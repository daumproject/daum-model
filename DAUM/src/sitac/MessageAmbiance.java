/**
 */
package sitac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Ambiance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.MessageAmbiance#getJeSuis <em>Je Suis</em>}</li>
 *   <li>{@link sitac.MessageAmbiance#getJeVois <em>Je Vois</em>}</li>
 *   <li>{@link sitac.MessageAmbiance#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getMessageAmbiance()
 * @model
 * @generated
 */
public interface MessageAmbiance extends EObject {
	/**
	 * Returns the value of the '<em><b>Je Suis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Je Suis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Je Suis</em>' attribute.
	 * @see #setJeSuis(String)
	 * @see sitac.SitacPackage#getMessageAmbiance_JeSuis()
	 * @model
	 * @generated
	 */
	String getJeSuis();

	/**
	 * Sets the value of the '{@link sitac.MessageAmbiance#getJeSuis <em>Je Suis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Je Suis</em>' attribute.
	 * @see #getJeSuis()
	 * @generated
	 */
	void setJeSuis(String value);

	/**
	 * Returns the value of the '<em><b>Je Vois</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Je Vois</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Je Vois</em>' attribute.
	 * @see #setJeVois(String)
	 * @see sitac.SitacPackage#getMessageAmbiance_JeVois()
	 * @model
	 * @generated
	 */
	String getJeVois();

	/**
	 * Sets the value of the '{@link sitac.MessageAmbiance#getJeVois <em>Je Vois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Je Vois</em>' attribute.
	 * @see #getJeVois()
	 * @generated
	 */
	void setJeVois(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sitac.SitacPackage#getMessageAmbiance_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sitac.MessageAmbiance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MessageAmbiance
