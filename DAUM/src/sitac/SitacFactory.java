/**
 */
package sitac;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sitac.SitacPackage
 * @generated
 */
public interface SitacFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SitacFactory eINSTANCE = sitac.impl.SitacFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intervention</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervention</em>'.
	 * @generated
	 */
	Intervention createIntervention();

	/**
	 * Returns a new object of class '<em>Detachement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detachement</em>'.
	 * @generated
	 */
	Detachement createDetachement();

	/**
	 * Returns a new object of class '<em>Moyen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moyen</em>'.
	 * @generated
	 */
	Moyen createMoyen();

	/**
	 * Returns a new object of class '<em>Intervention Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervention Type</em>'.
	 * @generated
	 */
	InterventionType createInterventionType();

	/**
	 * Returns a new object of class '<em>Historique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historique</em>'.
	 * @generated
	 */
	Historique createHistorique();

	/**
	 * Returns a new object of class '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entree</em>'.
	 * @generated
	 */
	Entree createEntree();

	/**
	 * Returns a new object of class '<em>Type Entree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Entree</em>'.
	 * @generated
	 */
	TypeEntree createTypeEntree();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Gps Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gps Point</em>'.
	 * @generated
	 */
	GpsPoint createGpsPoint();

	/**
	 * Returns a new object of class '<em>Position Civil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Civil</em>'.
	 * @generated
	 */
	PositionCivil createPositionCivil();

	/**
	 * Returns a new object of class '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personne</em>'.
	 * @generated
	 */
	Personne createPersonne();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Moyen Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moyen Type</em>'.
	 * @generated
	 */
	MoyenType createMoyenType();

	/**
	 * Returns a new object of class '<em>Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affectation</em>'.
	 * @generated
	 */
	Affectation createAffectation();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SitacModel createSitacModel();

	/**
	 * Returns a new object of class '<em>Prise Eau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prise Eau</em>'.
	 * @generated
	 */
	PriseEau createPriseEau();

	/**
	 * Returns a new object of class '<em>Source Danger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Danger</em>'.
	 * @generated
	 */
	SourceDanger createSourceDanger();

	/**
	 * Returns a new object of class '<em>Categorie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorie</em>'.
	 * @generated
	 */
	Categorie createCategorie();

	/**
	 * Returns a new object of class '<em>Cible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cible</em>'.
	 * @generated
	 */
	Cible createCible();

	/**
	 * Returns a new object of class '<em>Sinistre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sinistre</em>'.
	 * @generated
	 */
	Sinistre createSinistre();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Type</em>'.
	 * @generated
	 */
	ActionType createActionType();

	/**
	 * Returns a new object of class '<em>Secteur Geo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secteur Geo</em>'.
	 * @generated
	 */
	SecteurGeo createSecteurGeo();

	/**
	 * Returns a new object of class '<em>Secteur Fontionel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secteur Fontionel</em>'.
	 * @generated
	 */
	SecteurFontionel createSecteurFontionel();

	/**
	 * Returns a new object of class '<em>Donnee Contextuel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Donnee Contextuel</em>'.
	 * @generated
	 */
	DonneeContextuel createDonneeContextuel();

	/**
	 * Returns a new object of class '<em>Message Ambiance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Ambiance</em>'.
	 * @generated
	 */
	MessageAmbiance createMessageAmbiance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SitacPackage getSitacPackage();

} //SitacFactory
