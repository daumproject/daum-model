/**
 */
package sitac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gps Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.GpsPoint#getLat <em>Lat</em>}</li>
 *   <li>{@link sitac.GpsPoint#getLong <em>Long</em>}</li>
 *   <li>{@link sitac.GpsPoint#getSatellites_used <em>Satellites used</em>}</li>
 *   <li>{@link sitac.GpsPoint#getMode <em>Mode</em>}</li>
 *   <li>{@link sitac.GpsPoint#getAltitude <em>Altitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getGpsPoint()
 * @model
 * @generated
 */
public interface GpsPoint extends Position {
	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(int)
	 * @see sitac.SitacPackage#getGpsPoint_Lat()
	 * @model
	 * @generated
	 */
	int getLat();

	/**
	 * Sets the value of the '{@link sitac.GpsPoint#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(int value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(int)
	 * @see sitac.SitacPackage#getGpsPoint_Long()
	 * @model
	 * @generated
	 */
	int getLong();

	/**
	 * Sets the value of the '{@link sitac.GpsPoint#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(int value);

	/**
	 * Returns the value of the '<em><b>Satellites used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellites used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satellites used</em>' attribute.
	 * @see #setSatellites_used(int)
	 * @see sitac.SitacPackage#getGpsPoint_Satellites_used()
	 * @model
	 * @generated
	 */
	int getSatellites_used();

	/**
	 * Sets the value of the '{@link sitac.GpsPoint#getSatellites_used <em>Satellites used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellites used</em>' attribute.
	 * @see #getSatellites_used()
	 * @generated
	 */
	void setSatellites_used(int value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(int)
	 * @see sitac.SitacPackage#getGpsPoint_Mode()
	 * @model
	 * @generated
	 */
	int getMode();

	/**
	 * Sets the value of the '{@link sitac.GpsPoint#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(int value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(int)
	 * @see sitac.SitacPackage#getGpsPoint_Altitude()
	 * @model
	 * @generated
	 */
	int getAltitude();

	/**
	 * Sets the value of the '{@link sitac.GpsPoint#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(int value);

} // GpsPoint
