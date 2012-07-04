/**
 */
package sitac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Pos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.InfoPos#getPositions <em>Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getInfoPos()
 * @model abstract="true"
 * @generated
 */
public interface InfoPos extends InfoTactic {
	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference.
	 * @see #setPositions(Position)
	 * @see sitac.SitacPackage#getInfoPos_Positions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPositions();

	/**
	 * Sets the value of the '{@link sitac.InfoPos#getPositions <em>Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positions</em>' containment reference.
	 * @see #getPositions()
	 * @generated
	 */
	void setPositions(Position value);

} // InfoPos
