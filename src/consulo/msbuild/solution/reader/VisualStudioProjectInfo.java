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

package consulo.msbuild.solution.reader;

import java.io.File;

import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import consulo.msbuild.dom.Project;

/**
 * @author VISTALL
 * @since 28-Jan-17
 */
public class VisualStudioProjectInfo
{
	private String myName;
	private File myFile;
	private Project myProject;

	public VisualStudioProjectInfo(String name, File file, Project project)
	{
		myName = name;
		myFile = file;
		myProject = project;
	}

	public String getName()
	{
		return myName;
	}

	public File getFile()
	{
		return myFile;
	}

	public VirtualFile getVirtualFile()
	{
		return LocalFileSystem.getInstance().findFileByIoFile(myFile);
	}

	public Project getProject()
	{
		return myProject;
	}
}