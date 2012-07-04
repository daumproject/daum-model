/**
 */
package sitac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.Entree#getHorodatage <em>Horodatage</em>}</li>
 *   <li>{@link sitac.Entree#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends EObject {
	/**
	 * Returns the value of the '<em><b>Horodatage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horodatage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horodatage</em>' attribute.
	 * @see #setHorodatage(String)
	 * @see sitac.SitacPackage#getEntree_Horodatage()
	 * @model
	 * @generated
	 */
	String getHorodatage();

	/**
	 * Sets the value of the '{@link sitac.Entree#getHorodatage <em>Horodatage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horodatage</em>' attribute.
	 * @see #getHorodatage()
	 * @generated
	 */
	void setHorodatage(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeEntree)
	 * @see sitac.SitacPackage#getEntree_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeEntree getType();

	/**
	 * Sets the value of the '{@link sitac.Entree#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeEntree value);

} // Entree
