/**
 */
package sitac.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sitac.Affectation;
import sitac.Moyen;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.AffectationImpl#getMoyen <em>Moyen</em>}</li>
 *   <li>{@link sitac.impl.AffectationImpl#getHorodatageDemande <em>Horodatage Demande</em>}</li>
 *   <li>{@link sitac.impl.AffectationImpl#getHorodatageEngagement <em>Horodatage Engagement</em>}</li>
 *   <li>{@link sitac.impl.AffectationImpl#getHorodatageDesengagement <em>Horodatage Desengagement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AffectationImpl extends EObjectImpl implements Affectation {
	/**
	 * The cached value of the '{@link #getMoyen() <em>Moyen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyen()
	 * @generated
	 * @ordered
	 */
	protected Moyen moyen;

	/**
	 * The default value of the '{@link #getHorodatageDemande() <em>Horodatage Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageDemande()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORODATAGE_DEMANDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorodatageDemande() <em>Horodatage Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageDemande()
	 * @generated
	 * @ordered
	 */
	protected Date horodatageDemande = HORODATAGE_DEMANDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorodatageEngagement() <em>Horodatage Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageEngagement()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORODATAGE_ENGAGEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorodatageEngagement() <em>Horodatage Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageEngagement()
	 * @generated
	 * @ordered
	 */
	protected Date horodatageEngagement = HORODATAGE_ENGAGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorodatageDesengagement() <em>Horodatage Desengagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageDesengagement()
	 * @generated
	 * @ordered
	 */
	protected static final Date HORODATAGE_DESENGAGEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorodatageDesengagement() <em>Horodatage Desengagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorodatageDesengagement()
	 * @generated
	 * @ordered
	 */
	protected Date horodatageDesengagement = HORODATAGE_DESENGAGEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moyen getMoyen() {
		if (moyen != null && moyen.eIsProxy()) {
			InternalEObject oldMoyen = (InternalEObject)moyen;
			moyen = (Moyen)eResolveProxy(oldMoyen);
			if (moyen != oldMoyen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.AFFECTATION__MOYEN, oldMoyen, moyen));
			}
		}
		return moyen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moyen basicGetMoyen() {
		return moyen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyen(Moyen newMoyen) {
		Moyen oldMoyen = moyen;
		moyen = newMoyen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.AFFECTATION__MOYEN, oldMoyen, moyen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorodatageDemande() {
		return horodatageDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorodatageDemande(Date newHorodatageDemande) {
		Date oldHorodatageDemande = horodatageDemande;
		horodatageDemande = newHorodatageDemande;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.AFFECTATION__HORODATAGE_DEMANDE, oldHorodatageDemande, horodatageDemande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorodatageEngagement() {
		return horodatageEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorodatageEngagement(Date newHorodatageEngagement) {
		Date oldHorodatageEngagement = horodatageEngagement;
		horodatageEngagement = newHorodatageEngagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.AFFECTATION__HORODATAGE_ENGAGEMENT, oldHorodatageEngagement, horodatageEngagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHorodatageDesengagement() {
		return horodatageDesengagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorodatageDesengagement(Date newHorodatageDesengagement) {
		Date oldHorodatageDesengagement = horodatageDesengagement;
		horodatageDesengagement = newHorodatageDesengagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.AFFECTATION__HORODATAGE_DESENGAGEMENT, oldHorodatageDesengagement, horodatageDesengagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.AFFECTATION__MOYEN:
				if (resolve) return getMoyen();
				return basicGetMoyen();
			case SitacPackage.AFFECTATION__HORODATAGE_DEMANDE:
				return getHorodatageDemande();
			case SitacPackage.AFFECTATION__HORODATAGE_ENGAGEMENT:
				return getHorodatageEngagement();
			case SitacPackage.AFFECTATION__HORODATAGE_DESENGAGEMENT:
				return getHorodatageDesengagement();
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
			case SitacPackage.AFFECTATION__MOYEN:
				setMoyen((Moyen)newValue);
				return;
			case SitacPackage.AFFECTATION__HORODATAGE_DEMANDE:
				setHorodatageDemande((Date)newValue);
				return;
			case SitacPackage.AFFECTATION__HORODATAGE_ENGAGEMENT:
				setHorodatageEngagement((Date)newValue);
				return;
			case SitacPackage.AFFECTATION__HORODATAGE_DESENGAGEMENT:
				setHorodatageDesengagement((Date)newValue);
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
			case SitacPackage.AFFECTATION__MOYEN:
				setMoyen((Moyen)null);
				return;
			case SitacPackage.AFFECTATION__HORODATAGE_DEMANDE:
				setHorodatageDemande(HORODATAGE_DEMANDE_EDEFAULT);
				return;
			case SitacPackage.AFFECTATION__HORODATAGE_ENGAGEMENT:
				setHorodatageEngagement(HORODATAGE_ENGAGEMENT_EDEFAULT);
				return;
			case SitacPackage.AFFECTATION__HORODATAGE_DESENGAGEMENT:
				setHorodatageDesengagement(HORODATAGE_DESENGAGEMENT_EDEFAULT);
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
			case SitacPackage.AFFECTATION__MOYEN:
				return moyen != null;
			case SitacPackage.AFFECTATION__HORODATAGE_DEMANDE:
				return HORODATAGE_DEMANDE_EDEFAULT == null ? horodatageDemande != null : !HORODATAGE_DEMANDE_EDEFAULT.equals(horodatageDemande);
			case SitacPackage.AFFECTATION__HORODATAGE_ENGAGEMENT:
				return HORODATAGE_ENGAGEMENT_EDEFAULT == null ? horodatageEngagement != null : !HORODATAGE_ENGAGEMENT_EDEFAULT.equals(horodatageEngagement);
			case SitacPackage.AFFECTATION__HORODATAGE_DESENGAGEMENT:
				return HORODATAGE_DESENGAGEMENT_EDEFAULT == null ? horodatageDesengagement != null : !HORODATAGE_DESENGAGEMENT_EDEFAULT.equals(horodatageDesengagement);
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
		result.append(" (horodatageDemande: ");
		result.append(horodatageDemande);
		result.append(", horodatageEngagement: ");
		result.append(horodatageEngagement);
		result.append(", horodatageDesengagement: ");
		result.append(horodatageDesengagement);
		result.append(')');
		return result.toString();
	}

} //AffectationImpl
