/**
 */
package sitac.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sitac.Action;
import sitac.ActionType;
import sitac.Affectation;
import sitac.Agent;
import sitac.Categorie;
import sitac.Cible;
import sitac.Detachement;
import sitac.DonneeContextuel;
import sitac.Entree;
import sitac.GpsPoint;
import sitac.Historique;
import sitac.InfoHorodate;
import sitac.InfoLignePos;
import sitac.InfoNiveau;
import sitac.InfoPos;
import sitac.InfoResponsable;
import sitac.InfoTactic;
import sitac.InfoZone;
import sitac.Intervention;
import sitac.InterventionType;
import sitac.MessageAmbiance;
import sitac.Moyen;
import sitac.MoyenType;
import sitac.Personne;
import sitac.Position;
import sitac.PositionCivil;
import sitac.PriseEau;
import sitac.SecteurFontionel;
import sitac.SecteurGeo;
import sitac.Sinistre;
import sitac.SitacFactory;
import sitac.SitacModel;
import sitac.SitacPackage;
import sitac.SourceDanger;
import sitac.TypeEntree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SitacPackageImpl extends EPackageImpl implements SitacPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interventionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detachementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moyenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interventionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEntreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionCivilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moyenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sitacModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoTacticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priseEauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinistreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoLignePosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoHorodateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoNiveauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secteurGeoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secteurFontionelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoResponsableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donneeContextuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageAmbianceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sitac.SitacPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SitacPackageImpl() {
		super(eNS_URI, SitacFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SitacPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SitacPackage init() {
		if (isInited) return (SitacPackage)EPackage.Registry.INSTANCE.getEPackage(SitacPackage.eNS_URI);

		// Obtain or create and register package
		SitacPackageImpl theSitacPackage = (SitacPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SitacPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SitacPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSitacPackage.createPackageContents();

		// Initialize created meta-data
		theSitacPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSitacPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SitacPackage.eNS_URI, theSitacPackage);
		return theSitacPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervention() {
		return interventionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervention_Type() {
		return (EReference)interventionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervention_Historique() {
		return (EReference)interventionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervention_NumeroIntervention() {
		return (EAttribute)interventionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervention_Position() {
		return (EReference)interventionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervention_Requerant() {
		return (EReference)interventionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervention_Precision() {
		return (EAttribute)interventionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervention_Detachements() {
		return (EReference)interventionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervention_Victimes() {
		return (EReference)interventionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntervention_InfoTactics() {
		return (EReference)interventionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetachement() {
		return detachementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetachement_Affectation() {
		return (EReference)detachementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetachement_Chef() {
		return (EReference)detachementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoyen() {
		return moyenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoyen_Type() {
		return (EReference)moyenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoyen_Personnels() {
		return (EReference)moyenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoyen_Precision() {
		return (EAttribute)moyenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoyen_Numero() {
		return (EAttribute)moyenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoyen_PosRef() {
		return (EReference)moyenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoyen_PosTarget() {
		return (EReference)moyenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterventionType() {
		return interventionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterventionType_Code() {
		return (EAttribute)interventionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistorique() {
		return historiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistorique_Entrees() {
		return (EReference)historiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntree_Horodatage() {
		return (EAttribute)entreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntree_Type() {
		return (EReference)entreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeEntree() {
		return typeEntreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsPoint() {
		return gpsPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsPoint_Lat() {
		return (EAttribute)gpsPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsPoint_Long() {
		return (EAttribute)gpsPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsPoint_Satellites_used() {
		return (EAttribute)gpsPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsPoint_Mode() {
		return (EAttribute)gpsPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsPoint_Altitude() {
		return (EAttribute)gpsPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionCivil() {
		return positionCivilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionCivil_NomRue() {
		return (EAttribute)positionCivilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionCivil_Cp() {
		return (EAttribute)positionCivilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionCivil_NumeroRue() {
		return (EAttribute)positionCivilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionCivil_Pays() {
		return (EAttribute)positionCivilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Nom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Prenom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Matricule() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoyenType() {
		return moyenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoyenType_Code() {
		return (EAttribute)moyenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffectation() {
		return affectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffectation_Moyen() {
		return (EReference)affectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectation_HorodatageDemande() {
		return (EAttribute)affectationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectation_HorodatageEngagement() {
		return (EAttribute)affectationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectation_HorodatageDesengagement() {
		return (EAttribute)affectationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSitacModel() {
		return sitacModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSitacModel_InterventionTypes() {
		return (EReference)sitacModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSitacModel_TypeEntrees() {
		return (EReference)sitacModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSitacModel_Interventions() {
		return (EReference)sitacModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSitacModel_Personnes() {
		return (EReference)sitacModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSitacModel_TypeActions() {
		return (EReference)sitacModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoTactic() {
		return infoTacticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoTactic_Categorie() {
		return (EReference)infoTacticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoPos() {
		return infoPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoPos_Positions() {
		return (EReference)infoPosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriseEau() {
		return priseEauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriseEau_Perenne() {
		return (EAttribute)priseEauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDanger() {
		return sourceDangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategorie() {
		return categorieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCible() {
		return cibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinistre() {
		return sinistreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoLignePos() {
		return infoLignePosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoLignePos_Positions() {
		return (EReference)infoLignePosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoZone() {
		return infoZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoZone_Nom() {
		return (EAttribute)infoZoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Type() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Noria() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_EnLigne() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoHorodate() {
		return infoHorodateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoHorodate_HorodatageDebut() {
		return (EAttribute)infoHorodateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoHorodate_HorodatageFin() {
		return (EAttribute)infoHorodateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionType() {
		return actionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionType_Code() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoNiveau() {
		return infoNiveauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoNiveau_PositionZ() {
		return (EAttribute)infoNiveauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecteurGeo() {
		return secteurGeoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecteurFontionel() {
		return secteurFontionelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoResponsable() {
		return infoResponsableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoResponsable_Chef() {
		return (EReference)infoResponsableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoResponsable_Niveau() {
		return (EAttribute)infoResponsableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonneeContextuel() {
		return donneeContextuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonneeContextuel_Orientation() {
		return (EAttribute)donneeContextuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDonneeContextuel_Precision() {
		return (EAttribute)donneeContextuelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageAmbiance() {
		return messageAmbianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageAmbiance_JeSuis() {
		return (EAttribute)messageAmbianceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageAmbiance_JeVois() {
		return (EAttribute)messageAmbianceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageAmbiance_Id() {
		return (EAttribute)messageAmbianceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacFactory getSitacFactory() {
		return (SitacFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		interventionEClass = createEClass(INTERVENTION);
		createEReference(interventionEClass, INTERVENTION__TYPE);
		createEReference(interventionEClass, INTERVENTION__HISTORIQUE);
		createEAttribute(interventionEClass, INTERVENTION__NUMERO_INTERVENTION);
		createEReference(interventionEClass, INTERVENTION__POSITION);
		createEReference(interventionEClass, INTERVENTION__REQUERANT);
		createEAttribute(interventionEClass, INTERVENTION__PRECISION);
		createEReference(interventionEClass, INTERVENTION__DETACHEMENTS);
		createEReference(interventionEClass, INTERVENTION__VICTIMES);
		createEReference(interventionEClass, INTERVENTION__INFO_TACTICS);

		detachementEClass = createEClass(DETACHEMENT);
		createEReference(detachementEClass, DETACHEMENT__AFFECTATION);
		createEReference(detachementEClass, DETACHEMENT__CHEF);

		moyenEClass = createEClass(MOYEN);
		createEReference(moyenEClass, MOYEN__TYPE);
		createEReference(moyenEClass, MOYEN__PERSONNELS);
		createEAttribute(moyenEClass, MOYEN__PRECISION);
		createEAttribute(moyenEClass, MOYEN__NUMERO);
		createEReference(moyenEClass, MOYEN__POS_REF);
		createEReference(moyenEClass, MOYEN__POS_TARGET);

		interventionTypeEClass = createEClass(INTERVENTION_TYPE);
		createEAttribute(interventionTypeEClass, INTERVENTION_TYPE__CODE);

		historiqueEClass = createEClass(HISTORIQUE);
		createEReference(historiqueEClass, HISTORIQUE__ENTREES);

		entreeEClass = createEClass(ENTREE);
		createEAttribute(entreeEClass, ENTREE__HORODATAGE);
		createEReference(entreeEClass, ENTREE__TYPE);

		typeEntreeEClass = createEClass(TYPE_ENTREE);

		positionEClass = createEClass(POSITION);

		gpsPointEClass = createEClass(GPS_POINT);
		createEAttribute(gpsPointEClass, GPS_POINT__LAT);
		createEAttribute(gpsPointEClass, GPS_POINT__LONG);
		createEAttribute(gpsPointEClass, GPS_POINT__SATELLITES_USED);
		createEAttribute(gpsPointEClass, GPS_POINT__MODE);
		createEAttribute(gpsPointEClass, GPS_POINT__ALTITUDE);

		positionCivilEClass = createEClass(POSITION_CIVIL);
		createEAttribute(positionCivilEClass, POSITION_CIVIL__NOM_RUE);
		createEAttribute(positionCivilEClass, POSITION_CIVIL__CP);
		createEAttribute(positionCivilEClass, POSITION_CIVIL__NUMERO_RUE);
		createEAttribute(positionCivilEClass, POSITION_CIVIL__PAYS);

		personneEClass = createEClass(PERSONNE);
		createEAttribute(personneEClass, PERSONNE__NOM);
		createEAttribute(personneEClass, PERSONNE__PRENOM);

		agentEClass = createEClass(AGENT);
		createEAttribute(agentEClass, AGENT__MATRICULE);

		moyenTypeEClass = createEClass(MOYEN_TYPE);
		createEAttribute(moyenTypeEClass, MOYEN_TYPE__CODE);

		affectationEClass = createEClass(AFFECTATION);
		createEReference(affectationEClass, AFFECTATION__MOYEN);
		createEAttribute(affectationEClass, AFFECTATION__HORODATAGE_DEMANDE);
		createEAttribute(affectationEClass, AFFECTATION__HORODATAGE_ENGAGEMENT);
		createEAttribute(affectationEClass, AFFECTATION__HORODATAGE_DESENGAGEMENT);

		sitacModelEClass = createEClass(SITAC_MODEL);
		createEReference(sitacModelEClass, SITAC_MODEL__INTERVENTION_TYPES);
		createEReference(sitacModelEClass, SITAC_MODEL__TYPE_ENTREES);
		createEReference(sitacModelEClass, SITAC_MODEL__INTERVENTIONS);
		createEReference(sitacModelEClass, SITAC_MODEL__PERSONNES);
		createEReference(sitacModelEClass, SITAC_MODEL__TYPE_ACTIONS);

		infoTacticEClass = createEClass(INFO_TACTIC);
		createEReference(infoTacticEClass, INFO_TACTIC__CATEGORIE);

		infoPosEClass = createEClass(INFO_POS);
		createEReference(infoPosEClass, INFO_POS__POSITIONS);

		priseEauEClass = createEClass(PRISE_EAU);
		createEAttribute(priseEauEClass, PRISE_EAU__PERENNE);

		sourceDangerEClass = createEClass(SOURCE_DANGER);

		categorieEClass = createEClass(CATEGORIE);

		cibleEClass = createEClass(CIBLE);

		sinistreEClass = createEClass(SINISTRE);

		infoLignePosEClass = createEClass(INFO_LIGNE_POS);
		createEReference(infoLignePosEClass, INFO_LIGNE_POS__POSITIONS);

		infoZoneEClass = createEClass(INFO_ZONE);
		createEAttribute(infoZoneEClass, INFO_ZONE__NOM);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__TYPE);
		createEAttribute(actionEClass, ACTION__NORIA);
		createEAttribute(actionEClass, ACTION__EN_LIGNE);

		infoHorodateEClass = createEClass(INFO_HORODATE);
		createEAttribute(infoHorodateEClass, INFO_HORODATE__HORODATAGE_DEBUT);
		createEAttribute(infoHorodateEClass, INFO_HORODATE__HORODATAGE_FIN);

		actionTypeEClass = createEClass(ACTION_TYPE);
		createEAttribute(actionTypeEClass, ACTION_TYPE__CODE);

		infoNiveauEClass = createEClass(INFO_NIVEAU);
		createEAttribute(infoNiveauEClass, INFO_NIVEAU__POSITION_Z);

		secteurGeoEClass = createEClass(SECTEUR_GEO);

		secteurFontionelEClass = createEClass(SECTEUR_FONTIONEL);

		infoResponsableEClass = createEClass(INFO_RESPONSABLE);
		createEReference(infoResponsableEClass, INFO_RESPONSABLE__CHEF);
		createEAttribute(infoResponsableEClass, INFO_RESPONSABLE__NIVEAU);

		donneeContextuelEClass = createEClass(DONNEE_CONTEXTUEL);
		createEAttribute(donneeContextuelEClass, DONNEE_CONTEXTUEL__ORIENTATION);
		createEAttribute(donneeContextuelEClass, DONNEE_CONTEXTUEL__PRECISION);

		messageAmbianceEClass = createEClass(MESSAGE_AMBIANCE);
		createEAttribute(messageAmbianceEClass, MESSAGE_AMBIANCE__JE_SUIS);
		createEAttribute(messageAmbianceEClass, MESSAGE_AMBIANCE__JE_VOIS);
		createEAttribute(messageAmbianceEClass, MESSAGE_AMBIANCE__ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moyenEClass.getESuperTypes().add(this.getDetachement());
		gpsPointEClass.getESuperTypes().add(this.getPosition());
		positionCivilEClass.getESuperTypes().add(this.getPosition());
		agentEClass.getESuperTypes().add(this.getPersonne());
		infoPosEClass.getESuperTypes().add(this.getInfoTactic());
		priseEauEClass.getESuperTypes().add(this.getInfoPos());
		sourceDangerEClass.getESuperTypes().add(this.getInfoPos());
		cibleEClass.getESuperTypes().add(this.getInfoPos());
		sinistreEClass.getESuperTypes().add(this.getInfoZone());
		infoLignePosEClass.getESuperTypes().add(this.getInfoTactic());
		infoZoneEClass.getESuperTypes().add(this.getInfoLignePos());
		actionEClass.getESuperTypes().add(this.getInfoLignePos());
		actionEClass.getESuperTypes().add(this.getInfoHorodate());
		actionEClass.getESuperTypes().add(this.getInfoNiveau());
		secteurGeoEClass.getESuperTypes().add(this.getInfoZone());
		secteurGeoEClass.getESuperTypes().add(this.getInfoResponsable());
		secteurFontionelEClass.getESuperTypes().add(this.getInfoPos());
		secteurFontionelEClass.getESuperTypes().add(this.getInfoResponsable());
		donneeContextuelEClass.getESuperTypes().add(this.getInfoPos());

		// Initialize classes and features; add operations and parameters
		initEClass(interventionEClass, Intervention.class, "Intervention", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntervention_Type(), this.getInterventionType(), null, "type", null, 1, 1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntervention_Historique(), this.getHistorique(), null, "historique", null, 0, 1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervention_NumeroIntervention(), ecorePackage.getEString(), "numeroIntervention", null, 0, 1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntervention_Position(), this.getPosition(), null, "position", null, 0, 1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntervention_Requerant(), this.getPersonne(), null, "requerant", null, 0, 1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervention_Precision(), ecorePackage.getEString(), "precision", null, 0, 1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntervention_Detachements(), this.getDetachement(), null, "detachements", null, 0, -1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntervention_Victimes(), this.getPersonne(), null, "victimes", null, 0, -1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntervention_InfoTactics(), this.getInfoTactic(), null, "infoTactics", null, 0, -1, Intervention.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detachementEClass, Detachement.class, "Detachement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetachement_Affectation(), this.getAffectation(), null, "affectation", null, 0, -1, Detachement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDetachement_Chef(), this.getAgent(), null, "chef", null, 0, 1, Detachement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moyenEClass, Moyen.class, "Moyen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoyen_Type(), this.getMoyenType(), null, "type", null, 0, 1, Moyen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoyen_Personnels(), this.getAgent(), null, "personnels", null, 0, -1, Moyen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoyen_Precision(), ecorePackage.getEString(), "precision", null, 0, 1, Moyen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoyen_Numero(), ecorePackage.getEString(), "numero", null, 0, 1, Moyen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoyen_PosRef(), this.getPosition(), null, "posRef", null, 0, 1, Moyen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoyen_PosTarget(), this.getPosition(), null, "posTarget", null, 0, 1, Moyen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interventionTypeEClass, InterventionType.class, "InterventionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterventionType_Code(), ecorePackage.getEString(), "code", null, 0, 1, InterventionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historiqueEClass, Historique.class, "Historique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistorique_Entrees(), this.getEntree(), null, "entrees", null, 0, -1, Historique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntree_Horodatage(), ecorePackage.getEString(), "horodatage", null, 0, 1, Entree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntree_Type(), this.getTypeEntree(), null, "type", null, 1, 1, Entree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEntreeEClass, TypeEntree.class, "TypeEntree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gpsPointEClass, GpsPoint.class, "GpsPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGpsPoint_Lat(), ecorePackage.getEInt(), "lat", null, 0, 1, GpsPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpsPoint_Long(), ecorePackage.getEInt(), "long", null, 0, 1, GpsPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpsPoint_Satellites_used(), ecorePackage.getEInt(), "satellites_used", null, 0, 1, GpsPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpsPoint_Mode(), ecorePackage.getEInt(), "mode", null, 0, 1, GpsPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpsPoint_Altitude(), ecorePackage.getEInt(), "altitude", null, 0, 1, GpsPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionCivilEClass, PositionCivil.class, "PositionCivil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionCivil_NomRue(), ecorePackage.getEString(), "nomRue", null, 0, 1, PositionCivil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionCivil_Cp(), ecorePackage.getEString(), "cp", null, 0, 1, PositionCivil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionCivil_NumeroRue(), ecorePackage.getEString(), "numeroRue", null, 0, 1, PositionCivil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionCivil_Pays(), ecorePackage.getEString(), "pays", "", 0, 1, PositionCivil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personneEClass, Personne.class, "Personne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonne_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgent_Matricule(), ecorePackage.getEString(), "matricule", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moyenTypeEClass, MoyenType.class, "MoyenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoyenType_Code(), ecorePackage.getEInt(), "code", null, 0, 1, MoyenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affectationEClass, Affectation.class, "Affectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffectation_Moyen(), this.getMoyen(), null, "moyen", null, 0, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectation_HorodatageDemande(), ecorePackage.getEDate(), "horodatageDemande", null, 0, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectation_HorodatageEngagement(), ecorePackage.getEDate(), "horodatageEngagement", null, 0, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectation_HorodatageDesengagement(), ecorePackage.getEDate(), "horodatageDesengagement", null, 0, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sitacModelEClass, SitacModel.class, "SitacModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSitacModel_InterventionTypes(), this.getInterventionType(), null, "interventionTypes", null, 0, -1, SitacModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSitacModel_TypeEntrees(), this.getTypeEntree(), null, "typeEntrees", null, 0, -1, SitacModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSitacModel_Interventions(), this.getIntervention(), null, "interventions", null, 0, -1, SitacModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSitacModel_Personnes(), this.getPersonne(), null, "personnes", null, 0, -1, SitacModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSitacModel_TypeActions(), this.getActionType(), null, "typeActions", null, 0, -1, SitacModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoTacticEClass, InfoTactic.class, "InfoTactic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfoTactic_Categorie(), this.getCategorie(), null, "categorie", null, 0, 1, InfoTactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoPosEClass, InfoPos.class, "InfoPos", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfoPos_Positions(), this.getPosition(), null, "positions", null, 1, 1, InfoPos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priseEauEClass, PriseEau.class, "PriseEau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriseEau_Perenne(), ecorePackage.getEBoolean(), "perenne", null, 0, 1, PriseEau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceDangerEClass, SourceDanger.class, "SourceDanger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categorieEClass, Categorie.class, "Categorie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cibleEClass, Cible.class, "Cible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinistreEClass, Sinistre.class, "Sinistre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infoLignePosEClass, InfoLignePos.class, "InfoLignePos", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfoLignePos_Positions(), this.getPosition(), null, "positions", null, 0, -1, InfoLignePos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoZoneEClass, InfoZone.class, "InfoZone", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfoZone_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, InfoZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Type(), this.getActionType(), null, "type", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Noria(), ecorePackage.getEBoolean(), "noria", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_EnLigne(), ecorePackage.getEBoolean(), "enLigne", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoHorodateEClass, InfoHorodate.class, "InfoHorodate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfoHorodate_HorodatageDebut(), ecorePackage.getEDate(), "horodatageDebut", null, 0, 1, InfoHorodate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoHorodate_HorodatageFin(), ecorePackage.getEDate(), "horodatageFin", null, 0, 1, InfoHorodate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionType_Code(), ecorePackage.getEString(), "code", null, 0, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoNiveauEClass, InfoNiveau.class, "InfoNiveau", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfoNiveau_PositionZ(), ecorePackage.getEString(), "positionZ", null, 0, 1, InfoNiveau.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secteurGeoEClass, SecteurGeo.class, "SecteurGeo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(secteurFontionelEClass, SecteurFontionel.class, "SecteurFontionel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(infoResponsableEClass, InfoResponsable.class, "InfoResponsable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfoResponsable_Chef(), this.getMoyen(), null, "chef", null, 1, 1, InfoResponsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoResponsable_Niveau(), ecorePackage.getEString(), "niveau", null, 0, 1, InfoResponsable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donneeContextuelEClass, DonneeContextuel.class, "DonneeContextuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonneeContextuel_Orientation(), ecorePackage.getEInt(), "orientation", null, 0, 1, DonneeContextuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDonneeContextuel_Precision(), ecorePackage.getEString(), "precision", null, 0, 1, DonneeContextuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageAmbianceEClass, MessageAmbiance.class, "MessageAmbiance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageAmbiance_JeSuis(), ecorePackage.getEString(), "jeSuis", null, 0, 1, MessageAmbiance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageAmbiance_JeVois(), ecorePackage.getEString(), "jeVois", null, 0, 1, MessageAmbiance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageAmbiance_Id(), ecorePackage.getEString(), "id", null, 0, 1, MessageAmbiance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SitacPackageImpl
