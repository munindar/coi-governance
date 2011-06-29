/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>kPARAMETER</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ooi.bspl.bSPL.BSPLPackage#getkPARAMETER()
 * @model
 * @generated
 */
public enum kPARAMETER implements Enumerator
{
  /**
   * The '<em><b>Parameter</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARAMETER_VALUE
   * @generated
   * @ordered
   */
  PARAMETER(0, "parameter", "parameter");

  /**
   * The '<em><b>Parameter</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Parameter</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARAMETER
   * @model name="parameter"
   * @generated
   * @ordered
   */
  public static final int PARAMETER_VALUE = 0;

  /**
   * An array of all the '<em><b>kPARAMETER</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final kPARAMETER[] VALUES_ARRAY =
    new kPARAMETER[]
    {
      PARAMETER,
    };

  /**
   * A public read-only list of all the '<em><b>kPARAMETER</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<kPARAMETER> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>kPARAMETER</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static kPARAMETER get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      kPARAMETER result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>kPARAMETER</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static kPARAMETER getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      kPARAMETER result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>kPARAMETER</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static kPARAMETER get(int value)
  {
    switch (value)
    {
      case PARAMETER_VALUE: return PARAMETER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private kPARAMETER(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //kPARAMETER
