package consulo.msbuild.compiler;

import javax.annotation.Nonnull;

import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileScope;
import com.intellij.openapi.compiler.TranslatingCompiler;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.Chunk;
import consulo.msbuild.module.extension.MSBuildRootExtension;

/**
 * @author VISTALL
 * @since 2018-02-06
 */
public class MSBuildCompiler implements TranslatingCompiler
{
	@Override
	public boolean isCompilableFile(VirtualFile virtualFile, CompileContext compileContext)
	{
		return true;
	}

	@Override
	public void compile(CompileContext compileContext, Chunk<Module> chunk, VirtualFile[] virtualFiles, OutputSink outputSink)
	{
		Module module = chunk.getNodes().iterator().next();

		MSBuildRootExtension extension = ModuleUtilCore.getExtension(module, MSBuildRootExtension.class);

		if(extension == null)
		{
			return;
		}

		Object sdk = extension.getBundleInfo().resolveSdk(extension.getImportTarget(), extension);

		if(sdk == null)
		{
			return;
		}

		if(sdk instanceof Sdk)
		{
			System.out.println("test");
		}
	}

	@Nonnull
	@Override
	public FileType[] getInputFileTypes()
	{
		return FileType.EMPTY_ARRAY;
	}

	@Nonnull
	@Override
	public FileType[] getOutputFileTypes()
	{
		return FileType.EMPTY_ARRAY;
	}

	@Nonnull
	@Override
	public String getDescription()
	{
		return "MSBuild Compiler";
	}

	@Override
	public boolean validateConfiguration(CompileScope compileScope)
	{
		return true;
	}
}
