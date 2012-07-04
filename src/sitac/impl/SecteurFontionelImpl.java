/**
 */
package sitac.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sitac.InfoResponsable;
import sitac.Moyen;
import sitac.SecteurFontionel;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secteur Fontionel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.SecteurFontionelImpl#getChef <em>Chef</em>}</li>
 *   <li>{@link sitac.impl.SecteurFontionelImpl#getNiveau <em>Niveau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecteurFontionelImpl extends InfoPosImpl implements SecteurFontionel {
	/**
	 * The cached value of the '{@link #getChef() <em>Chef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChef()
	 * @generated
	 * @ordered
	 */
	protected Moyen chef;

	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final String NIVEAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected String niveau = NIVEAU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecteurFontionelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.SECTEUR_FONTIONEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moyen getChef() {
		if (chef != null && chef.eIsProxy()) {
			InternalEObject oldChef = (InternalEObject)chef;
			chef = (Moyen)eResolveProxy(oldChef);
			if (chef != oldChef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.SECTEUR_FONTIONEL__CHEF, oldChef, chef));
			}
		}
		return chef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moyen basicGetChef() {
		return chef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChef(Moyen newChef) {
		Moyen oldChef = chef;
		chef = newChef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.SECTEUR_FONTIONEL__CHEF, oldChef, chef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(String newNiveau) {
		String oldNiveau = niveau;
		niveau = newNiveau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.SECTEUR_FONTIONEL__NIVEAU, oldNiveau, niveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.SECTEUR_FONTIONEL__CHEF:
				if (resolve) return getChef();
				return basicGetChef();
			case SitacPackage.SECTEUR_FONTIONEL__NIVEAU:
				return getNiveau();
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
			case SitacPackage.SECTEUR_FONTIONEL__CHEF:
				setChef((Moyen)newValue);
				return;
			case SitacPackage.SECTEUR_FONTIONEL__NIVEAU:
				setNiveau((String)newValue);
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
			case SitacPackage.SECTEUR_FONTIONEL__CHEF:
				setChef((Moyen)null);
				return;
			case SitacPackage.SECTEUR_FONTIONEL__NIVEAU:
				setNiveau(NIVEAU_EDEFAULT);
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
			case SitacPackage.SECTEUR_FONTIONEL__CHEF:
				return chef != null;
			case SitacPackage.SECTEUR_FONTIONEL__NIVEAU:
				return NIVEAU_EDEFAULT == null ? niveau != null : !NIVEAU_EDEFAULT.equals(niveau);
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
		if (baseClass == InfoResponsable.class) {
			switch (derivedFeatureID) {
				case SitacPackage.SECTEUR_FONTIONEL__CHEF: return SitacPackage.INFO_RESPONSABLE__CHEF;
				case SitacPackage.SECTEUR_FONTIONEL__NIVEAU: return SitacPackage.INFO_RESPONSABLE__NIVEAU;
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
		if (baseClass == InfoResponsable.class) {
			switch (baseFeatureID) {
				case SitacPackage.INFO_RESPONSABLE__CHEF: return SitacPackage.SECTEUR_FONTIONEL__CHEF;
				case SitacPackage.INFO_RESPONSABLE__NIVEAU: return SitacPackage.SECTEUR_FONTIONEL__NIVEAU;
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
		result.append(" (niveau: ");
		result.append(niveau);
		result.append(')');
		return result.toString();
	}

} //SecteurFontionelImpl
