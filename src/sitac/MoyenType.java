/**
 */
package sitac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moyen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.MoyenType#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getMoyenType()
 * @model
 * @generated
 */
public interface MoyenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see sitac.SitacPackage#getMoyenType_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link sitac.MoyenType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

} // MoyenType
