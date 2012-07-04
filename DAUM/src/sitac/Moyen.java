/**
 */
package sitac;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moyen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.Moyen#getType <em>Type</em>}</li>
 *   <li>{@link sitac.Moyen#getPersonnels <em>Personnels</em>}</li>
 *   <li>{@link sitac.Moyen#getPrecision <em>Precision</em>}</li>
 *   <li>{@link sitac.Moyen#getNumero <em>Numero</em>}</li>
 *   <li>{@link sitac.Moyen#getPosRef <em>Pos Ref</em>}</li>
 *   <li>{@link sitac.Moyen#getPosTarget <em>Pos Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getMoyen()
 * @model
 * @generated
 */
public interface Moyen extends Detachement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MoyenType)
	 * @see sitac.SitacPackage#getMoyen_Type()
	 * @model
	 * @generated
	 */
	MoyenType getType();

	/**
	 * Sets the value of the '{@link sitac.Moyen#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MoyenType value);

	/**
	 * Returns the value of the '<em><b>Personnels</b></em>' reference list.
	 * The list contents are of type {@link sitac.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personnels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnels</em>' reference list.
	 * @see sitac.SitacPackage#getMoyen_Personnels()
	 * @model
	 * @generated
	 */
	EList<Agent> getPersonnels();

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
	 * @see sitac.SitacPackage#getMoyen_Precision()
	 * @model
	 * @generated
	 */
	String getPrecision();

	/**
	 * Sets the value of the '{@link sitac.Moyen#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(String value);

	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(String)
	 * @see sitac.SitacPackage#getMoyen_Numero()
	 * @model
	 * @generated
	 */
	String getNumero();

	/**
	 * Sets the value of the '{@link sitac.Moyen#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(String value);

	/**
	 * Returns the value of the '<em><b>Pos Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Ref</em>' containment reference.
	 * @see #setPosRef(Position)
	 * @see sitac.SitacPackage#getMoyen_PosRef()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosRef();

	/**
	 * Sets the value of the '{@link sitac.Moyen#getPosRef <em>Pos Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Ref</em>' containment reference.
	 * @see #getPosRef()
	 * @generated
	 */
	void setPosRef(Position value);

	/**
	 * Returns the value of the '<em><b>Pos Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Target</em>' containment reference.
	 * @see #setPosTarget(Position)
	 * @see sitac.SitacPackage#getMoyen_PosTarget()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosTarget();

	/**
	 * Sets the value of the '{@link sitac.Moyen#getPosTarget <em>Pos Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Target</em>' containment reference.
	 * @see #getPosTarget()
	 * @generated
	 */
	void setPosTarget(Position value);

} // Moyen
