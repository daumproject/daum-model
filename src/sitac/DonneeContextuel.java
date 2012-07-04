/**
 */
package sitac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donnee Contextuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.DonneeContextuel#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link sitac.DonneeContextuel#getPrecision <em>Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getDonneeContextuel()
 * @model
 * @generated
 */
public interface DonneeContextuel extends InfoPos {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(int)
	 * @see sitac.SitacPackage#getDonneeContextuel_Orientation()
	 * @model
	 * @generated
	 */
	int getOrientation();

	/**
	 * Sets the value of the '{@link sitac.DonneeContextuel#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(int value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(String)
	 * @see sitac.SitacPackage#getDonneeContextuel_Precision()
	 * @model
	 * @generated
	 */
	String getPrecision();

	/**
	 * Sets the value of the '{@link sitac.DonneeContextuel#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(String value);

} // DonneeContextuel
