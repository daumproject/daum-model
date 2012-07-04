/**
 */
package sitac.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sitac.ActionType;
import sitac.Intervention;
import sitac.InterventionType;
import sitac.Personne;
import sitac.SitacModel;
import sitac.SitacPackage;
import sitac.TypeEntree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.SitacModelImpl#getInterventionTypes <em>Intervention Types</em>}</li>
 *   <li>{@link sitac.impl.SitacModelImpl#getTypeEntrees <em>Type Entrees</em>}</li>
 *   <li>{@link sitac.impl.SitacModelImpl#getInterventions <em>Interventions</em>}</li>
 *   <li>{@link sitac.impl.SitacModelImpl#getPersonnes <em>Personnes</em>}</li>
 *   <li>{@link sitac.impl.SitacModelImpl#getTypeActions <em>Type Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SitacModelImpl extends EObjectImpl implements SitacModel {
	/**
	 * The cached value of the '{@link #getInterventionTypes() <em>Intervention Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<InterventionType> interventionTypes;

	/**
	 * The cached value of the '{@link #getTypeEntrees() <em>Type Entrees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEntrees()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEntree> typeEntrees;

	/**
	 * The cached value of the '{@link #getInterventions() <em>Interventions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventions()
	 * @generated
	 * @ordered
	 */
	protected EList<Intervention> interventions;

	/**
	 * The cached value of the '{@link #getPersonnes() <em>Personnes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnes()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> personnes;

	/**
	 * The cached value of the '{@link #getTypeActions() <em>Type Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionType> typeActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SitacModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.SITAC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterventionType> getInterventionTypes() {
		if (interventionTypes == null) {
			interventionTypes = new EObjectContainmentEList<InterventionType>(InterventionType.class, this, SitacPackage.SITAC_MODEL__INTERVENTION_TYPES);
		}
		return interventionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEntree> getTypeEntrees() {
		if (typeEntrees == null) {
			typeEntrees = new EObjectContainmentEList<TypeEntree>(TypeEntree.class, this, SitacPackage.SITAC_MODEL__TYPE_ENTREES);
		}
		return typeEntrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervention> getInterventions() {
		if (interventions == null) {
			interventions = new EObjectContainmentEList<Intervention>(Intervention.class, this, SitacPackage.SITAC_MODEL__INTERVENTIONS);
		}
		return interventions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getPersonnes() {
		if (personnes == null) {
			personnes = new EObjectContainmentEList<Personne>(Personne.class, this, SitacPackage.SITAC_MODEL__PERSONNES);
		}
		return personnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType> getTypeActions() {
		if (typeActions == null) {
			typeActions = new EObjectContainmentEList<ActionType>(ActionType.class, this, SitacPackage.SITAC_MODEL__TYPE_ACTIONS);
		}
		return typeActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SitacPackage.SITAC_MODEL__INTERVENTION_TYPES:
				return ((InternalEList<?>)getInterventionTypes()).basicRemove(otherEnd, msgs);
			case SitacPackage.SITAC_MODEL__TYPE_ENTREES:
				return ((InternalEList<?>)getTypeEntrees()).basicRemove(otherEnd, msgs);
			case SitacPackage.SITAC_MODEL__INTERVENTIONS:
				return ((InternalEList<?>)getInterventions()).basicRemove(otherEnd, msgs);
			case SitacPackage.SITAC_MODEL__PERSONNES:
				return ((InternalEList<?>)getPersonnes()).basicRemove(otherEnd, msgs);
			case SitacPackage.SITAC_MODEL__TYPE_ACTIONS:
				return ((InternalEList<?>)getTypeActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.SITAC_MODEL__INTERVENTION_TYPES:
				return getInterventionTypes();
			case SitacPackage.SITAC_MODEL__TYPE_ENTREES:
				return getTypeEntrees();
			case SitacPackage.SITAC_MODEL__INTERVENTIONS:
				return getInterventions();
			case SitacPackage.SITAC_MODEL__PERSONNES:
				return getPersonnes();
			case SitacPackage.SITAC_MODEL__TYPE_ACTIONS:
				return getTypeActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SitacPackage.SITAC_MODEL__INTERVENTION_TYPES:
				getInterventionTypes().clear();
				getInterventionTypes().addAll((Collection<? extends InterventionType>)newValue);
				return;
			case SitacPackage.SITAC_MODEL__TYPE_ENTREES:
				getTypeEntrees().clear();
				getTypeEntrees().addAll((Collection<? extends TypeEntree>)newValue);
				return;
			case SitacPackage.SITAC_MODEL__INTERVENTIONS:
				getInterventions().clear();
				getInterventions().addAll((Collection<? extends Intervention>)newValue);
				return;
			case SitacPackage.SITAC_MODEL__PERSONNES:
				getPersonnes().clear();
				getPersonnes().addAll((Collection<? extends Personne>)newValue);
				return;
			case SitacPackage.SITAC_MODEL__TYPE_ACTIONS:
				getTypeActions().clear();
				getTypeActions().addAll((Collection<? extends ActionType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SitacPackage.SITAC_MODEL__INTERVENTION_TYPES:
				getInterventionTypes().clear();
				return;
			case SitacPackage.SITAC_MODEL__TYPE_ENTREES:
				getTypeEntrees().clear();
				return;
			case SitacPackage.SITAC_MODEL__INTERVENTIONS:
				getInterventions().clear();
				return;
			case SitacPackage.SITAC_MODEL__PERSONNES:
				getPersonnes().clear();
				return;
			case SitacPackage.SITAC_MODEL__TYPE_ACTIONS:
				getTypeActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SitacPackage.SITAC_MODEL__INTERVENTION_TYPES:
				return interventionTypes != null && !interventionTypes.isEmpty();
			case SitacPackage.SITAC_MODEL__TYPE_ENTREES:
				return typeEntrees != null && !typeEntrees.isEmpty();
			case SitacPackage.SITAC_MODEL__INTERVENTIONS:
				return interventions != null && !interventions.isEmpty();
			case SitacPackage.SITAC_MODEL__PERSONNES:
				return personnes != null && !personnes.isEmpty();
			case SitacPackage.SITAC_MODEL__TYPE_ACTIONS:
				return typeActions != null && !typeActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SitacModelImpl
