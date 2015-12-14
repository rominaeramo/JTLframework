/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

public class ASPPrinter implements ASP.resource.ASP.IASPTextPrinter {
	
	protected ASP.resource.ASP.IASPTokenResolverFactory tokenResolverFactory = new ASP.resource.ASP.mopp.ASPTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private ASP.resource.ASP.IASPTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public ASPPrinter(java.io.OutputStream outputStream, ASP.resource.ASP.IASPTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof ASP.Transformation) {
			print_ASP_Transformation((ASP.Transformation) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.LeftPattern) {
			print_ASP_LeftPattern((ASP.LeftPattern) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.RightPattern) {
			print_ASP_RightPattern((ASP.RightPattern) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Constraint) {
			print_ASP_Constraint((ASP.Constraint) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Not) {
			print_ASP_Not((ASP.Not) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Eq) {
			print_ASP_Eq((ASP.Eq) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.EqSimple) {
			print_ASP_EqSimple((ASP.EqSimple) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.NotEq) {
			print_ASP_NotEq((ASP.NotEq) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Literal) {
			print_ASP_Literal((ASP.Literal) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Node) {
			print_ASP_Node((ASP.Node) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Prop) {
			print_ASP_Prop((ASP.Prop) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Edge) {
			print_ASP_Edge((ASP.Edge) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Relation) {
			print_ASP_Relation((ASP.Relation) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Terminal) {
			print_ASP_Terminal((ASP.Terminal) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Metamodel) {
			print_ASP_Metamodel((ASP.Metamodel) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Metanode) {
			print_ASP_Metanode((ASP.Metanode) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Metaprop) {
			print_ASP_Metaprop((ASP.Metaprop) element, globaltab, out);
			return;
		}
		if (element instanceof ASP.Metaedge) {
			print_ASP_Metaedge((ASP.Metaedge) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected ASP.resource.ASP.mopp.ASPReferenceResolverSwitch getReferenceResolverSwitch() {
		return (ASP.resource.ASP.mopp.ASPReferenceResolverSwitch) new ASP.resource.ASP.mopp.ASPMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		ASP.resource.ASP.IASPTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new ASP.resource.ASP.mopp.ASPProblem(errorMessage, ASP.resource.ASP.ASPEProblemType.PRINT_PROBLEM, ASP.resource.ASP.ASPEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public ASP.resource.ASP.IASPTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_ASP_Transformation(ASP.Transformation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__METAMODELS));
		printCountingMap.put("metamodels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__USED_LITERALS));
		printCountingMap.put("usedLiterals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__CONSTRAINTS));
		printCountingMap.put("constraints", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__RELATIONS));
		printCountingMap.put("relations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Transformation");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Transformation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Transformation_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Transformation_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Transformation_3(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Transformation_4(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Transformation_5(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Transformation_6(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Transformation_6(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Transformation_7(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Transformation_7(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Transformation_8(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Transformation_0(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Transformation_1(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Transformation_2(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Transformation_3(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodels");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metamodels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__METAMODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metamodels", count - 1);
		}
	}
	
	public void print_ASP_Transformation_4(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("usedLiterals");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("usedLiterals");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__USED_LITERALS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("usedLiterals", count - 1);
		}
	}
	
	public void print_ASP_Transformation_5(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("constraints");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constraints");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__CONSTRAINTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constraints", count - 1);
		}
	}
	
	public void print_ASP_Transformation_6(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("elements");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	public void print_ASP_Transformation_7(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("relations");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__RELATIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("relations", count - 1);
		}
	}
	
	public void print_ASP_Transformation_8(ASP.Transformation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_ASP_LeftPattern(ASP.LeftPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__ELEMENT));
		printCountingMap.put("element", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__RELATION_ID));
		printCountingMap.put("relationId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE));
		printCountingMap.put("isMetanode", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP));
		printCountingMap.put("isMetaprop", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE));
		printCountingMap.put("isMetaedge", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("LeftPattern");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_LeftPattern_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_LeftPattern_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_LeftPattern_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_LeftPattern_3(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_LeftPattern_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_LeftPattern_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_LeftPattern_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_LeftPattern_7(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_LeftPattern_8(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_LeftPattern_0(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_LeftPattern_1(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_LeftPattern_2(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_LeftPattern_3(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("element");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("element");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__ELEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("element", count - 1);
		}
	}
	
	public void print_ASP_LeftPattern_4(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_LeftPattern_5(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("relationId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("relationId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__RELATION_ID));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__RELATION_ID), element));
				out.print(" ");
			}
			printCountingMap.put("relationId", count - 1);
		}
	}
	
	public void print_ASP_LeftPattern_6(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isMetanode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METANODE));
			if (o != null) {
			}
			printCountingMap.put("isMetanode", count - 1);
		}
	}
	
	public void print_ASP_LeftPattern_7(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isMetaprop");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAPROP));
			if (o != null) {
			}
			printCountingMap.put("isMetaprop", count - 1);
		}
	}
	
	public void print_ASP_LeftPattern_8(ASP.LeftPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isMetaedge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__IS_METAEDGE));
			if (o != null) {
			}
			printCountingMap.put("isMetaedge", count - 1);
		}
	}
	
	
	public void print_ASP_RightPattern(ASP.RightPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__ELEMENT));
		printCountingMap.put("element", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__RELATION_ID));
		printCountingMap.put("relationId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE));
		printCountingMap.put("isMetanode", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP));
		printCountingMap.put("isMetaprop", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE));
		printCountingMap.put("isMetaedge", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("RightPattern");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_RightPattern_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_RightPattern_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_RightPattern_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_RightPattern_3(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_RightPattern_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_RightPattern_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_RightPattern_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_RightPattern_7(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_RightPattern_8(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_RightPattern_0(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_RightPattern_1(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_RightPattern_2(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_RightPattern_3(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("element");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("element");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__ELEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("element", count - 1);
		}
	}
	
	public void print_ASP_RightPattern_4(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_RightPattern_5(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("relationId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("relationId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__RELATION_ID));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__RELATION_ID), element));
				out.print(" ");
			}
			printCountingMap.put("relationId", count - 1);
		}
	}
	
	public void print_ASP_RightPattern_6(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isMetanode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METANODE));
			if (o != null) {
			}
			printCountingMap.put("isMetanode", count - 1);
		}
	}
	
	public void print_ASP_RightPattern_7(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isMetaprop");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAPROP));
			if (o != null) {
			}
			printCountingMap.put("isMetaprop", count - 1);
		}
	}
	
	public void print_ASP_RightPattern_8(ASP.RightPattern element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isMetaedge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__IS_METAEDGE));
			if (o != null) {
			}
			printCountingMap.put("isMetaedge", count - 1);
		}
	}
	
	
	public void print_ASP_Constraint(ASP.Constraint element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__CONTENTS));
		printCountingMap.put("contents", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Constraint");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Constraint_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Constraint_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Constraint_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Constraint_3(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Constraint_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Constraint_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Constraint_0(ASP.Constraint element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Constraint_1(ASP.Constraint element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Constraint_2(ASP.Constraint element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Constraint_3(ASP.Constraint element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("contents");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("contents");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__CONTENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("contents", count - 1);
		}
	}
	
	public void print_ASP_Constraint_4(ASP.Constraint element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_ASP_Not(ASP.Not element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__ELEMENT));
		printCountingMap.put("element", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Not");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Not_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Not_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Not_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Not_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Not_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Not_0(ASP.Not element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Not_1(ASP.Not element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Not_2(ASP.Not element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Not_3(ASP.Not element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Not_4(ASP.Not element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("element");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("element");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT__ELEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("element", count - 1);
		}
	}
	
	
	public void print_ASP_Eq(ASP.Eq element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__PARAMETER_NAME));
		printCountingMap.put("parameterName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT1));
		printCountingMap.put("right1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT1));
		printCountingMap.put("left1", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Eq");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Eq_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Eq_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Eq_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Eq_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Eq_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Eq_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Eq_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Eq_0(ASP.Eq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Eq_1(ASP.Eq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Eq_2(ASP.Eq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Eq_3(ASP.Eq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Eq_4(ASP.Eq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("parameterName");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("parameterName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__PARAMETER_NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__PARAMETER_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("parameterName", count - 1);
		}
	}
	
	public void print_ASP_Eq_5(ASP.Eq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("right1");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("right1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT1));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqRight1ReferenceResolver().deResolve((ASP.Literal) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT1)), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT1), element));
				out.print(" ");
			}
			printCountingMap.put("right1", count - 1);
		}
	}
	
	public void print_ASP_Eq_6(ASP.Eq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("left1");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("left1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT1));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqLeft1ReferenceResolver().deResolve((ASP.Literal) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT1)), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT1), element));
				out.print(" ");
			}
			printCountingMap.put("left1", count - 1);
		}
	}
	
	
	public void print_ASP_EqSimple(ASP.EqSimple element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__PARAMETER_NAME));
		printCountingMap.put("parameterName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__RIGHT1));
		printCountingMap.put("right1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LEFT1));
		printCountingMap.put("left1", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("EqSimple");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_EqSimple_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_EqSimple_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_EqSimple_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_EqSimple_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_EqSimple_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_EqSimple_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_EqSimple_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_EqSimple_0(ASP.EqSimple element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_EqSimple_1(ASP.EqSimple element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_EqSimple_2(ASP.EqSimple element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_EqSimple_3(ASP.EqSimple element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_EqSimple_4(ASP.EqSimple element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("parameterName");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("parameterName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__PARAMETER_NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__PARAMETER_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("parameterName", count - 1);
		}
	}
	
	public void print_ASP_EqSimple_5(ASP.EqSimple element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("right1");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("right1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__RIGHT1));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqSimpleRight1ReferenceResolver().deResolve((ASP.Literal) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__RIGHT1)), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__RIGHT1), element));
				out.print(" ");
			}
			printCountingMap.put("right1", count - 1);
		}
	}
	
	public void print_ASP_EqSimple_6(ASP.EqSimple element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("left1");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("left1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LEFT1));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEqSimpleLeft1ReferenceResolver().deResolve((ASP.Literal) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LEFT1)), element.eClass().getEStructuralFeature(ASP.ASPPackage.EQ_SIMPLE__LEFT1), element));
				out.print(" ");
			}
			printCountingMap.put("left1", count - 1);
		}
	}
	
	
	public void print_ASP_NotEq(ASP.NotEq element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__PARAMETER_NAME));
		printCountingMap.put("parameterName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT1));
		printCountingMap.put("right1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT1));
		printCountingMap.put("left1", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("NotEq");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_NotEq_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_NotEq_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_NotEq_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_NotEq_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_NotEq_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_NotEq_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_NotEq_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_NotEq_0(ASP.NotEq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_NotEq_1(ASP.NotEq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_NotEq_2(ASP.NotEq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_NotEq_3(ASP.NotEq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_NotEq_4(ASP.NotEq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("parameterName");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("parameterName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__PARAMETER_NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__PARAMETER_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("parameterName", count - 1);
		}
	}
	
	public void print_ASP_NotEq_5(ASP.NotEq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("right1");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("right1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT1));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNotEqRight1ReferenceResolver().deResolve((ASP.Literal) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT1)), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT1), element));
				out.print(" ");
			}
			printCountingMap.put("right1", count - 1);
		}
	}
	
	public void print_ASP_NotEq_6(ASP.NotEq element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("left1");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("left1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT1));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNotEqLeft1ReferenceResolver().deResolve((ASP.Literal) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT1)), element.eClass().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT1), element));
				out.print(" ");
			}
			printCountingMap.put("left1", count - 1);
		}
	}
	
	
	public void print_ASP_Literal(ASP.Literal element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__PARAMETER_NAME));
		printCountingMap.put("parameterName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION));
		printCountingMap.put("isDefinition", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Literal");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Literal_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Literal_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Literal_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Literal_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Literal_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Literal_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Literal_0(ASP.Literal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isDefinition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__IS_DEFINITION));
			if (o != null) {
			}
			printCountingMap.put("isDefinition", count - 1);
		}
	}
	
	public void print_ASP_Literal_1(ASP.Literal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Literal_2(ASP.Literal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Literal_3(ASP.Literal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Literal_4(ASP.Literal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Literal_5(ASP.Literal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("parameterName");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("parameterName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__PARAMETER_NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.LITERAL__PARAMETER_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("parameterName", count - 1);
		}
	}
	
	
	public void print_ASP_Node(ASP.Node element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__META_CLASS));
		printCountingMap.put("metaClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX));
		printCountingMap.put("isNodex", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__NODE_ID));
		printCountingMap.put("nodeId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE));
		printCountingMap.put("isTrace", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Node");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Node_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Node_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Node_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Node_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Node_4(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Node_5(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Node_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Node_7(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Node_8(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Node_0(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isNodex");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_NODEX));
			if (o != null) {
			}
			printCountingMap.put("isNodex", count - 1);
		}
	}
	
	public void print_ASP_Node_1(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isTrace");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__IS_TRACE));
			if (o != null) {
			}
			printCountingMap.put("isTrace", count - 1);
		}
	}
	
	public void print_ASP_Node_2(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Node_3(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Node_4(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Node_5(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Node_6(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__METAMODEL));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getNodeMetamodelReferenceResolver().deResolve((ASP.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__METAMODEL)), element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_ASP_Node_7(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metaClass");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("metaClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__META_CLASS));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__META_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("metaClass", count - 1);
		}
	}
	
	public void print_ASP_Node_8(ASP.Node element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("nodeId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nodeId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.NODE__NODE_ID));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nodeId", count - 1);
		}
	}
	
	
	public void print_ASP_Prop(ASP.Prop element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__PROP_ID));
		printCountingMap.put("propId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__META_CLASS_ID));
		printCountingMap.put("metaClassId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__PROP_VALUE));
		printCountingMap.put("propValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX));
		printCountingMap.put("isPropx", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE));
		printCountingMap.put("isTrace", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Prop");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isPropx");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_PROPX));
			if (o != null) {
			}
			printCountingMap.put("isPropx", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isTrace");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__IS_TRACE));
			if (o != null) {
			}
			printCountingMap.put("isTrace", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Prop_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Prop_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Prop_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Prop_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Prop_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Prop_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Prop_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Prop_7(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Prop_0(ASP.Prop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Prop_1(ASP.Prop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Prop_2(ASP.Prop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Prop_3(ASP.Prop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Prop_4(ASP.Prop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__METAMODEL));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPropMetamodelReferenceResolver().deResolve((ASP.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__METAMODEL)), element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_ASP_Prop_5(ASP.Prop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("propId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("propId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__PROP_ID));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("propId", count - 1);
		}
	}
	
	public void print_ASP_Prop_6(ASP.Prop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metaClassId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metaClassId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__META_CLASS_ID));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metaClassId", count - 1);
		}
	}
	
	public void print_ASP_Prop_7(ASP.Prop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("propValue");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("propValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.PROP__PROP_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("propValue", count - 1);
		}
	}
	
	
	public void print_ASP_Edge(ASP.Edge element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__EDGE_ID));
		printCountingMap.put("edgeId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__SOURCE_MC_ID));
		printCountingMap.put("sourceMCId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__TARGET_MC_ID));
		printCountingMap.put("targetMCId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX));
		printCountingMap.put("isEdgex", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE));
		printCountingMap.put("isTrace", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Edge");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isEdgex");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_EDGEX));
			if (o != null) {
			}
			printCountingMap.put("isEdgex", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isTrace");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__IS_TRACE));
			if (o != null) {
			}
			printCountingMap.put("isTrace", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Edge_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Edge_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Edge_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Edge_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Edge_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Edge_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Edge_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Edge_7(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Edge_0(ASP.Edge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Edge_1(ASP.Edge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Edge_2(ASP.Edge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Edge_3(ASP.Edge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Edge_4(ASP.Edge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__METAMODEL));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getEdgeMetamodelReferenceResolver().deResolve((ASP.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__METAMODEL)), element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_ASP_Edge_5(ASP.Edge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("edgeId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("edgeId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__EDGE_ID));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("edgeId", count - 1);
		}
	}
	
	public void print_ASP_Edge_6(ASP.Edge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("sourceMCId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sourceMCId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__SOURCE_MC_ID));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceMCId", count - 1);
		}
	}
	
	public void print_ASP_Edge_7(ASP.Edge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("targetMCId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("targetMCId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.EDGE__TARGET_MC_ID));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetMCId", count - 1);
		}
	}
	
	
	public void print_ASP_Relation(ASP.Relation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LPATTERN));
		printCountingMap.put("lpattern", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RPATTERN));
		printCountingMap.put("rpattern", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RELATION_ID));
		printCountingMap.put("relationId", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT));
		printCountingMap.put("left2right", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT));
		printCountingMap.put("right2left", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Relation");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("left2right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LEFT2RIGHT));
			if (o != null) {
			}
			printCountingMap.put("left2right", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("right2left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RIGHT2LEFT));
			if (o != null) {
			}
			printCountingMap.put("right2left", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Relation_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Relation_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Relation_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Relation_3(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Relation_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Relation_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Relation_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Relation_7(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Relation_0(ASP.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Relation_1(ASP.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Relation_2(ASP.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Relation_3(ASP.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("lpattern");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("lpattern");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__LPATTERN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("lpattern", count - 1);
		}
	}
	
	public void print_ASP_Relation_4(ASP.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("rpattern");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rpattern");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RPATTERN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rpattern", count - 1);
		}
	}
	
	public void print_ASP_Relation_5(ASP.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("relationId");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("relationId");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RELATION_ID));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__RELATION_ID), element));
				out.print(" ");
			}
			printCountingMap.put("relationId", count - 1);
		}
	}
	
	public void print_ASP_Relation_6(ASP.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Relation_7(ASP.Relation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("type");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__TYPE));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.RELATION__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_ASP_Terminal(ASP.Terminal element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__CONTENT));
		printCountingMap.put("content", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Terminal");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Terminal_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Terminal_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Terminal_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Terminal_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Terminal_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Terminal_0(ASP.Terminal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Terminal_1(ASP.Terminal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Terminal_2(ASP.Terminal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Terminal_3(ASP.Terminal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Terminal_4(ASP.Terminal element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("content");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("content");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.TERMINAL__CONTENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("content", count - 1);
		}
	}
	
	
	public void print_ASP_Metamodel(ASP.Metamodel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Metamodel_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Metamodel_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Metamodel_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Metamodel_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Metamodel_0(ASP.Metamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Metamodel_1(ASP.Metamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Metamodel_2(ASP.Metamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Metamodel_3(ASP.Metamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAMODEL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_ASP_Metanode(ASP.Metanode element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Metanode");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Metanode_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Metanode_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Metanode_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Metanode_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Metanode_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Metanode_0(ASP.Metanode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Metanode_1(ASP.Metanode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Metanode_2(ASP.Metanode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Metanode_3(ASP.Metanode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Metanode_4(ASP.Metanode element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__METAMODEL));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPatternElementMetamodelReferenceResolver().deResolve((ASP.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__METAMODEL)), element.eClass().getEStructuralFeature(ASP.ASPPackage.METANODE__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	
	public void print_ASP_Metaprop(ASP.Metaprop element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__META_CLASS));
		printCountingMap.put("metaClass", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Metaprop");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Metaprop_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Metaprop_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Metaprop_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Metaprop_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Metaprop_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Metaprop_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Metaprop_0(ASP.Metaprop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Metaprop_1(ASP.Metaprop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Metaprop_2(ASP.Metaprop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Metaprop_3(ASP.Metaprop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Metaprop_4(ASP.Metaprop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__METAMODEL));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPatternElementMetamodelReferenceResolver().deResolve((ASP.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__METAMODEL)), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_ASP_Metaprop_5(ASP.Metaprop element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metaClass");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("metaClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__META_CLASS));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAPROP__META_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("metaClass", count - 1);
		}
	}
	
	
	public void print_ASP_Metaedge(ASP.Metaedge element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__COMMENTS_BEFORE));
		printCountingMap.put("commentsBefore", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__COMMENTS_AFTER));
		printCountingMap.put("commentsAfter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__SOURCE_META_CLASS));
		printCountingMap.put("sourceMetaClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__TARGET_META_CLASS));
		printCountingMap.put("targetMetaClass", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Metaedge");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Metaedge_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Metaedge_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_ASP_Metaedge_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_ASP_Metaedge_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Metaedge_4(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Metaedge_5(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_ASP_Metaedge_6(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ASP_Metaedge_0(ASP.Metaedge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("location");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LOCATION));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_ASP_Metaedge_1(ASP.Metaedge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsBefore");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsBefore");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__COMMENTS_BEFORE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__COMMENTS_BEFORE), element));
				out.print(" ");
			}
			printCountingMap.put("commentsBefore", count - 1);
		}
	}
	
	public void print_ASP_Metaedge_2(ASP.Metaedge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("commentsAfter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("commentsAfter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__COMMENTS_AFTER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__COMMENTS_AFTER), element));
				out.print(" ");
			}
			printCountingMap.put("commentsAfter", count - 1);
		}
	}
	
	public void print_ASP_Metaedge_3(ASP.Metaedge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__NAME));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_ASP_Metaedge_4(ASP.Metaedge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__METAMODEL));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPatternElementMetamodelReferenceResolver().deResolve((ASP.Metamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__METAMODEL)), element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_ASP_Metaedge_5(ASP.Metaedge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("sourceMetaClass");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("sourceMetaClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__SOURCE_META_CLASS));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__SOURCE_META_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("sourceMetaClass", count - 1);
		}
	}
	
	public void print_ASP_Metaedge_6(ASP.Metaedge element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("targetMetaClass");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("targetMetaClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__TARGET_META_CLASS));
			if (o != null) {
				ASP.resource.ASP.IASPTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ASP.ASPPackage.METAEDGE__TARGET_META_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("targetMetaClass", count - 1);
		}
	}
	
	
}
