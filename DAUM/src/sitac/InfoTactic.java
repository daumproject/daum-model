/**
 */
package sitac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Tactic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.InfoTactic#getCategorie <em>Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getInfoTactic()
 * @model abstract="true"
 * @generated
 */
public interface InfoTactic extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' reference.
	 * @see #setCategorie(Categorie)
	 * @see sitac.SitacPackage#getInfoTactic_Categorie()
	 * @model
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link sitac.InfoTactic#getCategorie <em>Categorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' reference.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

} // InfoTactic
