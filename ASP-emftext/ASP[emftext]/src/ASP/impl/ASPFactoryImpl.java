/**
 */
package ASP.impl;

import ASP.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASPFactoryImpl extends EFactoryImpl implements ASPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ASPFactory init() {
		try {
			ASPFactory theASPFactory = (ASPFactory)EPackage.Registry.INSTANCE.getEFactory("http://asp.ecore"); 
			if (theASPFactory != null) {
				return theASPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ASPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASPFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ASPPackage.TRANSFORMATION: return createTransformation();
			case ASPPackage.LEFT_PATTERN: return createLeftPattern();
			case ASPPackage.RIGHT_PATTERN: return createRightPattern();
			case ASPPackage.CONSTRAINT: return createConstraint();
			case ASPPackage.NOT: return createNot();
			case ASPPackage.EQ: return createEq();
			case ASPPackage.EQ_SIMPLE: return createEqSimple();
			case ASPPackage.NOT_EQ: return createNotEq();
			case ASPPackage.LITERAL: return createLiteral();
			case ASPPackage.NODE: return createNode();
			case ASPPackage.PROP: return createProp();
			case ASPPackage.EDGE: return createEdge();
			case ASPPackage.RELATION: return createRelation();
			case ASPPackage.TERMINAL: return createTerminal();
			case ASPPackage.METAMODEL: return createMetamodel();
			case ASPPackage.METANODE: return createMetanode();
			case ASPPackage.METAPROP: return createMetaprop();
			case ASPPackage.METAEDGE: return createMetaedge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftPattern createLeftPattern() {
		LeftPatternImpl leftPattern = new LeftPatternImpl();
		return leftPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightPattern createRightPattern() {
		RightPatternImpl rightPattern = new RightPatternImpl();
		return rightPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eq createEq() {
		EqImpl eq = new EqImpl();
		return eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqSimple createEqSimple() {
		EqSimpleImpl eqSimple = new EqSimpleImpl();
		return eqSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEq createNotEq() {
		NotEqImpl notEq = new NotEqImpl();
		return notEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prop createProp() {
		PropImpl prop = new PropImpl();
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metanode createMetanode() {
		MetanodeImpl metanode = new MetanodeImpl();
		return metanode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaprop createMetaprop() {
		MetapropImpl metaprop = new MetapropImpl();
		return metaprop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaedge createMetaedge() {
		MetaedgeImpl metaedge = new MetaedgeImpl();
		return metaedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASPPackage getASPPackage() {
		return (ASPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ASPPackage getPackage() {
		return ASPPackage.eINSTANCE;
	}

} //ASPFactoryImpl
