/**
 */
package sitac.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sitac.Action;
import sitac.ActionType;
import sitac.InfoHorodate;
import sitac.InfoNiveau;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.ActionImpl#getHorodatageDebut <em>Horodatage Debut</em>}</li>
 *   <li>{@link sitac.impl.ActionImpl#getHorodatageFin <em>Horodatage Fin</em>}</li>
 *   <li>{@link sitac.impl.ActionImpl#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link sitac.impl.ActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link sitac.impl.ActionImpl#isNoria <em>Noria</em>}</li>
 *   <li>{@link sitac.impl.ActionImpl#isEnLigne <em>En Ligne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends InfoLignePosImpl implements Action {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActionType type;

	/**
	 * The default value of the '{@link #isNoria() <em>Noria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoria()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORIA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoria() <em>Noria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoria()
	 * @generated
	 * @ordered
	 */
	protected boolean noria = NORIA_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnLigne() <em>En Ligne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnLigne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EN_LIGNE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnLigne() <em>En Ligne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnLigne()
	 * @generated
	 * @ordered
	 */
	protected boolean enLigne = EN_LIGNE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.ACTION__HORODATAGE_DEBUT, oldHorodatageDebut, horodatageDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.ACTION__HORODATAGE_FIN, oldHorodatageFin, horodatageFin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.ACTION__POSITION_Z, oldPositionZ, positionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ActionType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.ACTION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActionType newType) {
		ActionType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoria() {
		return noria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoria(boolean newNoria) {
		boolean oldNoria = noria;
		noria = newNoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.ACTION__NORIA, oldNoria, noria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnLigne() {
		return enLigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnLigne(boolean newEnLigne) {
		boolean oldEnLigne = enLigne;
		enLigne = newEnLigne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.ACTION__EN_LIGNE, oldEnLigne, enLigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.ACTION__HORODATAGE_DEBUT:
				return getHorodatageDebut();
			case SitacPackage.ACTION__HORODATAGE_FIN:
				return getHorodatageFin();
			case SitacPackage.ACTION__POSITION_Z:
				return getPositionZ();
			case SitacPackage.ACTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SitacPackage.ACTION__NORIA:
				return isNoria();
			case SitacPackage.ACTION__EN_LIGNE:
				return isEnLigne();
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
			case SitacPackage.ACTION__HORODATAGE_DEBUT:
				setHorodatageDebut((Date)newValue);
				return;
			case SitacPackage.ACTION__HORODATAGE_FIN:
				setHorodatageFin((Date)newValue);
				return;
			case SitacPackage.ACTION__POSITION_Z:
				setPositionZ((String)newValue);
				return;
			case SitacPackage.ACTION__TYPE:
				setType((ActionType)newValue);
				return;
			case SitacPackage.ACTION__NORIA:
				setNoria((Boolean)newValue);
				return;
			case SitacPackage.ACTION__EN_LIGNE:
				setEnLigne((Boolean)newValue);
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
			case SitacPackage.ACTION__HORODATAGE_DEBUT:
				setHorodatageDebut(HORODATAGE_DEBUT_EDEFAULT);
				return;
			case SitacPackage.ACTION__HORODATAGE_FIN:
				setHorodatageFin(HORODATAGE_FIN_EDEFAULT);
				return;
			case SitacPackage.ACTION__POSITION_Z:
				setPositionZ(POSITION_Z_EDEFAULT);
				return;
			case SitacPackage.ACTION__TYPE:
				setType((ActionType)null);
				return;
			case SitacPackage.ACTION__NORIA:
				setNoria(NORIA_EDEFAULT);
				return;
			case SitacPackage.ACTION__EN_LIGNE:
				setEnLigne(EN_LIGNE_EDEFAULT);
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
			case SitacPackage.ACTION__HORODATAGE_DEBUT:
				return HORODATAGE_DEBUT_EDEFAULT == null ? horodatageDebut != null : !HORODATAGE_DEBUT_EDEFAULT.equals(horodatageDebut);
			case SitacPackage.ACTION__HORODATAGE_FIN:
				return HORODATAGE_FIN_EDEFAULT == null ? horodatageFin != null : !HORODATAGE_FIN_EDEFAULT.equals(horodatageFin);
			case SitacPackage.ACTION__POSITION_Z:
				return POSITION_Z_EDEFAULT == null ? positionZ != null : !POSITION_Z_EDEFAULT.equals(positionZ);
			case SitacPackage.ACTION__TYPE:
				return type != null;
			case SitacPackage.ACTION__NORIA:
				return noria != NORIA_EDEFAULT;
			case SitacPackage.ACTION__EN_LIGNE:
				return enLigne != EN_LIGNE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InfoHorodate.class) {
			switch (derivedFeatureID) {
				case SitacPackage.ACTION__HORODATAGE_DEBUT: return SitacPackage.INFO_HORODATE__HORODATAGE_DEBUT;
				case SitacPackage.ACTION__HORODATAGE_FIN: return SitacPackage.INFO_HORODATE__HORODATAGE_FIN;
				default: return -1;
			}
		}
		if (baseClass == InfoNiveau.class) {
			switch (derivedFeatureID) {
				case SitacPackage.ACTION__POSITION_Z: return SitacPackage.INFO_NIVEAU__POSITION_Z;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InfoHorodate.class) {
			switch (baseFeatureID) {
				case SitacPackage.INFO_HORODATE__HORODATAGE_DEBUT: return SitacPackage.ACTION__HORODATAGE_DEBUT;
				case SitacPackage.INFO_HORODATE__HORODATAGE_FIN: return SitacPackage.ACTION__HORODATAGE_FIN;
				default: return -1;
			}
		}
		if (baseClass == InfoNiveau.class) {
			switch (baseFeatureID) {
				case SitacPackage.INFO_NIVEAU__POSITION_Z: return SitacPackage.ACTION__POSITION_Z;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", positionZ: ");
		result.append(positionZ);
		result.append(", noria: ");
		result.append(noria);
		result.append(", enLigne: ");
		result.append(enLigne);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
