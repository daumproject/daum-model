/**
 */
package sitac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.Action#getType <em>Type</em>}</li>
 *   <li>{@link sitac.Action#isNoria <em>Noria</em>}</li>
 *   <li>{@link sitac.Action#isEnLigne <em>En Ligne</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends InfoLignePos, InfoHorodate, InfoNiveau {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ActionType)
	 * @see sitac.SitacPackage#getAction_Type()
	 * @model
	 * @generated
	 */
	ActionType getType();

	/**
	 * Sets the value of the '{@link sitac.Action#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Noria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noria</em>' attribute.
	 * @see #setNoria(boolean)
	 * @see sitac.SitacPackage#getAction_Noria()
	 * @model
	 * @generated
	 */
	boolean isNoria();

	/**
	 * Sets the value of the '{@link sitac.Action#isNoria <em>Noria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noria</em>' attribute.
	 * @see #isNoria()
	 * @generated
	 */
	void setNoria(boolean value);

	/**
	 * Returns the value of the '<em><b>En Ligne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>En Ligne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>En Ligne</em>' attribute.
	 * @see #setEnLigne(boolean)
	 * @see sitac.SitacPackage#getAction_EnLigne()
	 * @model
	 * @generated
	 */
	boolean isEnLigne();

	/**
	 * Sets the value of the '{@link sitac.Action#isEnLigne <em>En Ligne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>En Ligne</em>' attribute.
	 * @see #isEnLigne()
	 * @generated
	 */
	void setEnLigne(boolean value);

} // Action
