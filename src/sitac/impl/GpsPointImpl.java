/**
 */
package sitac.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sitac.GpsPoint;
import sitac.SitacPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gps Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sitac.impl.GpsPointImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link sitac.impl.GpsPointImpl#getLong <em>Long</em>}</li>
 *   <li>{@link sitac.impl.GpsPointImpl#getSatellites_used <em>Satellites used</em>}</li>
 *   <li>{@link sitac.impl.GpsPointImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link sitac.impl.GpsPointImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GpsPointImpl extends PositionImpl implements GpsPoint {
	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final int LAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected int lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected int long_ = LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatellites_used() <em>Satellites used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellites_used()
	 * @generated
	 * @ordered
	 */
	protected static final int SATELLITES_USED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSatellites_used() <em>Satellites used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellites_used()
	 * @generated
	 * @ordered
	 */
	protected int satellites_used = SATELLITES_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final int MODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected int mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final int ALTITUDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected int altitude = ALTITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpsPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitacPackage.Literals.GPS_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(int newLat) {
		int oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.GPS_POINT__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong(int newLong) {
		int oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.GPS_POINT__LONG, oldLong, long_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSatellites_used() {
		return satellites_used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatellites_used(int newSatellites_used) {
		int oldSatellites_used = satellites_used;
		satellites_used = newSatellites_used;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.GPS_POINT__SATELLITES_USED, oldSatellites_used, satellites_used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(int newMode) {
		int oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.GPS_POINT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(int newAltitude) {
		int oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitacPackage.GPS_POINT__ALTITUDE, oldAltitude, altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitacPackage.GPS_POINT__LAT:
				return getLat();
			case SitacPackage.GPS_POINT__LONG:
				return getLong();
			case SitacPackage.GPS_POINT__SATELLITES_USED:
				return getSatellites_used();
			case SitacPackage.GPS_POINT__MODE:
				return getMode();
			case SitacPackage.GPS_POINT__ALTITUDE:
				return getAltitude();
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
			case SitacPackage.GPS_POINT__LAT:
				setLat((Integer)newValue);
				return;
			case SitacPackage.GPS_POINT__LONG:
				setLong((Integer)newValue);
				return;
			case SitacPackage.GPS_POINT__SATELLITES_USED:
				setSatellites_used((Integer)newValue);
				return;
			case SitacPackage.GPS_POINT__MODE:
				setMode((Integer)newValue);
				return;
			case SitacPackage.GPS_POINT__ALTITUDE:
				setAltitude((Integer)newValue);
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
			case SitacPackage.GPS_POINT__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case SitacPackage.GPS_POINT__LONG:
				setLong(LONG_EDEFAULT);
				return;
			case SitacPackage.GPS_POINT__SATELLITES_USED:
				setSatellites_used(SATELLITES_USED_EDEFAULT);
				return;
			case SitacPackage.GPS_POINT__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case SitacPackage.GPS_POINT__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
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
			case SitacPackage.GPS_POINT__LAT:
				return lat != LAT_EDEFAULT;
			case SitacPackage.GPS_POINT__LONG:
				return long_ != LONG_EDEFAULT;
			case SitacPackage.GPS_POINT__SATELLITES_USED:
				return satellites_used != SATELLITES_USED_EDEFAULT;
			case SitacPackage.GPS_POINT__MODE:
				return mode != MODE_EDEFAULT;
			case SitacPackage.GPS_POINT__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
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
		result.append(" (lat: ");
		result.append(lat);
		result.append(", long: ");
		result.append(long_);
		result.append(", satellites_used: ");
		result.append(satellites_used);
		result.append(", mode: ");
		result.append(mode);
		result.append(", altitude: ");
		result.append(altitude);
		result.append(')');
		return result.toString();
	}

} //GpsPointImpl
