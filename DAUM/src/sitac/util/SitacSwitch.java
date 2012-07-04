/**
 */
package sitac.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sitac.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sitac.SitacPackage
 * @generated
 */
public class SitacSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SitacPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitacSwitch() {
		if (modelPackage == null) {
			modelPackage = SitacPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SitacPackage.INTERVENTION: {
				Intervention intervention = (Intervention)theEObject;
				T result = caseIntervention(intervention);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.DETACHEMENT: {
				Detachement detachement = (Detachement)theEObject;
				T result = caseDetachement(detachement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.MOYEN: {
				Moyen moyen = (Moyen)theEObject;
				T result = caseMoyen(moyen);
				if (result == null) result = caseDetachement(moyen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.INTERVENTION_TYPE: {
				InterventionType interventionType = (InterventionType)theEObject;
				T result = caseInterventionType(interventionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.HISTORIQUE: {
				Historique historique = (Historique)theEObject;
				T result = caseHistorique(historique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.ENTREE: {
				Entree entree = (Entree)theEObject;
				T result = caseEntree(entree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.TYPE_ENTREE: {
				TypeEntree typeEntree = (TypeEntree)theEObject;
				T result = caseTypeEntree(typeEntree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.GPS_POINT: {
				GpsPoint gpsPoint = (GpsPoint)theEObject;
				T result = caseGpsPoint(gpsPoint);
				if (result == null) result = casePosition(gpsPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.POSITION_CIVIL: {
				PositionCivil positionCivil = (PositionCivil)theEObject;
				T result = casePositionCivil(positionCivil);
				if (result == null) result = casePosition(positionCivil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.PERSONNE: {
				Personne personne = (Personne)theEObject;
				T result = casePersonne(personne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = casePersonne(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.MOYEN_TYPE: {
				MoyenType moyenType = (MoyenType)theEObject;
				T result = caseMoyenType(moyenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.AFFECTATION: {
				Affectation affectation = (Affectation)theEObject;
				T result = caseAffectation(affectation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.SITAC_MODEL: {
				SitacModel sitacModel = (SitacModel)theEObject;
				T result = caseSitacModel(sitacModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.INFO_TACTIC: {
				InfoTactic infoTactic = (InfoTactic)theEObject;
				T result = caseInfoTactic(infoTactic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.INFO_POS: {
				InfoPos infoPos = (InfoPos)theEObject;
				T result = caseInfoPos(infoPos);
				if (result == null) result = caseInfoTactic(infoPos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.PRISE_EAU: {
				PriseEau priseEau = (PriseEau)theEObject;
				T result = casePriseEau(priseEau);
				if (result == null) result = caseInfoPos(priseEau);
				if (result == null) result = caseInfoTactic(priseEau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.SOURCE_DANGER: {
				SourceDanger sourceDanger = (SourceDanger)theEObject;
				T result = caseSourceDanger(sourceDanger);
				if (result == null) result = caseInfoPos(sourceDanger);
				if (result == null) result = caseInfoTactic(sourceDanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.CATEGORIE: {
				Categorie categorie = (Categorie)theEObject;
				T result = caseCategorie(categorie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.CIBLE: {
				Cible cible = (Cible)theEObject;
				T result = caseCible(cible);
				if (result == null) result = caseInfoPos(cible);
				if (result == null) result = caseInfoTactic(cible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.SINISTRE: {
				Sinistre sinistre = (Sinistre)theEObject;
				T result = caseSinistre(sinistre);
				if (result == null) result = caseInfoZone(sinistre);
				if (result == null) result = caseInfoLignePos(sinistre);
				if (result == null) result = caseInfoTactic(sinistre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.INFO_LIGNE_POS: {
				InfoLignePos infoLignePos = (InfoLignePos)theEObject;
				T result = caseInfoLignePos(infoLignePos);
				if (result == null) result = caseInfoTactic(infoLignePos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.INFO_ZONE: {
				InfoZone infoZone = (InfoZone)theEObject;
				T result = caseInfoZone(infoZone);
				if (result == null) result = caseInfoLignePos(infoZone);
				if (result == null) result = caseInfoTactic(infoZone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseInfoLignePos(action);
				if (result == null) result = caseInfoHorodate(action);
				if (result == null) result = caseInfoNiveau(action);
				if (result == null) result = caseInfoTactic(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.INFO_HORODATE: {
				InfoHorodate infoHorodate = (InfoHorodate)theEObject;
				T result = caseInfoHorodate(infoHorodate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				T result = caseActionType(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.INFO_NIVEAU: {
				InfoNiveau infoNiveau = (InfoNiveau)theEObject;
				T result = caseInfoNiveau(infoNiveau);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.SECTEUR_GEO: {
				SecteurGeo secteurGeo = (SecteurGeo)theEObject;
				T result = caseSecteurGeo(secteurGeo);
				if (result == null) result = caseInfoZone(secteurGeo);
				if (result == null) result = caseInfoResponsable(secteurGeo);
				if (result == null) result = caseInfoLignePos(secteurGeo);
				if (result == null) result = caseInfoTactic(secteurGeo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.SECTEUR_FONTIONEL: {
				SecteurFontionel secteurFontionel = (SecteurFontionel)theEObject;
				T result = caseSecteurFontionel(secteurFontionel);
				if (result == null) result = caseInfoPos(secteurFontionel);
				if (result == null) result = caseInfoResponsable(secteurFontionel);
				if (result == null) result = caseInfoTactic(secteurFontionel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.INFO_RESPONSABLE: {
				InfoResponsable infoResponsable = (InfoResponsable)theEObject;
				T result = caseInfoResponsable(infoResponsable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.DONNEE_CONTEXTUEL: {
				DonneeContextuel donneeContextuel = (DonneeContextuel)theEObject;
				T result = caseDonneeContextuel(donneeContextuel);
				if (result == null) result = caseInfoPos(donneeContextuel);
				if (result == null) result = caseInfoTactic(donneeContextuel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SitacPackage.MESSAGE_AMBIANCE: {
				MessageAmbiance messageAmbiance = (MessageAmbiance)theEObject;
				T result = caseMessageAmbiance(messageAmbiance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervention(Intervention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detachement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detachement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetachement(Detachement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moyen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moyen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoyen(Moyen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervention Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervention Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterventionType(InterventionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistorique(Historique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntree(Entree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeEntree(TypeEntree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsPoint(GpsPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Civil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Civil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionCivil(PositionCivil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personne</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonne(Personne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moyen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moyen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoyenType(MoyenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectation(Affectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSitacModel(SitacModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Tactic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Tactic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoTactic(InfoTactic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoPos(InfoPos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prise Eau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prise Eau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriseEau(PriseEau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Danger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Danger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceDanger(SourceDanger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorie(Categorie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCible(Cible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sinistre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sinistre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinistre(Sinistre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Ligne Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Ligne Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoLignePos(InfoLignePos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoZone(InfoZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Horodate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Horodate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoHorodate(InfoHorodate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionType(ActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Niveau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoNiveau(InfoNiveau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secteur Geo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secteur Geo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecteurGeo(SecteurGeo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secteur Fontionel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secteur Fontionel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecteurFontionel(SecteurFontionel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Responsable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Responsable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoResponsable(InfoResponsable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donnee Contextuel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donnee Contextuel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonneeContextuel(DonneeContextuel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Ambiance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Ambiance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageAmbiance(MessageAmbiance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SitacSwitch
