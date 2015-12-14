/**
 */
package JTLMM.emof.util;

import JTLMM.emof.Comment;
import JTLMM.emof.DataType;
import JTLMM.emof.Element;
import JTLMM.emof.EmofPackage;
import JTLMM.emof.Enumeration;
import JTLMM.emof.EnumerationLiteral;
import JTLMM.emof.Extent;
import JTLMM.emof.MultiplicityElement;
import JTLMM.emof.NamedElement;
import JTLMM.emof.Operation;
import JTLMM.emof.Parameter;
import JTLMM.emof.PrimitiveType;
import JTLMM.emof.Property;
import JTLMM.emof.Tag;
import JTLMM.emof.Type;
import JTLMM.emof.TypedElement;
import JTLMM.emof.URIExtent;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JTLMM.emof.EmofPackage
 * @generated
 */
public class EmofAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EmofPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmofAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EmofPackage.eINSTANCE;
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
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected EmofSwitch<Adapter> modelSwitch =
    new EmofSwitch<Adapter>()
    {
      @Override
      public Adapter caseClass(JTLMM.emof.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseTag(Tag object)
      {
        return createTagAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseExtent(Extent object)
      {
        return createExtentAdapter();
      }
      @Override
      public Adapter caseObject(JTLMM.emof.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseMultiplicityElement(MultiplicityElement object)
      {
        return createMultiplicityElementAdapter();
      }
      @Override
      public Adapter casePackage(JTLMM.emof.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseEnumerationLiteral(EnumerationLiteral object)
      {
        return createEnumerationLiteralAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseTypedElement(TypedElement object)
      {
        return createTypedElementAdapter();
      }
      @Override
      public Adapter casePrimitiveType(PrimitiveType object)
      {
        return createPrimitiveTypeAdapter();
      }
      @Override
      public Adapter caseURIExtent(URIExtent object)
      {
        return createURIExtentAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
   * Creates a new adapter for an object of class '{@link JTLMM.emof.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.Tag
   * @generated
   */
  public Adapter createTagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JTLMM.emof.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
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
   * Creates a new adapter for an object of class '{@link JTLMM.emof.Extent <em>Extent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.Extent
   * @generated
   */
  public Adapter createExtentAdapter()
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
   * Creates a new adapter for an object of class '{@link JTLMM.emof.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JTLMM.emof.MultiplicityElement <em>Multiplicity Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.MultiplicityElement
   * @generated
   */
  public Adapter createMultiplicityElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JTLMM.emof.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.Package
   * @generated
   */
  public Adapter createPackageAdapter()
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
   * Creates a new adapter for an object of class '{@link JTLMM.emof.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JTLMM.emof.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.EnumerationLiteral
   * @generated
   */
  public Adapter createEnumerationLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JTLMM.emof.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
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
   * Creates a new adapter for an object of class '{@link JTLMM.emof.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.PrimitiveType
   * @generated
   */
  public Adapter createPrimitiveTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JTLMM.emof.URIExtent <em>URI Extent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.URIExtent
   * @generated
   */
  public Adapter createURIExtentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JTLMM.emof.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JTLMM.emof.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
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

} //EmofAdapterFactory
