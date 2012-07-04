/**
 */
package sitac.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sitac.Categorie;
import sitac.InfoTactic;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Tactic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.InfoTacticImpl#getCategorie <em>Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InfoTacticImpl extends EObjectImpl implements InfoTactic {
	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected Categorie categorie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoTacticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.INFO_TACTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getCategorie() {
		if (categorie != null && categorie.eIsProxy()) {
			InternalEObject oldCategorie = (InternalEObject)categorie;
			categorie = (Categorie)eResolveProxy(oldCategorie);
			if (categorie != oldCategorie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.INFO_TACTIC__CATEGORIE, oldCategorie, categorie));
			}
		}
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie basicGetCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(Categorie newCategorie) {
		Categorie oldCategorie = categorie;
		categorie = newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INFO_TACTIC__CATEGORIE, oldCategorie, categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.INFO_TACTIC__CATEGORIE:
				if (resolve) return getCategorie();
				return basicGetCategorie();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SitacPackage.INFO_TACTIC__CATEGORIE:
				setCategorie((Categorie)newValue);
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
			case SitacPackage.INFO_TACTIC__CATEGORIE:
				setCategorie((Categorie)null);
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
			case SitacPackage.INFO_TACTIC__CATEGORIE:
				return categorie != null;
		}
		return super.eIsSet(featureID);
	}

} //InfoTacticImpl
