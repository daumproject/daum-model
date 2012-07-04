/**
 */
package sitac.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sitac.InfoHorodate;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Horodate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.InfoHorodateImpl#getHorodatageDebut <em>Horodatage Debut</em>}</li>
 *   <li>{@link sitac.impl.InfoHorodateImpl#getHorodatageFin <em>Horodatage Fin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InfoHorodateImpl extends EObjectImpl implements InfoHorodate {
	/**
	 * The default value of the '{@link #getHorodatageDebut() <em>Horodatage Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORODATAGE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorodatageDebut() <em>Horodatage Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageDebut()
	 * @generated
	 * @ordered
	 */
	protected Date horodatageDebut = HORODATAGE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorodatageFin() <em>Horodatage Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageFin()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORODATAGE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorodatageFin() <em>Horodatage Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageFin()
	 * @generated
	 * @ordered
	 */
	protected Date horodatageFin = HORODATAGE_FIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoHorodateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.INFO_HORODATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorodatageDebut() {
		return horodatageDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorodatageDebut(Date newHorodatageDebut) {
		Date oldHorodatageDebut = horodatageDebut;
		horodatageDebut = newHorodatageDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INFO_HORODATE__HORODATAGE_DEBUT, oldHorodatageDebut, horodatageDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorodatageFin() {
		return horodatageFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorodatageFin(Date newHorodatageFin) {
		Date oldHorodatageFin = horodatageFin;
		horodatageFin = newHorodatageFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INFO_HORODATE__HORODATAGE_FIN, oldHorodatageFin, horodatageFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.INFO_HORODATE__HORODATAGE_DEBUT:
				return getHorodatageDebut();
			case SitacPackage.INFO_HORODATE__HORODATAGE_FIN:
				return getHorodatageFin();
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
			case SitacPackage.INFO_HORODATE__HORODATAGE_DEBUT:
				setHorodatageDebut((Date)newValue);
				return;
			case SitacPackage.INFO_HORODATE__HORODATAGE_FIN:
				setHorodatageFin((Date)newValue);
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
			case SitacPackage.INFO_HORODATE__HORODATAGE_DEBUT:
				setHorodatageDebut(HORODATAGE_DEBUT_EDEFAULT);
				return;
			case SitacPackage.INFO_HORODATE__HORODATAGE_FIN:
				setHorodatageFin(HORODATAGE_FIN_EDEFAULT);
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
			case SitacPackage.INFO_HORODATE__HORODATAGE_DEBUT:
				return HORODATAGE_DEBUT_EDEFAULT == null ? horodatageDebut != null : !HORODATAGE_DEBUT_EDEFAULT.equals(horodatageDebut);
			case SitacPackage.INFO_HORODATE__HORODATAGE_FIN:
				return HORODATAGE_FIN_EDEFAULT == null ? horodatageFin != null : !HORODATAGE_FIN_EDEFAULT.equals(horodatageFin);
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
		result.append(" (horodatageDebut: ");
		result.append(horodatageDebut);
		result.append(", horodatageFin: ");
		result.append(horodatageFin);
		result.append(')');
		return result.toString();
	}

} //InfoHorodateImpl
