/**
 */
package sitac.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sitac.Entree;
import sitac.SitacPackage;
import sitac.TypeEntree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.EntreeImpl#getHorodatage <em>Horodatage</em>}</li>
 *   <li>{@link sitac.impl.EntreeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntreeImpl extends EObjectImpl implements Entree {
	/**
	 * The default value of the '{@link #getHorodatage() <em>Horodatage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatage()
	 * @generated
	 * @ordered
	 */
	protected static final String HORODATAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorodatage() <em>Horodatage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatage()
	 * @generated
	 * @ordered
	 */
	protected String horodatage = HORODATAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeEntree type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorodatage() {
		return horodatage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorodatage(String newHorodatage) {
		String oldHorodatage = horodatage;
		horodatage = newHorodatage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.ENTREE__HORODATAGE, oldHorodatage, horodatage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEntree getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeEntree)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.ENTREE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEntree basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeEntree newType) {
		TypeEntree oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.ENTREE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.ENTREE__HORODATAGE:
				return getHorodatage();
			case SitacPackage.ENTREE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case SitacPackage.ENTREE__HORODATAGE:
				setHorodatage((String)newValue);
				return;
			case SitacPackage.ENTREE__TYPE:
				setType((TypeEntree)newValue);
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
			case SitacPackage.ENTREE__HORODATAGE:
				setHorodatage(HORODATAGE_EDEFAULT);
				return;
			case SitacPackage.ENTREE__TYPE:
				setType((TypeEntree)null);
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
			case SitacPackage.ENTREE__HORODATAGE:
				return HORODATAGE_EDEFAULT == null ? horodatage != null : !HORODATAGE_EDEFAULT.equals(horodatage);
			case SitacPackage.ENTREE__TYPE:
				return type != null;
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
		result.append(" (horodatage: ");
		result.append(horodatage);
		result.append(')');
		return result.toString();
	}

} //EntreeImpl
