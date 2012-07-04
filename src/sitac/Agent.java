/**
 */
package sitac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.Agent#getMatricule <em>Matricule</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends Personne {
	/**
	 * Returns the value of the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricule</em>' attribute.
	 * @see #setMatricule(String)
	 * @see sitac.SitacPackage#getAgent_Matricule()
	 * @model
	 * @generated
	 */
	String getMatricule();

	/**
	 * Sets the value of the '{@link sitac.Agent#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(String value);

} // Agent
