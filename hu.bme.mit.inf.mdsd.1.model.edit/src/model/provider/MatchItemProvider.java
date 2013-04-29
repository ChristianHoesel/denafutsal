/**
 */
package model.provider;


import java.util.Collection;
import java.util.List;

import model.Match;
import model.ModelFactory;
import model.ModelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link model.Match} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDatePropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addAgeGroupPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_date_feature", "_UI_Match_type"),
				 ModelPackage.Literals.MATCH__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_location_feature", "_UI_Match_type"),
				 ModelPackage.Literals.MATCH__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_type_feature", "_UI_Match_type"),
				 ModelPackage.Literals.MATCH__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Age Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgeGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_ageGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_ageGroup_feature", "_UI_Match_type"),
				 ModelPackage.Literals.MATCH__AGE_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_id_feature", "_UI_Match_type"),
				 ModelPackage.Literals.MATCH__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelPackage.Literals.MATCH__REFEREE);
			childrenFeatures.add(ModelPackage.Literals.MATCH__ASSISTANT);
			childrenFeatures.add(ModelPackage.Literals.MATCH__THIRD_REFEREE);
			childrenFeatures.add(ModelPackage.Literals.MATCH__SUPERVISOR);
			childrenFeatures.add(ModelPackage.Literals.MATCH__EVENTS);
			childrenFeatures.add(ModelPackage.Literals.MATCH__HOME);
			childrenFeatures.add(ModelPackage.Literals.MATCH__VISITOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Match.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Match"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Match match = (Match)object;
		return getString("_UI_Match_type") + " " + match.getId();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Match.class)) {
			case ModelPackage.MATCH__DATE:
			case ModelPackage.MATCH__LOCATION:
			case ModelPackage.MATCH__TYPE:
			case ModelPackage.MATCH__AGE_GROUP:
			case ModelPackage.MATCH__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.MATCH__REFEREE:
			case ModelPackage.MATCH__ASSISTANT:
			case ModelPackage.MATCH__THIRD_REFEREE:
			case ModelPackage.MATCH__SUPERVISOR:
			case ModelPackage.MATCH__EVENTS:
			case ModelPackage.MATCH__HOME:
			case ModelPackage.MATCH__VISITOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__REFEREE,
				 ModelFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__REFEREE,
				 ModelFactory.eINSTANCE.createTeamMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__ASSISTANT,
				 ModelFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__ASSISTANT,
				 ModelFactory.eINSTANCE.createTeamMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__THIRD_REFEREE,
				 ModelFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__THIRD_REFEREE,
				 ModelFactory.eINSTANCE.createTeamMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__SUPERVISOR,
				 ModelFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__SUPERVISOR,
				 ModelFactory.eINSTANCE.createTeamMember()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__EVENTS,
				 ModelFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__HOME,
				 ModelFactory.eINSTANCE.createTeam()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.MATCH__VISITOR,
				 ModelFactory.eINSTANCE.createTeam()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ModelPackage.Literals.MATCH__REFEREE ||
			childFeature == ModelPackage.Literals.MATCH__ASSISTANT ||
			childFeature == ModelPackage.Literals.MATCH__THIRD_REFEREE ||
			childFeature == ModelPackage.Literals.MATCH__SUPERVISOR ||
			childFeature == ModelPackage.Literals.MATCH__HOME ||
			childFeature == ModelPackage.Literals.MATCH__VISITOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelEditPlugin.INSTANCE;
	}

}
