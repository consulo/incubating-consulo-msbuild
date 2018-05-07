/*
 * Copyright 2013-2017 consulo.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package consulo.msbuild;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.PlainTextLanguage;
import consulo.ui.image.Image;

/**
 * @author VISTALL
 * @since 28-Jan-17
 */
public class VisualStudioSolutionFileType extends LanguageFileType
{
	public static final VisualStudioSolutionFileType INSTANCE = new VisualStudioSolutionFileType();

	public VisualStudioSolutionFileType()
	{
		super(PlainTextLanguage.INSTANCE);
	}

	@Nonnull
	@Override
	public String getId()
	{
		return "VISUAL_STUDIO_SOLUTION";
	}

	@Nonnull
	@Override
	public String getDescription()
	{
		return "Visual Studio Solutions";
	}

	@Nonnull
	@Override
	public String getDefaultExtension()
	{
		return "sln";
	}

	@Nullable
	@Override
	public Image getIcon()
	{
		return MSBuildIcons.VisualStudio;
	}
}
