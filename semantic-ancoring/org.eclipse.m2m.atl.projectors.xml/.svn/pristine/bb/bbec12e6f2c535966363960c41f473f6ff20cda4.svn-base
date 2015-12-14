/*******************************************************************************
 * Copyright (c) 2009 INRIA. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     INRIA - Initial API and implementation
 *     
 ******************************************************************************/

package org.eclipse.m2m.atl.projectors.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Implementation of an XML injector using EMF
 * @author Vincent Mahe
 * @author Hugo Bruneliere
 */
public class XMLInjector extends DefaultHandler implements IInjector {

	/**
	 * The EMFModel filled by the SAX Handler
	 */
	private EMFModel target;
	
	/**
	 * SAX Locator, used to store elements locations in the target model
	 * for traceability.
	 */
	private Locator locator = null;
	
	/**
	 * Current element. Since it owns a reference to its parent, it behaves
	 * as a stack.
	 */
	private EObject current = null;
	
	/**
	 * Root element.
	 */
	private EObject root = null;

	private int prevLineNumber = 1;
	private int prevColumnNumber = 1;

	public void inject(IModel targetModel, String source) 
			throws ATLCoreException {
		inject(targetModel, source, Collections.<String, Object> emptyMap());
	}

	public void inject(IModel targetModel, String source,
			Map<String, Object> options) throws ATLCoreException {
		try {
			String formattedSource = source;
			if( source.startsWith("file:") )
				formattedSource = source.substring(source.indexOf(":")+2);
			InputStream in = new FileInputStream(formattedSource);
			inject(targetModel, in, options);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Injects an {@link InputStream} into an {@link EMFModel} (which conforms to the XML metamodel)
	 * 
	 * @param targetModel 
	 *			the target {@link EMFModel} (which conforms to the XML metamodel) to be injected
	 * @param source
	 * 			the source  {@link OutputStream} from which the target model must be injected 
	 * @param options
	 *            the extraction parameters (none are required there)
	 */
	public void inject(IModel targetModel, InputStream source,
			Map<String, Object> options) throws ATLCoreException {
		performImportation(targetModel, source);
	}

	private void performImportation(IModel targetModel, InputStream source) {
		try {			
			this.target = (EMFModel) targetModel;
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser;
			saxParser = factory.newSAXParser();
			saxParser.parse(source, this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		int end = start + length - 1;

		if(start > end) return;

		String value = new String(ch, start, length);

		if(value.length() > 0) {
			EClass ec = (EClass) target.getReferenceModel().getMetaElementByName("Text");
			EObject attr = ec.getEPackage().getEFactoryInstance().create(ec);
			attr.eSet(attr.eClass().getEStructuralFeature("name"), new String("#text"));	// as in DOM
			attr.eSet(attr.eClass().getEStructuralFeature("value"), new String(value));
			attr.eSet(attr.eClass().getEStructuralFeature("parent"), current);
			if(locator != null) {
				if(locator.getLineNumber() != -1) {
					int lineNumber = locator.getLineNumber();
					attr.eSet(attr.eClass().getEStructuralFeature("startLine"), new Integer(prevLineNumber));
					attr.eSet(attr.eClass().getEStructuralFeature("endLine"), new Integer(lineNumber));
					prevLineNumber = lineNumber;
				}
				if(locator.getColumnNumber() != -1) {
					int n = 0;
// Seems necessary in Java 1.6 but not in Java 1.5
//					String next = new String(ch, start + length, 2);
//					if("</".equals(next)) {
//						n = 2;
//					} else if(next.startsWith("<")) {
//						n = 1;
//					}
					int columnNumber = locator.getColumnNumber() - n;
					attr.eSet(attr.eClass().getEStructuralFeature("startColumn"), new Integer(prevColumnNumber));
					attr.eSet(attr.eClass().getEStructuralFeature("endColumn"), new Integer(columnNumber));
					prevColumnNumber = columnNumber;
				}
			}
		}
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		EObject parent = current;

		EClass ec;
		if(current == null) {
			ec = (EClass) target.getReferenceModel().getMetaElementByName("Root");
			root =  (EObject) target.newElement(ec);
			current = root;
		} else {
			ec = (EClass) target.getReferenceModel().getMetaElementByName("Element");
			current = ec.getEPackage().getEFactoryInstance().create(ec);
			current.eSet(ec.getEStructuralFeature("parent"), parent);
		}
		current.eSet(ec.getEStructuralFeature("name"), new String(qName));
		
		EClass attrClass = (EClass) target.getReferenceModel().getMetaElementByName("Attribute");
		for(int i = 0 ; i < attributes.getLength() ; i++) {
			EObject attr = attrClass.getEPackage().getEFactoryInstance().create(attrClass);
			attr.eSet(attrClass.getEStructuralFeature("name"), new String(attributes.getQName(i)));
			attr.eSet(attrClass.getEStructuralFeature("value"), new String(attributes.getValue(i)));
			attr.eSet(attrClass.getEStructuralFeature("parent"), current);
		}
		
		if(locator != null) {
			if(locator.getLineNumber() != -1) {
				current.eSet(ec.getEStructuralFeature("startLine"), new Integer(prevLineNumber));
				prevLineNumber = locator.getLineNumber();
			}
			if(locator.getColumnNumber() != -1) {
				current.eSet(ec.getEStructuralFeature("startColumn"), new Integer(prevColumnNumber));
				prevColumnNumber = locator.getColumnNumber();
			}
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		EObject parent = (EObject) current.eGet(current.eClass().getEStructuralFeature("parent"));
		if(locator != null) {
			if(locator.getLineNumber() != -1) {
				prevLineNumber = locator.getLineNumber();
				current.eSet(current.eClass().getEStructuralFeature("endLine"), new Integer(prevLineNumber));
			}
			if(locator.getColumnNumber() != -1) {
				prevColumnNumber = locator.getColumnNumber();
				current.eSet(current.eClass().getEStructuralFeature("endColumn"), new Integer(prevColumnNumber));
			}
		}
		if(parent instanceof EObject) {
			current = parent;
		} else {
			current = null;
		}
	}
}
