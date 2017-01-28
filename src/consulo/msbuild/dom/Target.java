// Generated on Sat Jan 28 04:58:19 MSK 2017
// DTD/Schema  :    http://schemas.microsoft.com/developer/msbuild/2003

package consulo.msbuild.dom;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;

/**
 * http://schemas.microsoft.com/developer/msbuild/2003:TargetType interface.
 * <pre>
 * <h3>Type http://schemas.microsoft.com/developer/msbuild/2003:TargetType documentation</h3>
 * <!-- _locID_text="TargetType" _locComment="" -->Groups tasks into a section of the build process
 * </pre>
 *
 * @author VISTALL
 */
public interface Target extends DomElement
{

	/**
	 * Returns the value of the Name child.
	 * <pre>
	 * <h3>Attribute null:Name documentation</h3>
	 * <!-- _locID_text="TargetType_Name" _locComment="" -->Name of the target
	 * </pre>
	 *
	 * @return the value of the Name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the DependsOnTargets child.
	 * <pre>
	 * <h3>Attribute null:DependsOnTargets documentation</h3>
	 * <!-- _locID_text="TargetType_DependsOnTargets" _locComment="" -->Optional semi-colon separated list of targets that should be run before this target
	 * </pre>
	 *
	 * @return the value of the DependsOnTargets child.
	 */
	@NotNull
	GenericAttributeValue<String> getDependsOnTargets();


	/**
	 * Returns the value of the Inputs child.
	 * <pre>
	 * <h3>Attribute null:Inputs documentation</h3>
	 * <!-- _locID_text="TargetType_Inputs" _locComment="" -->Optional semi-colon separated list of files that form inputs into this target. Their timestamps will be compared with the timestamps of
	 * files in Outputs to determine whether the Target is up to date
	 * </pre>
	 *
	 * @return the value of the Inputs child.
	 */
	@NotNull
	GenericAttributeValue<String> getInputs();


	/**
	 * Returns the value of the Outputs child.
	 * <pre>
	 * <h3>Attribute null:Outputs documentation</h3>
	 * <!-- _locID_text="TargetType_Outputs" _locComment="" -->Optional semi-colon separated list of files that form outputs into this target. Their timestamps will be compared with the timestamps
	 * of files in Inputs to determine whether the Target is up to date
	 * </pre>
	 *
	 * @return the value of the Outputs child.
	 */
	@NotNull
	GenericAttributeValue<String> getOutputs();


	/**
	 * Returns the value of the Condition child.
	 * <pre>
	 * <h3>Attribute null:Condition documentation</h3>
	 * <!-- _locID_text="TargetType_Condition" _locComment="" -->Optional expression evaluated to determine whether the Target and the targets it depends on should be run
	 * </pre>
	 *
	 * @return the value of the Condition child.
	 */
	@NotNull
	GenericAttributeValue<String> getCondition();


	/**
	 * Returns the value of the KeepDuplicateOutputs child.
	 * <pre>
	 * <h3>Attribute null:KeepDuplicateOutputs documentation</h3>
	 * <!-- _locID_text="TargetType_KeepDuplicateOutputs" _locComment="" -->Optional expression evaluated to determine whether duplicate items in the Target's Returns should be removed before
	 * returning them. The default is not to eliminate duplicates.
	 * </pre>
	 *
	 * @return the value of the KeepDuplicateOutputs child.
	 */
	@NotNull
	GenericAttributeValue<String> getKeepDuplicateOutputs();


	/**
	 * Returns the value of the Returns child.
	 * <pre>
	 * <h3>Attribute null:Returns documentation</h3>
	 * <!-- _locID_text="TargetType_Returns" _locComment="" -->Optional expression evaluated to determine which items generated by the target should be returned by the target. If there are no
	 * Returns attributes on Targets in the file, the Outputs attributes are used instead for this purpose.
	 * </pre>
	 *
	 * @return the value of the Returns child.
	 */
	@NotNull
	GenericAttributeValue<String> getReturns();


	/**
	 * Returns the value of the BeforeTargets child.
	 * <pre>
	 * <h3>Attribute null:BeforeTargets documentation</h3>
	 * <!-- _locID_text="TargetType_BeforeTargets" _locComment="" -->Optional semi-colon separated list of targets that this target should run before.
	 * </pre>
	 *
	 * @return the value of the BeforeTargets child.
	 */
	@NotNull
	GenericAttributeValue<String> getBeforeTargets();


	/**
	 * Returns the value of the AfterTargets child.
	 * <pre>
	 * <h3>Attribute null:AfterTargets documentation</h3>
	 * <!-- _locID_text="TargetType_AfterTargets" _locComment="" -->Optional semi-colon separated list of targets that this target should run after.
	 * </pre>
	 *
	 * @return the value of the AfterTargets child.
	 */
	@NotNull
	GenericAttributeValue<String> getAfterTargets();


	/**
	 * Returns the value of the Label child.
	 * <pre>
	 * <h3>Attribute null:Label documentation</h3>
	 * <!-- _locID_text="ImportType_Label" _locComment="" -->Optional expression. Used to identify or order system and user elements
	 * </pre>
	 *
	 * @return the value of the Label child.
	 */
	@NotNull
	GenericAttributeValue<String> getLabel();


	/**
	 * Returns the list of OnError children.
	 *
	 * @return the list of OnError children.
	 */
	@NotNull
	List<OnError> getOnErrors();

	/**
	 * Adds new child to the list of OnError children.
	 *
	 * @return created child
	 */
	OnError addOnError();


	/**
	 * Returns the list of Task children.
	 *
	 * @return the list of Task children.
	 */
	@NotNull
	List<Task> getTasks();

	/**
	 * Adds new child to the list of Task children.
	 *
	 * @return created child
	 */
	Task addTask();


	/**
	 * Returns the list of PropertyGroup children.
	 *
	 * @return the list of PropertyGroup children.
	 */
	@NotNull
	List<PropertyGroup> getPropertyGroups();

	/**
	 * Adds new child to the list of PropertyGroup children.
	 *
	 * @return created child
	 */
	PropertyGroup addPropertyGroup();


	/**
	 * Returns the list of ItemGroup children.
	 *
	 * @return the list of ItemGroup children.
	 */
	@NotNull
	List<ItemGroup> getItemGroups();

	/**
	 * Adds new child to the list of ItemGroup children.
	 *
	 * @return created child
	 */
	ItemGroup addItemGroup();


}