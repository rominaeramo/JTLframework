/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements ASPMM.resource.ASPMM.IASPMMTextResource {
	
	public class ElementBasedTextDiagnostic implements ASPMM.resource.ASPMM.IASPMMTextDiagnostic {
		
		private final ASPMM.resource.ASPMM.IASPMMLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final ASPMM.resource.ASPMM.IASPMMProblem problem;
		
		public ElementBasedTextDiagnostic(ASPMM.resource.ASPMM.IASPMMLocationMap locationMap, org.eclipse.emf.common.util.URI uri, ASPMM.resource.ASPMM.IASPMMProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public ASPMM.resource.ASPMM.IASPMMProblem getProblem() {
			return problem;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public org.eclipse.emf.ecore.EObject getElement() {
			return element;
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	public class PositionBasedTextDiagnostic implements ASPMM.resource.ASPMM.IASPMMTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private ASPMM.resource.ASPMM.IASPMMProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, ASPMM.resource.ASPMM.IASPMMProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public ASPMM.resource.ASPMM.IASPMMProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	private ASPMM.resource.ASPMM.IASPMMReferenceResolverSwitch resolverSwitch;
	private ASPMM.resource.ASPMM.IASPMMLocationMap locationMap;
	private int proxyCounter = 0;
	private ASPMM.resource.ASPMM.IASPMMTextParser parser;
	private ASPMM.resource.ASPMM.util.ASPMMLayoutUtil layoutUtil = new ASPMM.resource.ASPMM.util.ASPMMLayoutUtil();
	private ASPMM.resource.ASPMM.mopp.ASPMMMarkerHelper markerHelper;
	private java.util.Map<String, ASPMM.resource.ASPMM.IASPMMContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.LinkedHashMap<String, ASPMM.resource.ASPMM.IASPMMContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	private java.util.Map<String, ASPMM.resource.ASPMM.IASPMMQuickFix> quickFixMap = new java.util.LinkedHashMap<String, ASPMM.resource.ASPMM.IASPMMQuickFix>();
	private java.util.Map<?, ?> loadOptions;
	
	/**
	 * If a post-processor is currently running, this field holds a reference to it.
	 * This reference is used to terminate post-processing if needed.
	 */
	private ASPMM.resource.ASPMM.IASPMMResourcePostProcessor runningPostProcessor;
	
	/**
	 * A flag (and lock) to indicate whether reloading of the resource shall be
	 * cancelled.
	 */
	private Boolean terminateReload = false;
	private Object terminateReloadLock = new Object();
	private Object loadingLock = new Object();
	private boolean delayNotifications = false;
	private java.util.List<org.eclipse.emf.common.notify.Notification> delayedNotifications = new java.util.ArrayList<org.eclipse.emf.common.notify.Notification>();
	private java.io.InputStream latestReloadInputStream = null;
	private java.util.Map<?, ?> latestReloadOptions = null;
	private ASPMM.resource.ASPMM.util.ASPMMInterruptibleEcoreResolver interruptibleResolver;
	
	protected ASPMM.resource.ASPMM.mopp.ASPMMMetaInformation metaInformation = new ASPMM.resource.ASPMM.mopp.ASPMMMetaInformation();
	
	public ASPMMResource() {
		super();
		resetLocationMap();
	}
	
	public ASPMMResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		synchronized (loadingLock) {
			if (processTerminationRequested()) {
				return;
			}
			this.loadOptions = options;
			delayNotifications = true;
			resetLocationMap();
			String encoding = getEncoding(options);
			java.io.InputStream actualInputStream = inputStream;
			Object inputStreamPreProcessorProvider = null;
			if (options != null) {
				inputStreamPreProcessorProvider = options.get(ASPMM.resource.ASPMM.IASPMMOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
			}
			if (inputStreamPreProcessorProvider != null) {
				if (inputStreamPreProcessorProvider instanceof ASPMM.resource.ASPMM.IASPMMInputStreamProcessorProvider) {
					ASPMM.resource.ASPMM.IASPMMInputStreamProcessorProvider provider = (ASPMM.resource.ASPMM.IASPMMInputStreamProcessorProvider) inputStreamPreProcessorProvider;
					ASPMM.resource.ASPMM.mopp.ASPMMInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
					actualInputStream = processor;
				}
			}
			
			parser = getMetaInformation().createParser(actualInputStream, encoding);
			parser.setOptions(options);
			ASPMM.resource.ASPMM.IASPMMReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
			referenceResolverSwitch.setOptions(options);
			ASPMM.resource.ASPMM.IASPMMParseResult result = parser.parse();
			// dispose parser, we don't need it anymore
			parser = null;
			
			if (processTerminationRequested()) {
				// do nothing if reload was already restarted
				return;
			}
			
			clearState();
			getContentsInternal().clear();
			org.eclipse.emf.ecore.EObject root = null;
			if (result != null) {
				root = result.getRoot();
				if (root != null) {
					if (isLayoutInformationRecordingEnabled()) {
						layoutUtil.transferAllLayoutInformationToModel(root);
					}
					if (processTerminationRequested()) {
						// the next reload will add new content
						return;
					}
					getContentsInternal().add(root);
				}
				java.util.Collection<ASPMM.resource.ASPMM.IASPMMCommand<ASPMM.resource.ASPMM.IASPMMTextResource>> commands = result.getPostParseCommands();
				if (commands != null) {
					for (ASPMM.resource.ASPMM.IASPMMCommand<ASPMM.resource.ASPMM.IASPMMTextResource>  command : commands) {
						command.execute(this);
					}
				}
			}
			getReferenceResolverSwitch().setOptions(options);
			if (getErrors().isEmpty()) {
				if (!runPostProcessors(options)) {
					return;
				}
				if (root != null) {
					runValidators(root);
				}
			}
			notifyDelayed();
		}
	}
	
	protected boolean processTerminationRequested() {
		if (terminateReload) {
			delayNotifications = false;
			delayedNotifications.clear();
			return true;
		}
		return false;
	}
	protected void notifyDelayed() {
		delayNotifications = false;
		for (org.eclipse.emf.common.notify.Notification delayedNotification : delayedNotifications) {
			super.eNotify(delayedNotification);
		}
		delayedNotifications.clear();
	}
	public void eNotify(org.eclipse.emf.common.notify.Notification notification) {
		if (delayNotifications) {
			delayedNotifications.add(notification);
		} else {
			super.eNotify(notification);
		}
	}
	/**
	 * Reloads the contents of this resource from the given stream.
	 */
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		synchronized (terminateReloadLock) {
			latestReloadInputStream = inputStream;
			latestReloadOptions = options;
			if (terminateReload == true) {
				// //reload already requested
			}
			terminateReload = true;
		}
		cancelReload();
		synchronized (loadingLock) {
			synchronized (terminateReloadLock) {
				terminateReload = false;
			}
			isLoaded = false;
			java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(latestReloadOptions);
			try {
				doLoad(latestReloadInputStream, loadOptions);
			} catch (ASPMM.resource.ASPMM.mopp.ASPMMTerminateParsingException tpe) {
				// do nothing - the resource is left unchanged if this exception is thrown
			}
			resolveAfterParsing();
			isLoaded = true;
		}
	}
	
	/**
	 * Cancels reloading this resource. The running parser and post processors are
	 * terminated.
	 */
	protected void cancelReload() {
		// Cancel parser
		ASPMM.resource.ASPMM.IASPMMTextParser parserCopy = parser;
		if (parserCopy != null) {
			parserCopy.terminate();
		}
		// Cancel post processor(s)
		ASPMM.resource.ASPMM.IASPMMResourcePostProcessor runningPostProcessorCopy = runningPostProcessor;
		if (runningPostProcessorCopy != null) {
			runningPostProcessorCopy.terminate();
		}
		// Cancel reference resolving
		ASPMM.resource.ASPMM.util.ASPMMInterruptibleEcoreResolver interruptibleResolverCopy = interruptibleResolver;
		if (interruptibleResolverCopy != null) {
			interruptibleResolverCopy.terminate();
		}
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		ASPMM.resource.ASPMM.IASPMMTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
		ASPMM.resource.ASPMM.IASPMMReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		printer.setEncoding(getEncoding(options));
		referenceResolverSwitch.setOptions(options);
		for (org.eclipse.emf.ecore.EObject root : getContentsInternal()) {
			if (isLayoutInformationRecordingEnabled()) {
				layoutUtil.transferAllLayoutInformationFromModel(root);
			}
			printer.print(root);
			if (isLayoutInformationRecordingEnabled()) {
				layoutUtil.transferAllLayoutInformationToModel(root);
			}
		}
	}
	
	protected String getSyntaxName() {
		return "ASPMM";
	}
	
	public String getEncoding(java.util.Map<?, ?> options) {
		String encoding = null;
		if (new ASPMM.resource.ASPMM.util.ASPMMRuntimeUtil().isEclipsePlatformAvailable()) {
			encoding = new ASPMM.resource.ASPMM.util.ASPMMEclipseProxy().getPlatformResourceEncoding(uri);
		}
		if (options != null) {
			Object encodingOption = options.get(ASPMM.resource.ASPMM.IASPMMOptions.OPTION_ENCODING);
			if (encodingOption != null) {
				encoding = encodingOption.toString();
			}
		}
		return encoding;
	}
	
	public ASPMM.resource.ASPMM.IASPMMReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new ASPMM.resource.ASPMM.mopp.ASPMMReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public ASPMM.resource.ASPMM.mopp.ASPMMMetaInformation getMetaInformation() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMMetaInformation();
	}
	
	/**
	 * Clears the location map by replacing it with a new instance.
	 */
	protected void resetLocationMap() {
		if (isLocationMapEnabled()) {
			locationMap = new ASPMM.resource.ASPMM.mopp.ASPMMLocationMap();
		} else {
			locationMap = new ASPMM.resource.ASPMM.mopp.ASPMMDevNullLocationMap();
		}
	}
	
	public void addURIFragment(String internalURIFragment, ASPMM.resource.ASPMM.IASPMMContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(ASPMM.resource.ASPMM.IASPMMContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, String id, org.eclipse.emf.ecore.EObject proxyElement, int position) {
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		String internalURIFragment = ASPMM.resource.ASPMM.IASPMMContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		ASPMM.resource.ASPMM.IASPMMContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, position, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			ASPMM.resource.ASPMM.IASPMMContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			ASPMM.resource.ASPMM.IASPMMReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = null;
			// catch and report all Exceptions that occur during proxy resolving
			try {
				result = uriFragment.resolve();
			} catch (Exception e) {
				String message = "An expection occured while resolving the proxy for: "+ id + ". (" + e.toString() + ")";
				addProblem(new ASPMM.resource.ASPMM.mopp.ASPMMProblem(message, ASPMM.resource.ASPMM.ASPMMEProblemType.UNRESOLVED_REFERENCE, ASPMM.resource.ASPMM.ASPMMEProblemSeverity.ERROR), uriFragment.getProxy());
				new ASPMM.resource.ASPMM.util.ASPMMRuntimeUtil().logError(message, e);
			}
			if (result == null) {
				// the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachResolveError(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				org.eclipse.emf.ecore.EObject proxy = uriFragment.getProxy();
				// remove an error that might have been added by an earlier attempt
				removeDiagnostics(proxy, getErrors());
				// remove old warnings and attach new
				removeDiagnostics(proxy, getWarnings());
				attachResolveWarnings(result, proxy);
				ASPMM.resource.ASPMM.IASPMMReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
				org.eclipse.emf.ecore.EObject resultElement = getResultElement(uriFragment, mapping, proxy, result.getErrorMessage());
				org.eclipse.emf.ecore.EObject container = uriFragment.getContainer();
				replaceProxyInLayoutAdapters(container, proxy, resultElement);
				return resultElement;
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	protected void replaceProxyInLayoutAdapters(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (org.eclipse.emf.common.notify.Adapter adapter : container.eAdapters()) {
			if (adapter instanceof ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter) {
				ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter layoutInformationAdapter = (ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter) adapter;
				layoutInformationAdapter.replaceProxy(proxy, target);
			}
		}
	}
	
	protected org.eclipse.emf.ecore.EObject getResultElement(ASPMM.resource.ASPMM.IASPMMContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, ASPMM.resource.ASPMM.IASPMMReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final String errorMessage) {
		if (mapping instanceof ASPMM.resource.ASPMM.IASPMMURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((ASPMM.resource.ASPMM.IASPMMURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new ASPMM.resource.ASPMM.mopp.ASPMMProblem(errorMessage, ASPMM.resource.ASPMM.ASPMMEProblemType.UNRESOLVED_REFERENCE, ASPMM.resource.ASPMM.ASPMMEProblemSeverity.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof ASPMM.resource.ASPMM.IASPMMElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((ASPMM.resource.ASPMM.IASPMMElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = ASPMM.resource.ASPMM.util.ASPMMCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
					// oppositeReference
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	protected void removeDiagnostics(org.eclipse.emf.ecore.EObject cause, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove all errors/warnings from this resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof ASPMM.resource.ASPMM.IASPMMTextDiagnostic) {
				if (((ASPMM.resource.ASPMM.IASPMMTextDiagnostic) errorCand).wasCausedBy(cause)) {
					diagnostics.remove(errorCand);
					unmark(cause);
				}
			}
		}
	}
	
	protected void attachResolveError(ASPMM.resource.ASPMM.IASPMMReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to this resource
		assert result != null;
		final String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new ASPMM.resource.ASPMM.mopp.ASPMMProblem(errorMessage, ASPMM.resource.ASPMM.ASPMMEProblemType.UNRESOLVED_REFERENCE, ASPMM.resource.ASPMM.ASPMMEProblemSeverity.ERROR, result.getQuickFixes()), proxy);
		}
	}
	
	protected void attachResolveWarnings(ASPMM.resource.ASPMM.IASPMMReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (ASPMM.resource.ASPMM.IASPMMReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new ASPMM.resource.ASPMM.mopp.ASPMMProblem(warningMessage, ASPMM.resource.ASPMM.ASPMMEProblemType.UNRESOLVED_REFERENCE, ASPMM.resource.ASPMM.ASPMMEProblemSeverity.WARNING), proxy);
			}
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void doUnload() {
		super.doUnload();
		clearState();
		loadOptions = null;
	}
	
	/**
	 * Runs all post processors to process this resource.
	 */
	protected boolean runPostProcessors(java.util.Map<?, ?> loadOptions) {
		unmark(ASPMM.resource.ASPMM.ASPMMEProblemType.ANALYSIS_PROBLEM);
		if (processTerminationRequested()) {
			return false;
		}
		// first, run the generated post processor
		runPostProcessor(new ASPMM.resource.ASPMM.mopp.ASPMMResourcePostProcessor());
		if (loadOptions == null) {
			return true;
		}
		// then, run post processors that are registered via the load options extension
		// point
		Object resourcePostProcessorProvider = loadOptions.get(ASPMM.resource.ASPMM.IASPMMOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof ASPMM.resource.ASPMM.IASPMMResourcePostProcessorProvider) {
				runPostProcessor(((ASPMM.resource.ASPMM.IASPMMResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor());
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (processTerminationRequested()) {
						return false;
					}
					if (processorProvider instanceof ASPMM.resource.ASPMM.IASPMMResourcePostProcessorProvider) {
						ASPMM.resource.ASPMM.IASPMMResourcePostProcessorProvider csProcessorProvider = (ASPMM.resource.ASPMM.IASPMMResourcePostProcessorProvider) processorProvider;
						ASPMM.resource.ASPMM.IASPMMResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						runPostProcessor(postProcessor);
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * Runs the given post processor to process this resource.
	 */
	protected void runPostProcessor(ASPMM.resource.ASPMM.IASPMMResourcePostProcessor postProcessor) {
		try {
			this.runningPostProcessor = postProcessor;
			postProcessor.process(this);
		} catch (Exception e) {
			new ASPMM.resource.ASPMM.util.ASPMMRuntimeUtil().logError("Exception while running a post-processor.", e);
		}
		this.runningPostProcessor = null;
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
		resolveAfterParsing();
	}
	
	protected void resolveAfterParsing() {
		interruptibleResolver = new ASPMM.resource.ASPMM.util.ASPMMInterruptibleEcoreResolver();
		interruptibleResolver.resolveAll(this);
		interruptibleResolver = null;
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		// because of the context dependent proxy resolving it is essential to resolve all
		// proxies before the URI is changed which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	/**
	 * Returns the location map that contains information about the position of the
	 * contents of this resource in the original textual representation.
	 */
	public ASPMM.resource.ASPMM.IASPMMLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(ASPMM.resource.ASPMM.IASPMMProblem problem, org.eclipse.emf.ecore.EObject element) {
		ElementBasedTextDiagnostic diagnostic = new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		mark(diagnostic);
		addQuickFixesToQuickFixMap(problem);
	}
	
	public void addProblem(ASPMM.resource.ASPMM.IASPMMProblem problem, int column, int line, int charStart, int charEnd) {
		PositionBasedTextDiagnostic diagnostic = new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		mark(diagnostic);
		addQuickFixesToQuickFixMap(problem);
	}
	
	protected void addQuickFixesToQuickFixMap(ASPMM.resource.ASPMM.IASPMMProblem problem) {
		java.util.Collection<ASPMM.resource.ASPMM.IASPMMQuickFix> quickFixes = problem.getQuickFixes();
		if (quickFixes != null) {
			for (ASPMM.resource.ASPMM.IASPMMQuickFix quickFix : quickFixes) {
				if (quickFix != null) {
					quickFixMap.put(quickFix.getContextAsString(), quickFix);
				}
			}
		}
	}
	
	@Deprecated	
	public void addError(String message, org.eclipse.emf.ecore.EObject cause) {
		addError(message, ASPMM.resource.ASPMM.ASPMMEProblemType.UNKNOWN, cause);
	}
	
	public void addError(String message, ASPMM.resource.ASPMM.ASPMMEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new ASPMM.resource.ASPMM.mopp.ASPMMProblem(message, type, ASPMM.resource.ASPMM.ASPMMEProblemSeverity.ERROR), cause);
	}
	
	@Deprecated	
	public void addWarning(String message, org.eclipse.emf.ecore.EObject cause) {
		addWarning(message, ASPMM.resource.ASPMM.ASPMMEProblemType.UNKNOWN, cause);
	}
	
	public void addWarning(String message, ASPMM.resource.ASPMM.ASPMMEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new ASPMM.resource.ASPMM.mopp.ASPMMProblem(message, type, ASPMM.resource.ASPMM.ASPMMEProblemSeverity.WARNING), cause);
	}
	
	protected java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(ASPMM.resource.ASPMM.ASPMMEProblemSeverity severity) {
		if (severity == ASPMM.resource.ASPMM.ASPMMEProblemSeverity.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<Object, Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<Object, Object> loadOptionsCopy = ASPMM.resource.ASPMM.util.ASPMMMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		// first add static option provider
		loadOptionsCopy.putAll(new ASPMM.resource.ASPMM.mopp.ASPMMOptionProvider().getOptions());
		
		// second, add dynamic option providers that are registered via extension
		if (new ASPMM.resource.ASPMM.util.ASPMMRuntimeUtil().isEclipsePlatformAvailable()) {
			new ASPMM.resource.ASPMM.util.ASPMMEclipseProxy().getDefaultLoadOptionProviderExtensions(loadOptionsCopy);
		}
		return loadOptionsCopy;
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void clearState() {
		// clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		unmark(ASPMM.resource.ASPMM.ASPMMEProblemType.UNKNOWN);
		unmark(ASPMM.resource.ASPMM.ASPMMEProblemType.SYNTAX_ERROR);
		unmark(ASPMM.resource.ASPMM.ASPMMEProblemType.UNRESOLVED_REFERENCE);
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	/**
	 * Returns a copy of the contents of this resource wrapped in a list that
	 * propagates changes to the original resource list. Wrapping is required to make
	 * sure that clients which obtain a reference to the list of contents do not
	 * interfere when changing the list.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.EObject>();
		}
		return new ASPMM.resource.ASPMM.util.ASPMMCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	/**
	 * Returns the raw contents of this resource. In contrast to getContents(), this
	 * methods does not return a copy of the content list, but the original list.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContentsInternal() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.EObject>();
		}
		return super.getContents();
	}
	
	/**
	 * Returns all warnings that are associated with this resource.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>();
		}
		return new ASPMM.resource.ASPMM.util.ASPMMCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	/**
	 * Returns all errors that are associated with this resource.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>();
		}
		return new ASPMM.resource.ASPMM.util.ASPMMCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
	protected void runValidators(org.eclipse.emf.ecore.EObject root) {
		// checking constraints provided by EMF validator classes was disabled by option
		// 'disableEValidators'.
		
		if (new ASPMM.resource.ASPMM.util.ASPMMRuntimeUtil().isEclipsePlatformAvailable()) {
			new ASPMM.resource.ASPMM.util.ASPMMEclipseProxy().checkEMFValidationConstraints(this, root);
		}
	}
	
	public ASPMM.resource.ASPMM.IASPMMQuickFix getQuickFix(String quickFixContext) {
		return quickFixMap.get(quickFixContext);
	}
	
	protected void mark(ASPMM.resource.ASPMM.IASPMMTextDiagnostic diagnostic) {
		ASPMM.resource.ASPMM.mopp.ASPMMMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.mark(this, diagnostic);
		}
	}
	
	protected void unmark(org.eclipse.emf.ecore.EObject cause) {
		ASPMM.resource.ASPMM.mopp.ASPMMMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.unmark(this, cause);
		}
	}
	
	protected void unmark(ASPMM.resource.ASPMM.ASPMMEProblemType analysisProblem) {
		ASPMM.resource.ASPMM.mopp.ASPMMMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.unmark(this, analysisProblem);
		}
	}
	
	protected ASPMM.resource.ASPMM.mopp.ASPMMMarkerHelper getMarkerHelper() {
		if (isMarkerCreationEnabled() && new ASPMM.resource.ASPMM.util.ASPMMRuntimeUtil().isEclipsePlatformAvailable()) {
			if (markerHelper == null) {
				markerHelper = new ASPMM.resource.ASPMM.mopp.ASPMMMarkerHelper();
			}
			return markerHelper;
		}
		return null;
	}
	
	public boolean isMarkerCreationEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(ASPMM.resource.ASPMM.IASPMMOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS);
	}
	
	protected boolean isLocationMapEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(ASPMM.resource.ASPMM.IASPMMOptions.DISABLE_LOCATION_MAP);
	}
	
	protected boolean isLayoutInformationRecordingEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(ASPMM.resource.ASPMM.IASPMMOptions.DISABLE_LAYOUT_INFORMATION_RECORDING);
	}
	
}
