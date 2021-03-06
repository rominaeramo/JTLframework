/**
 */
package JTLMM.essentialocl;

import JTLMM.emof.EmofPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see JTLMM.essentialocl.EssentialoclFactory
 * @model kind="package"
 * @generated
 */
public interface EssentialoclPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "essentialocl";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http:///essentialocl.ecore";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "essentialocl";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EssentialoclPackage eINSTANCE = JTLMM.essentialocl.impl.EssentialoclPackageImpl.init();

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.OclExpressionImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getOclExpression()
	 * @generated
	 */
  int OCL_EXPRESSION = 2;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCL_EXPRESSION__TAG = EmofPackage.TYPED_ELEMENT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCL_EXPRESSION__OWNED_COMMENT = EmofPackage.TYPED_ELEMENT__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCL_EXPRESSION__NAME = EmofPackage.TYPED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCL_EXPRESSION__TYPE = EmofPackage.TYPED_ELEMENT__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCL_EXPRESSION__TRY_BODY_OWNER = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCL_EXPRESSION_FEATURE_COUNT = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OCL_EXPRESSION_OPERATION_COUNT = EmofPackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.LiteralExpImpl <em>Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.LiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getLiteralExp()
	 * @generated
	 */
  int LITERAL_EXP = 16;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_EXP__TAG = OCL_EXPRESSION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_EXP__OWNED_COMMENT = OCL_EXPRESSION__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_EXP__NAME = OCL_EXPRESSION__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_EXP__TYPE = OCL_EXPRESSION__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_EXP__TRY_BODY_OWNER = OCL_EXPRESSION__TRY_BODY_OWNER;

  /**
	 * The number of structural features of the '<em>Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LITERAL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.PrimitiveLiteralExpImpl <em>Primitive Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.PrimitiveLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getPrimitiveLiteralExp()
	 * @generated
	 */
  int PRIMITIVE_LITERAL_EXP = 18;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRIMITIVE_LITERAL_EXP__TAG = LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRIMITIVE_LITERAL_EXP__OWNED_COMMENT = LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRIMITIVE_LITERAL_EXP__NAME = LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRIMITIVE_LITERAL_EXP__TYPE = LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRIMITIVE_LITERAL_EXP__TRY_BODY_OWNER = LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The number of structural features of the '<em>Primitive Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRIMITIVE_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Primitive Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRIMITIVE_LITERAL_EXP_OPERATION_COUNT = LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.BooleanLiteralExpImpl <em>Boolean Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.BooleanLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getBooleanLiteralExp()
	 * @generated
	 */
  int BOOLEAN_LITERAL_EXP = 0;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_LITERAL_EXP__TAG = PRIMITIVE_LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_LITERAL_EXP__OWNED_COMMENT = PRIMITIVE_LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_LITERAL_EXP__NAME = PRIMITIVE_LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_LITERAL_EXP__TYPE = PRIMITIVE_LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_LITERAL_EXP__TRY_BODY_OWNER = PRIMITIVE_LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Boolean Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Boolean Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Boolean Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_LITERAL_EXP_OPERATION_COUNT = PRIMITIVE_LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.CallExpImpl <em>Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.CallExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCallExp()
	 * @generated
	 */
  int CALL_EXP = 1;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CALL_EXP__TAG = OCL_EXPRESSION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CALL_EXP__OWNED_COMMENT = OCL_EXPRESSION__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CALL_EXP__NAME = OCL_EXPRESSION__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CALL_EXP__TYPE = OCL_EXPRESSION__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CALL_EXP__TRY_BODY_OWNER = OCL_EXPRESSION__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CALL_EXP__SOURCE = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Call Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Call Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CALL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.NumericLiteralExpImpl <em>Numeric Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.NumericLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getNumericLiteralExp()
	 * @generated
	 */
  int NUMERIC_LITERAL_EXP = 19;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMERIC_LITERAL_EXP__TAG = PRIMITIVE_LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMERIC_LITERAL_EXP__OWNED_COMMENT = PRIMITIVE_LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMERIC_LITERAL_EXP__NAME = PRIMITIVE_LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMERIC_LITERAL_EXP__TYPE = PRIMITIVE_LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMERIC_LITERAL_EXP__TRY_BODY_OWNER = PRIMITIVE_LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The number of structural features of the '<em>Numeric Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMERIC_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Numeric Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMERIC_LITERAL_EXP_OPERATION_COUNT = PRIMITIVE_LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.UnlimitedNaturalExpImpl <em>Unlimited Natural Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.UnlimitedNaturalExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getUnlimitedNaturalExp()
	 * @generated
	 */
  int UNLIMITED_NATURAL_EXP = 3;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNLIMITED_NATURAL_EXP__TAG = NUMERIC_LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNLIMITED_NATURAL_EXP__OWNED_COMMENT = NUMERIC_LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNLIMITED_NATURAL_EXP__NAME = NUMERIC_LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNLIMITED_NATURAL_EXP__TYPE = NUMERIC_LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNLIMITED_NATURAL_EXP__TRY_BODY_OWNER = NUMERIC_LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNLIMITED_NATURAL_EXP__SYMBOL = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Unlimited Natural Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNLIMITED_NATURAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Unlimited Natural Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UNLIMITED_NATURAL_EXP_OPERATION_COUNT = NUMERIC_LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.IfExpImpl <em>If Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.IfExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getIfExp()
	 * @generated
	 */
  int IF_EXP = 4;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP__TAG = OCL_EXPRESSION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP__OWNED_COMMENT = OCL_EXPRESSION__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP__NAME = OCL_EXPRESSION__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP__TYPE = OCL_EXPRESSION__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP__TRY_BODY_OWNER = OCL_EXPRESSION__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP__CONDITION = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP__THEN_EXPRESSION = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP__ELSE_EXPRESSION = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>If Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>If Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IF_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.LetExpImpl <em>Let Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.LetExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getLetExp()
	 * @generated
	 */
  int LET_EXP = 5;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP__TAG = OCL_EXPRESSION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP__OWNED_COMMENT = OCL_EXPRESSION__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP__NAME = OCL_EXPRESSION__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP__TYPE = OCL_EXPRESSION__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP__TRY_BODY_OWNER = OCL_EXPRESSION__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP__IN = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP__VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Let Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Let Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LET_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.VariableImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getVariable()
	 * @generated
	 */
  int VARIABLE = 6;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__TAG = EmofPackage.TYPED_ELEMENT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__OWNED_COMMENT = EmofPackage.TYPED_ELEMENT__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__NAME = EmofPackage.TYPED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__TYPE = EmofPackage.TYPED_ELEMENT__TYPE;

  /**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__INIT_EXPRESSION = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__LET_EXP = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Bind Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__BIND_PARAMETER = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Compute Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE__COMPUTE_OWNER = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_FEATURE_COUNT = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 4;

  /**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_OPERATION_COUNT = EmofPackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.FeaturePropertyCallImpl <em>Feature Property Call</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.FeaturePropertyCallImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getFeaturePropertyCall()
	 * @generated
	 */
  int FEATURE_PROPERTY_CALL = 29;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_PROPERTY_CALL__TAG = CALL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_PROPERTY_CALL__OWNED_COMMENT = CALL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_PROPERTY_CALL__NAME = CALL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_PROPERTY_CALL__TYPE = CALL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_PROPERTY_CALL__TRY_BODY_OWNER = CALL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_PROPERTY_CALL__SOURCE = CALL_EXP__SOURCE;

  /**
	 * The number of structural features of the '<em>Feature Property Call</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_PROPERTY_CALL_FEATURE_COUNT = CALL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Feature Property Call</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_PROPERTY_CALL_OPERATION_COUNT = CALL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.PropertyCallExpImpl <em>Property Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.PropertyCallExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getPropertyCallExp()
	 * @generated
	 */
  int PROPERTY_CALL_EXP = 7;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP__TAG = FEATURE_PROPERTY_CALL__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP__OWNED_COMMENT = FEATURE_PROPERTY_CALL__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP__NAME = FEATURE_PROPERTY_CALL__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP__TYPE = FEATURE_PROPERTY_CALL__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP__TRY_BODY_OWNER = FEATURE_PROPERTY_CALL__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP__SOURCE = FEATURE_PROPERTY_CALL__SOURCE;

  /**
	 * The feature id for the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP__REFERRED_PROPERTY = FEATURE_PROPERTY_CALL_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP_FEATURE_COUNT = FEATURE_PROPERTY_CALL_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_CALL_EXP_OPERATION_COUNT = FEATURE_PROPERTY_CALL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.VariableExpImpl <em>Variable Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.VariableExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getVariableExp()
	 * @generated
	 */
  int VARIABLE_EXP = 8;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_EXP__TAG = OCL_EXPRESSION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_EXP__OWNED_COMMENT = OCL_EXPRESSION__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_EXP__NAME = OCL_EXPRESSION__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_EXP__TYPE = OCL_EXPRESSION__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_EXP__TRY_BODY_OWNER = OCL_EXPRESSION__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_EXP__REFERRED_VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.TypeExpImpl <em>Type Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.TypeExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getTypeExp()
	 * @generated
	 */
  int TYPE_EXP = 9;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_EXP__TAG = OCL_EXPRESSION__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_EXP__OWNED_COMMENT = OCL_EXPRESSION__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_EXP__NAME = OCL_EXPRESSION__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_EXP__TYPE = OCL_EXPRESSION__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_EXP__TRY_BODY_OWNER = OCL_EXPRESSION__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Referred Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_EXP__REFERRED_TYPE = OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Type Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Type Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.LoopExpImpl <em>Loop Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.LoopExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getLoopExp()
	 * @generated
	 */
  int LOOP_EXP = 10;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP__TAG = CALL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP__OWNED_COMMENT = CALL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP__NAME = CALL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP__TYPE = CALL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP__TRY_BODY_OWNER = CALL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP__SOURCE = CALL_EXP__SOURCE;

  /**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP__BODY = CALL_EXP_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP__ITERATOR = CALL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP_FEATURE_COUNT = CALL_EXP_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LOOP_EXP_OPERATION_COUNT = CALL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.IteratorExpImpl <em>Iterator Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.IteratorExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getIteratorExp()
	 * @generated
	 */
  int ITERATOR_EXP = 11;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP__TAG = LOOP_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP__OWNED_COMMENT = LOOP_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP__NAME = LOOP_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP__TYPE = LOOP_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP__TRY_BODY_OWNER = LOOP_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP__SOURCE = LOOP_EXP__SOURCE;

  /**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP__BODY = LOOP_EXP__BODY;

  /**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP__ITERATOR = LOOP_EXP__ITERATOR;

  /**
	 * The number of structural features of the '<em>Iterator Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Iterator Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATOR_EXP_OPERATION_COUNT = LOOP_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.StringLiteralExpImpl <em>String Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.StringLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getStringLiteralExp()
	 * @generated
	 */
  int STRING_LITERAL_EXP = 12;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRING_LITERAL_EXP__TAG = PRIMITIVE_LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRING_LITERAL_EXP__OWNED_COMMENT = PRIMITIVE_LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRING_LITERAL_EXP__NAME = PRIMITIVE_LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRING_LITERAL_EXP__TYPE = PRIMITIVE_LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRING_LITERAL_EXP__TRY_BODY_OWNER = PRIMITIVE_LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>String Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRING_LITERAL_EXP__STRING_SYMBOL = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>String Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRING_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_LITERAL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>String Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STRING_LITERAL_EXP_OPERATION_COUNT = PRIMITIVE_LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.IntegerLiteralExpImpl <em>Integer Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.IntegerLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getIntegerLiteralExp()
	 * @generated
	 */
  int INTEGER_LITERAL_EXP = 13;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTEGER_LITERAL_EXP__TAG = NUMERIC_LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTEGER_LITERAL_EXP__OWNED_COMMENT = NUMERIC_LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTEGER_LITERAL_EXP__NAME = NUMERIC_LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTEGER_LITERAL_EXP__TYPE = NUMERIC_LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTEGER_LITERAL_EXP__TRY_BODY_OWNER = NUMERIC_LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Integer Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTEGER_LITERAL_EXP__INTEGER_SYMBOL = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Integer Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTEGER_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Integer Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INTEGER_LITERAL_EXP_OPERATION_COUNT = NUMERIC_LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.OperationCallExpImpl <em>Operation Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.OperationCallExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getOperationCallExp()
	 * @generated
	 */
  int OPERATION_CALL_EXP = 14;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP__TAG = FEATURE_PROPERTY_CALL__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP__OWNED_COMMENT = FEATURE_PROPERTY_CALL__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP__NAME = FEATURE_PROPERTY_CALL__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP__TYPE = FEATURE_PROPERTY_CALL__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP__TRY_BODY_OWNER = FEATURE_PROPERTY_CALL__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP__SOURCE = FEATURE_PROPERTY_CALL__SOURCE;

  /**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP__ARGUMENT = FEATURE_PROPERTY_CALL_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP__REFERRED_OPERATION = FEATURE_PROPERTY_CALL_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Operation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP_FEATURE_COUNT = FEATURE_PROPERTY_CALL_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Operation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_CALL_EXP_OPERATION_COUNT = FEATURE_PROPERTY_CALL_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.RealLiteralExpImpl <em>Real Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.RealLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getRealLiteralExp()
	 * @generated
	 */
  int REAL_LITERAL_EXP = 15;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REAL_LITERAL_EXP__TAG = NUMERIC_LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REAL_LITERAL_EXP__OWNED_COMMENT = NUMERIC_LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REAL_LITERAL_EXP__NAME = NUMERIC_LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REAL_LITERAL_EXP__TYPE = NUMERIC_LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REAL_LITERAL_EXP__TRY_BODY_OWNER = NUMERIC_LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Real Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REAL_LITERAL_EXP__REAL_SYMBOL = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Real Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REAL_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Real Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REAL_LITERAL_EXP_OPERATION_COUNT = NUMERIC_LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.IterateExpImpl <em>Iterate Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.IterateExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getIterateExp()
	 * @generated
	 */
  int ITERATE_EXP = 17;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__TAG = LOOP_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__OWNED_COMMENT = LOOP_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__NAME = LOOP_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__TYPE = LOOP_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__TRY_BODY_OWNER = LOOP_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__SOURCE = LOOP_EXP__SOURCE;

  /**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__BODY = LOOP_EXP__BODY;

  /**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__ITERATOR = LOOP_EXP__ITERATOR;

  /**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP__RESULT = LOOP_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Iterate Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Iterate Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ITERATE_EXP_OPERATION_COUNT = LOOP_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.CollectionLiteralExpImpl <em>Collection Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.CollectionLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionLiteralExp()
	 * @generated
	 */
  int COLLECTION_LITERAL_EXP = 20;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP__TAG = LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP__OWNED_COMMENT = LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP__NAME = LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP__TYPE = LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP__TRY_BODY_OWNER = LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP__KIND = LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP__PART = LITERAL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Collection Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Collection Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_EXP_OPERATION_COUNT = LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.CollectionLiteralPartImpl <em>Collection Literal Part</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.CollectionLiteralPartImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionLiteralPart()
	 * @generated
	 */
  int COLLECTION_LITERAL_PART = 21;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_PART__TAG = EmofPackage.TYPED_ELEMENT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_PART__OWNED_COMMENT = EmofPackage.TYPED_ELEMENT__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_PART__NAME = EmofPackage.TYPED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_PART__TYPE = EmofPackage.TYPED_ELEMENT__TYPE;

  /**
	 * The feature id for the '<em><b>Collection Literal Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Collection Literal Part</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_PART_FEATURE_COUNT = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Collection Literal Part</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_LITERAL_PART_OPERATION_COUNT = EmofPackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.CollectionItemImpl <em>Collection Item</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.CollectionItemImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionItem()
	 * @generated
	 */
  int COLLECTION_ITEM = 22;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_ITEM__TAG = COLLECTION_LITERAL_PART__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_ITEM__OWNED_COMMENT = COLLECTION_LITERAL_PART__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_ITEM__NAME = COLLECTION_LITERAL_PART__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_ITEM__TYPE = COLLECTION_LITERAL_PART__TYPE;

  /**
	 * The feature id for the '<em><b>Collection Literal Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_ITEM__COLLECTION_LITERAL_EXP = COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP;

  /**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_ITEM__ITEM = COLLECTION_LITERAL_PART_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Collection Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_ITEM_FEATURE_COUNT = COLLECTION_LITERAL_PART_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Collection Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_ITEM_OPERATION_COUNT = COLLECTION_LITERAL_PART_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.CollectionRangeImpl <em>Collection Range</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.CollectionRangeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionRange()
	 * @generated
	 */
  int COLLECTION_RANGE = 23;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE__TAG = COLLECTION_LITERAL_PART__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE__OWNED_COMMENT = COLLECTION_LITERAL_PART__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE__NAME = COLLECTION_LITERAL_PART__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE__TYPE = COLLECTION_LITERAL_PART__TYPE;

  /**
	 * The feature id for the '<em><b>Collection Literal Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE__COLLECTION_LITERAL_EXP = COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP;

  /**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE__FIRST = COLLECTION_LITERAL_PART_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE__LAST = COLLECTION_LITERAL_PART_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Collection Range</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE_FEATURE_COUNT = COLLECTION_LITERAL_PART_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Collection Range</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_RANGE_OPERATION_COUNT = COLLECTION_LITERAL_PART_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.TupleLiteralExpImpl <em>Tuple Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.TupleLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getTupleLiteralExp()
	 * @generated
	 */
  int TUPLE_LITERAL_EXP = 24;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_EXP__TAG = LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_EXP__OWNED_COMMENT = LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_EXP__NAME = LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_EXP__TYPE = LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_EXP__TRY_BODY_OWNER = LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_EXP__PART = LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Tuple Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Tuple Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_EXP_OPERATION_COUNT = LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.NullLiteralExpImpl <em>Null Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.NullLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getNullLiteralExp()
	 * @generated
	 */
  int NULL_LITERAL_EXP = 25;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NULL_LITERAL_EXP__TAG = LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NULL_LITERAL_EXP__OWNED_COMMENT = LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NULL_LITERAL_EXP__NAME = LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NULL_LITERAL_EXP__TYPE = LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NULL_LITERAL_EXP__TRY_BODY_OWNER = LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The number of structural features of the '<em>Null Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NULL_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Null Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NULL_LITERAL_EXP_OPERATION_COUNT = LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.OpaqueExpressionImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getOpaqueExpression()
	 * @generated
	 */
  int OPAQUE_EXPRESSION = 27;

  /**
	 * The number of structural features of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPAQUE_EXPRESSION_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPAQUE_EXPRESSION_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.ExpressionInOclImpl <em>Expression In Ocl</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.ExpressionInOclImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getExpressionInOcl()
	 * @generated
	 */
  int EXPRESSION_IN_OCL = 26;

  /**
	 * The feature id for the '<em><b>Body Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSION_IN_OCL__BODY_EXPRESSION = OPAQUE_EXPRESSION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSION_IN_OCL__CONTEXT = OPAQUE_EXPRESSION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Result Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSION_IN_OCL__RESULT_VARIABLE = OPAQUE_EXPRESSION_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Parameter Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSION_IN_OCL__PARAMETER_VARIABLE = OPAQUE_EXPRESSION_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Expression In Ocl</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSION_IN_OCL_FEATURE_COUNT = OPAQUE_EXPRESSION_FEATURE_COUNT + 4;

  /**
	 * The number of operations of the '<em>Expression In Ocl</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPRESSION_IN_OCL_OPERATION_COUNT = OPAQUE_EXPRESSION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.InvalidLiteralExpImpl <em>Invalid Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.InvalidLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getInvalidLiteralExp()
	 * @generated
	 */
  int INVALID_LITERAL_EXP = 28;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_LITERAL_EXP__TAG = LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_LITERAL_EXP__OWNED_COMMENT = LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_LITERAL_EXP__NAME = LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_LITERAL_EXP__TYPE = LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_LITERAL_EXP__TRY_BODY_OWNER = LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The number of structural features of the '<em>Invalid Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Invalid Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_LITERAL_EXP_OPERATION_COUNT = LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.TupleLiteralPartImpl <em>Tuple Literal Part</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.TupleLiteralPartImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getTupleLiteralPart()
	 * @generated
	 */
  int TUPLE_LITERAL_PART = 30;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_PART__TAG = EmofPackage.TYPED_ELEMENT__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_PART__OWNED_COMMENT = EmofPackage.TYPED_ELEMENT__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_PART__NAME = EmofPackage.TYPED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_PART__TYPE = EmofPackage.TYPED_ELEMENT__TYPE;

  /**
	 * The feature id for the '<em><b>Tuple Literal Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Tuple Literal Part</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_PART_FEATURE_COUNT = EmofPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Tuple Literal Part</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_LITERAL_PART_OPERATION_COUNT = EmofPackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.CollectionTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionType()
	 * @generated
	 */
  int COLLECTION_TYPE = 32;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_TYPE__TAG = EmofPackage.DATA_TYPE__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_TYPE__OWNED_COMMENT = EmofPackage.DATA_TYPE__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_TYPE__NAME = EmofPackage.DATA_TYPE__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_TYPE__PACKAGE = EmofPackage.DATA_TYPE__PACKAGE;

  /**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_TYPE__ELEMENT_TYPE = EmofPackage.DATA_TYPE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_TYPE_FEATURE_COUNT = EmofPackage.DATA_TYPE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COLLECTION_TYPE_OPERATION_COUNT = EmofPackage.DATA_TYPE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.BagTypeImpl <em>Bag Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.BagTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getBagType()
	 * @generated
	 */
  int BAG_TYPE = 31;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG_TYPE__TAG = COLLECTION_TYPE__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG_TYPE__OWNED_COMMENT = COLLECTION_TYPE__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG_TYPE__NAME = COLLECTION_TYPE__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG_TYPE__PACKAGE = COLLECTION_TYPE__PACKAGE;

  /**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

  /**
	 * The number of structural features of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BAG_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.EnumLiteralExpImpl <em>Enum Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.EnumLiteralExpImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getEnumLiteralExp()
	 * @generated
	 */
  int ENUM_LITERAL_EXP = 33;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUM_LITERAL_EXP__TAG = LITERAL_EXP__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUM_LITERAL_EXP__OWNED_COMMENT = LITERAL_EXP__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUM_LITERAL_EXP__NAME = LITERAL_EXP__NAME;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUM_LITERAL_EXP__TYPE = LITERAL_EXP__TYPE;

  /**
	 * The feature id for the '<em><b>Try Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUM_LITERAL_EXP__TRY_BODY_OWNER = LITERAL_EXP__TRY_BODY_OWNER;

  /**
	 * The feature id for the '<em><b>Referred Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL = LITERAL_EXP_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Enum Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUM_LITERAL_EXP_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Enum Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUM_LITERAL_EXP_OPERATION_COUNT = LITERAL_EXP_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.InvalidTypeImpl <em>Invalid Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.InvalidTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getInvalidType()
	 * @generated
	 */
  int INVALID_TYPE = 34;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_TYPE__TAG = EmofPackage.TYPE__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_TYPE__OWNED_COMMENT = EmofPackage.TYPE__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_TYPE__NAME = EmofPackage.TYPE__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_TYPE__PACKAGE = EmofPackage.TYPE__PACKAGE;

  /**
	 * The number of structural features of the '<em>Invalid Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_TYPE_FEATURE_COUNT = EmofPackage.TYPE_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Invalid Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVALID_TYPE_OPERATION_COUNT = EmofPackage.TYPE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.OrderedSetTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getOrderedSetType()
	 * @generated
	 */
  int ORDERED_SET_TYPE = 35;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET_TYPE__TAG = COLLECTION_TYPE__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET_TYPE__OWNED_COMMENT = COLLECTION_TYPE__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET_TYPE__NAME = COLLECTION_TYPE__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET_TYPE__PACKAGE = COLLECTION_TYPE__PACKAGE;

  /**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

  /**
	 * The number of structural features of the '<em>Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ORDERED_SET_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.SequenceTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getSequenceType()
	 * @generated
	 */
  int SEQUENCE_TYPE = 36;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE_TYPE__TAG = COLLECTION_TYPE__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE_TYPE__OWNED_COMMENT = COLLECTION_TYPE__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE_TYPE__NAME = COLLECTION_TYPE__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE_TYPE__PACKAGE = COLLECTION_TYPE__PACKAGE;

  /**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

  /**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SEQUENCE_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.SetTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getSetType()
	 * @generated
	 */
  int SET_TYPE = 37;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_TYPE__TAG = COLLECTION_TYPE__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_TYPE__OWNED_COMMENT = COLLECTION_TYPE__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_TYPE__NAME = COLLECTION_TYPE__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_TYPE__PACKAGE = COLLECTION_TYPE__PACKAGE;

  /**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

  /**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SET_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.TupleTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getTupleType()
	 * @generated
	 */
  int TUPLE_TYPE = 38;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE__TAG = EmofPackage.CLASS__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE__NAME = EmofPackage.CLASS__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE__PACKAGE = EmofPackage.CLASS__PACKAGE;

  /**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

  /**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

  /**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

  /**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

  /**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TUPLE_TYPE_OPERATION_COUNT = EmofPackage.CLASS_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.VoidTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getVoidType()
	 * @generated
	 */
  int VOID_TYPE = 39;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID_TYPE__TAG = EmofPackage.TYPE__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID_TYPE__OWNED_COMMENT = EmofPackage.TYPE__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID_TYPE__NAME = EmofPackage.TYPE__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID_TYPE__PACKAGE = EmofPackage.TYPE__PACKAGE;

  /**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID_TYPE_FEATURE_COUNT = EmofPackage.TYPE_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VOID_TYPE_OPERATION_COUNT = EmofPackage.TYPE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.impl.AnyTypeImpl <em>Any Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.impl.AnyTypeImpl
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getAnyType()
	 * @generated
	 */
  int ANY_TYPE = 40;

  /**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE__TAG = EmofPackage.CLASS__TAG;

  /**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE__NAME = EmofPackage.CLASS__NAME;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE__PACKAGE = EmofPackage.CLASS__PACKAGE;

  /**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

  /**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

  /**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

  /**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

  /**
	 * The number of structural features of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ANY_TYPE_OPERATION_COUNT = EmofPackage.CLASS_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link JTLMM.essentialocl.CollectionKind <em>Collection Kind</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see JTLMM.essentialocl.CollectionKind
	 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionKind()
	 * @generated
	 */
  int COLLECTION_KIND = 41;


  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.BooleanLiteralExp <em>Boolean Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal Exp</em>'.
	 * @see JTLMM.essentialocl.BooleanLiteralExp
	 * @generated
	 */
  EClass getBooleanLiteralExp();

  /**
	 * Returns the meta object for the attribute '{@link JTLMM.essentialocl.BooleanLiteralExp#isBooleanSymbol <em>Boolean Symbol</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Symbol</em>'.
	 * @see JTLMM.essentialocl.BooleanLiteralExp#isBooleanSymbol()
	 * @see #getBooleanLiteralExp()
	 * @generated
	 */
  EAttribute getBooleanLiteralExp_BooleanSymbol();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.CallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Exp</em>'.
	 * @see JTLMM.essentialocl.CallExp
	 * @generated
	 */
  EClass getCallExp();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.CallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see JTLMM.essentialocl.CallExp#getSource()
	 * @see #getCallExp()
	 * @generated
	 */
  EReference getCallExp_Source();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Expression</em>'.
	 * @see JTLMM.essentialocl.OclExpression
	 * @generated
	 */
  EClass getOclExpression();

  /**
	 * Returns the meta object for the container reference '{@link JTLMM.essentialocl.OclExpression#getTryBodyOwner <em>Try Body Owner</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Try Body Owner</em>'.
	 * @see JTLMM.essentialocl.OclExpression#getTryBodyOwner()
	 * @see #getOclExpression()
	 * @generated
	 */
  EReference getOclExpression_TryBodyOwner();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.UnlimitedNaturalExp <em>Unlimited Natural Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlimited Natural Exp</em>'.
	 * @see JTLMM.essentialocl.UnlimitedNaturalExp
	 * @generated
	 */
  EClass getUnlimitedNaturalExp();

  /**
	 * Returns the meta object for the attribute '{@link JTLMM.essentialocl.UnlimitedNaturalExp#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see JTLMM.essentialocl.UnlimitedNaturalExp#getSymbol()
	 * @see #getUnlimitedNaturalExp()
	 * @generated
	 */
  EAttribute getUnlimitedNaturalExp_Symbol();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.IfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Exp</em>'.
	 * @see JTLMM.essentialocl.IfExp
	 * @generated
	 */
  EClass getIfExp();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.IfExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see JTLMM.essentialocl.IfExp#getCondition()
	 * @see #getIfExp()
	 * @generated
	 */
  EReference getIfExp_Condition();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.IfExp#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see JTLMM.essentialocl.IfExp#getThenExpression()
	 * @see #getIfExp()
	 * @generated
	 */
  EReference getIfExp_ThenExpression();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.IfExp#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see JTLMM.essentialocl.IfExp#getElseExpression()
	 * @see #getIfExp()
	 * @generated
	 */
  EReference getIfExp_ElseExpression();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.LetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Exp</em>'.
	 * @see JTLMM.essentialocl.LetExp
	 * @generated
	 */
  EClass getLetExp();

  /**
	 * Returns the meta object for the containment reference list '{@link JTLMM.essentialocl.LetExp#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see JTLMM.essentialocl.LetExp#getIn()
	 * @see #getLetExp()
	 * @generated
	 */
  EReference getLetExp_In();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.LetExp#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see JTLMM.essentialocl.LetExp#getVariable()
	 * @see #getLetExp()
	 * @generated
	 */
  EReference getLetExp_Variable();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see JTLMM.essentialocl.Variable
	 * @generated
	 */
  EClass getVariable();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.Variable#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see JTLMM.essentialocl.Variable#getInitExpression()
	 * @see #getVariable()
	 * @generated
	 */
  EReference getVariable_InitExpression();

  /**
	 * Returns the meta object for the container reference '{@link JTLMM.essentialocl.Variable#getLetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Let Exp</em>'.
	 * @see JTLMM.essentialocl.Variable#getLetExp()
	 * @see #getVariable()
	 * @generated
	 */
  EReference getVariable_LetExp();

  /**
	 * Returns the meta object for the reference '{@link JTLMM.essentialocl.Variable#getBindParameter <em>Bind Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind Parameter</em>'.
	 * @see JTLMM.essentialocl.Variable#getBindParameter()
	 * @see #getVariable()
	 * @generated
	 */
  EReference getVariable_BindParameter();

  /**
	 * Returns the meta object for the container reference '{@link JTLMM.essentialocl.Variable#getComputeOwner <em>Compute Owner</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compute Owner</em>'.
	 * @see JTLMM.essentialocl.Variable#getComputeOwner()
	 * @see #getVariable()
	 * @generated
	 */
  EReference getVariable_ComputeOwner();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call Exp</em>'.
	 * @see JTLMM.essentialocl.PropertyCallExp
	 * @generated
	 */
  EClass getPropertyCallExp();

  /**
	 * Returns the meta object for the reference '{@link JTLMM.essentialocl.PropertyCallExp#getReferredProperty <em>Referred Property</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Property</em>'.
	 * @see JTLMM.essentialocl.PropertyCallExp#getReferredProperty()
	 * @see #getPropertyCallExp()
	 * @generated
	 */
  EReference getPropertyCallExp_ReferredProperty();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Exp</em>'.
	 * @see JTLMM.essentialocl.VariableExp
	 * @generated
	 */
  EClass getVariableExp();

  /**
	 * Returns the meta object for the reference '{@link JTLMM.essentialocl.VariableExp#getReferredVariable <em>Referred Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Variable</em>'.
	 * @see JTLMM.essentialocl.VariableExp#getReferredVariable()
	 * @see #getVariableExp()
	 * @generated
	 */
  EReference getVariableExp_ReferredVariable();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.TypeExp <em>Type Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Exp</em>'.
	 * @see JTLMM.essentialocl.TypeExp
	 * @generated
	 */
  EClass getTypeExp();

  /**
	 * Returns the meta object for the reference '{@link JTLMM.essentialocl.TypeExp#getReferredType <em>Referred Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Type</em>'.
	 * @see JTLMM.essentialocl.TypeExp#getReferredType()
	 * @see #getTypeExp()
	 * @generated
	 */
  EReference getTypeExp_ReferredType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Exp</em>'.
	 * @see JTLMM.essentialocl.LoopExp
	 * @generated
	 */
  EClass getLoopExp();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.LoopExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see JTLMM.essentialocl.LoopExp#getBody()
	 * @see #getLoopExp()
	 * @generated
	 */
  EReference getLoopExp_Body();

  /**
	 * Returns the meta object for the containment reference list '{@link JTLMM.essentialocl.LoopExp#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iterator</em>'.
	 * @see JTLMM.essentialocl.LoopExp#getIterator()
	 * @see #getLoopExp()
	 * @generated
	 */
  EReference getLoopExp_Iterator();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Exp</em>'.
	 * @see JTLMM.essentialocl.IteratorExp
	 * @generated
	 */
  EClass getIteratorExp();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.StringLiteralExp <em>String Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal Exp</em>'.
	 * @see JTLMM.essentialocl.StringLiteralExp
	 * @generated
	 */
  EClass getStringLiteralExp();

  /**
	 * Returns the meta object for the attribute '{@link JTLMM.essentialocl.StringLiteralExp#getStringSymbol <em>String Symbol</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Symbol</em>'.
	 * @see JTLMM.essentialocl.StringLiteralExp#getStringSymbol()
	 * @see #getStringLiteralExp()
	 * @generated
	 */
  EAttribute getStringLiteralExp_StringSymbol();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.IntegerLiteralExp <em>Integer Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal Exp</em>'.
	 * @see JTLMM.essentialocl.IntegerLiteralExp
	 * @generated
	 */
  EClass getIntegerLiteralExp();

  /**
	 * Returns the meta object for the attribute '{@link JTLMM.essentialocl.IntegerLiteralExp#getIntegerSymbol <em>Integer Symbol</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Symbol</em>'.
	 * @see JTLMM.essentialocl.IntegerLiteralExp#getIntegerSymbol()
	 * @see #getIntegerLiteralExp()
	 * @generated
	 */
  EAttribute getIntegerLiteralExp_IntegerSymbol();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Exp</em>'.
	 * @see JTLMM.essentialocl.OperationCallExp
	 * @generated
	 */
  EClass getOperationCallExp();

  /**
	 * Returns the meta object for the containment reference list '{@link JTLMM.essentialocl.OperationCallExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see JTLMM.essentialocl.OperationCallExp#getArgument()
	 * @see #getOperationCallExp()
	 * @generated
	 */
  EReference getOperationCallExp_Argument();

  /**
	 * Returns the meta object for the reference '{@link JTLMM.essentialocl.OperationCallExp#getReferredOperation <em>Referred Operation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Operation</em>'.
	 * @see JTLMM.essentialocl.OperationCallExp#getReferredOperation()
	 * @see #getOperationCallExp()
	 * @generated
	 */
  EReference getOperationCallExp_ReferredOperation();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.RealLiteralExp <em>Real Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal Exp</em>'.
	 * @see JTLMM.essentialocl.RealLiteralExp
	 * @generated
	 */
  EClass getRealLiteralExp();

  /**
	 * Returns the meta object for the attribute '{@link JTLMM.essentialocl.RealLiteralExp#getRealSymbol <em>Real Symbol</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Symbol</em>'.
	 * @see JTLMM.essentialocl.RealLiteralExp#getRealSymbol()
	 * @see #getRealLiteralExp()
	 * @generated
	 */
  EAttribute getRealLiteralExp_RealSymbol();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Exp</em>'.
	 * @see JTLMM.essentialocl.LiteralExp
	 * @generated
	 */
  EClass getLiteralExp();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Exp</em>'.
	 * @see JTLMM.essentialocl.IterateExp
	 * @generated
	 */
  EClass getIterateExp();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.IterateExp#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see JTLMM.essentialocl.IterateExp#getResult()
	 * @see #getIterateExp()
	 * @generated
	 */
  EReference getIterateExp_Result();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.PrimitiveLiteralExp <em>Primitive Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Literal Exp</em>'.
	 * @see JTLMM.essentialocl.PrimitiveLiteralExp
	 * @generated
	 */
  EClass getPrimitiveLiteralExp();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.NumericLiteralExp <em>Numeric Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Literal Exp</em>'.
	 * @see JTLMM.essentialocl.NumericLiteralExp
	 * @generated
	 */
  EClass getNumericLiteralExp();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.CollectionLiteralExp <em>Collection Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Literal Exp</em>'.
	 * @see JTLMM.essentialocl.CollectionLiteralExp
	 * @generated
	 */
  EClass getCollectionLiteralExp();

  /**
	 * Returns the meta object for the attribute '{@link JTLMM.essentialocl.CollectionLiteralExp#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see JTLMM.essentialocl.CollectionLiteralExp#getKind()
	 * @see #getCollectionLiteralExp()
	 * @generated
	 */
  EAttribute getCollectionLiteralExp_Kind();

  /**
	 * Returns the meta object for the containment reference list '{@link JTLMM.essentialocl.CollectionLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see JTLMM.essentialocl.CollectionLiteralExp#getPart()
	 * @see #getCollectionLiteralExp()
	 * @generated
	 */
  EReference getCollectionLiteralExp_Part();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.CollectionLiteralPart <em>Collection Literal Part</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Literal Part</em>'.
	 * @see JTLMM.essentialocl.CollectionLiteralPart
	 * @generated
	 */
  EClass getCollectionLiteralPart();

  /**
	 * Returns the meta object for the container reference '{@link JTLMM.essentialocl.CollectionLiteralPart#getCollectionLiteralExp <em>Collection Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection Literal Exp</em>'.
	 * @see JTLMM.essentialocl.CollectionLiteralPart#getCollectionLiteralExp()
	 * @see #getCollectionLiteralPart()
	 * @generated
	 */
  EReference getCollectionLiteralPart_CollectionLiteralExp();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Item</em>'.
	 * @see JTLMM.essentialocl.CollectionItem
	 * @generated
	 */
  EClass getCollectionItem();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.CollectionItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see JTLMM.essentialocl.CollectionItem#getItem()
	 * @see #getCollectionItem()
	 * @generated
	 */
  EReference getCollectionItem_Item();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.CollectionRange <em>Collection Range</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Range</em>'.
	 * @see JTLMM.essentialocl.CollectionRange
	 * @generated
	 */
  EClass getCollectionRange();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.CollectionRange#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see JTLMM.essentialocl.CollectionRange#getFirst()
	 * @see #getCollectionRange()
	 * @generated
	 */
  EReference getCollectionRange_First();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.CollectionRange#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last</em>'.
	 * @see JTLMM.essentialocl.CollectionRange#getLast()
	 * @see #getCollectionRange()
	 * @generated
	 */
  EReference getCollectionRange_Last();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.TupleLiteralExp <em>Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Literal Exp</em>'.
	 * @see JTLMM.essentialocl.TupleLiteralExp
	 * @generated
	 */
  EClass getTupleLiteralExp();

  /**
	 * Returns the meta object for the containment reference list '{@link JTLMM.essentialocl.TupleLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see JTLMM.essentialocl.TupleLiteralExp#getPart()
	 * @see #getTupleLiteralExp()
	 * @generated
	 */
  EReference getTupleLiteralExp_Part();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.NullLiteralExp <em>Null Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal Exp</em>'.
	 * @see JTLMM.essentialocl.NullLiteralExp
	 * @generated
	 */
  EClass getNullLiteralExp();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.ExpressionInOcl <em>Expression In Ocl</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression In Ocl</em>'.
	 * @see JTLMM.essentialocl.ExpressionInOcl
	 * @generated
	 */
  EClass getExpressionInOcl();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.ExpressionInOcl#getBodyExpression <em>Body Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Expression</em>'.
	 * @see JTLMM.essentialocl.ExpressionInOcl#getBodyExpression()
	 * @see #getExpressionInOcl()
	 * @generated
	 */
  EReference getExpressionInOcl_BodyExpression();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.ExpressionInOcl#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see JTLMM.essentialocl.ExpressionInOcl#getContext()
	 * @see #getExpressionInOcl()
	 * @generated
	 */
  EReference getExpressionInOcl_Context();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.ExpressionInOcl#getResultVariable <em>Result Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Variable</em>'.
	 * @see JTLMM.essentialocl.ExpressionInOcl#getResultVariable()
	 * @see #getExpressionInOcl()
	 * @generated
	 */
  EReference getExpressionInOcl_ResultVariable();

  /**
	 * Returns the meta object for the containment reference '{@link JTLMM.essentialocl.ExpressionInOcl#getParameterVariable <em>Parameter Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Variable</em>'.
	 * @see JTLMM.essentialocl.ExpressionInOcl#getParameterVariable()
	 * @see #getExpressionInOcl()
	 * @generated
	 */
  EReference getExpressionInOcl_ParameterVariable();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Expression</em>'.
	 * @see JTLMM.essentialocl.OpaqueExpression
	 * @generated
	 */
  EClass getOpaqueExpression();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.InvalidLiteralExp <em>Invalid Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Literal Exp</em>'.
	 * @see JTLMM.essentialocl.InvalidLiteralExp
	 * @generated
	 */
  EClass getInvalidLiteralExp();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.FeaturePropertyCall <em>Feature Property Call</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Property Call</em>'.
	 * @see JTLMM.essentialocl.FeaturePropertyCall
	 * @generated
	 */
  EClass getFeaturePropertyCall();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.TupleLiteralPart <em>Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Literal Part</em>'.
	 * @see JTLMM.essentialocl.TupleLiteralPart
	 * @generated
	 */
  EClass getTupleLiteralPart();

  /**
	 * Returns the meta object for the container reference '{@link JTLMM.essentialocl.TupleLiteralPart#getTupleLiteralExp <em>Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tuple Literal Exp</em>'.
	 * @see JTLMM.essentialocl.TupleLiteralPart#getTupleLiteralExp()
	 * @see #getTupleLiteralPart()
	 * @generated
	 */
  EReference getTupleLiteralPart_TupleLiteralExp();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Type</em>'.
	 * @see JTLMM.essentialocl.BagType
	 * @generated
	 */
  EClass getBagType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see JTLMM.essentialocl.CollectionType
	 * @generated
	 */
  EClass getCollectionType();

  /**
	 * Returns the meta object for the reference '{@link JTLMM.essentialocl.CollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see JTLMM.essentialocl.CollectionType#getElementType()
	 * @see #getCollectionType()
	 * @generated
	 */
  EReference getCollectionType_ElementType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Exp</em>'.
	 * @see JTLMM.essentialocl.EnumLiteralExp
	 * @generated
	 */
  EClass getEnumLiteralExp();

  /**
	 * Returns the meta object for the reference '{@link JTLMM.essentialocl.EnumLiteralExp#getReferredEnumLiteral <em>Referred Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Enum Literal</em>'.
	 * @see JTLMM.essentialocl.EnumLiteralExp#getReferredEnumLiteral()
	 * @see #getEnumLiteralExp()
	 * @generated
	 */
  EReference getEnumLiteralExp_ReferredEnumLiteral();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.InvalidType <em>Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Type</em>'.
	 * @see JTLMM.essentialocl.InvalidType
	 * @generated
	 */
  EClass getInvalidType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set Type</em>'.
	 * @see JTLMM.essentialocl.OrderedSetType
	 * @generated
	 */
  EClass getOrderedSetType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see JTLMM.essentialocl.SequenceType
	 * @generated
	 */
  EClass getSequenceType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see JTLMM.essentialocl.SetType
	 * @generated
	 */
  EClass getSetType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see JTLMM.essentialocl.TupleType
	 * @generated
	 */
  EClass getTupleType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see JTLMM.essentialocl.VoidType
	 * @generated
	 */
  EClass getVoidType();

  /**
	 * Returns the meta object for class '{@link JTLMM.essentialocl.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Type</em>'.
	 * @see JTLMM.essentialocl.AnyType
	 * @generated
	 */
  EClass getAnyType();

  /**
	 * Returns the meta object for enum '{@link JTLMM.essentialocl.CollectionKind <em>Collection Kind</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Kind</em>'.
	 * @see JTLMM.essentialocl.CollectionKind
	 * @generated
	 */
  EEnum getCollectionKind();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EssentialoclFactory getEssentialoclFactory();

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
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.BooleanLiteralExpImpl <em>Boolean Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.BooleanLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getBooleanLiteralExp()
		 * @generated
		 */
    EClass BOOLEAN_LITERAL_EXP = eINSTANCE.getBooleanLiteralExp();

    /**
		 * The meta object literal for the '<em><b>Boolean Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL = eINSTANCE.getBooleanLiteralExp_BooleanSymbol();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.CallExpImpl <em>Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.CallExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCallExp()
		 * @generated
		 */
    EClass CALL_EXP = eINSTANCE.getCallExp();

    /**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CALL_EXP__SOURCE = eINSTANCE.getCallExp_Source();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.OclExpressionImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getOclExpression()
		 * @generated
		 */
    EClass OCL_EXPRESSION = eINSTANCE.getOclExpression();

    /**
		 * The meta object literal for the '<em><b>Try Body Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OCL_EXPRESSION__TRY_BODY_OWNER = eINSTANCE.getOclExpression_TryBodyOwner();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.UnlimitedNaturalExpImpl <em>Unlimited Natural Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.UnlimitedNaturalExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getUnlimitedNaturalExp()
		 * @generated
		 */
    EClass UNLIMITED_NATURAL_EXP = eINSTANCE.getUnlimitedNaturalExp();

    /**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute UNLIMITED_NATURAL_EXP__SYMBOL = eINSTANCE.getUnlimitedNaturalExp_Symbol();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.IfExpImpl <em>If Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.IfExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getIfExp()
		 * @generated
		 */
    EClass IF_EXP = eINSTANCE.getIfExp();

    /**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_EXP__CONDITION = eINSTANCE.getIfExp_Condition();

    /**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_EXP__THEN_EXPRESSION = eINSTANCE.getIfExp_ThenExpression();

    /**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IF_EXP__ELSE_EXPRESSION = eINSTANCE.getIfExp_ElseExpression();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.LetExpImpl <em>Let Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.LetExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getLetExp()
		 * @generated
		 */
    EClass LET_EXP = eINSTANCE.getLetExp();

    /**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LET_EXP__IN = eINSTANCE.getLetExp_In();

    /**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LET_EXP__VARIABLE = eINSTANCE.getLetExp_Variable();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.VariableImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getVariable()
		 * @generated
		 */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE__INIT_EXPRESSION = eINSTANCE.getVariable_InitExpression();

    /**
		 * The meta object literal for the '<em><b>Let Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE__LET_EXP = eINSTANCE.getVariable_LetExp();

    /**
		 * The meta object literal for the '<em><b>Bind Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE__BIND_PARAMETER = eINSTANCE.getVariable_BindParameter();

    /**
		 * The meta object literal for the '<em><b>Compute Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE__COMPUTE_OWNER = eINSTANCE.getVariable_ComputeOwner();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.PropertyCallExpImpl <em>Property Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.PropertyCallExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getPropertyCallExp()
		 * @generated
		 */
    EClass PROPERTY_CALL_EXP = eINSTANCE.getPropertyCallExp();

    /**
		 * The meta object literal for the '<em><b>Referred Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PROPERTY_CALL_EXP__REFERRED_PROPERTY = eINSTANCE.getPropertyCallExp_ReferredProperty();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.VariableExpImpl <em>Variable Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.VariableExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getVariableExp()
		 * @generated
		 */
    EClass VARIABLE_EXP = eINSTANCE.getVariableExp();

    /**
		 * The meta object literal for the '<em><b>Referred Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE_EXP__REFERRED_VARIABLE = eINSTANCE.getVariableExp_ReferredVariable();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.TypeExpImpl <em>Type Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.TypeExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getTypeExp()
		 * @generated
		 */
    EClass TYPE_EXP = eINSTANCE.getTypeExp();

    /**
		 * The meta object literal for the '<em><b>Referred Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TYPE_EXP__REFERRED_TYPE = eINSTANCE.getTypeExp_ReferredType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.LoopExpImpl <em>Loop Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.LoopExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getLoopExp()
		 * @generated
		 */
    EClass LOOP_EXP = eINSTANCE.getLoopExp();

    /**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LOOP_EXP__BODY = eINSTANCE.getLoopExp_Body();

    /**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LOOP_EXP__ITERATOR = eINSTANCE.getLoopExp_Iterator();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.IteratorExpImpl <em>Iterator Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.IteratorExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getIteratorExp()
		 * @generated
		 */
    EClass ITERATOR_EXP = eINSTANCE.getIteratorExp();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.StringLiteralExpImpl <em>String Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.StringLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getStringLiteralExp()
		 * @generated
		 */
    EClass STRING_LITERAL_EXP = eINSTANCE.getStringLiteralExp();

    /**
		 * The meta object literal for the '<em><b>String Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STRING_LITERAL_EXP__STRING_SYMBOL = eINSTANCE.getStringLiteralExp_StringSymbol();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.IntegerLiteralExpImpl <em>Integer Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.IntegerLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getIntegerLiteralExp()
		 * @generated
		 */
    EClass INTEGER_LITERAL_EXP = eINSTANCE.getIntegerLiteralExp();

    /**
		 * The meta object literal for the '<em><b>Integer Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute INTEGER_LITERAL_EXP__INTEGER_SYMBOL = eINSTANCE.getIntegerLiteralExp_IntegerSymbol();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.OperationCallExpImpl <em>Operation Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.OperationCallExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getOperationCallExp()
		 * @generated
		 */
    EClass OPERATION_CALL_EXP = eINSTANCE.getOperationCallExp();

    /**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OPERATION_CALL_EXP__ARGUMENT = eINSTANCE.getOperationCallExp_Argument();

    /**
		 * The meta object literal for the '<em><b>Referred Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OPERATION_CALL_EXP__REFERRED_OPERATION = eINSTANCE.getOperationCallExp_ReferredOperation();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.RealLiteralExpImpl <em>Real Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.RealLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getRealLiteralExp()
		 * @generated
		 */
    EClass REAL_LITERAL_EXP = eINSTANCE.getRealLiteralExp();

    /**
		 * The meta object literal for the '<em><b>Real Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REAL_LITERAL_EXP__REAL_SYMBOL = eINSTANCE.getRealLiteralExp_RealSymbol();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.LiteralExpImpl <em>Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.LiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getLiteralExp()
		 * @generated
		 */
    EClass LITERAL_EXP = eINSTANCE.getLiteralExp();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.IterateExpImpl <em>Iterate Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.IterateExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getIterateExp()
		 * @generated
		 */
    EClass ITERATE_EXP = eINSTANCE.getIterateExp();

    /**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ITERATE_EXP__RESULT = eINSTANCE.getIterateExp_Result();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.PrimitiveLiteralExpImpl <em>Primitive Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.PrimitiveLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getPrimitiveLiteralExp()
		 * @generated
		 */
    EClass PRIMITIVE_LITERAL_EXP = eINSTANCE.getPrimitiveLiteralExp();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.NumericLiteralExpImpl <em>Numeric Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.NumericLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getNumericLiteralExp()
		 * @generated
		 */
    EClass NUMERIC_LITERAL_EXP = eINSTANCE.getNumericLiteralExp();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.CollectionLiteralExpImpl <em>Collection Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.CollectionLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionLiteralExp()
		 * @generated
		 */
    EClass COLLECTION_LITERAL_EXP = eINSTANCE.getCollectionLiteralExp();

    /**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute COLLECTION_LITERAL_EXP__KIND = eINSTANCE.getCollectionLiteralExp_Kind();

    /**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COLLECTION_LITERAL_EXP__PART = eINSTANCE.getCollectionLiteralExp_Part();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.CollectionLiteralPartImpl <em>Collection Literal Part</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.CollectionLiteralPartImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionLiteralPart()
		 * @generated
		 */
    EClass COLLECTION_LITERAL_PART = eINSTANCE.getCollectionLiteralPart();

    /**
		 * The meta object literal for the '<em><b>Collection Literal Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COLLECTION_LITERAL_PART__COLLECTION_LITERAL_EXP = eINSTANCE.getCollectionLiteralPart_CollectionLiteralExp();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.CollectionItemImpl <em>Collection Item</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.CollectionItemImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionItem()
		 * @generated
		 */
    EClass COLLECTION_ITEM = eINSTANCE.getCollectionItem();

    /**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COLLECTION_ITEM__ITEM = eINSTANCE.getCollectionItem_Item();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.CollectionRangeImpl <em>Collection Range</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.CollectionRangeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionRange()
		 * @generated
		 */
    EClass COLLECTION_RANGE = eINSTANCE.getCollectionRange();

    /**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COLLECTION_RANGE__FIRST = eINSTANCE.getCollectionRange_First();

    /**
		 * The meta object literal for the '<em><b>Last</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COLLECTION_RANGE__LAST = eINSTANCE.getCollectionRange_Last();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.TupleLiteralExpImpl <em>Tuple Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.TupleLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getTupleLiteralExp()
		 * @generated
		 */
    EClass TUPLE_LITERAL_EXP = eINSTANCE.getTupleLiteralExp();

    /**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TUPLE_LITERAL_EXP__PART = eINSTANCE.getTupleLiteralExp_Part();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.NullLiteralExpImpl <em>Null Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.NullLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getNullLiteralExp()
		 * @generated
		 */
    EClass NULL_LITERAL_EXP = eINSTANCE.getNullLiteralExp();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.ExpressionInOclImpl <em>Expression In Ocl</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.ExpressionInOclImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getExpressionInOcl()
		 * @generated
		 */
    EClass EXPRESSION_IN_OCL = eINSTANCE.getExpressionInOcl();

    /**
		 * The meta object literal for the '<em><b>Body Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPRESSION_IN_OCL__BODY_EXPRESSION = eINSTANCE.getExpressionInOcl_BodyExpression();

    /**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPRESSION_IN_OCL__CONTEXT = eINSTANCE.getExpressionInOcl_Context();

    /**
		 * The meta object literal for the '<em><b>Result Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPRESSION_IN_OCL__RESULT_VARIABLE = eINSTANCE.getExpressionInOcl_ResultVariable();

    /**
		 * The meta object literal for the '<em><b>Parameter Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EXPRESSION_IN_OCL__PARAMETER_VARIABLE = eINSTANCE.getExpressionInOcl_ParameterVariable();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.OpaqueExpressionImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getOpaqueExpression()
		 * @generated
		 */
    EClass OPAQUE_EXPRESSION = eINSTANCE.getOpaqueExpression();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.InvalidLiteralExpImpl <em>Invalid Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.InvalidLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getInvalidLiteralExp()
		 * @generated
		 */
    EClass INVALID_LITERAL_EXP = eINSTANCE.getInvalidLiteralExp();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.FeaturePropertyCallImpl <em>Feature Property Call</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.FeaturePropertyCallImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getFeaturePropertyCall()
		 * @generated
		 */
    EClass FEATURE_PROPERTY_CALL = eINSTANCE.getFeaturePropertyCall();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.TupleLiteralPartImpl <em>Tuple Literal Part</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.TupleLiteralPartImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getTupleLiteralPart()
		 * @generated
		 */
    EClass TUPLE_LITERAL_PART = eINSTANCE.getTupleLiteralPart();

    /**
		 * The meta object literal for the '<em><b>Tuple Literal Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP = eINSTANCE.getTupleLiteralPart_TupleLiteralExp();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.BagTypeImpl <em>Bag Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.BagTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getBagType()
		 * @generated
		 */
    EClass BAG_TYPE = eINSTANCE.getBagType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.CollectionTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionType()
		 * @generated
		 */
    EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

    /**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getCollectionType_ElementType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.EnumLiteralExpImpl <em>Enum Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.EnumLiteralExpImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getEnumLiteralExp()
		 * @generated
		 */
    EClass ENUM_LITERAL_EXP = eINSTANCE.getEnumLiteralExp();

    /**
		 * The meta object literal for the '<em><b>Referred Enum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ENUM_LITERAL_EXP__REFERRED_ENUM_LITERAL = eINSTANCE.getEnumLiteralExp_ReferredEnumLiteral();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.InvalidTypeImpl <em>Invalid Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.InvalidTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getInvalidType()
		 * @generated
		 */
    EClass INVALID_TYPE = eINSTANCE.getInvalidType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.OrderedSetTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getOrderedSetType()
		 * @generated
		 */
    EClass ORDERED_SET_TYPE = eINSTANCE.getOrderedSetType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.SequenceTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getSequenceType()
		 * @generated
		 */
    EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.SetTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getSetType()
		 * @generated
		 */
    EClass SET_TYPE = eINSTANCE.getSetType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.TupleTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getTupleType()
		 * @generated
		 */
    EClass TUPLE_TYPE = eINSTANCE.getTupleType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.VoidTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getVoidType()
		 * @generated
		 */
    EClass VOID_TYPE = eINSTANCE.getVoidType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.impl.AnyTypeImpl <em>Any Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.impl.AnyTypeImpl
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getAnyType()
		 * @generated
		 */
    EClass ANY_TYPE = eINSTANCE.getAnyType();

    /**
		 * The meta object literal for the '{@link JTLMM.essentialocl.CollectionKind <em>Collection Kind</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see JTLMM.essentialocl.CollectionKind
		 * @see JTLMM.essentialocl.impl.EssentialoclPackageImpl#getCollectionKind()
		 * @generated
		 */
    EEnum COLLECTION_KIND = eINSTANCE.getCollectionKind();

  }

} //EssentialoclPackage
