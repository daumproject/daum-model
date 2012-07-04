/**
 */
package sitac.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sitac.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SitacFactoryImpl extends EFactoryImpl implements SitacFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SitacFactory init() {
		try {
			SitacFactory theSitacFactory = (SitacFactory)EPackage.Registry.INSTANCE.getEFactory("http://sitac/1.0"); 
			if (theSitacFactory != null) {
				return theSitacFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SitacFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SitacPackage.INTERVENTION: return createIntervention();
			case SitacPackage.DETACHEMENT: return createDetachement();
			case SitacPackage.MOYEN: return createMoyen();
			case SitacPackage.INTERVENTION_TYPE: return createInterventionType();
			case SitacPackage.HISTORIQUE: return createHistorique();
			case SitacPackage.ENTREE: return createEntree();
			case SitacPackage.TYPE_ENTREE: return createTypeEntree();
			case SitacPackage.POSITION: return createPosition();
			case SitacPackage.GPS_POINT: return createGpsPoint();
			case SitacPackage.POSITION_CIVIL: return createPositionCivil();
			case SitacPackage.PERSONNE: return createPersonne();
			case SitacPackage.AGENT: return createAgent();
			case SitacPackage.MOYEN_TYPE: return createMoyenType();
			case SitacPackage.AFFECTATION: return createAffectation();
			case SitacPackage.SITAC_MODEL: return createSitacModel();
			case SitacPackage.PRISE_EAU: return createPriseEau();
			case SitacPackage.SOURCE_DANGER: return createSourceDanger();
			case SitacPackage.CATEGORIE: return createCategorie();
			case SitacPackage.CIBLE: return createCible();
			case SitacPackage.SINISTRE: return createSinistre();
			case SitacPackage.ACTION: return createAction();
			case SitacPackage.ACTION_TYPE: return createActionType();
			case SitacPackage.SECTEUR_GEO: return createSecteurGeo();
			case SitacPackage.SECTEUR_FONTIONEL: return createSecteurFontionel();
			case SitacPackage.DONNEE_CONTEXTUEL: return createDonneeContextuel();
			case SitacPackage.MESSAGE_AMBIANCE: return createMessageAmbiance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intervention createIntervention() {
		InterventionImpl intervention = new InterventionImpl();
		return intervention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detachement createDetachement() {
		DetachementImpl detachement = new DetachementImpl();
		return detachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moyen createMoyen() {
		MoyenImpl moyen = new MoyenImpl();
		return moyen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionType createInterventionType() {
		InterventionTypeImpl interventionType = new InterventionTypeImpl();
		return interventionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historique createHistorique() {
		HistoriqueImpl historique = new HistoriqueImpl();
		return historique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entree createEntree() {
		EntreeImpl entree = new EntreeImpl();
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEntree createTypeEntree() {
		TypeEntreeImpl typeEntree = new TypeEntreeImpl();
		return typeEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsPoint createGpsPoint() {
		GpsPointImpl gpsPoint = new GpsPointImpl();
		return gpsPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionCivil createPositionCivil() {
		PositionCivilImpl positionCivil = new PositionCivilImpl();
		return positionCivil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne createPersonne() {
		PersonneImpl personne = new PersonneImpl();
		return personne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoyenType createMoyenType() {
		MoyenTypeImpl moyenType = new MoyenTypeImpl();
		return moyenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affectation createAffectation() {
		AffectationImpl affectation = new AffectationImpl();
		return affectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacModel createSitacModel() {
		SitacModelImpl sitacModel = new SitacModelImpl();
		return sitacModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriseEau createPriseEau() {
		PriseEauImpl priseEau = new PriseEauImpl();
		return priseEau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceDanger createSourceDanger() {
		SourceDangerImpl sourceDanger = new SourceDangerImpl();
		return sourceDanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie createCategorie() {
		CategorieImpl categorie = new CategorieImpl();
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cible createCible() {
		CibleImpl cible = new CibleImpl();
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sinistre createSinistre() {
		SinistreImpl sinistre = new SinistreImpl();
		return sinistre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecteurGeo createSecteurGeo() {
		SecteurGeoImpl secteurGeo = new SecteurGeoImpl();
		return secteurGeo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecteurFontionel createSecteurFontionel() {
		SecteurFontionelImpl secteurFontionel = new SecteurFontionelImpl();
		return secteurFontionel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonneeContextuel createDonneeContextuel() {
		DonneeContextuelImpl donneeContextuel = new DonneeContextuelImpl();
		return donneeContextuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageAmbiance createMessageAmbiance() {
		MessageAmbianceImpl messageAmbiance = new MessageAmbianceImpl();
		return messageAmbiance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacPackage getSitacPackage() {
		return (SitacPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SitacPackage getPackage() {
		return SitacPackage.eINSTANCE;
	}

} //SitacFactoryImpl
