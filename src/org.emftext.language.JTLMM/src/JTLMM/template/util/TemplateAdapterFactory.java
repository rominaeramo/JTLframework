/**
 */
package JTLMM.template.util;

import JTLMM.emof.Element;
import JTLMM.emof.NamedElement;
import JTLMM.emof.TypedElement;

import JTLMM.essentialocl.LiteralExp;
import JTLMM.essentialocl.OclExpression;

import JTLMM.template.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JTLMM.template.TemplatePackage
 * @generated
 */
public class TemplateAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static TemplatePackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TemplateAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = TemplatePackage.eINSTANCE;
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
  protected TemplateSwitch<Adapter> modelSwitch =
    new TemplateSwitch<Adapter>() {
			@Override
			public Adapter caseTemplateExp(TemplateExp object) {
				return createTemplateExpAdapter();
			}
			@Override
			public Adapter caseObjectTemplateExp(ObjectTemplateExp object) {
				return createObjectTemplateExpAdapter();
			}
			@Override
			public Adapter caseCollectionTemplateExp(CollectionTemplateExp object) {
				return createCollectionTemplateExpAdapter();
			}
			@Override
			public Adapter casePropertyTemplateItem(PropertyTemplateItem object) {
				return createPropertyTemplateItemAdapter();
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
	 * Creates a new adapter for an object of class '{@link JTLMM.template.TemplateExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.template.TemplateExp
	 * @generated
	 */
  public Adapter createTemplateExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.template.ObjectTemplateExp <em>Object Template Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.template.ObjectTemplateExp
	 * @generated
	 */
  public Adapter createObjectTemplateExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.template.CollectionTemplateExp <em>Collection Template Exp</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.template.CollectionTemplateExp
	 * @generated
	 */
  public Adapter createCollectionTemplateExpAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link JTLMM.template.PropertyTemplateItem <em>Property Template Item</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JTLMM.template.PropertyTemplateItem
	 * @generated
	 */
  public Adapter createPropertyTemplateItemAdapter()
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

} //TemplateAdapterFactory
