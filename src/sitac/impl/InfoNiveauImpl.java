/**
 */
package sitac.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sitac.InfoNiveau;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Niveau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.InfoNiveauImpl#getPositionZ <em>Position Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InfoNiveauImpl extends EObjectImpl implements InfoNiveau {
	/**
	 * The default value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected String positionZ = POSITION_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoNiveauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.INFO_NIVEAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositionZ() {
		return positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionZ(String newPositionZ) {
		String oldPositionZ = positionZ;
		positionZ = newPositionZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INFO_NIVEAU__POSITION_Z, oldPositionZ, positionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.INFO_NIVEAU__POSITION_Z:
				return getPositionZ();
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
			case SitacPackage.INFO_NIVEAU__POSITION_Z:
				setPositionZ((String)newValue);
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
			case SitacPackage.INFO_NIVEAU__POSITION_Z:
				setPositionZ(POSITION_Z_EDEFAULT);
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
			case SitacPackage.INFO_NIVEAU__POSITION_Z:
				return POSITION_Z_EDEFAULT == null ? positionZ != null : !POSITION_Z_EDEFAULT.equals(positionZ);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (positionZ: ");
		result.append(positionZ);
		result.append(')');
		return result.toString();
	}

} //InfoNiveauImpl
