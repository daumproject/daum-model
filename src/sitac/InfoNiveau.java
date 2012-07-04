/**
 */
package sitac;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Niveau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.InfoNiveau#getPositionZ <em>Position Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getInfoNiveau()
 * @model abstract="true"
 * @generated
 */
public interface InfoNiveau extends EObject {
	/**
	 * Returns the value of the '<em><b>Position Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Z</em>' attribute.
	 * @see #setPositionZ(String)
	 * @see sitac.SitacPackage#getInfoNiveau_PositionZ()
	 * @model
	 * @generated
	 */
	String getPositionZ();

	/**
	 * Sets the value of the '{@link sitac.InfoNiveau#getPositionZ <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Z</em>' attribute.
	 * @see #getPositionZ()
	 * @generated
	 */
	void setPositionZ(String value);

} // InfoNiveau
