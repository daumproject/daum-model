/**
 */
package sitac.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sitac.MessageAmbiance;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Ambiance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.MessageAmbianceImpl#getJeSuis <em>Je Suis</em>}</li>
 *   <li>{@link sitac.impl.MessageAmbianceImpl#getJeVois <em>Je Vois</em>}</li>
 *   <li>{@link sitac.impl.MessageAmbianceImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageAmbianceImpl extends EObjectImpl implements MessageAmbiance {
	/**
	 * The default value of the '{@link #getJeSuis() <em>Je Suis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJeSuis()
	 * @generated
	 * @ordered
	 */
	protected static final String JE_SUIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJeSuis() <em>Je Suis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJeSuis()
	 * @generated
	 * @ordered
	 */
	protected String jeSuis = JE_SUIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJeVois() <em>Je Vois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJeVois()
	 * @generated
	 * @ordered
	 */
	protected static final String JE_VOIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJeVois() <em>Je Vois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJeVois()
	 * @generated
	 * @ordered
	 */
	protected String jeVois = JE_VOIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageAmbianceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.MESSAGE_AMBIANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJeSuis() {
		return jeSuis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJeSuis(String newJeSuis) {
		String oldJeSuis = jeSuis;
		jeSuis = newJeSuis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.MESSAGE_AMBIANCE__JE_SUIS, oldJeSuis, jeSuis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJeVois() {
		return jeVois;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJeVois(String newJeVois) {
		String oldJeVois = jeVois;
		jeVois = newJeVois;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.MESSAGE_AMBIANCE__JE_VOIS, oldJeVois, jeVois));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.MESSAGE_AMBIANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.MESSAGE_AMBIANCE__JE_SUIS:
				return getJeSuis();
			case SitacPackage.MESSAGE_AMBIANCE__JE_VOIS:
				return getJeVois();
			case SitacPackage.MESSAGE_AMBIANCE__ID:
				return getId();
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
			case SitacPackage.MESSAGE_AMBIANCE__JE_SUIS:
				setJeSuis((String)newValue);
				return;
			case SitacPackage.MESSAGE_AMBIANCE__JE_VOIS:
				setJeVois((String)newValue);
				return;
			case SitacPackage.MESSAGE_AMBIANCE__ID:
				setId((String)newValue);
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
			case SitacPackage.MESSAGE_AMBIANCE__JE_SUIS:
				setJeSuis(JE_SUIS_EDEFAULT);
				return;
			case SitacPackage.MESSAGE_AMBIANCE__JE_VOIS:
				setJeVois(JE_VOIS_EDEFAULT);
				return;
			case SitacPackage.MESSAGE_AMBIANCE__ID:
				setId(ID_EDEFAULT);
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
			case SitacPackage.MESSAGE_AMBIANCE__JE_SUIS:
				return JE_SUIS_EDEFAULT == null ? jeSuis != null : !JE_SUIS_EDEFAULT.equals(jeSuis);
			case SitacPackage.MESSAGE_AMBIANCE__JE_VOIS:
				return JE_VOIS_EDEFAULT == null ? jeVois != null : !JE_VOIS_EDEFAULT.equals(jeVois);
			case SitacPackage.MESSAGE_AMBIANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (jeSuis: ");
		result.append(jeSuis);
		result.append(", jeVois: ");
		result.append(jeVois);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MessageAmbianceImpl
