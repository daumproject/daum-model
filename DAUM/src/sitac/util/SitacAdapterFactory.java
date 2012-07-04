/**
 */
package sitac.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sitac.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sitac.SitacPackage
 * @generated
 */
public class SitacAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SitacPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SitacPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SitacSwitch<Adapter> modelSwitch =
		new SitacSwitch<Adapter>() {
			@Override
			public Adapter caseIntervention(Intervention object) {
				return createInterventionAdapter();
			}
			@Override
			public Adapter caseDetachement(Detachement object) {
				return createDetachementAdapter();
			}
			@Override
			public Adapter caseMoyen(Moyen object) {
				return createMoyenAdapter();
			}
			@Override
			public Adapter caseInterventionType(InterventionType object) {
				return createInterventionTypeAdapter();
			}
			@Override
			public Adapter caseHistorique(Historique object) {
				return createHistoriqueAdapter();
			}
			@Override
			public Adapter caseEntree(Entree object) {
				return createEntreeAdapter();
			}
			@Override
			public Adapter caseTypeEntree(TypeEntree object) {
				return createTypeEntreeAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseGpsPoint(GpsPoint object) {
				return createGpsPointAdapter();
			}
			@Override
			public Adapter casePositionCivil(PositionCivil object) {
				return createPositionCivilAdapter();
			}
			@Override
			public Adapter casePersonne(Personne object) {
				return createPersonneAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseMoyenType(MoyenType object) {
				return createMoyenTypeAdapter();
			}
			@Override
			public Adapter caseAffectation(Affectation object) {
				return createAffectationAdapter();
			}
			@Override
			public Adapter caseSitacModel(SitacModel object) {
				return createSitacModelAdapter();
			}
			@Override
			public Adapter caseInfoTactic(InfoTactic object) {
				return createInfoTacticAdapter();
			}
			@Override
			public Adapter caseInfoPos(InfoPos object) {
				return createInfoPosAdapter();
			}
			@Override
			public Adapter casePriseEau(PriseEau object) {
				return createPriseEauAdapter();
			}
			@Override
			public Adapter caseSourceDanger(SourceDanger object) {
				return createSourceDangerAdapter();
			}
			@Override
			public Adapter caseCategorie(Categorie object) {
				return createCategorieAdapter();
			}
			@Override
			public Adapter caseCible(Cible object) {
				return createCibleAdapter();
			}
			@Override
			public Adapter caseSinistre(Sinistre object) {
				return createSinistreAdapter();
			}
			@Override
			public Adapter caseInfoLignePos(InfoLignePos object) {
				return createInfoLignePosAdapter();
			}
			@Override
			public Adapter caseInfoZone(InfoZone object) {
				return createInfoZoneAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseInfoHorodate(InfoHorodate object) {
				return createInfoHorodateAdapter();
			}
			@Override
			public Adapter caseActionType(ActionType object) {
				return createActionTypeAdapter();
			}
			@Override
			public Adapter caseInfoNiveau(InfoNiveau object) {
				return createInfoNiveauAdapter();
			}
			@Override
			public Adapter caseSecteurGeo(SecteurGeo object) {
				return createSecteurGeoAdapter();
			}
			@Override
			public Adapter caseSecteurFontionel(SecteurFontionel object) {
				return createSecteurFontionelAdapter();
			}
			@Override
			public Adapter caseInfoResponsable(InfoResponsable object) {
				return createInfoResponsableAdapter();
			}
			@Override
			public Adapter caseDonneeContextuel(DonneeContextuel object) {
				return createDonneeContextuelAdapter();
			}
			@Override
			public Adapter caseMessageAmbiance(MessageAmbiance object) {
				return createMessageAmbianceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sitac.Intervention <em>Intervention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Intervention
	 * @generated
	 */
	public Adapter createInterventionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Detachement <em>Detachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Detachement
	 * @generated
	 */
	public Adapter createDetachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Moyen <em>Moyen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Moyen
	 * @generated
	 */
	public Adapter createMoyenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.InterventionType <em>Intervention Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.InterventionType
	 * @generated
	 */
	public Adapter createInterventionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Historique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Historique
	 * @generated
	 */
	public Adapter createHistoriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Entree
	 * @generated
	 */
	public Adapter createEntreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.TypeEntree <em>Type Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.TypeEntree
	 * @generated
	 */
	public Adapter createTypeEntreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.GpsPoint <em>Gps Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.GpsPoint
	 * @generated
	 */
	public Adapter createGpsPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.PositionCivil <em>Position Civil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.PositionCivil
	 * @generated
	 */
	public Adapter createPositionCivilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.MoyenType <em>Moyen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.MoyenType
	 * @generated
	 */
	public Adapter createMoyenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Affectation
	 * @generated
	 */
	public Adapter createAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.SitacModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.SitacModel
	 * @generated
	 */
	public Adapter createSitacModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.InfoTactic <em>Info Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.InfoTactic
	 * @generated
	 */
	public Adapter createInfoTacticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.InfoPos <em>Info Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.InfoPos
	 * @generated
	 */
	public Adapter createInfoPosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.PriseEau <em>Prise Eau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.PriseEau
	 * @generated
	 */
	public Adapter createPriseEauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.SourceDanger <em>Source Danger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.SourceDanger
	 * @generated
	 */
	public Adapter createSourceDangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Categorie
	 * @generated
	 */
	public Adapter createCategorieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Cible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Cible
	 * @generated
	 */
	public Adapter createCibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Sinistre <em>Sinistre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Sinistre
	 * @generated
	 */
	public Adapter createSinistreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.InfoLignePos <em>Info Ligne Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.InfoLignePos
	 * @generated
	 */
	public Adapter createInfoLignePosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.InfoZone <em>Info Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.InfoZone
	 * @generated
	 */
	public Adapter createInfoZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.InfoHorodate <em>Info Horodate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.InfoHorodate
	 * @generated
	 */
	public Adapter createInfoHorodateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.ActionType
	 * @generated
	 */
	public Adapter createActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.InfoNiveau <em>Info Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.InfoNiveau
	 * @generated
	 */
	public Adapter createInfoNiveauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.SecteurGeo <em>Secteur Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.SecteurGeo
	 * @generated
	 */
	public Adapter createSecteurGeoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.SecteurFontionel <em>Secteur Fontionel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.SecteurFontionel
	 * @generated
	 */
	public Adapter createSecteurFontionelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.InfoResponsable <em>Info Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.InfoResponsable
	 * @generated
	 */
	public Adapter createInfoResponsableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.DonneeContextuel <em>Donnee Contextuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.DonneeContextuel
	 * @generated
	 */
	public Adapter createDonneeContextuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sitac.MessageAmbiance <em>Message Ambiance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sitac.MessageAmbiance
	 * @generated
	 */
	public Adapter createMessageAmbianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SitacAdapterFactory
