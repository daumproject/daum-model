/**
 */
package sitac;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sitac.SitacFactory
 * @model kind="package"
 * @generated
 */
public interface SitacPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sitac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sitac/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sitac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SitacPackage eINSTANCE = sitac.impl.SitacPackageImpl.init();

	/**
	 * The meta object id for the '{@link sitac.impl.InterventionImpl <em>Intervention</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InterventionImpl
	 * @see sitac.impl.SitacPackageImpl#getIntervention()
	 * @generated
	 */
	int INTERVENTION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Historique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__HISTORIQUE = 1;

	/**
	 * The feature id for the '<em><b>Numero Intervention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__NUMERO_INTERVENTION = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__POSITION = 3;

	/**
	 * The feature id for the '<em><b>Requerant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__REQUERANT = 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__PRECISION = 5;

	/**
	 * The feature id for the '<em><b>Detachements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__DETACHEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Victimes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__VICTIMES = 7;

	/**
	 * The feature id for the '<em><b>Info Tactics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION__INFO_TACTICS = 8;

	/**
	 * The number of structural features of the '<em>Intervention</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link sitac.impl.DetachementImpl <em>Detachement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.DetachementImpl
	 * @see sitac.impl.SitacPackageImpl#getDetachement()
	 * @generated
	 */
	int DETACHEMENT = 1;

	/**
	 * The feature id for the '<em><b>Affectation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACHEMENT__AFFECTATION = 0;

	/**
	 * The feature id for the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACHEMENT__CHEF = 1;

	/**
	 * The number of structural features of the '<em>Detachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETACHEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sitac.impl.MoyenImpl <em>Moyen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.MoyenImpl
	 * @see sitac.impl.SitacPackageImpl#getMoyen()
	 * @generated
	 */
	int MOYEN = 2;

	/**
	 * The feature id for the '<em><b>Affectation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN__AFFECTATION = DETACHEMENT__AFFECTATION;

	/**
	 * The feature id for the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN__CHEF = DETACHEMENT__CHEF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN__TYPE = DETACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Personnels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN__PERSONNELS = DETACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN__PRECISION = DETACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN__NUMERO = DETACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN__POS_REF = DETACHEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pos Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN__POS_TARGET = DETACHEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Moyen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN_FEATURE_COUNT = DETACHEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link sitac.impl.InterventionTypeImpl <em>Intervention Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InterventionTypeImpl
	 * @see sitac.impl.SitacPackageImpl#getInterventionType()
	 * @generated
	 */
	int INTERVENTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_TYPE__CODE = 0;

	/**
	 * The number of structural features of the '<em>Intervention Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sitac.impl.HistoriqueImpl <em>Historique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.HistoriqueImpl
	 * @see sitac.impl.SitacPackageImpl#getHistorique()
	 * @generated
	 */
	int HISTORIQUE = 4;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE__ENTREES = 0;

	/**
	 * The number of structural features of the '<em>Historique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sitac.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.EntreeImpl
	 * @see sitac.impl.SitacPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 5;

	/**
	 * The feature id for the '<em><b>Horodatage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__HORODATAGE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sitac.impl.TypeEntreeImpl <em>Type Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.TypeEntreeImpl
	 * @see sitac.impl.SitacPackageImpl#getTypeEntree()
	 * @generated
	 */
	int TYPE_ENTREE = 6;

	/**
	 * The number of structural features of the '<em>Type Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ENTREE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sitac.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.PositionImpl
	 * @see sitac.impl.SitacPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 7;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sitac.impl.GpsPointImpl <em>Gps Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.GpsPointImpl
	 * @see sitac.impl.SitacPackageImpl#getGpsPoint()
	 * @generated
	 */
	int GPS_POINT = 8;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POINT__LAT = POSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POINT__LONG = POSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Satellites used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POINT__SATELLITES_USED = POSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POINT__MODE = POSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POINT__ALTITUDE = POSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gps Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_POINT_FEATURE_COUNT = POSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link sitac.impl.PositionCivilImpl <em>Position Civil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.PositionCivilImpl
	 * @see sitac.impl.SitacPackageImpl#getPositionCivil()
	 * @generated
	 */
	int POSITION_CIVIL = 9;

	/**
	 * The feature id for the '<em><b>Nom Rue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CIVIL__NOM_RUE = POSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CIVIL__CP = POSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numero Rue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CIVIL__NUMERO_RUE = POSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CIVIL__PAYS = POSITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Position Civil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CIVIL_FEATURE_COUNT = POSITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sitac.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.PersonneImpl
	 * @see sitac.impl.SitacPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRENOM = 1;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sitac.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.AgentImpl
	 * @see sitac.impl.SitacPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 11;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MATRICULE = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitac.impl.MoyenTypeImpl <em>Moyen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.MoyenTypeImpl
	 * @see sitac.impl.SitacPackageImpl#getMoyenType()
	 * @generated
	 */
	int MOYEN_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN_TYPE__CODE = 0;

	/**
	 * The number of structural features of the '<em>Moyen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOYEN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sitac.impl.AffectationImpl <em>Affectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.AffectationImpl
	 * @see sitac.impl.SitacPackageImpl#getAffectation()
	 * @generated
	 */
	int AFFECTATION = 13;

	/**
	 * The feature id for the '<em><b>Moyen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__MOYEN = 0;

	/**
	 * The feature id for the '<em><b>Horodatage Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__HORODATAGE_DEMANDE = 1;

	/**
	 * The feature id for the '<em><b>Horodatage Engagement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__HORODATAGE_ENGAGEMENT = 2;

	/**
	 * The feature id for the '<em><b>Horodatage Desengagement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__HORODATAGE_DESENGAGEMENT = 3;

	/**
	 * The number of structural features of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sitac.impl.SitacModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.SitacModelImpl
	 * @see sitac.impl.SitacPackageImpl#getSitacModel()
	 * @generated
	 */
	int SITAC_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Intervention Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITAC_MODEL__INTERVENTION_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Type Entrees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITAC_MODEL__TYPE_ENTREES = 1;

	/**
	 * The feature id for the '<em><b>Interventions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITAC_MODEL__INTERVENTIONS = 2;

	/**
	 * The feature id for the '<em><b>Personnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITAC_MODEL__PERSONNES = 3;

	/**
	 * The feature id for the '<em><b>Type Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITAC_MODEL__TYPE_ACTIONS = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITAC_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link sitac.impl.InfoTacticImpl <em>Info Tactic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InfoTacticImpl
	 * @see sitac.impl.SitacPackageImpl#getInfoTactic()
	 * @generated
	 */
	int INFO_TACTIC = 15;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TACTIC__CATEGORIE = 0;

	/**
	 * The number of structural features of the '<em>Info Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TACTIC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sitac.impl.InfoPosImpl <em>Info Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InfoPosImpl
	 * @see sitac.impl.SitacPackageImpl#getInfoPos()
	 * @generated
	 */
	int INFO_POS = 16;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_POS__CATEGORIE = INFO_TACTIC__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_POS__POSITIONS = INFO_TACTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Info Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_POS_FEATURE_COUNT = INFO_TACTIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitac.impl.PriseEauImpl <em>Prise Eau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.PriseEauImpl
	 * @see sitac.impl.SitacPackageImpl#getPriseEau()
	 * @generated
	 */
	int PRISE_EAU = 17;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISE_EAU__CATEGORIE = INFO_POS__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISE_EAU__POSITIONS = INFO_POS__POSITIONS;

	/**
	 * The feature id for the '<em><b>Perenne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISE_EAU__PERENNE = INFO_POS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prise Eau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISE_EAU_FEATURE_COUNT = INFO_POS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitac.impl.SourceDangerImpl <em>Source Danger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.SourceDangerImpl
	 * @see sitac.impl.SitacPackageImpl#getSourceDanger()
	 * @generated
	 */
	int SOURCE_DANGER = 18;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DANGER__CATEGORIE = INFO_POS__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DANGER__POSITIONS = INFO_POS__POSITIONS;

	/**
	 * The number of structural features of the '<em>Source Danger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DANGER_FEATURE_COUNT = INFO_POS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sitac.impl.CategorieImpl <em>Categorie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.CategorieImpl
	 * @see sitac.impl.SitacPackageImpl#getCategorie()
	 * @generated
	 */
	int CATEGORIE = 19;

	/**
	 * The number of structural features of the '<em>Categorie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sitac.impl.CibleImpl <em>Cible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.CibleImpl
	 * @see sitac.impl.SitacPackageImpl#getCible()
	 * @generated
	 */
	int CIBLE = 20;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIBLE__CATEGORIE = INFO_POS__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIBLE__POSITIONS = INFO_POS__POSITIONS;

	/**
	 * The number of structural features of the '<em>Cible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIBLE_FEATURE_COUNT = INFO_POS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sitac.impl.InfoLignePosImpl <em>Info Ligne Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InfoLignePosImpl
	 * @see sitac.impl.SitacPackageImpl#getInfoLignePos()
	 * @generated
	 */
	int INFO_LIGNE_POS = 22;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_LIGNE_POS__CATEGORIE = INFO_TACTIC__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_LIGNE_POS__POSITIONS = INFO_TACTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Info Ligne Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_LIGNE_POS_FEATURE_COUNT = INFO_TACTIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitac.impl.InfoZoneImpl <em>Info Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InfoZoneImpl
	 * @see sitac.impl.SitacPackageImpl#getInfoZone()
	 * @generated
	 */
	int INFO_ZONE = 23;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ZONE__CATEGORIE = INFO_LIGNE_POS__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ZONE__POSITIONS = INFO_LIGNE_POS__POSITIONS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ZONE__NOM = INFO_LIGNE_POS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Info Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ZONE_FEATURE_COUNT = INFO_LIGNE_POS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sitac.impl.SinistreImpl <em>Sinistre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.SinistreImpl
	 * @see sitac.impl.SitacPackageImpl#getSinistre()
	 * @generated
	 */
	int SINISTRE = 21;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINISTRE__CATEGORIE = INFO_ZONE__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINISTRE__POSITIONS = INFO_ZONE__POSITIONS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINISTRE__NOM = INFO_ZONE__NOM;

	/**
	 * The number of structural features of the '<em>Sinistre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINISTRE_FEATURE_COUNT = INFO_ZONE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sitac.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.ActionImpl
	 * @see sitac.impl.SitacPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 24;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CATEGORIE = INFO_LIGNE_POS__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__POSITIONS = INFO_LIGNE_POS__POSITIONS;

	/**
	 * The feature id for the '<em><b>Horodatage Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HORODATAGE_DEBUT = INFO_LIGNE_POS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horodatage Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HORODATAGE_FIN = INFO_LIGNE_POS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__POSITION_Z = INFO_LIGNE_POS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = INFO_LIGNE_POS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Noria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NORIA = INFO_LIGNE_POS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>En Ligne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EN_LIGNE = INFO_LIGNE_POS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = INFO_LIGNE_POS_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link sitac.impl.InfoHorodateImpl <em>Info Horodate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InfoHorodateImpl
	 * @see sitac.impl.SitacPackageImpl#getInfoHorodate()
	 * @generated
	 */
	int INFO_HORODATE = 25;

	/**
	 * The feature id for the '<em><b>Horodatage Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_HORODATE__HORODATAGE_DEBUT = 0;

	/**
	 * The feature id for the '<em><b>Horodatage Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_HORODATE__HORODATAGE_FIN = 1;

	/**
	 * The number of structural features of the '<em>Info Horodate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_HORODATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sitac.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.ActionTypeImpl
	 * @see sitac.impl.SitacPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__CODE = 0;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sitac.impl.InfoNiveauImpl <em>Info Niveau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InfoNiveauImpl
	 * @see sitac.impl.SitacPackageImpl#getInfoNiveau()
	 * @generated
	 */
	int INFO_NIVEAU = 27;

	/**
	 * The feature id for the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NIVEAU__POSITION_Z = 0;

	/**
	 * The number of structural features of the '<em>Info Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_NIVEAU_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sitac.impl.SecteurGeoImpl <em>Secteur Geo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.SecteurGeoImpl
	 * @see sitac.impl.SitacPackageImpl#getSecteurGeo()
	 * @generated
	 */
	int SECTEUR_GEO = 28;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_GEO__CATEGORIE = INFO_ZONE__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_GEO__POSITIONS = INFO_ZONE__POSITIONS;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_GEO__NOM = INFO_ZONE__NOM;

	/**
	 * The feature id for the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_GEO__CHEF = INFO_ZONE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_GEO__NIVEAU = INFO_ZONE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Secteur Geo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_GEO_FEATURE_COUNT = INFO_ZONE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sitac.impl.SecteurFontionelImpl <em>Secteur Fontionel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.SecteurFontionelImpl
	 * @see sitac.impl.SitacPackageImpl#getSecteurFontionel()
	 * @generated
	 */
	int SECTEUR_FONTIONEL = 29;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_FONTIONEL__CATEGORIE = INFO_POS__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_FONTIONEL__POSITIONS = INFO_POS__POSITIONS;

	/**
	 * The feature id for the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_FONTIONEL__CHEF = INFO_POS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_FONTIONEL__NIVEAU = INFO_POS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Secteur Fontionel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTEUR_FONTIONEL_FEATURE_COUNT = INFO_POS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sitac.impl.InfoResponsableImpl <em>Info Responsable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.InfoResponsableImpl
	 * @see sitac.impl.SitacPackageImpl#getInfoResponsable()
	 * @generated
	 */
	int INFO_RESPONSABLE = 30;

	/**
	 * The feature id for the '<em><b>Chef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_RESPONSABLE__CHEF = 0;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_RESPONSABLE__NIVEAU = 1;

	/**
	 * The number of structural features of the '<em>Info Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_RESPONSABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sitac.impl.DonneeContextuelImpl <em>Donnee Contextuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.DonneeContextuelImpl
	 * @see sitac.impl.SitacPackageImpl#getDonneeContextuel()
	 * @generated
	 */
	int DONNEE_CONTEXTUEL = 31;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CONTEXTUEL__CATEGORIE = INFO_POS__CATEGORIE;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CONTEXTUEL__POSITIONS = INFO_POS__POSITIONS;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CONTEXTUEL__ORIENTATION = INFO_POS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CONTEXTUEL__PRECISION = INFO_POS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Donnee Contextuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONNEE_CONTEXTUEL_FEATURE_COUNT = INFO_POS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sitac.impl.MessageAmbianceImpl <em>Message Ambiance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sitac.impl.MessageAmbianceImpl
	 * @see sitac.impl.SitacPackageImpl#getMessageAmbiance()
	 * @generated
	 */
	int MESSAGE_AMBIANCE = 32;

	/**
	 * The feature id for the '<em><b>Je Suis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_AMBIANCE__JE_SUIS = 0;

	/**
	 * The feature id for the '<em><b>Je Vois</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_AMBIANCE__JE_VOIS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_AMBIANCE__ID = 2;

	/**
	 * The number of structural features of the '<em>Message Ambiance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_AMBIANCE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link sitac.Intervention <em>Intervention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervention</em>'.
	 * @see sitac.Intervention
	 * @generated
	 */
	EClass getIntervention();

	/**
	 * Returns the meta object for the reference '{@link sitac.Intervention#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sitac.Intervention#getType()
	 * @see #getIntervention()
	 * @generated
	 */
	EReference getIntervention_Type();

	/**
	 * Returns the meta object for the containment reference '{@link sitac.Intervention#getHistorique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Historique</em>'.
	 * @see sitac.Intervention#getHistorique()
	 * @see #getIntervention()
	 * @generated
	 */
	EReference getIntervention_Historique();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Intervention#getNumeroIntervention <em>Numero Intervention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Intervention</em>'.
	 * @see sitac.Intervention#getNumeroIntervention()
	 * @see #getIntervention()
	 * @generated
	 */
	EAttribute getIntervention_NumeroIntervention();

	/**
	 * Returns the meta object for the containment reference '{@link sitac.Intervention#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see sitac.Intervention#getPosition()
	 * @see #getIntervention()
	 * @generated
	 */
	EReference getIntervention_Position();

	/**
	 * Returns the meta object for the reference '{@link sitac.Intervention#getRequerant <em>Requerant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requerant</em>'.
	 * @see sitac.Intervention#getRequerant()
	 * @see #getIntervention()
	 * @generated
	 */
	EReference getIntervention_Requerant();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Intervention#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see sitac.Intervention#getPrecision()
	 * @see #getIntervention()
	 * @generated
	 */
	EAttribute getIntervention_Precision();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.Intervention#getDetachements <em>Detachements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detachements</em>'.
	 * @see sitac.Intervention#getDetachements()
	 * @see #getIntervention()
	 * @generated
	 */
	EReference getIntervention_Detachements();

	/**
	 * Returns the meta object for the reference list '{@link sitac.Intervention#getVictimes <em>Victimes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Victimes</em>'.
	 * @see sitac.Intervention#getVictimes()
	 * @see #getIntervention()
	 * @generated
	 */
	EReference getIntervention_Victimes();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.Intervention#getInfoTactics <em>Info Tactics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Info Tactics</em>'.
	 * @see sitac.Intervention#getInfoTactics()
	 * @see #getIntervention()
	 * @generated
	 */
	EReference getIntervention_InfoTactics();

	/**
	 * Returns the meta object for class '{@link sitac.Detachement <em>Detachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detachement</em>'.
	 * @see sitac.Detachement
	 * @generated
	 */
	EClass getDetachement();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.Detachement#getAffectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affectation</em>'.
	 * @see sitac.Detachement#getAffectation()
	 * @see #getDetachement()
	 * @generated
	 */
	EReference getDetachement_Affectation();

	/**
	 * Returns the meta object for the reference '{@link sitac.Detachement#getChef <em>Chef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chef</em>'.
	 * @see sitac.Detachement#getChef()
	 * @see #getDetachement()
	 * @generated
	 */
	EReference getDetachement_Chef();

	/**
	 * Returns the meta object for class '{@link sitac.Moyen <em>Moyen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moyen</em>'.
	 * @see sitac.Moyen
	 * @generated
	 */
	EClass getMoyen();

	/**
	 * Returns the meta object for the reference '{@link sitac.Moyen#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sitac.Moyen#getType()
	 * @see #getMoyen()
	 * @generated
	 */
	EReference getMoyen_Type();

	/**
	 * Returns the meta object for the reference list '{@link sitac.Moyen#getPersonnels <em>Personnels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personnels</em>'.
	 * @see sitac.Moyen#getPersonnels()
	 * @see #getMoyen()
	 * @generated
	 */
	EReference getMoyen_Personnels();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Moyen#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see sitac.Moyen#getPrecision()
	 * @see #getMoyen()
	 * @generated
	 */
	EAttribute getMoyen_Precision();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Moyen#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see sitac.Moyen#getNumero()
	 * @see #getMoyen()
	 * @generated
	 */
	EAttribute getMoyen_Numero();

	/**
	 * Returns the meta object for the containment reference '{@link sitac.Moyen#getPosRef <em>Pos Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos Ref</em>'.
	 * @see sitac.Moyen#getPosRef()
	 * @see #getMoyen()
	 * @generated
	 */
	EReference getMoyen_PosRef();

	/**
	 * Returns the meta object for the containment reference '{@link sitac.Moyen#getPosTarget <em>Pos Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos Target</em>'.
	 * @see sitac.Moyen#getPosTarget()
	 * @see #getMoyen()
	 * @generated
	 */
	EReference getMoyen_PosTarget();

	/**
	 * Returns the meta object for class '{@link sitac.InterventionType <em>Intervention Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervention Type</em>'.
	 * @see sitac.InterventionType
	 * @generated
	 */
	EClass getInterventionType();

	/**
	 * Returns the meta object for the attribute '{@link sitac.InterventionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see sitac.InterventionType#getCode()
	 * @see #getInterventionType()
	 * @generated
	 */
	EAttribute getInterventionType_Code();

	/**
	 * Returns the meta object for class '{@link sitac.Historique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historique</em>'.
	 * @see sitac.Historique
	 * @generated
	 */
	EClass getHistorique();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.Historique#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entrees</em>'.
	 * @see sitac.Historique#getEntrees()
	 * @see #getHistorique()
	 * @generated
	 */
	EReference getHistorique_Entrees();

	/**
	 * Returns the meta object for class '{@link sitac.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see sitac.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Entree#getHorodatage <em>Horodatage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horodatage</em>'.
	 * @see sitac.Entree#getHorodatage()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Horodatage();

	/**
	 * Returns the meta object for the reference '{@link sitac.Entree#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sitac.Entree#getType()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_Type();

	/**
	 * Returns the meta object for class '{@link sitac.TypeEntree <em>Type Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Entree</em>'.
	 * @see sitac.TypeEntree
	 * @generated
	 */
	EClass getTypeEntree();

	/**
	 * Returns the meta object for class '{@link sitac.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see sitac.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link sitac.GpsPoint <em>Gps Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Point</em>'.
	 * @see sitac.GpsPoint
	 * @generated
	 */
	EClass getGpsPoint();

	/**
	 * Returns the meta object for the attribute '{@link sitac.GpsPoint#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see sitac.GpsPoint#getLat()
	 * @see #getGpsPoint()
	 * @generated
	 */
	EAttribute getGpsPoint_Lat();

	/**
	 * Returns the meta object for the attribute '{@link sitac.GpsPoint#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see sitac.GpsPoint#getLong()
	 * @see #getGpsPoint()
	 * @generated
	 */
	EAttribute getGpsPoint_Long();

	/**
	 * Returns the meta object for the attribute '{@link sitac.GpsPoint#getSatellites_used <em>Satellites used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satellites used</em>'.
	 * @see sitac.GpsPoint#getSatellites_used()
	 * @see #getGpsPoint()
	 * @generated
	 */
	EAttribute getGpsPoint_Satellites_used();

	/**
	 * Returns the meta object for the attribute '{@link sitac.GpsPoint#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see sitac.GpsPoint#getMode()
	 * @see #getGpsPoint()
	 * @generated
	 */
	EAttribute getGpsPoint_Mode();

	/**
	 * Returns the meta object for the attribute '{@link sitac.GpsPoint#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see sitac.GpsPoint#getAltitude()
	 * @see #getGpsPoint()
	 * @generated
	 */
	EAttribute getGpsPoint_Altitude();

	/**
	 * Returns the meta object for class '{@link sitac.PositionCivil <em>Position Civil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Civil</em>'.
	 * @see sitac.PositionCivil
	 * @generated
	 */
	EClass getPositionCivil();

	/**
	 * Returns the meta object for the attribute '{@link sitac.PositionCivil#getNomRue <em>Nom Rue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Rue</em>'.
	 * @see sitac.PositionCivil#getNomRue()
	 * @see #getPositionCivil()
	 * @generated
	 */
	EAttribute getPositionCivil_NomRue();

	/**
	 * Returns the meta object for the attribute '{@link sitac.PositionCivil#getCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp</em>'.
	 * @see sitac.PositionCivil#getCp()
	 * @see #getPositionCivil()
	 * @generated
	 */
	EAttribute getPositionCivil_Cp();

	/**
	 * Returns the meta object for the attribute '{@link sitac.PositionCivil#getNumeroRue <em>Numero Rue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Rue</em>'.
	 * @see sitac.PositionCivil#getNumeroRue()
	 * @see #getPositionCivil()
	 * @generated
	 */
	EAttribute getPositionCivil_NumeroRue();

	/**
	 * Returns the meta object for the attribute '{@link sitac.PositionCivil#getPays <em>Pays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pays</em>'.
	 * @see sitac.PositionCivil#getPays()
	 * @see #getPositionCivil()
	 * @generated
	 */
	EAttribute getPositionCivil_Pays();

	/**
	 * Returns the meta object for class '{@link sitac.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see sitac.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see sitac.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Personne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see sitac.Personne#getPrenom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prenom();

	/**
	 * Returns the meta object for class '{@link sitac.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see sitac.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Agent#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see sitac.Agent#getMatricule()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Matricule();

	/**
	 * Returns the meta object for class '{@link sitac.MoyenType <em>Moyen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moyen Type</em>'.
	 * @see sitac.MoyenType
	 * @generated
	 */
	EClass getMoyenType();

	/**
	 * Returns the meta object for the attribute '{@link sitac.MoyenType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see sitac.MoyenType#getCode()
	 * @see #getMoyenType()
	 * @generated
	 */
	EAttribute getMoyenType_Code();

	/**
	 * Returns the meta object for class '{@link sitac.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affectation</em>'.
	 * @see sitac.Affectation
	 * @generated
	 */
	EClass getAffectation();

	/**
	 * Returns the meta object for the reference '{@link sitac.Affectation#getMoyen <em>Moyen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moyen</em>'.
	 * @see sitac.Affectation#getMoyen()
	 * @see #getAffectation()
	 * @generated
	 */
	EReference getAffectation_Moyen();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Affectation#getHorodatageDemande <em>Horodatage Demande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horodatage Demande</em>'.
	 * @see sitac.Affectation#getHorodatageDemande()
	 * @see #getAffectation()
	 * @generated
	 */
	EAttribute getAffectation_HorodatageDemande();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Affectation#getHorodatageEngagement <em>Horodatage Engagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horodatage Engagement</em>'.
	 * @see sitac.Affectation#getHorodatageEngagement()
	 * @see #getAffectation()
	 * @generated
	 */
	EAttribute getAffectation_HorodatageEngagement();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Affectation#getHorodatageDesengagement <em>Horodatage Desengagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horodatage Desengagement</em>'.
	 * @see sitac.Affectation#getHorodatageDesengagement()
	 * @see #getAffectation()
	 * @generated
	 */
	EAttribute getAffectation_HorodatageDesengagement();

	/**
	 * Returns the meta object for class '{@link sitac.SitacModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see sitac.SitacModel
	 * @generated
	 */
	EClass getSitacModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.SitacModel#getInterventionTypes <em>Intervention Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intervention Types</em>'.
	 * @see sitac.SitacModel#getInterventionTypes()
	 * @see #getSitacModel()
	 * @generated
	 */
	EReference getSitacModel_InterventionTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.SitacModel#getTypeEntrees <em>Type Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Entrees</em>'.
	 * @see sitac.SitacModel#getTypeEntrees()
	 * @see #getSitacModel()
	 * @generated
	 */
	EReference getSitacModel_TypeEntrees();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.SitacModel#getInterventions <em>Interventions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interventions</em>'.
	 * @see sitac.SitacModel#getInterventions()
	 * @see #getSitacModel()
	 * @generated
	 */
	EReference getSitacModel_Interventions();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.SitacModel#getPersonnes <em>Personnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personnes</em>'.
	 * @see sitac.SitacModel#getPersonnes()
	 * @see #getSitacModel()
	 * @generated
	 */
	EReference getSitacModel_Personnes();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.SitacModel#getTypeActions <em>Type Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Actions</em>'.
	 * @see sitac.SitacModel#getTypeActions()
	 * @see #getSitacModel()
	 * @generated
	 */
	EReference getSitacModel_TypeActions();

	/**
	 * Returns the meta object for class '{@link sitac.InfoTactic <em>Info Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Tactic</em>'.
	 * @see sitac.InfoTactic
	 * @generated
	 */
	EClass getInfoTactic();

	/**
	 * Returns the meta object for the reference '{@link sitac.InfoTactic#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Categorie</em>'.
	 * @see sitac.InfoTactic#getCategorie()
	 * @see #getInfoTactic()
	 * @generated
	 */
	EReference getInfoTactic_Categorie();

	/**
	 * Returns the meta object for class '{@link sitac.InfoPos <em>Info Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Pos</em>'.
	 * @see sitac.InfoPos
	 * @generated
	 */
	EClass getInfoPos();

	/**
	 * Returns the meta object for the containment reference '{@link sitac.InfoPos#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Positions</em>'.
	 * @see sitac.InfoPos#getPositions()
	 * @see #getInfoPos()
	 * @generated
	 */
	EReference getInfoPos_Positions();

	/**
	 * Returns the meta object for class '{@link sitac.PriseEau <em>Prise Eau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prise Eau</em>'.
	 * @see sitac.PriseEau
	 * @generated
	 */
	EClass getPriseEau();

	/**
	 * Returns the meta object for the attribute '{@link sitac.PriseEau#isPerenne <em>Perenne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perenne</em>'.
	 * @see sitac.PriseEau#isPerenne()
	 * @see #getPriseEau()
	 * @generated
	 */
	EAttribute getPriseEau_Perenne();

	/**
	 * Returns the meta object for class '{@link sitac.SourceDanger <em>Source Danger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Danger</em>'.
	 * @see sitac.SourceDanger
	 * @generated
	 */
	EClass getSourceDanger();

	/**
	 * Returns the meta object for class '{@link sitac.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorie</em>'.
	 * @see sitac.Categorie
	 * @generated
	 */
	EClass getCategorie();

	/**
	 * Returns the meta object for class '{@link sitac.Cible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cible</em>'.
	 * @see sitac.Cible
	 * @generated
	 */
	EClass getCible();

	/**
	 * Returns the meta object for class '{@link sitac.Sinistre <em>Sinistre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sinistre</em>'.
	 * @see sitac.Sinistre
	 * @generated
	 */
	EClass getSinistre();

	/**
	 * Returns the meta object for class '{@link sitac.InfoLignePos <em>Info Ligne Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Ligne Pos</em>'.
	 * @see sitac.InfoLignePos
	 * @generated
	 */
	EClass getInfoLignePos();

	/**
	 * Returns the meta object for the containment reference list '{@link sitac.InfoLignePos#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see sitac.InfoLignePos#getPositions()
	 * @see #getInfoLignePos()
	 * @generated
	 */
	EReference getInfoLignePos_Positions();

	/**
	 * Returns the meta object for class '{@link sitac.InfoZone <em>Info Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Zone</em>'.
	 * @see sitac.InfoZone
	 * @generated
	 */
	EClass getInfoZone();

	/**
	 * Returns the meta object for the attribute '{@link sitac.InfoZone#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see sitac.InfoZone#getNom()
	 * @see #getInfoZone()
	 * @generated
	 */
	EAttribute getInfoZone_Nom();

	/**
	 * Returns the meta object for class '{@link sitac.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see sitac.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link sitac.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sitac.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Type();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Action#isNoria <em>Noria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noria</em>'.
	 * @see sitac.Action#isNoria()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Noria();

	/**
	 * Returns the meta object for the attribute '{@link sitac.Action#isEnLigne <em>En Ligne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>En Ligne</em>'.
	 * @see sitac.Action#isEnLigne()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_EnLigne();

	/**
	 * Returns the meta object for class '{@link sitac.InfoHorodate <em>Info Horodate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Horodate</em>'.
	 * @see sitac.InfoHorodate
	 * @generated
	 */
	EClass getInfoHorodate();

	/**
	 * Returns the meta object for the attribute '{@link sitac.InfoHorodate#getHorodatageDebut <em>Horodatage Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horodatage Debut</em>'.
	 * @see sitac.InfoHorodate#getHorodatageDebut()
	 * @see #getInfoHorodate()
	 * @generated
	 */
	EAttribute getInfoHorodate_HorodatageDebut();

	/**
	 * Returns the meta object for the attribute '{@link sitac.InfoHorodate#getHorodatageFin <em>Horodatage Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horodatage Fin</em>'.
	 * @see sitac.InfoHorodate#getHorodatageFin()
	 * @see #getInfoHorodate()
	 * @generated
	 */
	EAttribute getInfoHorodate_HorodatageFin();

	/**
	 * Returns the meta object for class '{@link sitac.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see sitac.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for the attribute '{@link sitac.ActionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see sitac.ActionType#getCode()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Code();

	/**
	 * Returns the meta object for class '{@link sitac.InfoNiveau <em>Info Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Niveau</em>'.
	 * @see sitac.InfoNiveau
	 * @generated
	 */
	EClass getInfoNiveau();

	/**
	 * Returns the meta object for the attribute '{@link sitac.InfoNiveau#getPositionZ <em>Position Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Z</em>'.
	 * @see sitac.InfoNiveau#getPositionZ()
	 * @see #getInfoNiveau()
	 * @generated
	 */
	EAttribute getInfoNiveau_PositionZ();

	/**
	 * Returns the meta object for class '{@link sitac.SecteurGeo <em>Secteur Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secteur Geo</em>'.
	 * @see sitac.SecteurGeo
	 * @generated
	 */
	EClass getSecteurGeo();

	/**
	 * Returns the meta object for class '{@link sitac.SecteurFontionel <em>Secteur Fontionel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secteur Fontionel</em>'.
	 * @see sitac.SecteurFontionel
	 * @generated
	 */
	EClass getSecteurFontionel();

	/**
	 * Returns the meta object for class '{@link sitac.InfoResponsable <em>Info Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Responsable</em>'.
	 * @see sitac.InfoResponsable
	 * @generated
	 */
	EClass getInfoResponsable();

	/**
	 * Returns the meta object for the reference '{@link sitac.InfoResponsable#getChef <em>Chef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chef</em>'.
	 * @see sitac.InfoResponsable#getChef()
	 * @see #getInfoResponsable()
	 * @generated
	 */
	EReference getInfoResponsable_Chef();

	/**
	 * Returns the meta object for the attribute '{@link sitac.InfoResponsable#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau</em>'.
	 * @see sitac.InfoResponsable#getNiveau()
	 * @see #getInfoResponsable()
	 * @generated
	 */
	EAttribute getInfoResponsable_Niveau();

	/**
	 * Returns the meta object for class '{@link sitac.DonneeContextuel <em>Donnee Contextuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donnee Contextuel</em>'.
	 * @see sitac.DonneeContextuel
	 * @generated
	 */
	EClass getDonneeContextuel();

	/**
	 * Returns the meta object for the attribute '{@link sitac.DonneeContextuel#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see sitac.DonneeContextuel#getOrientation()
	 * @see #getDonneeContextuel()
	 * @generated
	 */
	EAttribute getDonneeContextuel_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link sitac.DonneeContextuel#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see sitac.DonneeContextuel#getPrecision()
	 * @see #getDonneeContextuel()
	 * @generated
	 */
	EAttribute getDonneeContextuel_Precision();

	/**
	 * Returns the meta object for class '{@link sitac.MessageAmbiance <em>Message Ambiance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Ambiance</em>'.
	 * @see sitac.MessageAmbiance
	 * @generated
	 */
	EClass getMessageAmbiance();

	/**
	 * Returns the meta object for the attribute '{@link sitac.MessageAmbiance#getJeSuis <em>Je Suis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Je Suis</em>'.
	 * @see sitac.MessageAmbiance#getJeSuis()
	 * @see #getMessageAmbiance()
	 * @generated
	 */
	EAttribute getMessageAmbiance_JeSuis();

	/**
	 * Returns the meta object for the attribute '{@link sitac.MessageAmbiance#getJeVois <em>Je Vois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Je Vois</em>'.
	 * @see sitac.MessageAmbiance#getJeVois()
	 * @see #getMessageAmbiance()
	 * @generated
	 */
	EAttribute getMessageAmbiance_JeVois();

	/**
	 * Returns the meta object for the attribute '{@link sitac.MessageAmbiance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sitac.MessageAmbiance#getId()
	 * @see #getMessageAmbiance()
	 * @generated
	 */
	EAttribute getMessageAmbiance_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SitacFactory getSitacFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sitac.impl.InterventionImpl <em>Intervention</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InterventionImpl
		 * @see sitac.impl.SitacPackageImpl#getIntervention()
		 * @generated
		 */
		EClass INTERVENTION = eINSTANCE.getIntervention();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENTION__TYPE = eINSTANCE.getIntervention_Type();

		/**
		 * The meta object literal for the '<em><b>Historique</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENTION__HISTORIQUE = eINSTANCE.getIntervention_Historique();

		/**
		 * The meta object literal for the '<em><b>Numero Intervention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVENTION__NUMERO_INTERVENTION = eINSTANCE.getIntervention_NumeroIntervention();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENTION__POSITION = eINSTANCE.getIntervention_Position();

		/**
		 * The meta object literal for the '<em><b>Requerant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENTION__REQUERANT = eINSTANCE.getIntervention_Requerant();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVENTION__PRECISION = eINSTANCE.getIntervention_Precision();

		/**
		 * The meta object literal for the '<em><b>Detachements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENTION__DETACHEMENTS = eINSTANCE.getIntervention_Detachements();

		/**
		 * The meta object literal for the '<em><b>Victimes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENTION__VICTIMES = eINSTANCE.getIntervention_Victimes();

		/**
		 * The meta object literal for the '<em><b>Info Tactics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENTION__INFO_TACTICS = eINSTANCE.getIntervention_InfoTactics();

		/**
		 * The meta object literal for the '{@link sitac.impl.DetachementImpl <em>Detachement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.DetachementImpl
		 * @see sitac.impl.SitacPackageImpl#getDetachement()
		 * @generated
		 */
		EClass DETACHEMENT = eINSTANCE.getDetachement();

		/**
		 * The meta object literal for the '<em><b>Affectation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETACHEMENT__AFFECTATION = eINSTANCE.getDetachement_Affectation();

		/**
		 * The meta object literal for the '<em><b>Chef</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETACHEMENT__CHEF = eINSTANCE.getDetachement_Chef();

		/**
		 * The meta object literal for the '{@link sitac.impl.MoyenImpl <em>Moyen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.MoyenImpl
		 * @see sitac.impl.SitacPackageImpl#getMoyen()
		 * @generated
		 */
		EClass MOYEN = eINSTANCE.getMoyen();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOYEN__TYPE = eINSTANCE.getMoyen_Type();

		/**
		 * The meta object literal for the '<em><b>Personnels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOYEN__PERSONNELS = eINSTANCE.getMoyen_Personnels();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOYEN__PRECISION = eINSTANCE.getMoyen_Precision();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOYEN__NUMERO = eINSTANCE.getMoyen_Numero();

		/**
		 * The meta object literal for the '<em><b>Pos Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOYEN__POS_REF = eINSTANCE.getMoyen_PosRef();

		/**
		 * The meta object literal for the '<em><b>Pos Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOYEN__POS_TARGET = eINSTANCE.getMoyen_PosTarget();

		/**
		 * The meta object literal for the '{@link sitac.impl.InterventionTypeImpl <em>Intervention Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InterventionTypeImpl
		 * @see sitac.impl.SitacPackageImpl#getInterventionType()
		 * @generated
		 */
		EClass INTERVENTION_TYPE = eINSTANCE.getInterventionType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVENTION_TYPE__CODE = eINSTANCE.getInterventionType_Code();

		/**
		 * The meta object literal for the '{@link sitac.impl.HistoriqueImpl <em>Historique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.HistoriqueImpl
		 * @see sitac.impl.SitacPackageImpl#getHistorique()
		 * @generated
		 */
		EClass HISTORIQUE = eINSTANCE.getHistorique();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORIQUE__ENTREES = eINSTANCE.getHistorique_Entrees();

		/**
		 * The meta object literal for the '{@link sitac.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.EntreeImpl
		 * @see sitac.impl.SitacPackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Horodatage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__HORODATAGE = eINSTANCE.getEntree_Horodatage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__TYPE = eINSTANCE.getEntree_Type();

		/**
		 * The meta object literal for the '{@link sitac.impl.TypeEntreeImpl <em>Type Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.TypeEntreeImpl
		 * @see sitac.impl.SitacPackageImpl#getTypeEntree()
		 * @generated
		 */
		EClass TYPE_ENTREE = eINSTANCE.getTypeEntree();

		/**
		 * The meta object literal for the '{@link sitac.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.PositionImpl
		 * @see sitac.impl.SitacPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link sitac.impl.GpsPointImpl <em>Gps Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.GpsPointImpl
		 * @see sitac.impl.SitacPackageImpl#getGpsPoint()
		 * @generated
		 */
		EClass GPS_POINT = eINSTANCE.getGpsPoint();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POINT__LAT = eINSTANCE.getGpsPoint_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POINT__LONG = eINSTANCE.getGpsPoint_Long();

		/**
		 * The meta object literal for the '<em><b>Satellites used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POINT__SATELLITES_USED = eINSTANCE.getGpsPoint_Satellites_used();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POINT__MODE = eINSTANCE.getGpsPoint_Mode();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS_POINT__ALTITUDE = eINSTANCE.getGpsPoint_Altitude();

		/**
		 * The meta object literal for the '{@link sitac.impl.PositionCivilImpl <em>Position Civil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.PositionCivilImpl
		 * @see sitac.impl.SitacPackageImpl#getPositionCivil()
		 * @generated
		 */
		EClass POSITION_CIVIL = eINSTANCE.getPositionCivil();

		/**
		 * The meta object literal for the '<em><b>Nom Rue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_CIVIL__NOM_RUE = eINSTANCE.getPositionCivil_NomRue();

		/**
		 * The meta object literal for the '<em><b>Cp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_CIVIL__CP = eINSTANCE.getPositionCivil_Cp();

		/**
		 * The meta object literal for the '<em><b>Numero Rue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_CIVIL__NUMERO_RUE = eINSTANCE.getPositionCivil_NumeroRue();

		/**
		 * The meta object literal for the '<em><b>Pays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_CIVIL__PAYS = eINSTANCE.getPositionCivil_Pays();

		/**
		 * The meta object literal for the '{@link sitac.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.PersonneImpl
		 * @see sitac.impl.SitacPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRENOM = eINSTANCE.getPersonne_Prenom();

		/**
		 * The meta object literal for the '{@link sitac.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.AgentImpl
		 * @see sitac.impl.SitacPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__MATRICULE = eINSTANCE.getAgent_Matricule();

		/**
		 * The meta object literal for the '{@link sitac.impl.MoyenTypeImpl <em>Moyen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.MoyenTypeImpl
		 * @see sitac.impl.SitacPackageImpl#getMoyenType()
		 * @generated
		 */
		EClass MOYEN_TYPE = eINSTANCE.getMoyenType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOYEN_TYPE__CODE = eINSTANCE.getMoyenType_Code();

		/**
		 * The meta object literal for the '{@link sitac.impl.AffectationImpl <em>Affectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.AffectationImpl
		 * @see sitac.impl.SitacPackageImpl#getAffectation()
		 * @generated
		 */
		EClass AFFECTATION = eINSTANCE.getAffectation();

		/**
		 * The meta object literal for the '<em><b>Moyen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTATION__MOYEN = eINSTANCE.getAffectation_Moyen();

		/**
		 * The meta object literal for the '<em><b>Horodatage Demande</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION__HORODATAGE_DEMANDE = eINSTANCE.getAffectation_HorodatageDemande();

		/**
		 * The meta object literal for the '<em><b>Horodatage Engagement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION__HORODATAGE_ENGAGEMENT = eINSTANCE.getAffectation_HorodatageEngagement();

		/**
		 * The meta object literal for the '<em><b>Horodatage Desengagement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION__HORODATAGE_DESENGAGEMENT = eINSTANCE.getAffectation_HorodatageDesengagement();

		/**
		 * The meta object literal for the '{@link sitac.impl.SitacModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.SitacModelImpl
		 * @see sitac.impl.SitacPackageImpl#getSitacModel()
		 * @generated
		 */
		EClass SITAC_MODEL = eINSTANCE.getSitacModel();

		/**
		 * The meta object literal for the '<em><b>Intervention Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITAC_MODEL__INTERVENTION_TYPES = eINSTANCE.getSitacModel_InterventionTypes();

		/**
		 * The meta object literal for the '<em><b>Type Entrees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITAC_MODEL__TYPE_ENTREES = eINSTANCE.getSitacModel_TypeEntrees();

		/**
		 * The meta object literal for the '<em><b>Interventions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITAC_MODEL__INTERVENTIONS = eINSTANCE.getSitacModel_Interventions();

		/**
		 * The meta object literal for the '<em><b>Personnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITAC_MODEL__PERSONNES = eINSTANCE.getSitacModel_Personnes();

		/**
		 * The meta object literal for the '<em><b>Type Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITAC_MODEL__TYPE_ACTIONS = eINSTANCE.getSitacModel_TypeActions();

		/**
		 * The meta object literal for the '{@link sitac.impl.InfoTacticImpl <em>Info Tactic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InfoTacticImpl
		 * @see sitac.impl.SitacPackageImpl#getInfoTactic()
		 * @generated
		 */
		EClass INFO_TACTIC = eINSTANCE.getInfoTactic();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TACTIC__CATEGORIE = eINSTANCE.getInfoTactic_Categorie();

		/**
		 * The meta object literal for the '{@link sitac.impl.InfoPosImpl <em>Info Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InfoPosImpl
		 * @see sitac.impl.SitacPackageImpl#getInfoPos()
		 * @generated
		 */
		EClass INFO_POS = eINSTANCE.getInfoPos();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_POS__POSITIONS = eINSTANCE.getInfoPos_Positions();

		/**
		 * The meta object literal for the '{@link sitac.impl.PriseEauImpl <em>Prise Eau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.PriseEauImpl
		 * @see sitac.impl.SitacPackageImpl#getPriseEau()
		 * @generated
		 */
		EClass PRISE_EAU = eINSTANCE.getPriseEau();

		/**
		 * The meta object literal for the '<em><b>Perenne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRISE_EAU__PERENNE = eINSTANCE.getPriseEau_Perenne();

		/**
		 * The meta object literal for the '{@link sitac.impl.SourceDangerImpl <em>Source Danger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.SourceDangerImpl
		 * @see sitac.impl.SitacPackageImpl#getSourceDanger()
		 * @generated
		 */
		EClass SOURCE_DANGER = eINSTANCE.getSourceDanger();

		/**
		 * The meta object literal for the '{@link sitac.impl.CategorieImpl <em>Categorie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.CategorieImpl
		 * @see sitac.impl.SitacPackageImpl#getCategorie()
		 * @generated
		 */
		EClass CATEGORIE = eINSTANCE.getCategorie();

		/**
		 * The meta object literal for the '{@link sitac.impl.CibleImpl <em>Cible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.CibleImpl
		 * @see sitac.impl.SitacPackageImpl#getCible()
		 * @generated
		 */
		EClass CIBLE = eINSTANCE.getCible();

		/**
		 * The meta object literal for the '{@link sitac.impl.SinistreImpl <em>Sinistre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.SinistreImpl
		 * @see sitac.impl.SitacPackageImpl#getSinistre()
		 * @generated
		 */
		EClass SINISTRE = eINSTANCE.getSinistre();

		/**
		 * The meta object literal for the '{@link sitac.impl.InfoLignePosImpl <em>Info Ligne Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InfoLignePosImpl
		 * @see sitac.impl.SitacPackageImpl#getInfoLignePos()
		 * @generated
		 */
		EClass INFO_LIGNE_POS = eINSTANCE.getInfoLignePos();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_LIGNE_POS__POSITIONS = eINSTANCE.getInfoLignePos_Positions();

		/**
		 * The meta object literal for the '{@link sitac.impl.InfoZoneImpl <em>Info Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InfoZoneImpl
		 * @see sitac.impl.SitacPackageImpl#getInfoZone()
		 * @generated
		 */
		EClass INFO_ZONE = eINSTANCE.getInfoZone();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_ZONE__NOM = eINSTANCE.getInfoZone_Nom();

		/**
		 * The meta object literal for the '{@link sitac.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.ActionImpl
		 * @see sitac.impl.SitacPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '<em><b>Noria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NORIA = eINSTANCE.getAction_Noria();

		/**
		 * The meta object literal for the '<em><b>En Ligne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__EN_LIGNE = eINSTANCE.getAction_EnLigne();

		/**
		 * The meta object literal for the '{@link sitac.impl.InfoHorodateImpl <em>Info Horodate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InfoHorodateImpl
		 * @see sitac.impl.SitacPackageImpl#getInfoHorodate()
		 * @generated
		 */
		EClass INFO_HORODATE = eINSTANCE.getInfoHorodate();

		/**
		 * The meta object literal for the '<em><b>Horodatage Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_HORODATE__HORODATAGE_DEBUT = eINSTANCE.getInfoHorodate_HorodatageDebut();

		/**
		 * The meta object literal for the '<em><b>Horodatage Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_HORODATE__HORODATAGE_FIN = eINSTANCE.getInfoHorodate_HorodatageFin();

		/**
		 * The meta object literal for the '{@link sitac.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.ActionTypeImpl
		 * @see sitac.impl.SitacPackageImpl#getActionType()
		 * @generated
		 */
		EClass ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__CODE = eINSTANCE.getActionType_Code();

		/**
		 * The meta object literal for the '{@link sitac.impl.InfoNiveauImpl <em>Info Niveau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InfoNiveauImpl
		 * @see sitac.impl.SitacPackageImpl#getInfoNiveau()
		 * @generated
		 */
		EClass INFO_NIVEAU = eINSTANCE.getInfoNiveau();

		/**
		 * The meta object literal for the '<em><b>Position Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_NIVEAU__POSITION_Z = eINSTANCE.getInfoNiveau_PositionZ();

		/**
		 * The meta object literal for the '{@link sitac.impl.SecteurGeoImpl <em>Secteur Geo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.SecteurGeoImpl
		 * @see sitac.impl.SitacPackageImpl#getSecteurGeo()
		 * @generated
		 */
		EClass SECTEUR_GEO = eINSTANCE.getSecteurGeo();

		/**
		 * The meta object literal for the '{@link sitac.impl.SecteurFontionelImpl <em>Secteur Fontionel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.SecteurFontionelImpl
		 * @see sitac.impl.SitacPackageImpl#getSecteurFontionel()
		 * @generated
		 */
		EClass SECTEUR_FONTIONEL = eINSTANCE.getSecteurFontionel();

		/**
		 * The meta object literal for the '{@link sitac.impl.InfoResponsableImpl <em>Info Responsable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.InfoResponsableImpl
		 * @see sitac.impl.SitacPackageImpl#getInfoResponsable()
		 * @generated
		 */
		EClass INFO_RESPONSABLE = eINSTANCE.getInfoResponsable();

		/**
		 * The meta object literal for the '<em><b>Chef</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_RESPONSABLE__CHEF = eINSTANCE.getInfoResponsable_Chef();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_RESPONSABLE__NIVEAU = eINSTANCE.getInfoResponsable_Niveau();

		/**
		 * The meta object literal for the '{@link sitac.impl.DonneeContextuelImpl <em>Donnee Contextuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.DonneeContextuelImpl
		 * @see sitac.impl.SitacPackageImpl#getDonneeContextuel()
		 * @generated
		 */
		EClass DONNEE_CONTEXTUEL = eINSTANCE.getDonneeContextuel();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONNEE_CONTEXTUEL__ORIENTATION = eINSTANCE.getDonneeContextuel_Orientation();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONNEE_CONTEXTUEL__PRECISION = eINSTANCE.getDonneeContextuel_Precision();

		/**
		 * The meta object literal for the '{@link sitac.impl.MessageAmbianceImpl <em>Message Ambiance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sitac.impl.MessageAmbianceImpl
		 * @see sitac.impl.SitacPackageImpl#getMessageAmbiance()
		 * @generated
		 */
		EClass MESSAGE_AMBIANCE = eINSTANCE.getMessageAmbiance();

		/**
		 * The meta object literal for the '<em><b>Je Suis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_AMBIANCE__JE_SUIS = eINSTANCE.getMessageAmbiance_JeSuis();

		/**
		 * The meta object literal for the '<em><b>Je Vois</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_AMBIANCE__JE_VOIS = eINSTANCE.getMessageAmbiance_JeVois();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_AMBIANCE__ID = eINSTANCE.getMessageAmbiance_Id();

	}

} //SitacPackage
