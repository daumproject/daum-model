/**
 */
package sitac.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sitac.PositionCivil;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Civil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.PositionCivilImpl#getNomRue <em>Nom Rue</em>}</li>
 *   <li>{@link sitac.impl.PositionCivilImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link sitac.impl.PositionCivilImpl#getNumeroRue <em>Numero Rue</em>}</li>
 *   <li>{@link sitac.impl.PositionCivilImpl#getPays <em>Pays</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionCivilImpl extends PositionImpl implements PositionCivil {
	/**
	 * The default value of the '{@link #getNomRue() <em>Nom Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomRue()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_RUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomRue() <em>Nom Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomRue()
	 * @generated
	 * @ordered
	 */
	protected String nomRue = NOM_RUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected String cp = CP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroRue() <em>Numero Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRue()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_RUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroRue() <em>Numero Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRue()
	 * @generated
	 * @ordered
	 */
	protected String numeroRue = NUMERO_RUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPays() <em>Pays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPays()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPays() <em>Pays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPays()
	 * @generated
	 * @ordered
	 */
	protected String pays = PAYS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionCivilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.POSITION_CIVIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomRue() {
		return nomRue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomRue(String newNomRue) {
		String oldNomRue = nomRue;
		nomRue = newNomRue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.POSITION_CIVIL__NOM_RUE, oldNomRue, nomRue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCp(String newCp) {
		String oldCp = cp;
		cp = newCp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.POSITION_CIVIL__CP, oldCp, cp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroRue() {
		return numeroRue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroRue(String newNumeroRue) {
		String oldNumeroRue = numeroRue;
		numeroRue = newNumeroRue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.POSITION_CIVIL__NUMERO_RUE, oldNumeroRue, numeroRue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPays(String newPays) {
		String oldPays = pays;
		pays = newPays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.POSITION_CIVIL__PAYS, oldPays, pays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.POSITION_CIVIL__NOM_RUE:
				return getNomRue();
			case SitacPackage.POSITION_CIVIL__CP:
				return getCp();
			case SitacPackage.POSITION_CIVIL__NUMERO_RUE:
				return getNumeroRue();
			case SitacPackage.POSITION_CIVIL__PAYS:
				return getPays();
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
			case SitacPackage.POSITION_CIVIL__NOM_RUE:
				setNomRue((String)newValue);
				return;
			case SitacPackage.POSITION_CIVIL__CP:
				setCp((String)newValue);
				return;
			case SitacPackage.POSITION_CIVIL__NUMERO_RUE:
				setNumeroRue((String)newValue);
				return;
			case SitacPackage.POSITION_CIVIL__PAYS:
				setPays((String)newValue);
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
			case SitacPackage.POSITION_CIVIL__NOM_RUE:
				setNomRue(NOM_RUE_EDEFAULT);
				return;
			case SitacPackage.POSITION_CIVIL__CP:
				setCp(CP_EDEFAULT);
				return;
			case SitacPackage.POSITION_CIVIL__NUMERO_RUE:
				setNumeroRue(NUMERO_RUE_EDEFAULT);
				return;
			case SitacPackage.POSITION_CIVIL__PAYS:
				setPays(PAYS_EDEFAULT);
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
			case SitacPackage.POSITION_CIVIL__NOM_RUE:
				return NOM_RUE_EDEFAULT == null ? nomRue != null : !NOM_RUE_EDEFAULT.equals(nomRue);
			case SitacPackage.POSITION_CIVIL__CP:
				return CP_EDEFAULT == null ? cp != null : !CP_EDEFAULT.equals(cp);
			case SitacPackage.POSITION_CIVIL__NUMERO_RUE:
				return NUMERO_RUE_EDEFAULT == null ? numeroRue != null : !NUMERO_RUE_EDEFAULT.equals(numeroRue);
			case SitacPackage.POSITION_CIVIL__PAYS:
				return PAYS_EDEFAULT == null ? pays != null : !PAYS_EDEFAULT.equals(pays);
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
		result.append(" (nomRue: ");
		result.append(nomRue);
		result.append(", cp: ");
		result.append(cp);
		result.append(", numeroRue: ");
		result.append(numeroRue);
		result.append(", pays: ");
		result.append(pays);
		result.append(')');
		return result.toString();
	}

} //PositionCivilImpl
