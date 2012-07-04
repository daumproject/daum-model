/**
 */
package sitac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Responsable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.InfoResponsable#getChef <em>Chef</em>}</li>
 *   <li>{@link sitac.InfoResponsable#getNiveau <em>Niveau</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getInfoResponsable()
 * @model abstract="true"
 * @generated
 */
public interface InfoResponsable extends EObject {
	/**
	 * Returns the value of the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chef</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef</em>' reference.
	 * @see #setChef(Moyen)
	 * @see sitac.SitacPackage#getInfoResponsable_Chef()
	 * @model required="true"
	 * @generated
	 */
	Moyen getChef();

	/**
	 * Sets the value of the '{@link sitac.InfoResponsable#getChef <em>Chef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef</em>' reference.
	 * @see #getChef()
	 * @generated
	 */
	void setChef(Moyen value);

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see #setNiveau(String)
	 * @see sitac.SitacPackage#getInfoResponsable_Niveau()
	 * @model
	 * @generated
	 */
	String getNiveau();

	/**
	 * Sets the value of the '{@link sitac.InfoResponsable#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(String value);

} // InfoResponsable
