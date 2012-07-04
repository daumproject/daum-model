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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sitac.Agent;
import sitac.Moyen;
import sitac.MoyenType;
import sitac.Position;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moyen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.MoyenImpl#getType <em>Type</em>}</li>
 *   <li>{@link sitac.impl.MoyenImpl#getPersonnels <em>Personnels</em>}</li>
 *   <li>{@link sitac.impl.MoyenImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link sitac.impl.MoyenImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link sitac.impl.MoyenImpl#getPosRef <em>Pos Ref</em>}</li>
 *   <li>{@link sitac.impl.MoyenImpl#getPosTarget <em>Pos Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoyenImpl extends DetachementImpl implements Moyen {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MoyenType type;

	/**
	 * The cached value of the '{@link #getPersonnels() <em>Personnels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnels()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> personnels;

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
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected String numero = NUMERO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosRef() <em>Pos Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosRef()
	 * @generated
	 * @ordered
	 */
	protected Position posRef;

	/**
	 * The cached value of the '{@link #getPosTarget() <em>Pos Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosTarget()
	 * @generated
	 * @ordered
	 */
	protected Position posTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoyenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.MOYEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoyenType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MoyenType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitacPackage.MOYEN__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoyenType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MoyenType newType) {
		MoyenType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.MOYEN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getPersonnels() {
		if (personnels == null) {
			personnels = new EObjectResolvingEList<Agent>(Agent.class, this, SitacPackage.MOYEN__PERSONNELS);
		}
		return personnels;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.MOYEN__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(String newNumero) {
		String oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.MOYEN__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosRef() {
		return posRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosRef(Position newPosRef, NotificationChain msgs) {
		Position oldPosRef = posRef;
		posRef = newPosRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SitacPackage.MOYEN__POS_REF, oldPosRef, newPosRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosRef(Position newPosRef) {
		if (newPosRef != posRef) {
			NotificationChain msgs = null;
			if (posRef != null)
				msgs = ((InternalEObject)posRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SitacPackage.MOYEN__POS_REF, null, msgs);
			if (newPosRef != null)
				msgs = ((InternalEObject)newPosRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SitacPackage.MOYEN__POS_REF, null, msgs);
			msgs = basicSetPosRef(newPosRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.MOYEN__POS_REF, newPosRef, newPosRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosTarget() {
		return posTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosTarget(Position newPosTarget, NotificationChain msgs) {
		Position oldPosTarget = posTarget;
		posTarget = newPosTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SitacPackage.MOYEN__POS_TARGET, oldPosTarget, newPosTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosTarget(Position newPosTarget) {
		if (newPosTarget != posTarget) {
			NotificationChain msgs = null;
			if (posTarget != null)
				msgs = ((InternalEObject)posTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SitacPackage.MOYEN__POS_TARGET, null, msgs);
			if (newPosTarget != null)
				msgs = ((InternalEObject)newPosTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SitacPackage.MOYEN__POS_TARGET, null, msgs);
			msgs = basicSetPosTarget(newPosTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.MOYEN__POS_TARGET, newPosTarget, newPosTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SitacPackage.MOYEN__POS_REF:
				return basicSetPosRef(null, msgs);
			case SitacPackage.MOYEN__POS_TARGET:
				return basicSetPosTarget(null, msgs);
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
			case SitacPackage.MOYEN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SitacPackage.MOYEN__PERSONNELS:
				return getPersonnels();
			case SitacPackage.MOYEN__PRECISION:
				return getPrecision();
			case SitacPackage.MOYEN__NUMERO:
				return getNumero();
			case SitacPackage.MOYEN__POS_REF:
				return getPosRef();
			case SitacPackage.MOYEN__POS_TARGET:
				return getPosTarget();
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
			case SitacPackage.MOYEN__TYPE:
				setType((MoyenType)newValue);
				return;
			case SitacPackage.MOYEN__PERSONNELS:
				getPersonnels().clear();
				getPersonnels().addAll((Collection<? extends Agent>)newValue);
				return;
			case SitacPackage.MOYEN__PRECISION:
				setPrecision((String)newValue);
				return;
			case SitacPackage.MOYEN__NUMERO:
				setNumero((String)newValue);
				return;
			case SitacPackage.MOYEN__POS_REF:
				setPosRef((Position)newValue);
				return;
			case SitacPackage.MOYEN__POS_TARGET:
				setPosTarget((Position)newValue);
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
			case SitacPackage.MOYEN__TYPE:
				setType((MoyenType)null);
				return;
			case SitacPackage.MOYEN__PERSONNELS:
				getPersonnels().clear();
				return;
			case SitacPackage.MOYEN__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case SitacPackage.MOYEN__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case SitacPackage.MOYEN__POS_REF:
				setPosRef((Position)null);
				return;
			case SitacPackage.MOYEN__POS_TARGET:
				setPosTarget((Position)null);
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
			case SitacPackage.MOYEN__TYPE:
				return type != null;
			case SitacPackage.MOYEN__PERSONNELS:
				return personnels != null && !personnels.isEmpty();
			case SitacPackage.MOYEN__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case SitacPackage.MOYEN__NUMERO:
				return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
			case SitacPackage.MOYEN__POS_REF:
				return posRef != null;
			case SitacPackage.MOYEN__POS_TARGET:
				return posTarget != null;
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
		result.append(" (precision: ");
		result.append(precision);
		result.append(", numero: ");
		result.append(numero);
		result.append(')');
		return result.toString();
	}

} //MoyenImpl
