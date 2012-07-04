/**
 */
package sitac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.Historique#getEntrees <em>Entrees</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getHistorique()
 * @model
 * @generated
 */
public interface Historique extends EObject {
	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.Entree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entrees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' containment reference list.
	 * @see sitac.SitacPackage#getHistorique_Entrees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entree> getEntrees();

} // Historique
