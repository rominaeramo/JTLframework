/**
 */
package ASP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ASP.ASPFactory
 * @model kind="package"
 * @generated
 */
public interface ASPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ASP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://asp.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ASP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASPPackage eINSTANCE = ASP.impl.ASPPackageImpl.init();

	/**
	 * The meta object id for the '{@link ASP.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.LocatedElementImpl
	 * @see ASP.impl.ASPPackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COMMENTS_BEFORE = 1;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COMMENTS_AFTER = 2;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ASP.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.TransformationImpl
	 * @see ASP.impl.ASPPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__METAMODELS = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__USED_LITERALS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CONSTRAINTS = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ELEMENTS = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RELATIONS = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ASP.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.PatternImpl
	 * @see ASP.impl.ASPPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ELEMENT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__RELATION_ID = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Metanode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__IS_METANODE = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Metaprop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__IS_METAPROP = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Metaedge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__IS_METAEDGE = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ASP.impl.LeftPatternImpl <em>Left Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.LeftPatternImpl
	 * @see ASP.impl.ASPPackageImpl#getLeftPattern()
	 * @generated
	 */
	int LEFT_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__LOCATION = PATTERN__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__COMMENTS_BEFORE = PATTERN__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__COMMENTS_AFTER = PATTERN__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__ELEMENT = PATTERN__ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__NAME = PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Relation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__RELATION_ID = PATTERN__RELATION_ID;

	/**
	 * The feature id for the '<em><b>Is Metanode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__IS_METANODE = PATTERN__IS_METANODE;

	/**
	 * The feature id for the '<em><b>Is Metaprop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__IS_METAPROP = PATTERN__IS_METAPROP;

	/**
	 * The feature id for the '<em><b>Is Metaedge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__IS_METAEDGE = PATTERN__IS_METAEDGE;

	/**
	 * The number of structural features of the '<em>Left Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASP.impl.RightPatternImpl <em>Right Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.RightPatternImpl
	 * @see ASP.impl.ASPPackageImpl#getRightPattern()
	 * @generated
	 */
	int RIGHT_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__LOCATION = PATTERN__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__COMMENTS_BEFORE = PATTERN__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__COMMENTS_AFTER = PATTERN__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__ELEMENT = PATTERN__ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__NAME = PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Relation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__RELATION_ID = PATTERN__RELATION_ID;

	/**
	 * The feature id for the '<em><b>Is Metanode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__IS_METANODE = PATTERN__IS_METANODE;

	/**
	 * The feature id for the '<em><b>Is Metaprop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__IS_METAPROP = PATTERN__IS_METAPROP;

	/**
	 * The feature id for the '<em><b>Is Metaedge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__IS_METAEDGE = PATTERN__IS_METAEDGE;

	/**
	 * The number of structural features of the '<em>Right Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASP.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.ElementImpl
	 * @see ASP.impl.ASPPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ASP.impl.PatternElementImpl <em>Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.PatternElementImpl
	 * @see ASP.impl.ASPPackageImpl#getPatternElement()
	 * @generated
	 */
	int PATTERN_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__LOCATION = ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__COMMENTS_BEFORE = ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__COMMENTS_AFTER = ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT__METAMODEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ASP.impl.TerminalElementImpl <em>Terminal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.TerminalElementImpl
	 * @see ASP.impl.ASPPackageImpl#getTerminalElement()
	 * @generated
	 */
	int TERMINAL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ELEMENT__LOCATION = ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ELEMENT__COMMENTS_BEFORE = ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ELEMENT__COMMENTS_AFTER = ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Terminal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASP.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.ConstraintImpl
	 * @see ASP.impl.ASPPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTENTS = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ASP.impl.ConstraintElementImpl <em>Constraint Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.ConstraintElementImpl
	 * @see ASP.impl.ASPPackageImpl#getConstraintElement()
	 * @generated
	 */
	int CONSTRAINT_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ELEMENT__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ELEMENT__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ELEMENT__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The number of structural features of the '<em>Constraint Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ELEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASP.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.ExpressionImpl
	 * @see ASP.impl.ASPPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LOCATION = ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COMMENTS_BEFORE = ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COMMENTS_AFTER = ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASP.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.NotImpl
	 * @see ASP.impl.ASPPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ASP.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.FunctionParameterImpl
	 * @see ASP.impl.ASPPackageImpl#getFunctionParameter()
	 * @generated
	 */
	int FUNCTION_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__PARAMETER_NAME = 0;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ASP.impl.EqImpl <em>Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.EqImpl
	 * @see ASP.impl.ASPPackageImpl#getEq()
	 * @generated
	 */
	int EQ = 13;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__PARAMETER_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__RIGHT1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ__LEFT1 = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ASP.impl.EqSimpleImpl <em>Eq Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.EqSimpleImpl
	 * @see ASP.impl.ASPPackageImpl#getEqSimple()
	 * @generated
	 */
	int EQ_SIMPLE = 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_SIMPLE__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_SIMPLE__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_SIMPLE__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_SIMPLE__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_SIMPLE__PARAMETER_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_SIMPLE__RIGHT1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_SIMPLE__LEFT1 = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Eq Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_SIMPLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ASP.impl.NotEqImpl <em>Not Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.NotEqImpl
	 * @see ASP.impl.ASPPackageImpl#getNotEq()
	 * @generated
	 */
	int NOT_EQ = 15;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQ__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQ__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQ__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQ__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQ__PARAMETER_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQ__RIGHT1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQ__LEFT1 = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Not Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ASP.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.LiteralImpl
	 * @see ASP.impl.ASPPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LOCATION = ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__COMMENTS_BEFORE = ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__COMMENTS_AFTER = ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__PARAMETER_NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__IS_DEFINITION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ASP.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.NodeImpl
	 * @see ASP.impl.ASPPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 17;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LOCATION = TERMINAL_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMMENTS_BEFORE = TERMINAL_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMMENTS_AFTER = TERMINAL_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = TERMINAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__METAMODEL = TERMINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__META_CLASS = TERMINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Nodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_NODEX = TERMINAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NODE_ID = TERMINAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_TRACE = TERMINAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = TERMINAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ASP.impl.PropImpl <em>Prop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.PropImpl
	 * @see ASP.impl.ASPPackageImpl#getProp()
	 * @generated
	 */
	int PROP = 18;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__LOCATION = TERMINAL_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__COMMENTS_BEFORE = TERMINAL_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__COMMENTS_AFTER = TERMINAL_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__NAME = TERMINAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__METAMODEL = TERMINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prop Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__PROP_ID = TERMINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meta Class Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__META_CLASS_ID = TERMINAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prop Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__PROP_VALUE = TERMINAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Propx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__IS_PROPX = TERMINAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__IS_TRACE = TERMINAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Prop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_FEATURE_COUNT = TERMINAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ASP.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.EdgeImpl
	 * @see ASP.impl.ASPPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 19;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LOCATION = TERMINAL_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__COMMENTS_BEFORE = TERMINAL_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__COMMENTS_AFTER = TERMINAL_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = TERMINAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__METAMODEL = TERMINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edge Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EDGE_ID = TERMINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source MC Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE_MC_ID = TERMINAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target MC Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET_MC_ID = TERMINAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Edgex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__IS_EDGEX = TERMINAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__IS_TRACE = TERMINAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = TERMINAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ASP.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.RelationImpl
	 * @see ASP.impl.ASPPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 20;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LOCATION = LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__COMMENTS_BEFORE = LOCATED_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__COMMENTS_AFTER = LOCATED_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Lpattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LPATTERN = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rpattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RPATTERN = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RELATION_ID = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Left2right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LEFT2RIGHT = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Right2left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RIGHT2LEFT = LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ASP.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.TerminalImpl
	 * @see ASP.impl.ASPPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 21;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__LOCATION = EXPRESSION__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__COMMENTS_BEFORE = EXPRESSION__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__COMMENTS_AFTER = EXPRESSION__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONTENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ASP.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.MetamodelImpl
	 * @see ASP.impl.ASPPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 22;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__LOCATION = ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__COMMENTS_BEFORE = ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__COMMENTS_AFTER = ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASP.impl.MetanodeImpl <em>Metanode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.MetanodeImpl
	 * @see ASP.impl.ASPPackageImpl#getMetanode()
	 * @generated
	 */
	int METANODE = 23;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METANODE__LOCATION = PATTERN_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METANODE__COMMENTS_BEFORE = PATTERN_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METANODE__COMMENTS_AFTER = PATTERN_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METANODE__NAME = PATTERN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METANODE__METAMODEL = PATTERN_ELEMENT__METAMODEL;

	/**
	 * The number of structural features of the '<em>Metanode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METANODE_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASP.impl.MetapropImpl <em>Metaprop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.MetapropImpl
	 * @see ASP.impl.ASPPackageImpl#getMetaprop()
	 * @generated
	 */
	int METAPROP = 24;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAPROP__LOCATION = PATTERN_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAPROP__COMMENTS_BEFORE = PATTERN_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAPROP__COMMENTS_AFTER = PATTERN_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAPROP__NAME = PATTERN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAPROP__METAMODEL = PATTERN_ELEMENT__METAMODEL;

	/**
	 * The feature id for the '<em><b>Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAPROP__META_CLASS = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metaprop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAPROP_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ASP.impl.MetaedgeImpl <em>Metaedge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASP.impl.MetaedgeImpl
	 * @see ASP.impl.ASPPackageImpl#getMetaedge()
	 * @generated
	 */
	int METAEDGE = 25;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAEDGE__LOCATION = PATTERN_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAEDGE__COMMENTS_BEFORE = PATTERN_ELEMENT__COMMENTS_BEFORE;

	/**
	 * The feature id for the '<em><b>Comments After</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAEDGE__COMMENTS_AFTER = PATTERN_ELEMENT__COMMENTS_AFTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAEDGE__NAME = PATTERN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAEDGE__METAMODEL = PATTERN_ELEMENT__METAMODEL;

	/**
	 * The feature id for the '<em><b>Source Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAEDGE__SOURCE_META_CLASS = PATTERN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Meta Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAEDGE__TARGET_META_CLASS = PATTERN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metaedge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAEDGE_FEATURE_COUNT = PATTERN_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link ASP.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see ASP.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link ASP.LocatedElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ASP.LocatedElement#getLocation()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Location();

	/**
	 * Returns the meta object for the attribute list '{@link ASP.LocatedElement#getCommentsBefore <em>Comments Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments Before</em>'.
	 * @see ASP.LocatedElement#getCommentsBefore()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CommentsBefore();

	/**
	 * Returns the meta object for the attribute list '{@link ASP.LocatedElement#getCommentsAfter <em>Comments After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments After</em>'.
	 * @see ASP.LocatedElement#getCommentsAfter()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CommentsAfter();

	/**
	 * Returns the meta object for class '{@link ASP.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see ASP.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link ASP.Transformation#getMetamodels <em>Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodels</em>'.
	 * @see ASP.Transformation#getMetamodels()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Metamodels();

	/**
	 * Returns the meta object for the containment reference list '{@link ASP.Transformation#getUsedLiterals <em>Used Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Literals</em>'.
	 * @see ASP.Transformation#getUsedLiterals()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_UsedLiterals();

	/**
	 * Returns the meta object for the containment reference list '{@link ASP.Transformation#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see ASP.Transformation#getConstraints()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link ASP.Transformation#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see ASP.Transformation#getElements()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link ASP.Transformation#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see ASP.Transformation#getRelations()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Relations();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASP.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for class '{@link ASP.LeftPattern <em>Left Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Pattern</em>'.
	 * @see ASP.LeftPattern
	 * @generated
	 */
	EClass getLeftPattern();

	/**
	 * Returns the meta object for class '{@link ASP.RightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Pattern</em>'.
	 * @see ASP.RightPattern
	 * @generated
	 */
	EClass getRightPattern();

	/**
	 * Returns the meta object for class '{@link ASP.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see ASP.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Pattern#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see ASP.Pattern#getElement()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Element();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Pattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASP.Pattern#getName()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Name();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Pattern#getRelationId <em>Relation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Id</em>'.
	 * @see ASP.Pattern#getRelationId()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_RelationId();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Pattern#isIsMetanode <em>Is Metanode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Metanode</em>'.
	 * @see ASP.Pattern#isIsMetanode()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_IsMetanode();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Pattern#isIsMetaprop <em>Is Metaprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Metaprop</em>'.
	 * @see ASP.Pattern#isIsMetaprop()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_IsMetaprop();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Pattern#isIsMetaedge <em>Is Metaedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Metaedge</em>'.
	 * @see ASP.Pattern#isIsMetaedge()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_IsMetaedge();

	/**
	 * Returns the meta object for class '{@link ASP.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Element</em>'.
	 * @see ASP.PatternElement
	 * @generated
	 */
	EClass getPatternElement();

	/**
	 * Returns the meta object for the reference '{@link ASP.PatternElement#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see ASP.PatternElement#getMetamodel()
	 * @see #getPatternElement()
	 * @generated
	 */
	EReference getPatternElement_Metamodel();

	/**
	 * Returns the meta object for class '{@link ASP.TerminalElement <em>Terminal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Element</em>'.
	 * @see ASP.TerminalElement
	 * @generated
	 */
	EClass getTerminalElement();

	/**
	 * Returns the meta object for class '{@link ASP.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ASP.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link ASP.Constraint#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see ASP.Constraint#getContents()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Contents();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASP.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for class '{@link ASP.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ASP.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASP.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link ASP.ConstraintElement <em>Constraint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Element</em>'.
	 * @see ASP.ConstraintElement
	 * @generated
	 */
	EClass getConstraintElement();

	/**
	 * Returns the meta object for class '{@link ASP.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ASP.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link ASP.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see ASP.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Not#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see ASP.Not#getElement()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Element();

	/**
	 * Returns the meta object for class '{@link ASP.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see ASP.FunctionParameter
	 * @generated
	 */
	EClass getFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link ASP.FunctionParameter#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see ASP.FunctionParameter#getParameterName()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_ParameterName();

	/**
	 * Returns the meta object for class '{@link ASP.Eq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq</em>'.
	 * @see ASP.Eq
	 * @generated
	 */
	EClass getEq();

	/**
	 * Returns the meta object for the reference '{@link ASP.Eq#getRight1 <em>Right1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right1</em>'.
	 * @see ASP.Eq#getRight1()
	 * @see #getEq()
	 * @generated
	 */
	EReference getEq_Right1();

	/**
	 * Returns the meta object for the reference '{@link ASP.Eq#getLeft1 <em>Left1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left1</em>'.
	 * @see ASP.Eq#getLeft1()
	 * @see #getEq()
	 * @generated
	 */
	EReference getEq_Left1();

	/**
	 * Returns the meta object for class '{@link ASP.EqSimple <em>Eq Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Simple</em>'.
	 * @see ASP.EqSimple
	 * @generated
	 */
	EClass getEqSimple();

	/**
	 * Returns the meta object for the reference '{@link ASP.EqSimple#getRight1 <em>Right1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right1</em>'.
	 * @see ASP.EqSimple#getRight1()
	 * @see #getEqSimple()
	 * @generated
	 */
	EReference getEqSimple_Right1();

	/**
	 * Returns the meta object for the reference '{@link ASP.EqSimple#getLeft1 <em>Left1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left1</em>'.
	 * @see ASP.EqSimple#getLeft1()
	 * @see #getEqSimple()
	 * @generated
	 */
	EReference getEqSimple_Left1();

	/**
	 * Returns the meta object for class '{@link ASP.NotEq <em>Not Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Eq</em>'.
	 * @see ASP.NotEq
	 * @generated
	 */
	EClass getNotEq();

	/**
	 * Returns the meta object for the reference '{@link ASP.NotEq#getRight1 <em>Right1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right1</em>'.
	 * @see ASP.NotEq#getRight1()
	 * @see #getNotEq()
	 * @generated
	 */
	EReference getNotEq_Right1();

	/**
	 * Returns the meta object for the reference '{@link ASP.NotEq#getLeft1 <em>Left1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left1</em>'.
	 * @see ASP.NotEq#getLeft1()
	 * @see #getNotEq()
	 * @generated
	 */
	EReference getNotEq_Left1();

	/**
	 * Returns the meta object for class '{@link ASP.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see ASP.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Literal#isIsDefinition <em>Is Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Definition</em>'.
	 * @see ASP.Literal#isIsDefinition()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_IsDefinition();

	/**
	 * Returns the meta object for class '{@link ASP.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ASP.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link ASP.Node#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see ASP.Node#getMetamodel()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Metamodel();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Node#getMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Class</em>'.
	 * @see ASP.Node#getMetaClass()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_MetaClass();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Node#isIsNodex <em>Is Nodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nodex</em>'.
	 * @see ASP.Node#isIsNodex()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_IsNodex();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Node#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Id</em>'.
	 * @see ASP.Node#getNodeId()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Node#isIsTrace <em>Is Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Trace</em>'.
	 * @see ASP.Node#isIsTrace()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_IsTrace();

	/**
	 * Returns the meta object for class '{@link ASP.Prop <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prop</em>'.
	 * @see ASP.Prop
	 * @generated
	 */
	EClass getProp();

	/**
	 * Returns the meta object for the reference '{@link ASP.Prop#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see ASP.Prop#getMetamodel()
	 * @see #getProp()
	 * @generated
	 */
	EReference getProp_Metamodel();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Prop#getPropId <em>Prop Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prop Id</em>'.
	 * @see ASP.Prop#getPropId()
	 * @see #getProp()
	 * @generated
	 */
	EReference getProp_PropId();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Prop#getMetaClassId <em>Meta Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Class Id</em>'.
	 * @see ASP.Prop#getMetaClassId()
	 * @see #getProp()
	 * @generated
	 */
	EReference getProp_MetaClassId();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Prop#getPropValue <em>Prop Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prop Value</em>'.
	 * @see ASP.Prop#getPropValue()
	 * @see #getProp()
	 * @generated
	 */
	EReference getProp_PropValue();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Prop#isIsPropx <em>Is Propx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Propx</em>'.
	 * @see ASP.Prop#isIsPropx()
	 * @see #getProp()
	 * @generated
	 */
	EAttribute getProp_IsPropx();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Prop#isIsTrace <em>Is Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Trace</em>'.
	 * @see ASP.Prop#isIsTrace()
	 * @see #getProp()
	 * @generated
	 */
	EAttribute getProp_IsTrace();

	/**
	 * Returns the meta object for class '{@link ASP.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see ASP.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link ASP.Edge#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see ASP.Edge#getMetamodel()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Metamodel();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Edge#getEdgeId <em>Edge Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edge Id</em>'.
	 * @see ASP.Edge#getEdgeId()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_EdgeId();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Edge#getSourceMCId <em>Source MC Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source MC Id</em>'.
	 * @see ASP.Edge#getSourceMCId()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_SourceMCId();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Edge#getTargetMCId <em>Target MC Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target MC Id</em>'.
	 * @see ASP.Edge#getTargetMCId()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_TargetMCId();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Edge#isIsEdgex <em>Is Edgex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Edgex</em>'.
	 * @see ASP.Edge#isIsEdgex()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_IsEdgex();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Edge#isIsTrace <em>Is Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Trace</em>'.
	 * @see ASP.Edge#isIsTrace()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_IsTrace();

	/**
	 * Returns the meta object for class '{@link ASP.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see ASP.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Relation#getLpattern <em>Lpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lpattern</em>'.
	 * @see ASP.Relation#getLpattern()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Lpattern();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Relation#getRpattern <em>Rpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rpattern</em>'.
	 * @see ASP.Relation#getRpattern()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Rpattern();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Relation#getRelationId <em>Relation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Id</em>'.
	 * @see ASP.Relation#getRelationId()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_RelationId();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASP.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ASP.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Relation#isLeft2right <em>Left2right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left2right</em>'.
	 * @see ASP.Relation#isLeft2right()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Left2right();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Relation#isRight2left <em>Right2left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right2left</em>'.
	 * @see ASP.Relation#isRight2left()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Right2left();

	/**
	 * Returns the meta object for class '{@link ASP.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see ASP.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the containment reference '{@link ASP.Terminal#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see ASP.Terminal#getContent()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Content();

	/**
	 * Returns the meta object for class '{@link ASP.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see ASP.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for class '{@link ASP.Metanode <em>Metanode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metanode</em>'.
	 * @see ASP.Metanode
	 * @generated
	 */
	EClass getMetanode();

	/**
	 * Returns the meta object for class '{@link ASP.Metaprop <em>Metaprop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metaprop</em>'.
	 * @see ASP.Metaprop
	 * @generated
	 */
	EClass getMetaprop();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Metaprop#getMetaClass <em>Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Class</em>'.
	 * @see ASP.Metaprop#getMetaClass()
	 * @see #getMetaprop()
	 * @generated
	 */
	EAttribute getMetaprop_MetaClass();

	/**
	 * Returns the meta object for class '{@link ASP.Metaedge <em>Metaedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metaedge</em>'.
	 * @see ASP.Metaedge
	 * @generated
	 */
	EClass getMetaedge();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Metaedge#getSourceMetaClass <em>Source Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Meta Class</em>'.
	 * @see ASP.Metaedge#getSourceMetaClass()
	 * @see #getMetaedge()
	 * @generated
	 */
	EAttribute getMetaedge_SourceMetaClass();

	/**
	 * Returns the meta object for the attribute '{@link ASP.Metaedge#getTargetMetaClass <em>Target Meta Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Meta Class</em>'.
	 * @see ASP.Metaedge#getTargetMetaClass()
	 * @see #getMetaedge()
	 * @generated
	 */
	EAttribute getMetaedge_TargetMetaClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ASPFactory getASPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ASP.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.LocatedElementImpl
		 * @see ASP.impl.ASPPackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__LOCATION = eINSTANCE.getLocatedElement_Location();

		/**
		 * The meta object literal for the '<em><b>Comments Before</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COMMENTS_BEFORE = eINSTANCE.getLocatedElement_CommentsBefore();

		/**
		 * The meta object literal for the '<em><b>Comments After</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COMMENTS_AFTER = eINSTANCE.getLocatedElement_CommentsAfter();

		/**
		 * The meta object literal for the '{@link ASP.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.TransformationImpl
		 * @see ASP.impl.ASPPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__METAMODELS = eINSTANCE.getTransformation_Metamodels();

		/**
		 * The meta object literal for the '<em><b>Used Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__USED_LITERALS = eINSTANCE.getTransformation_UsedLiterals();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__CONSTRAINTS = eINSTANCE.getTransformation_Constraints();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__ELEMENTS = eINSTANCE.getTransformation_Elements();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RELATIONS = eINSTANCE.getTransformation_Relations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '{@link ASP.impl.LeftPatternImpl <em>Left Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.LeftPatternImpl
		 * @see ASP.impl.ASPPackageImpl#getLeftPattern()
		 * @generated
		 */
		EClass LEFT_PATTERN = eINSTANCE.getLeftPattern();

		/**
		 * The meta object literal for the '{@link ASP.impl.RightPatternImpl <em>Right Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.RightPatternImpl
		 * @see ASP.impl.ASPPackageImpl#getRightPattern()
		 * @generated
		 */
		EClass RIGHT_PATTERN = eINSTANCE.getRightPattern();

		/**
		 * The meta object literal for the '{@link ASP.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.PatternImpl
		 * @see ASP.impl.ASPPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__ELEMENT = eINSTANCE.getPattern_Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Relation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__RELATION_ID = eINSTANCE.getPattern_RelationId();

		/**
		 * The meta object literal for the '<em><b>Is Metanode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__IS_METANODE = eINSTANCE.getPattern_IsMetanode();

		/**
		 * The meta object literal for the '<em><b>Is Metaprop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__IS_METAPROP = eINSTANCE.getPattern_IsMetaprop();

		/**
		 * The meta object literal for the '<em><b>Is Metaedge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__IS_METAEDGE = eINSTANCE.getPattern_IsMetaedge();

		/**
		 * The meta object literal for the '{@link ASP.impl.PatternElementImpl <em>Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.PatternElementImpl
		 * @see ASP.impl.ASPPackageImpl#getPatternElement()
		 * @generated
		 */
		EClass PATTERN_ELEMENT = eINSTANCE.getPatternElement();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_ELEMENT__METAMODEL = eINSTANCE.getPatternElement_Metamodel();

		/**
		 * The meta object literal for the '{@link ASP.impl.TerminalElementImpl <em>Terminal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.TerminalElementImpl
		 * @see ASP.impl.ASPPackageImpl#getTerminalElement()
		 * @generated
		 */
		EClass TERMINAL_ELEMENT = eINSTANCE.getTerminalElement();

		/**
		 * The meta object literal for the '{@link ASP.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.ConstraintImpl
		 * @see ASP.impl.ASPPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONTENTS = eINSTANCE.getConstraint_Contents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '{@link ASP.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.ElementImpl
		 * @see ASP.impl.ASPPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link ASP.impl.ConstraintElementImpl <em>Constraint Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.ConstraintElementImpl
		 * @see ASP.impl.ASPPackageImpl#getConstraintElement()
		 * @generated
		 */
		EClass CONSTRAINT_ELEMENT = eINSTANCE.getConstraintElement();

		/**
		 * The meta object literal for the '{@link ASP.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.ExpressionImpl
		 * @see ASP.impl.ASPPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link ASP.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.NotImpl
		 * @see ASP.impl.ASPPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__ELEMENT = eINSTANCE.getNot_Element();

		/**
		 * The meta object literal for the '{@link ASP.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.FunctionParameterImpl
		 * @see ASP.impl.ASPPackageImpl#getFunctionParameter()
		 * @generated
		 */
		EClass FUNCTION_PARAMETER = eINSTANCE.getFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__PARAMETER_NAME = eINSTANCE.getFunctionParameter_ParameterName();

		/**
		 * The meta object literal for the '{@link ASP.impl.EqImpl <em>Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.EqImpl
		 * @see ASP.impl.ASPPackageImpl#getEq()
		 * @generated
		 */
		EClass EQ = eINSTANCE.getEq();

		/**
		 * The meta object literal for the '<em><b>Right1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ__RIGHT1 = eINSTANCE.getEq_Right1();

		/**
		 * The meta object literal for the '<em><b>Left1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ__LEFT1 = eINSTANCE.getEq_Left1();

		/**
		 * The meta object literal for the '{@link ASP.impl.EqSimpleImpl <em>Eq Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.EqSimpleImpl
		 * @see ASP.impl.ASPPackageImpl#getEqSimple()
		 * @generated
		 */
		EClass EQ_SIMPLE = eINSTANCE.getEqSimple();

		/**
		 * The meta object literal for the '<em><b>Right1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ_SIMPLE__RIGHT1 = eINSTANCE.getEqSimple_Right1();

		/**
		 * The meta object literal for the '<em><b>Left1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQ_SIMPLE__LEFT1 = eINSTANCE.getEqSimple_Left1();

		/**
		 * The meta object literal for the '{@link ASP.impl.NotEqImpl <em>Not Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.NotEqImpl
		 * @see ASP.impl.ASPPackageImpl#getNotEq()
		 * @generated
		 */
		EClass NOT_EQ = eINSTANCE.getNotEq();

		/**
		 * The meta object literal for the '<em><b>Right1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EQ__RIGHT1 = eINSTANCE.getNotEq_Right1();

		/**
		 * The meta object literal for the '<em><b>Left1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EQ__LEFT1 = eINSTANCE.getNotEq_Left1();

		/**
		 * The meta object literal for the '{@link ASP.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.LiteralImpl
		 * @see ASP.impl.ASPPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Is Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__IS_DEFINITION = eINSTANCE.getLiteral_IsDefinition();

		/**
		 * The meta object literal for the '{@link ASP.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.NodeImpl
		 * @see ASP.impl.ASPPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__METAMODEL = eINSTANCE.getNode_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Meta Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__META_CLASS = eINSTANCE.getNode_MetaClass();

		/**
		 * The meta object literal for the '<em><b>Is Nodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IS_NODEX = eINSTANCE.getNode_IsNodex();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__NODE_ID = eINSTANCE.getNode_NodeId();

		/**
		 * The meta object literal for the '<em><b>Is Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IS_TRACE = eINSTANCE.getNode_IsTrace();

		/**
		 * The meta object literal for the '{@link ASP.impl.PropImpl <em>Prop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.PropImpl
		 * @see ASP.impl.ASPPackageImpl#getProp()
		 * @generated
		 */
		EClass PROP = eINSTANCE.getProp();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROP__METAMODEL = eINSTANCE.getProp_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Prop Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROP__PROP_ID = eINSTANCE.getProp_PropId();

		/**
		 * The meta object literal for the '<em><b>Meta Class Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROP__META_CLASS_ID = eINSTANCE.getProp_MetaClassId();

		/**
		 * The meta object literal for the '<em><b>Prop Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROP__PROP_VALUE = eINSTANCE.getProp_PropValue();

		/**
		 * The meta object literal for the '<em><b>Is Propx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROP__IS_PROPX = eINSTANCE.getProp_IsPropx();

		/**
		 * The meta object literal for the '<em><b>Is Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROP__IS_TRACE = eINSTANCE.getProp_IsTrace();

		/**
		 * The meta object literal for the '{@link ASP.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.EdgeImpl
		 * @see ASP.impl.ASPPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__METAMODEL = eINSTANCE.getEdge_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Edge Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__EDGE_ID = eINSTANCE.getEdge_EdgeId();

		/**
		 * The meta object literal for the '<em><b>Source MC Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE_MC_ID = eINSTANCE.getEdge_SourceMCId();

		/**
		 * The meta object literal for the '<em><b>Target MC Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET_MC_ID = eINSTANCE.getEdge_TargetMCId();

		/**
		 * The meta object literal for the '<em><b>Is Edgex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__IS_EDGEX = eINSTANCE.getEdge_IsEdgex();

		/**
		 * The meta object literal for the '<em><b>Is Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__IS_TRACE = eINSTANCE.getEdge_IsTrace();

		/**
		 * The meta object literal for the '{@link ASP.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.RelationImpl
		 * @see ASP.impl.ASPPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Lpattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__LPATTERN = eINSTANCE.getRelation_Lpattern();

		/**
		 * The meta object literal for the '<em><b>Rpattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__RPATTERN = eINSTANCE.getRelation_Rpattern();

		/**
		 * The meta object literal for the '<em><b>Relation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__RELATION_ID = eINSTANCE.getRelation_RelationId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Left2right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__LEFT2RIGHT = eINSTANCE.getRelation_Left2right();

		/**
		 * The meta object literal for the '<em><b>Right2left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__RIGHT2LEFT = eINSTANCE.getRelation_Right2left();

		/**
		 * The meta object literal for the '{@link ASP.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.TerminalImpl
		 * @see ASP.impl.ASPPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__CONTENT = eINSTANCE.getTerminal_Content();

		/**
		 * The meta object literal for the '{@link ASP.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.MetamodelImpl
		 * @see ASP.impl.ASPPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '{@link ASP.impl.MetanodeImpl <em>Metanode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.MetanodeImpl
		 * @see ASP.impl.ASPPackageImpl#getMetanode()
		 * @generated
		 */
		EClass METANODE = eINSTANCE.getMetanode();

		/**
		 * The meta object literal for the '{@link ASP.impl.MetapropImpl <em>Metaprop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.MetapropImpl
		 * @see ASP.impl.ASPPackageImpl#getMetaprop()
		 * @generated
		 */
		EClass METAPROP = eINSTANCE.getMetaprop();

		/**
		 * The meta object literal for the '<em><b>Meta Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAPROP__META_CLASS = eINSTANCE.getMetaprop_MetaClass();

		/**
		 * The meta object literal for the '{@link ASP.impl.MetaedgeImpl <em>Metaedge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASP.impl.MetaedgeImpl
		 * @see ASP.impl.ASPPackageImpl#getMetaedge()
		 * @generated
		 */
		EClass METAEDGE = eINSTANCE.getMetaedge();

		/**
		 * The meta object literal for the '<em><b>Source Meta Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAEDGE__SOURCE_META_CLASS = eINSTANCE.getMetaedge_SourceMetaClass();

		/**
		 * The meta object literal for the '<em><b>Target Meta Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAEDGE__TARGET_META_CLASS = eINSTANCE.getMetaedge_TargetMetaClass();

	}

} //ASPPackage
