/**
 */
package JTLMM.essentialocl.util;

import JTLMM.emof.DataType;
import JTLMM.emof.Element;
import JTLMM.emof.NamedElement;
import JTLMM.emof.Type;
import JTLMM.emof.TypedElement;

import JTLMM.essentialocl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JTLMM.essentialocl.EssentialoclPackage
 * @generated
 */
public class EssentialoclAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EssentialoclPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EssentialoclAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = EssentialoclPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EssentialoclSwitch<Adapter> modelSwitch =
    new EssentialoclSwitch<Adapter>() {
			@Override
			public Adapter caseBooleanLiteralExp(BooleanLiteralExp object) {
				return createBooleanLiteralExpAdapter();
			}
			@Override
			public Adapter caseCallExp(CallExp object) {
				return createCallExpAdapter();
			}
			@Override
			public Adapter caseOclExpression(OclExpression object) {
				return createOclExpressionAdapter();
			}
			@Override
			public Adapter caseUnlimitedNaturalExp(UnlimitedNaturalExp object) {
				return createUnlimitedNaturalExpAdapter();
			}
			@Override
			public Adapter caseIfExp(IfExp object) {
				return createIfExpAdapter();
			}
			@Override
			public Adapter caseLetExp(LetExp object) {
				return createLetExpAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter casePropertyCallExp(PropertyCallExp object) {
				return createPropertyCallExpAdapter();
			}
			@Override
			public Adapter caseVariableExp(VariableExp object) {
				return createVariableExpAdapter();
			}
			@Override
			public Adapter caseTypeExp(TypeExp object) {
				return createTypeExpAdapter();
			}
			@Override
			public Adapter caseLoopExp(LoopExp object) {
				return createLoopExpAdapter();
			}
			@Override
			public Adapter caseIteratorExp(IteratorExp object) {
				return createIteratorExpAdapter();
			}
			@Override
			public Adapter caseStringLiteralExp(StringLiteralExp object) {
				return createStringLiteralExpAdapter();
			}
			@Override
			public Adapter caseIntegerLiteralExp(IntegerLiteralExp object) {
				return createIntegerLiteralExpAdapter();
			}
			@Override
			public Adapter caseOperationCallExp(OperationCallExp object) {
				return createOperationCallExpAdapter();
			}
			@Override
			public Adapter caseRealLiteralExp(RealLiteralExp object) {
				return createRealLiteralExpAdapter();
			}
			@Override
			public Adapter caseLiteralExp(LiteralExp object) {
				return createLiteralExpAdapter();
			}
			@Override
			public Adapter caseIterateExp(IterateExp object) {
				return createIterateExpAdapter();
			}
			@Override
			public Adapter casePrimitiveLiteralExp(PrimitiveLiteralExp object) {
				return createPrimitiveLiteralExpAdapter();
			}
			@Override
			public Adapter caseNumericLiteralExp(NumericLiteralExp object) {
				return createNumericLiteralExpAdapter();
			}
			@Override
			public Adapter caseCollectionLiteralExp(CollectionLiteralExp object) {
				return createCollectionLiteralExpAdapter();
			}
			@Override
			public Adapter caseCollectionLiteralPart(CollectionLiteralPart object) {
				return createCollectionLiteralPartAdapter();
			}
			@Override
			public Adapter caseCollectionItem(CollectionItem object) {
				return createCollectionItemAdapter();
			}
			@Override
			public Adapter caseCollectionRange(CollectionRange object) {
				return createCollectionRangeAdapter();
			}
			@Override
			public Adapter caseTupleLiteralExp(TupleLiteralExp object) {
				return createTupleLiteralExpAdapter();
			}
			@Override
			public Adapter caseNullLiteralExp(NullLiteralExp object) {
				return createNullLiteralExpAdapter();
			}
			@Override
			public Adapter caseExpressionInOcl(ExpressionInOcl object) {
				return createExpressionInOclAdapter();
			}
			@Override
			public Adapter caseOpaqueExpression(OpaqueExpression object) {
				return createOpaqueExpressionAdapter();
			}
			@Override
			public Adapter caseInvalidLiteralExp(InvalidLiteralExp object) {
				return createInvalidLiteralExpAdapter();
			}
			@Override
			public Adapter caseFeaturePropertyCall(FeaturePropertyCall object) {
				return createFeaturePropertyCallAdapter();
			}
			@Override
			public Adapter caseTupleLiteralPart(TupleLiteralPart object) {
				return createTupleLiteralPartAdapter();
			}
			@Override
			public Adapter caseBagType(BagType object) {
				return createBagTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseEnumLiteralExp(EnumLiteralExp object) {
				return createEnumLiteralExpAdapter();
			}
			@Override
			public Adapter caseInvalidType(InvalidType object) {
				return createInvalidTypeAdapter();
			}
			@Override
			public Adapter caseOrderedSetType(OrderedSetType object) {
				return createOrderedSetTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseSetType(SetType object) {
				return createSetTypeAdapter();
			}
			@Override
			public Adapter caseTupleType(TupleType object) {
				return createTupleTypeAdapter();
			}
			@Override
			public Adapter caseVoidType(VoidType object) {
				return createVoidTypeAdapter();
			}
			@Override
			public Adapter caseAnyType(AnyType object) {
				return createAnyTypeAdapter();
			}
			@Override
			public Adapter caseObject(JTLMM.emof.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseClass(JTLMM.emof.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.BooleanLiteralExp <em>Boolean Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.BooleanLiteralExp
	 * @generated
	 */
  public Adapter createBooleanLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.CallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.CallExp
	 * @generated
	 */
  public Adapter createCallExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.OclExpression
	 * @generated
	 */
  public Adapter createOclExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.UnlimitedNaturalExp <em>Unlimited Natural Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.UnlimitedNaturalExp
	 * @generated
	 */
  public Adapter createUnlimitedNaturalExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.IfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.IfExp
	 * @generated
	 */
  public Adapter createIfExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.LetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.LetExp
	 * @generated
	 */
  public Adapter createLetExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.Variable
	 * @generated
	 */
  public Adapter createVariableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.PropertyCallExp
	 * @generated
	 */
  public Adapter createPropertyCallExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.VariableExp
	 * @generated
	 */
  public Adapter createVariableExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.TypeExp <em>Type Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.TypeExp
	 * @generated
	 */
  public Adapter createTypeExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.LoopExp
	 * @generated
	 */
  public Adapter createLoopExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.IteratorExp
	 * @generated
	 */
  public Adapter createIteratorExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.StringLiteralExp <em>String Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.StringLiteralExp
	 * @generated
	 */
  public Adapter createStringLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.IntegerLiteralExp <em>Integer Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.IntegerLiteralExp
	 * @generated
	 */
  public Adapter createIntegerLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.OperationCallExp
	 * @generated
	 */
  public Adapter createOperationCallExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.RealLiteralExp <em>Real Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.RealLiteralExp
	 * @generated
	 */
  public Adapter createRealLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.LiteralExp
	 * @generated
	 */
  public Adapter createLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.IterateExp
	 * @generated
	 */
  public Adapter createIterateExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.PrimitiveLiteralExp <em>Primitive Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.PrimitiveLiteralExp
	 * @generated
	 */
  public Adapter createPrimitiveLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.NumericLiteralExp <em>Numeric Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.NumericLiteralExp
	 * @generated
	 */
  public Adapter createNumericLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.CollectionLiteralExp <em>Collection Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.CollectionLiteralExp
	 * @generated
	 */
  public Adapter createCollectionLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.CollectionLiteralPart <em>Collection Literal Part</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.CollectionLiteralPart
	 * @generated
	 */
  public Adapter createCollectionLiteralPartAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.CollectionItem
	 * @generated
	 */
  public Adapter createCollectionItemAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.CollectionRange <em>Collection Range</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.CollectionRange
	 * @generated
	 */
  public Adapter createCollectionRangeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.TupleLiteralExp <em>Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.TupleLiteralExp
	 * @generated
	 */
  public Adapter createTupleLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.NullLiteralExp <em>Null Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.NullLiteralExp
	 * @generated
	 */
  public Adapter createNullLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.ExpressionInOcl <em>Expression In Ocl</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.ExpressionInOcl
	 * @generated
	 */
  public Adapter createExpressionInOclAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.OpaqueExpression
	 * @generated
	 */
  public Adapter createOpaqueExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.InvalidLiteralExp <em>Invalid Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.InvalidLiteralExp
	 * @generated
	 */
  public Adapter createInvalidLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.FeaturePropertyCall <em>Feature Property Call</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.FeaturePropertyCall
	 * @generated
	 */
  public Adapter createFeaturePropertyCallAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.TupleLiteralPart <em>Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.TupleLiteralPart
	 * @generated
	 */
  public Adapter createTupleLiteralPartAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.BagType
	 * @generated
	 */
  public Adapter createBagTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.CollectionType
	 * @generated
	 */
  public Adapter createCollectionTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.EnumLiteralExp
	 * @generated
	 */
  public Adapter createEnumLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.InvalidType <em>Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.InvalidType
	 * @generated
	 */
  public Adapter createInvalidTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.OrderedSetType
	 * @generated
	 */
  public Adapter createOrderedSetTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.SequenceType
	 * @generated
	 */
  public Adapter createSequenceTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.SetType
	 * @generated
	 */
  public Adapter createSetTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.TupleType
	 * @generated
	 */
  public Adapter createTupleTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.VoidType
	 * @generated
	 */
  public Adapter createVoidTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.essentialocl.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.essentialocl.AnyType
	 * @generated
	 */
  public Adapter createAnyTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.emof.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.emof.Object
	 * @generated
	 */
  public Adapter createObjectAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.emof.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.emof.Element
	 * @generated
	 */
  public Adapter createElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.emof.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.emof.NamedElement
	 * @generated
	 */
  public Adapter createNamedElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.emof.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.emof.TypedElement
	 * @generated
	 */
  public Adapter createTypedElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.emof.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.emof.Type
	 * @generated
	 */
  public Adapter createTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.emof.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.emof.DataType
	 * @generated
	 */
  public Adapter createDataTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.emof.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.emof.Class
	 * @generated
	 */
  public Adapter createClassAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //EssentialoclAdapterFactory
