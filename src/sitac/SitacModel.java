/**
 */
package sitac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.SitacModel#getInterventionTypes <em>Intervention Types</em>}</li>
 *   <li>{@link sitac.SitacModel#getTypeEntrees <em>Type Entrees</em>}</li>
 *   <li>{@link sitac.SitacModel#getInterventions <em>Interventions</em>}</li>
 *   <li>{@link sitac.SitacModel#getPersonnes <em>Personnes</em>}</li>
 *   <li>{@link sitac.SitacModel#getTypeActions <em>Type Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getSitacModel()
 * @model
 * @generated
 */
public interface SitacModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Intervention Types</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.InterventionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervention Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervention Types</em>' containment reference list.
	 * @see sitac.SitacPackage#getSitacModel_InterventionTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterventionType> getInterventionTypes();

	/**
	 * Returns the value of the '<em><b>Type Entrees</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.TypeEntree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Entrees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Entrees</em>' containment reference list.
	 * @see sitac.SitacPackage#getSitacModel_TypeEntrees()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeEntree> getTypeEntrees();

	/**
	 * Returns the value of the '<em><b>Interventions</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.Intervention}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interventions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interventions</em>' containment reference list.
	 * @see sitac.SitacPackage#getSitacModel_Interventions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Intervention> getInterventions();

	/**
	 * Returns the value of the '<em><b>Personnes</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.Personne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personnes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnes</em>' containment reference list.
	 * @see sitac.SitacPackage#getSitacModel_Personnes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Personne> getPersonnes();

	/**
	 * Returns the value of the '<em><b>Type Actions</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Actions</em>' containment reference list.
	 * @see sitac.SitacPackage#getSitacModel_TypeActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionType> getTypeActions();

} // SitacModel
