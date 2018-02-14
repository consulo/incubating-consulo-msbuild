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

package consulo.msbuild.solution;

import java.util.function.Predicate;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.intellij.util.xml.DomElement;

/**
 * @author VISTALL
 * @since 28-Jan-17
 */
public abstract class SolutionVirtualItem
{
	private String myName;
	@Nullable
	private SolutionVirtualDirectory myParent;
	private DomElement myElement;

	public SolutionVirtualItem(@Nonnull String name, @Nullable SolutionVirtualDirectory parent, @Nullable DomElement element)
	{
		myName = name;
		myParent = parent;
		myElement = element;
	}

	@Nullable
	public SolutionVirtualDirectory getParent()
	{
		return myParent;
	}

	@Nonnull
	public String getName()
	{
		return myName;
	}

	public boolean visitRecursive(@Nonnull Predicate<SolutionVirtualItem> processor)
	{
		return processor.test(this);
	}
}
