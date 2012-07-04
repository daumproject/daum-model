/**
 */
package sitac;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Horodate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.InfoHorodate#getHorodatageDebut <em>Horodatage Debut</em>}</li>
 *   <li>{@link sitac.InfoHorodate#getHorodatageFin <em>Horodatage Fin</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getInfoHorodate()
 * @model abstract="true"
 * @generated
 */
public interface InfoHorodate extends EObject {
	/**
	 * Returns the value of the '<em><b>Horodatage Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horodatage Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horodatage Debut</em>' attribute.
	 * @see #setHorodatageDebut(Date)
	 * @see sitac.SitacPackage#getInfoHorodate_HorodatageDebut()
	 * @model
	 * @generated
	 */
	Date getHorodatageDebut();

	/**
	 * Sets the value of the '{@link sitac.InfoHorodate#getHorodatageDebut <em>Horodatage Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horodatage Debut</em>' attribute.
	 * @see #getHorodatageDebut()
	 * @generated
	 */
	void setHorodatageDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Horodatage Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horodatage Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horodatage Fin</em>' attribute.
	 * @see #setHorodatageFin(Date)
	 * @see sitac.SitacPackage#getInfoHorodate_HorodatageFin()
	 * @model
	 * @generated
	 */
	Date getHorodatageFin();

	/**
	 * Sets the value of the '{@link sitac.InfoHorodate#getHorodatageFin <em>Horodatage Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horodatage Fin</em>' attribute.
	 * @see #getHorodatageFin()
	 * @generated
	 */
	void setHorodatageFin(Date value);

} // InfoHorodate
