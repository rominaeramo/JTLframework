/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public abstract class ASPMMANTLRParserBase extends org.antlr.runtime3_4_0.Parser implements ASPMM.resource.ASPMM.IASPMMTextParser {
	
	/**
	 * The index of the last token that was handled by retrieveLayoutInformation().
	 */
	private int lastPosition2;
	
	/**
	 * A collection to store all anonymous tokens.
	 */
	protected java.util.List<org.antlr.runtime3_4_0.CommonToken> anonymousTokens = new java.util.ArrayList<org.antlr.runtime3_4_0.CommonToken>();
	
	/**
	 * A collection that is filled with commands to be executed after parsing. This
	 * collection is cleared before parsing starts and returned as part of the parse
	 * result object.
	 */
	protected java.util.Collection<ASPMM.resource.ASPMM.IASPMMCommand<ASPMM.resource.ASPMM.IASPMMTextResource>> postParseCommands;
	
	/**
	 * A copy of the options that were used to load the text resource. This map is
	 * filled when the parser is created.
	 */
	private java.util.Map<?, ?> options;
	
	/**
	 * A flag that indicates whether this parser runs in a special mode where the
	 * location map is not filled. If this flag is set to true, copying localization
	 * information for elements is not performed. This improves time and memory
	 * consumption.
	 */
	protected boolean disableLocationMap = false;
	
	/**
	 * A flag that indicates whether this parser runs in a special mode where layout
	 * information is not recorded. If this flag is set to true, no layout information
	 * adapters are created. This improves time and memory consumption.
	 */
	protected boolean disableLayoutRecording = false;
	
	/**
	 * A flag to indicate that the parser should stop parsing as soon as possible. The
	 * flag is set to false before parsing starts. It can be set to true by invoking
	 * the terminateParsing() method from another thread. This feature is used, when
	 * documents are parsed in the background (i.e., while editing them). In order to
	 * cancel running parsers, the parsing process can be terminated. This is done
	 * whenever a document changes, because the previous content of the document is
	 * not valid anymore and parsing the old content is not necessary any longer.
	 */
	protected boolean terminateParsing;
	
	/**
	 * A reusable container for the result of resolving tokens.
	 */
	private ASPMM.resource.ASPMM.mopp.ASPMMTokenResolveResult tokenResolveResult = new ASPMM.resource.ASPMM.mopp.ASPMMTokenResolveResult();
	
	protected ASPMM.resource.ASPMM.mopp.ASPMMMetaInformation metaInformation = new ASPMM.resource.ASPMM.mopp.ASPMMMetaInformation();
	
	public ASPMMANTLRParserBase(org.antlr.runtime3_4_0.TokenStream input) {
		super(input);
	}
	
	public ASPMMANTLRParserBase(org.antlr.runtime3_4_0.TokenStream input, org.antlr.runtime3_4_0.RecognizerSharedState state) {
		super(input, state);
	}
	
	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement syntaxElement, Object object, boolean ignoreTokensAfterLastVisibleToken) {
		if (disableLayoutRecording || element == null) {
			return;
		}
		// null must be accepted, since the layout information that is found at the end of
		// documents (just before the EOF character) is not associated with a particular
		// syntax element.
		boolean isElementToStore = syntaxElement == null;
		isElementToStore |= syntaxElement instanceof ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder;
		isElementToStore |= syntaxElement instanceof ASPMM.resource.ASPMM.grammar.ASPMMKeyword;
		isElementToStore |= syntaxElement instanceof ASPMM.resource.ASPMM.grammar.ASPMMEnumerationTerminal;
		isElementToStore |= syntaxElement instanceof ASPMM.resource.ASPMM.grammar.ASPMMBooleanTerminal;
		if (!isElementToStore) {
			return;
		}
		ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
		StringBuilder anonymousText = new StringBuilder();
		for (org.antlr.runtime3_4_0.CommonToken anonymousToken : anonymousTokens) {
			anonymousText.append(anonymousToken.getText());
		}
		int currentPos = getTokenStream().index();
		if (currentPos == 0) {
			return;
		}
		int endPos = currentPos - 1;
		if (ignoreTokensAfterLastVisibleToken) {
			for (; endPos >= this.lastPosition2; endPos--) {
				org.antlr.runtime3_4_0.Token token = getTokenStream().get(endPos);
				int _channel = token.getChannel();
				if (_channel != 99) {
					break;
				}
			}
		}
		StringBuilder hiddenTokenText = new StringBuilder();
		hiddenTokenText.append(anonymousText);
		StringBuilder visibleTokenText = new StringBuilder();
		org.antlr.runtime3_4_0.CommonToken firstToken = null;
		for (int pos = this.lastPosition2; pos <= endPos; pos++) {
			org.antlr.runtime3_4_0.Token token = getTokenStream().get(pos);
			if (firstToken == null) {
				firstToken = (org.antlr.runtime3_4_0.CommonToken) token;
			}
			if (anonymousTokens.contains(token)) {
				continue;
			}
			int _channel = token.getChannel();
			if (_channel == 99) {
				hiddenTokenText.append(token.getText());
			} else {
				visibleTokenText.append(token.getText());
			}
		}
		int offset = -1;
		if (firstToken != null) {
			offset = firstToken.getStartIndex();
		}
		layoutInformationAdapter.addLayoutInformation(new ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
		anonymousTokens.clear();
	}
	
	protected ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter) {
				return (ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter) adapter;
			}
		}
		ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter newAdapter = new ASPMM.resource.ASPMM.mopp.ASPMMLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final ASPMM.resource.ASPMM.mopp.ASPMMContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType container, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		final int position;
		if (reference.isMany()) {
			position = ((java.util.List<?>) container.eGet(reference)).size();
		} else {
			position = -1;
		}
		
		postParseCommands.add(new ASPMM.resource.ASPMM.IASPMMCommand<ASPMM.resource.ASPMM.IASPMMTextResource>() {
			public boolean execute(ASPMM.resource.ASPMM.IASPMMTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.registerContextDependentProxy(factory, container, reference, id, proxy, position);
				return true;
			}
		});
	}
	
	protected String formatTokenName(int tokenType)  {
		String tokenName = "<unknown>";
		if (tokenType < 0) {
			tokenName = "EOF";
		} else {
			if (tokenType < 0) {
				return tokenName;
			}
			tokenName = getTokenNames()[tokenType];
			tokenName = ASPMM.resource.ASPMM.util.ASPMMStringUtil.formatTokenName(tokenName);
		}
		return tokenName;
	}
	
	protected java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
		if (this.options == null) {
			return;
		}
		if (this.options.containsKey(ASPMM.resource.ASPMM.IASPMMOptions.DISABLE_LOCATION_MAP)) {
			this.disableLocationMap = true;
		}
		if (this.options.containsKey(ASPMM.resource.ASPMM.IASPMMOptions.DISABLE_LAYOUT_INFORMATION_RECORDING)) {
			this.disableLayoutRecording = true;
		}
	}
	
	/**
	 * Creates a dynamic Java proxy that mimics the interface of the given class.
	 */
	@SuppressWarnings("unchecked")	
	public <T> T createDynamicProxy(Class<T> clazz) {
		Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
			
			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
			
			public Object invoke(Object object, java.lang.reflect.Method method, Object[] args) throws Throwable {
				// search in dummyObject for the requested method
				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
					boolean matches = true;
					if (methodInDummy.getName().equals(method.getName())) {
						Class<?>[] parameterTypes = method.getParameterTypes();
						Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
						if (parameterTypes.length == parameterTypesInDummy.length) {
							for (int p = 0; p < parameterTypes.length; p++) {
								Class<?> parameterType = parameterTypes[p];
								Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
								if (!parameterType.equals(parameterTypeInDummy)) {
									matches = false;
								}
							}
						} else {
							matches = false;
						}
					} else {
						matches = false;
					}
					if (matches) {
						return methodInDummy.invoke(dummyObject, args);
					}
				}
				return null;
			}
		});
		return (T) proxy;
	}
	
	public void terminate() {
		terminateParsing = true;
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, ASPMM.resource.ASPMM.mopp.ASPMMDummyEObject dummy) {
		Object value = element.eGet(structuralFeature);
		Object mapKey = dummy.getValueByName("key");
		Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<Object, Object> valueMap = ASPMM.resource.ASPMM.util.ASPMMMapUtil.castToEMap(value);
			if (mapKey != null && mapValue != null) {
				valueMap.put(mapKey, mapValue);
			}
		}
	}
	
	@SuppressWarnings("unchecked")	
	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, int featureID, Object object) {
		return ((java.util.List<Object>) container.eGet(container.eClass().getEStructuralFeature(featureID))).add(object);
	}
	
	@SuppressWarnings("unchecked")	
	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EStructuralFeature feature, Object object) {
		return ((java.util.List<Object>) container.eGet(feature)).add(object);
	}
	
	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
		org.eclipse.emf.ecore.EObject currentTarget = target;
		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
			assert(object instanceof ASPMM.resource.ASPMM.mopp.ASPMMDummyEObject);
			ASPMM.resource.ASPMM.mopp.ASPMMDummyEObject dummy = (ASPMM.resource.ASPMM.mopp.ASPMMDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected ASPMM.resource.ASPMM.mopp.ASPMMTokenResolveResult getFreshTokenResolveResult() {
		tokenResolveResult.clear();
		return tokenResolveResult;
	}
	
	protected ASPMM.resource.ASPMM.mopp.ASPMMReferenceResolverSwitch getReferenceResolverSwitch() {
		ASPMM.resource.ASPMM.mopp.ASPMMReferenceResolverSwitch resolverSwitch = (ASPMM.resource.ASPMM.mopp.ASPMMReferenceResolverSwitch) metaInformation.getReferenceResolverSwitch();
		resolverSwitch.setOptions(options);
		return resolverSwitch;
	}
	
}