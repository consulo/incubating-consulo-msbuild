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

package consulo.msbuild.dom.expression.lang.psi;

import javax.annotation.Nonnull;
import com.intellij.psi.PsiManager;
import com.intellij.psi.impl.light.LightElement;
import consulo.msbuild.dom.expression.lang.MSBuildExpressionLanguage;

/**
 * @author VISTALL
 * @since 16-Jun-17
 */
public class MSBuildLightMacroValue extends LightElement
{
	private final String myName;
	private final String myValue;

	public MSBuildLightMacroValue(com.intellij.openapi.project.Project project, String name, String value)
	{
		super(PsiManager.getInstance(project), MSBuildExpressionLanguage.INSTANCE);
		myName = name;
		myValue = value;
	}

	@Override
	public boolean isValid()
	{
		return true;
	}

	@Nonnull
	public String getValue()
	{
		return myValue;
	}

	@Override
	public String toString()
	{
		return myName;
	}
}
