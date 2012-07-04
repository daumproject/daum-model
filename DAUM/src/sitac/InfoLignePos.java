/**
 */
package sitac;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Ligne Pos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sitac.InfoLignePos#getPositions <em>Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @see sitac.SitacPackage#getInfoLignePos()
 * @model abstract="true"
 * @generated
 */
public interface InfoLignePos extends InfoTactic {
	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link sitac.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see sitac.SitacPackage#getInfoLignePos_Positions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getPositions();

} // InfoLignePos
