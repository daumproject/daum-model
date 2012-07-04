/**
 */
package sitac;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prise Eau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.PriseEau#isPerenne <em>Perenne</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getPriseEau()
 * @model
 * @generated
 */
public interface PriseEau extends InfoPos {
	/**
	 * Returns the value of the '<em><b>Perenne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perenne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perenne</em>' attribute.
	 * @see #setPerenne(boolean)
	 * @see sitac.SitacPackage#getPriseEau_Perenne()
	 * @model
	 * @generated
	 */
	boolean isPerenne();

	/**
	 * Sets the value of the '{@link sitac.PriseEau#isPerenne <em>Perenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perenne</em>' attribute.
	 * @see #isPerenne()
	 * @generated
	 */
	void setPerenne(boolean value);

} // PriseEau
