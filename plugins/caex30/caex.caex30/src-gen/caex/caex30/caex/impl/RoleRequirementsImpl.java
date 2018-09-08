/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.Attribute;
import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.InterfaceClass;
import caex.caex30.caex.Mapping;
import caex.caex30.caex.RoleClass;
import caex.caex30.caex.RoleRequirements;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.RoleRequirementsImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.RoleRequirementsImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.RoleRequirementsImpl#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.RoleRequirementsImpl#getRoleClass <em>Role Class</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.RoleRequirementsImpl#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleRequirementsImpl extends CAEXBasicObjectImpl implements RoleRequirements {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getExternalInterface() <em>External Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass> externalInterface;

	/**
	 * The cached value of the '{@link #getMappingObject() <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingObject()
	 * @generated
	 * @ordered
	 */
	protected Mapping mappingObject;

	/**
	 * The cached value of the '{@link #getRoleClass() <em>Role Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClass()
	 * @generated
	 * @ordered
	 */
	protected RoleClass roleClass;

	/**
	 * The default value of the '{@link #getRefBaseRoleClassPath() <em>Ref Base Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseRoleClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_BASE_ROLE_CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefBaseRoleClassPath() <em>Ref Base Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseRoleClassPath()
	 * @generated
	 * @ordered
	 */
	protected String refBaseRoleClassPath = REF_BASE_ROLE_CLASS_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.ROLE_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, CAEXPackage.ROLE_REQUIREMENTS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass> getExternalInterface() {
		if (externalInterface == null) {
			externalInterface = new EObjectContainmentEList<InterfaceClass>(InterfaceClass.class, this, CAEXPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMappingObject() {
		return mappingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingObject(Mapping newMappingObject, NotificationChain msgs) {
		Mapping oldMappingObject = mappingObject;
		mappingObject = newMappingObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT, oldMappingObject, newMappingObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingObject(Mapping newMappingObject) {
		if (newMappingObject != mappingObject) {
			NotificationChain msgs = null;
			if (mappingObject != null)
				msgs = ((InternalEObject)mappingObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT, null, msgs);
			if (newMappingObject != null)
				msgs = ((InternalEObject)newMappingObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT, null, msgs);
			msgs = basicSetMappingObject(newMappingObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT, newMappingObject, newMappingObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass getRoleClass() {
		if (roleClass != null && roleClass.eIsProxy()) {
			InternalEObject oldRoleClass = (InternalEObject)roleClass;
			roleClass = (RoleClass)eResolveProxy(oldRoleClass);
			if (roleClass != oldRoleClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.ROLE_REQUIREMENTS__ROLE_CLASS, oldRoleClass, roleClass));
			}
		}
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass basicGetRoleClass() {
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleClass(RoleClass newRoleClass) {
		RoleClass oldRoleClass = roleClass;
		roleClass = newRoleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ROLE_REQUIREMENTS__ROLE_CLASS, oldRoleClass, roleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefBaseRoleClassPath() {
		return refBaseRoleClassPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBaseRoleClassPath(String newRefBaseRoleClassPath) {
		String oldRefBaseRoleClassPath = refBaseRoleClassPath;
		refBaseRoleClassPath = newRefBaseRoleClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH, oldRefBaseRoleClassPath, refBaseRoleClassPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case CAEXPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
			case CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				return basicSetMappingObject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return getAttribute();
			case CAEXPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				return getMappingObject();
			case CAEXPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				if (resolve) return getRoleClass();
				return basicGetRoleClass();
			case CAEXPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH:
				return getRefBaseRoleClassPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CAEXPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CAEXPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends InterfaceClass>)newValue);
				return;
			case CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				setMappingObject((Mapping)newValue);
				return;
			case CAEXPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				setRoleClass((RoleClass)newValue);
				return;
			case CAEXPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH:
				setRefBaseRoleClassPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CAEXPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CAEXPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				return;
			case CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				setMappingObject((Mapping)null);
				return;
			case CAEXPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				setRoleClass((RoleClass)null);
				return;
			case CAEXPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH:
				setRefBaseRoleClassPath(REF_BASE_ROLE_CLASS_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CAEXPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CAEXPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
			case CAEXPackage.ROLE_REQUIREMENTS__MAPPING_OBJECT:
				return mappingObject != null;
			case CAEXPackage.ROLE_REQUIREMENTS__ROLE_CLASS:
				return roleClass != null;
			case CAEXPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH:
				return REF_BASE_ROLE_CLASS_PATH_EDEFAULT == null ? refBaseRoleClassPath != null : !REF_BASE_ROLE_CLASS_PATH_EDEFAULT.equals(refBaseRoleClassPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (RefBaseRoleClassPath: ");
		result.append(refBaseRoleClassPath);
		result.append(')');
		return result.toString();
	}

} //RoleRequirementsImpl
