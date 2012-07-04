/**
 */
package sitac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intervention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.Intervention#getType <em>Type</em>}</li>
 *   <li>{@link sitac.Intervention#getHistorique <em>Historique</em>}</li>
 *   <li>{@link sitac.Intervention#getNumeroIntervention <em>Numero Intervention</em>}</li>
 *   <li>{@link sitac.Intervention#getPosition <em>Position</em>}</li>
 *   <li>{@link sitac.Intervention#getRequerant <em>Requerant</em>}</li>
 *   <li>{@link sitac.Intervention#getPrecision <em>Precision</em>}</li>
 *   <li>{@link sitac.Intervention#getDetachements <em>Detachements</em>}</li>
 *   <li>{@link sitac.Intervention#getVictimes <em>Victimes</em>}</li>
 *   <li>{@link sitac.Intervention#getInfoTactics <em>Info Tactics</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getIntervention()
 * @model
 * @generated
 */
public interface Intervention extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(InterventionType)
	 * @see sitac.SitacPackage#getIntervention_Type()
	 * @model required="true"
	 * @generated
	 */
	InterventionType getType();

	/**
	 * Sets the value of the '{@link sitac.Intervention#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(InterventionType value);

	/**
	 * Returns the value of the '<em><b>Historique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historique</em>' containment reference.
	 * @see #setHistorique(Historique)
	 * @see sitac.SitacPackage#getIntervention_Historique()
	 * @model containment="true"
	 * @generated
	 */
	Historique getHistorique();

	/**
	 * Sets the value of the '{@link sitac.Intervention#getHistorique <em>Historique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historique</em>' containment reference.
	 * @see #getHistorique()
	 * @generated
	 */
	void setHistorique(Historique value);

	/**
	 * Returns the value of the '<em><b>Numero Intervention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Intervention</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Intervention</em>' attribute.
	 * @see #setNumeroIntervention(String)
	 * @see sitac.SitacPackage#getIntervention_NumeroIntervention()
	 * @model
	 * @generated
	 */
	String getNumeroIntervention();

	/**
	 * Sets the value of the '{@link sitac.Intervention#getNumeroIntervention <em>Numero Intervention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Intervention</em>' attribute.
	 * @see #getNumeroIntervention()
	 * @generated
	 */
	void setNumeroIntervention(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see sitac.SitacPackage#getIntervention_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link sitac.Intervention#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Requerant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requerant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requerant</em>' reference.
	 * @see #setRequerant(Personne)
	 * @see sitac.SitacPackage#getIntervention_Requerant()
	 * @model
	 * @generated
	 */
	Personne getRequerant();

	/**
	 * Sets the value of the '{@link sitac.Intervention#getRequerant <em>Requerant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requerant</em>' reference.
	 * @see #getRequerant()
	 * @generated
	 */
	void setRequerant(Personne value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(String)
	 * @see sitac.SitacPackage#getIntervention_Precision()
	 * @model
	 * @generated
	 */
	String getPrecision();

	/**
	 * Sets the value of the '{@link sitac.Intervention#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(String value);

	/**
	 * Returns the value of the '<em><b>Detachements</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.Detachement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detachements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detachements</em>' containment reference list.
	 * @see sitac.SitacPackage#getIntervention_Detachements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Detachement> getDetachements();

	/**
	 * Returns the value of the '<em><b>Victimes</b></em>' reference list.
	 * The list contents are of type {@link sitac.Personne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victimes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victimes</em>' reference list.
	 * @see sitac.SitacPackage#getIntervention_Victimes()
	 * @model
	 * @generated
	 */
	EList<Personne> getVictimes();

	/**
	 * Returns the value of the '<em><b>Info Tactics</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.InfoTactic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Tactics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Tactics</em>' containment reference list.
	 * @see sitac.SitacPackage#getIntervention_InfoTactics()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfoTactic> getInfoTactics();

} // Intervention
