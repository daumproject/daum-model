/**
 */
package sitac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Civil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.PositionCivil#getNomRue <em>Nom Rue</em>}</li>
 *   <li>{@link sitac.PositionCivil#getCp <em>Cp</em>}</li>
 *   <li>{@link sitac.PositionCivil#getNumeroRue <em>Numero Rue</em>}</li>
 *   <li>{@link sitac.PositionCivil#getPays <em>Pays</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getPositionCivil()
 * @model
 * @generated
 */
public interface PositionCivil extends Position {
	/**
	 * Returns the value of the '<em><b>Nom Rue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Rue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Rue</em>' attribute.
	 * @see #setNomRue(String)
	 * @see sitac.SitacPackage#getPositionCivil_NomRue()
	 * @model
	 * @generated
	 */
	String getNomRue();

	/**
	 * Sets the value of the '{@link sitac.PositionCivil#getNomRue <em>Nom Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Rue</em>' attribute.
	 * @see #getNomRue()
	 * @generated
	 */
	void setNomRue(String value);

	/**
	 * Returns the value of the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp</em>' attribute.
	 * @see #setCp(String)
	 * @see sitac.SitacPackage#getPositionCivil_Cp()
	 * @model
	 * @generated
	 */
	String getCp();

	/**
	 * Sets the value of the '{@link sitac.PositionCivil#getCp <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(String value);

	/**
	 * Returns the value of the '<em><b>Numero Rue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Rue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Rue</em>' attribute.
	 * @see #setNumeroRue(String)
	 * @see sitac.SitacPackage#getPositionCivil_NumeroRue()
	 * @model
	 * @generated
	 */
	String getNumeroRue();

	/**
	 * Sets the value of the '{@link sitac.PositionCivil#getNumeroRue <em>Numero Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Rue</em>' attribute.
	 * @see #getNumeroRue()
	 * @generated
	 */
	void setNumeroRue(String value);

	/**
	 * Returns the value of the '<em><b>Pays</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pays</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pays</em>' attribute.
	 * @see #setPays(String)
	 * @see sitac.SitacPackage#getPositionCivil_Pays()
	 * @model default=""
	 * @generated
	 */
	String getPays();

	/**
	 * Sets the value of the '{@link sitac.PositionCivil#getPays <em>Pays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pays</em>' attribute.
	 * @see #getPays()
	 * @generated
	 */
	void setPays(String value);

} // PositionCivil
