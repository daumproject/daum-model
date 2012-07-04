/**
 */
package sitac;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.Affectation#getMoyen <em>Moyen</em>}</li>
 *   <li>{@link sitac.Affectation#getHorodatageDemande <em>Horodatage Demande</em>}</li>
 *   <li>{@link sitac.Affectation#getHorodatageEngagement <em>Horodatage Engagement</em>}</li>
 *   <li>{@link sitac.Affectation#getHorodatageDesengagement <em>Horodatage Desengagement</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getAffectation()
 * @model
 * @generated
 */
public interface Affectation extends EObject {
	/**
	 * Returns the value of the '<em><b>Moyen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen</em>' reference.
	 * @see #setMoyen(Moyen)
	 * @see sitac.SitacPackage#getAffectation_Moyen()
	 * @model
	 * @generated
	 */
	Moyen getMoyen();

	/**
	 * Sets the value of the '{@link sitac.Affectation#getMoyen <em>Moyen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen</em>' reference.
	 * @see #getMoyen()
	 * @generated
	 */
	void setMoyen(Moyen value);

	/**
	 * Returns the value of the '<em><b>Horodatage Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horodatage Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horodatage Demande</em>' attribute.
	 * @see #setHorodatageDemande(Date)
	 * @see sitac.SitacPackage#getAffectation_HorodatageDemande()
	 * @model
	 * @generated
	 */
	Date getHorodatageDemande();

	/**
	 * Sets the value of the '{@link sitac.Affectation#getHorodatageDemande <em>Horodatage Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horodatage Demande</em>' attribute.
	 * @see #getHorodatageDemande()
	 * @generated
	 */
	void setHorodatageDemande(Date value);

	/**
	 * Returns the value of the '<em><b>Horodatage Engagement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horodatage Engagement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horodatage Engagement</em>' attribute.
	 * @see #setHorodatageEngagement(Date)
	 * @see sitac.SitacPackage#getAffectation_HorodatageEngagement()
	 * @model
	 * @generated
	 */
	Date getHorodatageEngagement();

	/**
	 * Sets the value of the '{@link sitac.Affectation#getHorodatageEngagement <em>Horodatage Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horodatage Engagement</em>' attribute.
	 * @see #getHorodatageEngagement()
	 * @generated
	 */
	void setHorodatageEngagement(Date value);

	/**
	 * Returns the value of the '<em><b>Horodatage Desengagement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horodatage Desengagement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horodatage Desengagement</em>' attribute.
	 * @see #setHorodatageDesengagement(Date)
	 * @see sitac.SitacPackage#getAffectation_HorodatageDesengagement()
	 * @model
	 * @generated
	 */
	Date getHorodatageDesengagement();

	/**
	 * Sets the value of the '{@link sitac.Affectation#getHorodatageDesengagement <em>Horodatage Desengagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horodatage Desengagement</em>' attribute.
	 * @see #getHorodatageDesengagement()
	 * @generated
	 */
	void setHorodatageDesengagement(Date value);

} // Affectation
