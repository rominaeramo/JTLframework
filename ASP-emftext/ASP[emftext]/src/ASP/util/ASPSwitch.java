/**
 */
package ASP.util;

import ASP.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ASP.ASPPackage
 * @generated
 */
public class ASPSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ASPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASPSwitch() {
		if (modelPackage == null) {
			modelPackage = ASPPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ASPPackage.LOCATED_ELEMENT: {
				LocatedElement locatedElement = (LocatedElement)theEObject;
				T result = caseLocatedElement(locatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseLocatedElement(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.LEFT_PATTERN: {
				LeftPattern leftPattern = (LeftPattern)theEObject;
				T result = caseLeftPattern(leftPattern);
				if (result == null) result = casePattern(leftPattern);
				if (result == null) result = caseLocatedElement(leftPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.RIGHT_PATTERN: {
				RightPattern rightPattern = (RightPattern)theEObject;
				T result = caseRightPattern(rightPattern);
				if (result == null) result = casePattern(rightPattern);
				if (result == null) result = caseLocatedElement(rightPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseLocatedElement(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.PATTERN_ELEMENT: {
				PatternElement patternElement = (PatternElement)theEObject;
				T result = casePatternElement(patternElement);
				if (result == null) result = caseElement(patternElement);
				if (result == null) result = caseLocatedElement(patternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.TERMINAL_ELEMENT: {
				TerminalElement terminalElement = (TerminalElement)theEObject;
				T result = caseTerminalElement(terminalElement);
				if (result == null) result = caseElement(terminalElement);
				if (result == null) result = caseLocatedElement(terminalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseLocatedElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseLocatedElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.CONSTRAINT_ELEMENT: {
				ConstraintElement constraintElement = (ConstraintElement)theEObject;
				T result = caseConstraintElement(constraintElement);
				if (result == null) result = caseLocatedElement(constraintElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = caseConstraintElement(expression);
				if (result == null) result = caseLocatedElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseExpression(not);
				if (result == null) result = caseElement(not);
				if (result == null) result = caseConstraintElement(not);
				if (result == null) result = caseLocatedElement(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.FUNCTION_PARAMETER: {
				FunctionParameter functionParameter = (FunctionParameter)theEObject;
				T result = caseFunctionParameter(functionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.EQ: {
				Eq eq = (Eq)theEObject;
				T result = caseEq(eq);
				if (result == null) result = caseExpression(eq);
				if (result == null) result = caseFunctionParameter(eq);
				if (result == null) result = caseElement(eq);
				if (result == null) result = caseConstraintElement(eq);
				if (result == null) result = caseLocatedElement(eq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.EQ_SIMPLE: {
				EqSimple eqSimple = (EqSimple)theEObject;
				T result = caseEqSimple(eqSimple);
				if (result == null) result = caseExpression(eqSimple);
				if (result == null) result = caseFunctionParameter(eqSimple);
				if (result == null) result = caseElement(eqSimple);
				if (result == null) result = caseConstraintElement(eqSimple);
				if (result == null) result = caseLocatedElement(eqSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.NOT_EQ: {
				NotEq notEq = (NotEq)theEObject;
				T result = caseNotEq(notEq);
				if (result == null) result = caseExpression(notEq);
				if (result == null) result = caseFunctionParameter(notEq);
				if (result == null) result = caseElement(notEq);
				if (result == null) result = caseConstraintElement(notEq);
				if (result == null) result = caseLocatedElement(notEq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseElement(literal);
				if (result == null) result = caseFunctionParameter(literal);
				if (result == null) result = caseLocatedElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseTerminalElement(node);
				if (result == null) result = caseElement(node);
				if (result == null) result = caseLocatedElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.PROP: {
				Prop prop = (Prop)theEObject;
				T result = caseProp(prop);
				if (result == null) result = caseTerminalElement(prop);
				if (result == null) result = caseElement(prop);
				if (result == null) result = caseLocatedElement(prop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseTerminalElement(edge);
				if (result == null) result = caseElement(edge);
				if (result == null) result = caseLocatedElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseLocatedElement(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = caseExpression(terminal);
				if (result == null) result = caseElement(terminal);
				if (result == null) result = caseConstraintElement(terminal);
				if (result == null) result = caseLocatedElement(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.METAMODEL: {
				Metamodel metamodel = (Metamodel)theEObject;
				T result = caseMetamodel(metamodel);
				if (result == null) result = caseElement(metamodel);
				if (result == null) result = caseLocatedElement(metamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.METANODE: {
				Metanode metanode = (Metanode)theEObject;
				T result = caseMetanode(metanode);
				if (result == null) result = casePatternElement(metanode);
				if (result == null) result = caseElement(metanode);
				if (result == null) result = caseLocatedElement(metanode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.METAPROP: {
				Metaprop metaprop = (Metaprop)theEObject;
				T result = caseMetaprop(metaprop);
				if (result == null) result = casePatternElement(metaprop);
				if (result == null) result = caseElement(metaprop);
				if (result == null) result = caseLocatedElement(metaprop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ASPPackage.METAEDGE: {
				Metaedge metaedge = (Metaedge)theEObject;
				T result = caseMetaedge(metaedge);
				if (result == null) result = casePatternElement(metaedge);
				if (result == null) result = caseElement(metaedge);
				if (result == null) result = caseLocatedElement(metaedge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftPattern(LeftPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightPattern(RightPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminalElement(TerminalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintElement(ConstraintElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameter(FunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEq(Eq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eq Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eq Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqSimple(EqSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEq(NotEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProp(Prop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodel(Metamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metanode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metanode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetanode(Metanode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metaprop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metaprop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaprop(Metaprop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metaedge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metaedge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaedge(Metaedge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ASPSwitch
