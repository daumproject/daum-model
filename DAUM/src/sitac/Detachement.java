/**
 */
package sitac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detachement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.Detachement#getAffectation <em>Affectation</em>}</li>
 *   <li>{@link sitac.Detachement#getChef <em>Chef</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getDetachement()
 * @model
 * @generated
 */
public interface Detachement extends EObject {
	/**
	 * Returns the value of the '<em><b>Affectation</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.Affectation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affectation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectation</em>' containment reference list.
	 * @see sitac.SitacPackage#getDetachement_Affectation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Affectation> getAffectation();

	/**
	 * Returns the value of the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chef</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef</em>' reference.
	 * @see #setChef(Agent)
	 * @see sitac.SitacPackage#getDetachement_Chef()
	 * @model
	 * @generated
	 */
	Agent getChef();

	/**
	 * Sets the value of the '{@link sitac.Detachement#getChef <em>Chef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef</em>' reference.
	 * @see #getChef()
	 * @generated
	 */
	void setChef(Agent value);

} // Detachement
