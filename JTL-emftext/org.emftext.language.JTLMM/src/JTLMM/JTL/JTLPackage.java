/**
 */
package JTLMM.JTL;

import JTLMM.emof.EmofPackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see JTLMM.JTL.JTLFactory
 * @model kind="package"
 * @generated
 */
public interface JTLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "JTL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http:///jtl.ecore";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "JTL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JTLPackage eINSTANCE = JTLMM.JTL.impl.JTLPackageImpl.init();

  /**
   * The meta object id for the '{@link JTLMM.JTL.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JTLMM.JTL.impl.TransformationImpl
   * @see JTLMM.JTL.impl.JTLPackageImpl#getTransformation()
   * @generated
   */
  int TRANSFORMATION = 0;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__TAG = EmofPackage.CLASS__TAG;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__NAME = EmofPackage.CLASS__NAME;

  /**
   * The feature id for the '<em><b>Package</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__PACKAGE = EmofPackage.CLASS__PACKAGE;

  /**
   * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

  /**
   * The feature id for the '<em><b>Super Class</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

  /**
   * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__OWNED_TYPE = EmofPackage.CLASS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nested Package</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__NESTED_PACKAGE = EmofPackage.CLASS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__URI = EmofPackage.CLASS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Model Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__MODEL_PARAMETER = EmofPackage.CLASS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__RELATION = EmofPackage.CLASS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_OPERATION_COUNT = EmofPackage.CLASS_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link JTLMM.JTL.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JTLMM.JTL.impl.RelationImpl
   * @see JTLMM.JTL.impl.JTLPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TAG = EmofPackage.NAMED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__OWNED_COMMENT = EmofPackage.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = EmofPackage.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Transformation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TRANSFORMATION = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DOMAIN = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__WHERE = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__WHEN = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Is Top Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__IS_TOP_LEVEL = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__VARIABLE = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_OPERATION_COUNT = EmofPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link JTLMM.JTL.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JTLMM.JTL.impl.DomainImpl
   * @see JTLMM.JTL.impl.JTLPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 2;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__TAG = EmofPackage.NAMED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__OWNED_COMMENT = EmofPackage.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = EmofPackage.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Is Checkable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__IS_CHECKABLE = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Enforceable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__IS_ENFORCEABLE = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Relation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__RELATION = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__PATTERN = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__MODEL = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Root Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__ROOT_VARIABLE = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_OPERATION_COUNT = EmofPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link JTLMM.JTL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JTLMM.JTL.impl.ModelImpl
   * @see JTLMM.JTL.impl.JTLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 3;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TAG = EmofPackage.NAMED_ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OWNED_COMMENT = EmofPackage.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = EmofPackage.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Transformation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TRANSFORMATION = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Depends On</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DEPENDS_ON = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Used Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__USED_PACKAGE = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = EmofPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION_COUNT = EmofPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link JTLMM.JTL.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JTLMM.JTL.impl.PatternImpl
   * @see JTLMM.JTL.impl.JTLPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 4;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__TAG = EmofPackage.ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Where Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__WHERE_OWNER = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>When Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__WHEN_OWNER = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PREDICATE = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Binds To</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__BINDS_TO = EmofPackage.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Template Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__TEMPLATE_EXPRESSION = EmofPackage.ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Domain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__DOMAIN = EmofPackage.ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_OPERATION_COUNT = EmofPackage.ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link JTLMM.JTL.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JTLMM.JTL.impl.PredicateImpl
   * @see JTLMM.JTL.impl.JTLPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 5;

  /**
   * The feature id for the '<em><b>Tag</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__TAG = EmofPackage.ELEMENT__TAG;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__PATTERN = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__CONDITION_EXPRESSION = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_OPERATION_COUNT = EmofPackage.ELEMENT_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link JTLMM.JTL.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see JTLMM.JTL.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the containment reference list '{@link JTLMM.JTL.Transformation#getModelParameter <em>Model Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model Parameter</em>'.
   * @see JTLMM.JTL.Transformation#getModelParameter()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_ModelParameter();

  /**
   * Returns the meta object for the containment reference list '{@link JTLMM.JTL.Transformation#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relation</em>'.
   * @see JTLMM.JTL.Transformation#getRelation()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Relation();

  /**
   * Returns the meta object for class '{@link JTLMM.JTL.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see JTLMM.JTL.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the container reference '{@link JTLMM.JTL.Relation#getTransformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Transformation</em>'.
   * @see JTLMM.JTL.Relation#getTransformation()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Transformation();

  /**
   * Returns the meta object for the containment reference list '{@link JTLMM.JTL.Relation#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domain</em>'.
   * @see JTLMM.JTL.Relation#getDomain()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Domain();

  /**
   * Returns the meta object for the containment reference '{@link JTLMM.JTL.Relation#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where</em>'.
   * @see JTLMM.JTL.Relation#getWhere()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Where();

  /**
   * Returns the meta object for the containment reference '{@link JTLMM.JTL.Relation#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see JTLMM.JTL.Relation#getWhen()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_When();

  /**
   * Returns the meta object for the attribute '{@link JTLMM.JTL.Relation#isIsTopLevel <em>Is Top Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Top Level</em>'.
   * @see JTLMM.JTL.Relation#isIsTopLevel()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_IsTopLevel();

  /**
   * Returns the meta object for the containment reference list '{@link JTLMM.JTL.Relation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see JTLMM.JTL.Relation#getVariable()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Variable();

  /**
   * Returns the meta object for class '{@link JTLMM.JTL.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see JTLMM.JTL.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link JTLMM.JTL.Domain#isIsCheckable <em>Is Checkable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Checkable</em>'.
   * @see JTLMM.JTL.Domain#isIsCheckable()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_IsCheckable();

  /**
   * Returns the meta object for the attribute '{@link JTLMM.JTL.Domain#isIsEnforceable <em>Is Enforceable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Enforceable</em>'.
   * @see JTLMM.JTL.Domain#isIsEnforceable()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_IsEnforceable();

  /**
   * Returns the meta object for the container reference '{@link JTLMM.JTL.Domain#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Relation</em>'.
   * @see JTLMM.JTL.Domain#getRelation()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Relation();

  /**
   * Returns the meta object for the containment reference '{@link JTLMM.JTL.Domain#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see JTLMM.JTL.Domain#getPattern()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Pattern();

  /**
   * Returns the meta object for the reference '{@link JTLMM.JTL.Domain#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see JTLMM.JTL.Domain#getModel()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Model();

  /**
   * Returns the meta object for the reference '{@link JTLMM.JTL.Domain#getRootVariable <em>Root Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root Variable</em>'.
   * @see JTLMM.JTL.Domain#getRootVariable()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_RootVariable();

  /**
   * Returns the meta object for class '{@link JTLMM.JTL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see JTLMM.JTL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the container reference '{@link JTLMM.JTL.Model#getTransformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Transformation</em>'.
   * @see JTLMM.JTL.Model#getTransformation()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Transformation();

  /**
   * Returns the meta object for the reference list '{@link JTLMM.JTL.Model#getDependsOn <em>Depends On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Depends On</em>'.
   * @see JTLMM.JTL.Model#getDependsOn()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DependsOn();

  /**
   * Returns the meta object for the attribute '{@link JTLMM.JTL.Model#getUsedPackage <em>Used Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Package</em>'.
   * @see JTLMM.JTL.Model#getUsedPackage()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_UsedPackage();

  /**
   * Returns the meta object for class '{@link JTLMM.JTL.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see JTLMM.JTL.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the container reference '{@link JTLMM.JTL.Pattern#getWhereOwner <em>Where Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Where Owner</em>'.
   * @see JTLMM.JTL.Pattern#getWhereOwner()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_WhereOwner();

  /**
   * Returns the meta object for the container reference '{@link JTLMM.JTL.Pattern#getWhenOwner <em>When Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>When Owner</em>'.
   * @see JTLMM.JTL.Pattern#getWhenOwner()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_WhenOwner();

  /**
   * Returns the meta object for the containment reference list '{@link JTLMM.JTL.Pattern#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Predicate</em>'.
   * @see JTLMM.JTL.Pattern#getPredicate()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Predicate();

  /**
   * Returns the meta object for the containment reference list '{@link JTLMM.JTL.Pattern#getBindsTo <em>Binds To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binds To</em>'.
   * @see JTLMM.JTL.Pattern#getBindsTo()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_BindsTo();

  /**
   * Returns the meta object for the containment reference '{@link JTLMM.JTL.Pattern#getTemplateExpression <em>Template Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Expression</em>'.
   * @see JTLMM.JTL.Pattern#getTemplateExpression()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_TemplateExpression();

  /**
   * Returns the meta object for the reference '{@link JTLMM.JTL.Pattern#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Domain</em>'.
   * @see JTLMM.JTL.Pattern#getDomain()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Domain();

  /**
   * Returns the meta object for class '{@link JTLMM.JTL.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see JTLMM.JTL.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the container reference '{@link JTLMM.JTL.Predicate#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pattern</em>'.
   * @see JTLMM.JTL.Predicate#getPattern()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link JTLMM.JTL.Predicate#getConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition Expression</em>'.
   * @see JTLMM.JTL.Predicate#getConditionExpression()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_ConditionExpression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JTLFactory getJTLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link JTLMM.JTL.impl.TransformationImpl <em>Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JTLMM.JTL.impl.TransformationImpl
     * @see JTLMM.JTL.impl.JTLPackageImpl#getTransformation()
     * @generated
     */
    EClass TRANSFORMATION = eINSTANCE.getTransformation();

    /**
     * The meta object literal for the '<em><b>Model Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__MODEL_PARAMETER = eINSTANCE.getTransformation_ModelParameter();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__RELATION = eINSTANCE.getTransformation_Relation();

    /**
     * The meta object literal for the '{@link JTLMM.JTL.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JTLMM.JTL.impl.RelationImpl
     * @see JTLMM.JTL.impl.JTLPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Transformation</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__TRANSFORMATION = eINSTANCE.getRelation_Transformation();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__DOMAIN = eINSTANCE.getRelation_Domain();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__WHERE = eINSTANCE.getRelation_Where();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__WHEN = eINSTANCE.getRelation_When();

    /**
     * The meta object literal for the '<em><b>Is Top Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__IS_TOP_LEVEL = eINSTANCE.getRelation_IsTopLevel();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__VARIABLE = eINSTANCE.getRelation_Variable();

    /**
     * The meta object literal for the '{@link JTLMM.JTL.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JTLMM.JTL.impl.DomainImpl
     * @see JTLMM.JTL.impl.JTLPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Is Checkable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__IS_CHECKABLE = eINSTANCE.getDomain_IsCheckable();

    /**
     * The meta object literal for the '<em><b>Is Enforceable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__IS_ENFORCEABLE = eINSTANCE.getDomain_IsEnforceable();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__RELATION = eINSTANCE.getDomain_Relation();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__PATTERN = eINSTANCE.getDomain_Pattern();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__MODEL = eINSTANCE.getDomain_Model();

    /**
     * The meta object literal for the '<em><b>Root Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__ROOT_VARIABLE = eINSTANCE.getDomain_RootVariable();

    /**
     * The meta object literal for the '{@link JTLMM.JTL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JTLMM.JTL.impl.ModelImpl
     * @see JTLMM.JTL.impl.JTLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Transformation</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TRANSFORMATION = eINSTANCE.getModel_Transformation();

    /**
     * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DEPENDS_ON = eINSTANCE.getModel_DependsOn();

    /**
     * The meta object literal for the '<em><b>Used Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__USED_PACKAGE = eINSTANCE.getModel_UsedPackage();

    /**
     * The meta object literal for the '{@link JTLMM.JTL.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JTLMM.JTL.impl.PatternImpl
     * @see JTLMM.JTL.impl.JTLPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Where Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__WHERE_OWNER = eINSTANCE.getPattern_WhereOwner();

    /**
     * The meta object literal for the '<em><b>When Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__WHEN_OWNER = eINSTANCE.getPattern_WhenOwner();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__PREDICATE = eINSTANCE.getPattern_Predicate();

    /**
     * The meta object literal for the '<em><b>Binds To</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__BINDS_TO = eINSTANCE.getPattern_BindsTo();

    /**
     * The meta object literal for the '<em><b>Template Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__TEMPLATE_EXPRESSION = eINSTANCE.getPattern_TemplateExpression();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__DOMAIN = eINSTANCE.getPattern_Domain();

    /**
     * The meta object literal for the '{@link JTLMM.JTL.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JTLMM.JTL.impl.PredicateImpl
     * @see JTLMM.JTL.impl.JTLPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__PATTERN = eINSTANCE.getPredicate_Pattern();

    /**
     * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__CONDITION_EXPRESSION = eINSTANCE.getPredicate_ConditionExpression();

  }

} //JTLPackage
