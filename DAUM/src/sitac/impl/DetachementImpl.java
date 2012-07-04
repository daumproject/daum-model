/**
 */
package sitac.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sitac.Affectation;
import sitac.Agent;
import sitac.Detachement;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detachement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.DetachementImpl#getAffectation <em>Affectation</em>}</li>
 *   <li>{@link sitac.impl.DetachementImpl#getChef <em>Chef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DetachementImpl extends EObjectImpl implements Detachement {
	/**
	 * The cached value of the '{@link #getAffectation() <em>Affectation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectation()
	 * @generated
	 * @ordered
	 */
	protected EList<Affectation> affectation;

	/**
	 * The cached value of the '{@link #getChef() <em>Chef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChef()
	 * @generated
	 * @ordered
	 */
	protected Agent chef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetachementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.DETACHEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Affectation> getAffectation() {
		if (affectation == null) {
			affectation = new EObjectContainmentEList<Affectation>(Affectation.class, this, SitacPackage.DETACHEMENT__AFFECTATION);
		}
		return affectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getChef() {
		if (chef != null && chef.eIsProxy()) {
			InternalEObject oldChef = (InternalEObject)chef;
			chef = (Agent)eResolveProxy(oldChef);
			if (chef != oldChef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.DETACHEMENT__CHEF, oldChef, chef));
			}
		}
		return chef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetChef() {
		return chef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChef(Agent newChef) {
		Agent oldChef = chef;
		chef = newChef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.DETACHEMENT__CHEF, oldChef, chef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SitacPackage.DETACHEMENT__AFFECTATION:
				return ((InternalEList<?>)getAffectation()).basicRemove(otherEnd, msgs);
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
			case SitacPackage.DETACHEMENT__AFFECTATION:
				return getAffectation();
			case SitacPackage.DETACHEMENT__CHEF:
				if (resolve) return getChef();
				return basicGetChef();
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
			case SitacPackage.DETACHEMENT__AFFECTATION:
				getAffectation().clear();
				getAffectation().addAll((Collection<? extends Affectation>)newValue);
				return;
			case SitacPackage.DETACHEMENT__CHEF:
				setChef((Agent)newValue);
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
			case SitacPackage.DETACHEMENT__AFFECTATION:
				getAffectation().clear();
				return;
			case SitacPackage.DETACHEMENT__CHEF:
				setChef((Agent)null);
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
			case SitacPackage.DETACHEMENT__AFFECTATION:
				return affectation != null && !affectation.isEmpty();
			case SitacPackage.DETACHEMENT__CHEF:
				return chef != null;
		}
		return super.eIsSet(featureID);
	}

} //DetachementImpl
