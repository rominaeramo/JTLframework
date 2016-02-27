/**
 */
package JTLMM.imperativeocl.util;

import JTLMM.emof.DataType;
import JTLMM.emof.Element;
import JTLMM.emof.NamedElement;
import JTLMM.emof.Type;
import JTLMM.emof.TypedElement;

import JTLMM.essentialocl.CallExp;
import JTLMM.essentialocl.CollectionType;
import JTLMM.essentialocl.LiteralExp;
import JTLMM.essentialocl.LoopExp;
import JTLMM.essentialocl.OclExpression;

import JTLMM.imperativeocl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JTLMM.imperativeocl.ImperativeoclPackage
 * @generated
 */
public class ImperativeoclAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ImperativeoclPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImperativeoclAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ImperativeoclPackage.eINSTANCE;
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
  protected ImperativeoclSwitch<Adapter> modelSwitch =
    new ImperativeoclSwitch<Adapter>() {
			@Override
			public Adapter caseImperativeIterateExp(ImperativeIterateExp object) {
				return createImperativeIterateExpAdapter();
			}
			@Override
			public Adapter caseAssignExp(AssignExp object) {
				return createAssignExpAdapter();
			}
			@Override
			public Adapter caseBlockExp(BlockExp object) {
				return createBlockExpAdapter();
			}
			@Override
			public Adapter caseSwitchExp(SwitchExp object) {
				return createSwitchExpAdapter();
			}
			@Override
			public Adapter caseVariableInitExp(VariableInitExp object) {
				return createVariableInitExpAdapter();
			}
			@Override
			public Adapter caseWhileExp(WhileExp object) {
				return createWhileExpAdapter();
			}
			@Override
			public Adapter caseComputeExp(ComputeExp object) {
				return createComputeExpAdapter();
			}
			@Override
			public Adapter caseAltExp(AltExp object) {
				return createAltExpAdapter();
			}
			@Override
			public Adapter caseUnlinkExp(UnlinkExp object) {
				return createUnlinkExpAdapter();
			}
			@Override
			public Adapter caseReturnExp(ReturnExp object) {
				return createReturnExpAdapter();
			}
			@Override
			public Adapter caseBreakExp(BreakExp object) {
				return createBreakExpAdapter();
			}
			@Override
			public Adapter caseTryExp(TryExp object) {
				return createTryExpAdapter();
			}
			@Override
			public Adapter caseRaiseExp(RaiseExp object) {
				return createRaiseExpAdapter();
			}
			@Override
			public Adapter caseContinueExp(ContinueExp object) {
				return createContinueExpAdapter();
			}
			@Override
			public Adapter caseForExp(ForExp object) {
				return createForExpAdapter();
			}
			@Override
			public Adapter caseTupleExp(TupleExp object) {
				return createTupleExpAdapter();
			}
			@Override
			public Adapter caseTypedef(Typedef object) {
				return createTypedefAdapter();
			}
			@Override
			public Adapter caseInstantiationExp(InstantiationExp object) {
				return createInstantiationExpAdapter();
			}
			@Override
			public Adapter caseDictionaryType(DictionaryType object) {
				return createDictionaryTypeAdapter();
			}
			@Override
			public Adapter caseDictLiteralExp(DictLiteralExp object) {
				return createDictLiteralExpAdapter();
			}
			@Override
			public Adapter caseDictLiteralPart(DictLiteralPart object) {
				return createDictLiteralPartAdapter();
			}
			@Override
			public Adapter caseTemplateParameterType(TemplateParameterType object) {
				return createTemplateParameterTypeAdapter();
			}
			@Override
			public Adapter caseLogExp(LogExp object) {
				return createLogExpAdapter();
			}
			@Override
			public Adapter caseAssertExp(AssertExp object) {
				return createAssertExpAdapter();
			}
			@Override
			public Adapter caseImperativeLoopExp(ImperativeLoopExp object) {
				return createImperativeLoopExpAdapter();
			}
			@Override
			public Adapter caseCollectorExp(CollectorExp object) {
				return createCollectorExpAdapter();
			}
			@Override
			public Adapter caseImperativeExpression(ImperativeExpression object) {
				return createImperativeExpressionAdapter();
			}
			@Override
			public Adapter caseUnpackExp(UnpackExp object) {
				return createUnpackExpAdapter();
			}
			@Override
			public Adapter caseAnonymousTupleType(AnonymousTupleType object) {
				return createAnonymousTupleTypeAdapter();
			}
			@Override
			public Adapter caseAnonymousTupleLiteralExp(AnonymousTupleLiteralExp object) {
				return createAnonymousTupleLiteralExpAdapter();
			}
			@Override
			public Adapter caseAnonymousTupleLiteralPart(AnonymousTupleLiteralPart object) {
				return createAnonymousTupleLiteralPartAdapter();
			}
			@Override
			public Adapter caseListType(ListType object) {
				return createListTypeAdapter();
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
			public Adapter caseOclExpression(OclExpression object) {
				return createOclExpressionAdapter();
			}
			@Override
			public Adapter caseCallExp(CallExp object) {
				return createCallExpAdapter();
			}
			@Override
			public Adapter caseLoopExp(LoopExp object) {
				return createLoopExpAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseClass(JTLMM.emof.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseLiteralExp(LiteralExp object) {
				return createLiteralExpAdapter();
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
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.ImperativeIterateExp <em>Imperative Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.ImperativeIterateExp
	 * @generated
	 */
  public Adapter createImperativeIterateExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.AssignExp <em>Assign Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.AssignExp
	 * @generated
	 */
  public Adapter createAssignExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.BlockExp <em>Block Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.BlockExp
	 * @generated
	 */
  public Adapter createBlockExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.SwitchExp <em>Switch Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.SwitchExp
	 * @generated
	 */
  public Adapter createSwitchExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.VariableInitExp <em>Variable Init Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.VariableInitExp
	 * @generated
	 */
  public Adapter createVariableInitExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.WhileExp <em>While Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.WhileExp
	 * @generated
	 */
  public Adapter createWhileExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.ComputeExp <em>Compute Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.ComputeExp
	 * @generated
	 */
  public Adapter createComputeExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.AltExp <em>Alt Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.AltExp
	 * @generated
	 */
  public Adapter createAltExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.UnlinkExp <em>Unlink Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.UnlinkExp
	 * @generated
	 */
  public Adapter createUnlinkExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.ReturnExp <em>Return Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.ReturnExp
	 * @generated
	 */
  public Adapter createReturnExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.BreakExp <em>Break Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.BreakExp
	 * @generated
	 */
  public Adapter createBreakExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.TryExp <em>Try Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.TryExp
	 * @generated
	 */
  public Adapter createTryExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.RaiseExp <em>Raise Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.RaiseExp
	 * @generated
	 */
  public Adapter createRaiseExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.ContinueExp <em>Continue Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.ContinueExp
	 * @generated
	 */
  public Adapter createContinueExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.ForExp <em>For Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.ForExp
	 * @generated
	 */
  public Adapter createForExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.TupleExp <em>Tuple Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.TupleExp
	 * @generated
	 */
  public Adapter createTupleExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.Typedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.Typedef
	 * @generated
	 */
  public Adapter createTypedefAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.InstantiationExp <em>Instantiation Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.InstantiationExp
	 * @generated
	 */
  public Adapter createInstantiationExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.DictionaryType
	 * @generated
	 */
  public Adapter createDictionaryTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.DictLiteralExp <em>Dict Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.DictLiteralExp
	 * @generated
	 */
  public Adapter createDictLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.DictLiteralPart <em>Dict Literal Part</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.DictLiteralPart
	 * @generated
	 */
  public Adapter createDictLiteralPartAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.TemplateParameterType <em>Template Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.TemplateParameterType
	 * @generated
	 */
  public Adapter createTemplateParameterTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.LogExp <em>Log Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.LogExp
	 * @generated
	 */
  public Adapter createLogExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.AssertExp <em>Assert Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.AssertExp
	 * @generated
	 */
  public Adapter createAssertExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.ImperativeLoopExp <em>Imperative Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.ImperativeLoopExp
	 * @generated
	 */
  public Adapter createImperativeLoopExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.CollectorExp <em>Collector Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.CollectorExp
	 * @generated
	 */
  public Adapter createCollectorExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.ImperativeExpression <em>Imperative Expression</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.ImperativeExpression
	 * @generated
	 */
  public Adapter createImperativeExpressionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.UnpackExp <em>Unpack Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.UnpackExp
	 * @generated
	 */
  public Adapter createUnpackExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.AnonymousTupleType <em>Anonymous Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.AnonymousTupleType
	 * @generated
	 */
  public Adapter createAnonymousTupleTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.AnonymousTupleLiteralExp <em>Anonymous Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.AnonymousTupleLiteralExp
	 * @generated
	 */
  public Adapter createAnonymousTupleLiteralExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.AnonymousTupleLiteralPart <em>Anonymous Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.AnonymousTupleLiteralPart
	 * @generated
	 */
  public Adapter createAnonymousTupleLiteralPartAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.imperativeocl.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.imperativeocl.ListType
	 * @generated
	 */
  public Adapter createListTypeAdapter()
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

} //ImperativeoclAdapterFactory
