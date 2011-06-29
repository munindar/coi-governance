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
 * A representation of the literals of the enumeration '<em><b>kPRIVATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ooi.bspl.bSPL.BSPLPackage#getkPRIVATE()
 * @model
 * @generated
 */
public enum kPRIVATE implements Enumerator
{
  /**
   * The '<em><b>Private</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRIVATE_VALUE
   * @generated
   * @ordered
   */
  PRIVATE(0, "private", "private");

  /**
   * The '<em><b>Private</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Private</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRIVATE
   * @model name="private"
   * @generated
   * @ordered
   */
  public static final int PRIVATE_VALUE = 0;

  /**
   * An array of all the '<em><b>kPRIVATE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final kPRIVATE[] VALUES_ARRAY =
    new kPRIVATE[]
    {
      PRIVATE,
    };

  /**
   * A public read-only list of all the '<em><b>kPRIVATE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<kPRIVATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>kPRIVATE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static kPRIVATE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      kPRIVATE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>kPRIVATE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static kPRIVATE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      kPRIVATE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>kPRIVATE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static kPRIVATE get(int value)
  {
    switch (value)
    {
      case PRIVATE_VALUE: return PRIVATE;
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
  private kPRIVATE(int value, String name, String literal)
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
  
} //kPRIVATE
