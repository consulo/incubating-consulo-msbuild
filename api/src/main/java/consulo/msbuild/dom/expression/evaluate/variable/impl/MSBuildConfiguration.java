package consulo.msbuild.dom.expression.evaluate.variable.impl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import consulo.annotations.RequiredReadAction;
import consulo.msbuild.dom.expression.evaluate.MSBuildEvaluateContext;
import consulo.msbuild.dom.expression.evaluate.MSBuildEvaluatioException;
import consulo.msbuild.dom.expression.evaluate.variable.MSBuildVariableProvider;
import consulo.msbuild.module.extension.MSBuildRootExtension;

/**
 * @author VISTALL
 * @since 2018-07-30
 */
public class MSBuildConfiguration extends MSBuildVariableProvider
{
	public MSBuildConfiguration()
	{
		super("Configuration");
	}

	@RequiredReadAction
	@Nullable
	@Override
	public String evaluateUnsafe(@Nonnull MSBuildEvaluateContext context) throws MSBuildEvaluatioException
	{
		MSBuildRootExtension<?> moduleExtension = context.getModuleExtension();
		return moduleExtension == null ? null : moduleExtension.getConfiguration();
	}
}