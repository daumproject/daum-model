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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sitac.Detachement;
import sitac.Historique;
import sitac.InfoTactic;
import sitac.Intervention;
import sitac.InterventionType;
import sitac.Personne;
import sitac.Position;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.InterventionImpl#getType <em>Type</em>}</li>
 *   <li>{@link sitac.impl.InterventionImpl#getHistorique <em>Historique</em>}</li>
 *   <li>{@link sitac.impl.InterventionImpl#getNumeroIntervention <em>Numero Intervention</em>}</li>
 *   <li>{@link sitac.impl.InterventionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link sitac.impl.InterventionImpl#getRequerant <em>Requerant</em>}</li>
 *   <li>{@link sitac.impl.InterventionImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link sitac.impl.InterventionImpl#getDetachements <em>Detachements</em>}</li>
 *   <li>{@link sitac.impl.InterventionImpl#getVictimes <em>Victimes</em>}</li>
 *   <li>{@link sitac.impl.InterventionImpl#getInfoTactics <em>Info Tactics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterventionImpl extends EObjectImpl implements Intervention {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InterventionType type;

	/**
	 * The cached value of the '{@link #getHistorique() <em>Historique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorique()
	 * @generated
	 * @ordered
	 */
	protected Historique historique;

	/**
	 * The default value of the '{@link #getNumeroIntervention() <em>Numero Intervention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroIntervention()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_INTERVENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroIntervention() <em>Numero Intervention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroIntervention()
	 * @generated
	 * @ordered
	 */
	protected String numeroIntervention = NUMERO_INTERVENTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getRequerant() <em>Requerant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequerant()
	 * @generated
	 * @ordered
	 */
	protected Personne requerant;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected String precision = PRECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetachements() <em>Detachements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetachements()
	 * @generated
	 * @ordered
	 */
	protected EList<Detachement> detachements;

	/**
	 * The cached value of the '{@link #getVictimes() <em>Victimes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimes()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> victimes;

	/**
	 * The cached value of the '{@link #getInfoTactics() <em>Info Tactics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoTactics()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoTactic> infoTactics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.INTERVENTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (InterventionType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.INTERVENTION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InterventionType newType) {
		InterventionType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INTERVENTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historique getHistorique() {
		return historique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistorique(Historique newHistorique, NotificationChain msgs) {
		Historique oldHistorique = historique;
		historique = newHistorique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SitacPackage.INTERVENTION__HISTORIQUE, oldHistorique, newHistorique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistorique(Historique newHistorique) {
		if (newHistorique != historique) {
			NotificationChain msgs = null;
			if (historique != null)
				msgs = ((InternalEObject)historique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SitacPackage.INTERVENTION__HISTORIQUE, null, msgs);
			if (newHistorique != null)
				msgs = ((InternalEObject)newHistorique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SitacPackage.INTERVENTION__HISTORIQUE, null, msgs);
			msgs = basicSetHistorique(newHistorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INTERVENTION__HISTORIQUE, newHistorique, newHistorique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroIntervention() {
		return numeroIntervention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroIntervention(String newNumeroIntervention) {
		String oldNumeroIntervention = numeroIntervention;
		numeroIntervention = newNumeroIntervention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INTERVENTION__NUMERO_INTERVENTION, oldNumeroIntervention, numeroIntervention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SitacPackage.INTERVENTION__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SitacPackage.INTERVENTION__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SitacPackage.INTERVENTION__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INTERVENTION__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne getRequerant() {
		if (requerant != null && requerant.eIsProxy()) {
			InternalEObject oldRequerant = (InternalEObject)requerant;
			requerant = (Personne)eResolveProxy(oldRequerant);
			if (requerant != oldRequerant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.INTERVENTION__REQUERANT, oldRequerant, requerant));
			}
		}
		return requerant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personne basicGetRequerant() {
		return requerant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequerant(Personne newRequerant) {
		Personne oldRequerant = requerant;
		requerant = newRequerant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INTERVENTION__REQUERANT, oldRequerant, requerant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(String newPrecision) {
		String oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.INTERVENTION__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Detachement> getDetachements() {
		if (detachements == null) {
			detachements = new EObjectContainmentEList<Detachement>(Detachement.class, this, SitacPackage.INTERVENTION__DETACHEMENTS);
		}
		return detachements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getVictimes() {
		if (victimes == null) {
			victimes = new EObjectResolvingEList<Personne>(Personne.class, this, SitacPackage.INTERVENTION__VICTIMES);
		}
		return victimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfoTactic> getInfoTactics() {
		if (infoTactics == null) {
			infoTactics = new EObjectContainmentEList<InfoTactic>(InfoTactic.class, this, SitacPackage.INTERVENTION__INFO_TACTICS);
		}
		return infoTactics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SitacPackage.INTERVENTION__HISTORIQUE:
				return basicSetHistorique(null, msgs);
			case SitacPackage.INTERVENTION__POSITION:
				return basicSetPosition(null, msgs);
			case SitacPackage.INTERVENTION__DETACHEMENTS:
				return ((InternalEList<?>)getDetachements()).basicRemove(otherEnd, msgs);
			case SitacPackage.INTERVENTION__INFO_TACTICS:
				return ((InternalEList<?>)getInfoTactics()).basicRemove(otherEnd, msgs);
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
			case SitacPackage.INTERVENTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SitacPackage.INTERVENTION__HISTORIQUE:
				return getHistorique();
			case SitacPackage.INTERVENTION__NUMERO_INTERVENTION:
				return getNumeroIntervention();
			case SitacPackage.INTERVENTION__POSITION:
				return getPosition();
			case SitacPackage.INTERVENTION__REQUERANT:
				if (resolve) return getRequerant();
				return basicGetRequerant();
			case SitacPackage.INTERVENTION__PRECISION:
				return getPrecision();
			case SitacPackage.INTERVENTION__DETACHEMENTS:
				return getDetachements();
			case SitacPackage.INTERVENTION__VICTIMES:
				return getVictimes();
			case SitacPackage.INTERVENTION__INFO_TACTICS:
				return getInfoTactics();
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
			case SitacPackage.INTERVENTION__TYPE:
				setType((InterventionType)newValue);
				return;
			case SitacPackage.INTERVENTION__HISTORIQUE:
				setHistorique((Historique)newValue);
				return;
			case SitacPackage.INTERVENTION__NUMERO_INTERVENTION:
				setNumeroIntervention((String)newValue);
				return;
			case SitacPackage.INTERVENTION__POSITION:
				setPosition((Position)newValue);
				return;
			case SitacPackage.INTERVENTION__REQUERANT:
				setRequerant((Personne)newValue);
				return;
			case SitacPackage.INTERVENTION__PRECISION:
				setPrecision((String)newValue);
				return;
			case SitacPackage.INTERVENTION__DETACHEMENTS:
				getDetachements().clear();
				getDetachements().addAll((Collection<? extends Detachement>)newValue);
				return;
			case SitacPackage.INTERVENTION__VICTIMES:
				getVictimes().clear();
				getVictimes().addAll((Collection<? extends Personne>)newValue);
				return;
			case SitacPackage.INTERVENTION__INFO_TACTICS:
				getInfoTactics().clear();
				getInfoTactics().addAll((Collection<? extends InfoTactic>)newValue);
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
			case SitacPackage.INTERVENTION__TYPE:
				setType((InterventionType)null);
				return;
			case SitacPackage.INTERVENTION__HISTORIQUE:
				setHistorique((Historique)null);
				return;
			case SitacPackage.INTERVENTION__NUMERO_INTERVENTION:
				setNumeroIntervention(NUMERO_INTERVENTION_EDEFAULT);
				return;
			case SitacPackage.INTERVENTION__POSITION:
				setPosition((Position)null);
				return;
			case SitacPackage.INTERVENTION__REQUERANT:
				setRequerant((Personne)null);
				return;
			case SitacPackage.INTERVENTION__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case SitacPackage.INTERVENTION__DETACHEMENTS:
				getDetachements().clear();
				return;
			case SitacPackage.INTERVENTION__VICTIMES:
				getVictimes().clear();
				return;
			case SitacPackage.INTERVENTION__INFO_TACTICS:
				getInfoTactics().clear();
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
			case SitacPackage.INTERVENTION__TYPE:
				return type != null;
			case SitacPackage.INTERVENTION__HISTORIQUE:
				return historique != null;
			case SitacPackage.INTERVENTION__NUMERO_INTERVENTION:
				return NUMERO_INTERVENTION_EDEFAULT == null ? numeroIntervention != null : !NUMERO_INTERVENTION_EDEFAULT.equals(numeroIntervention);
			case SitacPackage.INTERVENTION__POSITION:
				return position != null;
			case SitacPackage.INTERVENTION__REQUERANT:
				return requerant != null;
			case SitacPackage.INTERVENTION__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case SitacPackage.INTERVENTION__DETACHEMENTS:
				return detachements != null && !detachements.isEmpty();
			case SitacPackage.INTERVENTION__VICTIMES:
				return victimes != null && !victimes.isEmpty();
			case SitacPackage.INTERVENTION__INFO_TACTICS:
				return infoTactics != null && !infoTactics.isEmpty();
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
		result.append(" (numeroIntervention: ");
		result.append(numeroIntervention);
		result.append(", precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //InterventionImpl
