/*
 * Copyright 2000-2009 JetBrains s.r.o.
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

/*
 * Created by IntelliJ IDEA.
 * User: Alexey
 * Date: 08.05.2005
 * Time: 0:17:52
 */
package com.intellij.lang.properties;

import com.intellij.lang.properties.psi.PropertiesFile;
import com.intellij.openapi.actionSystem.DataKey;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class ResourceBundle {
  public static final DataKey<ResourceBundle[]> ARRAY_DATA_KEY = DataKey.create("resource.bundle.array");

  @NotNull
  public abstract List<PropertiesFile> getPropertiesFiles();

  /**
   * @deprecated, use getPropertiesFiles() instead this method
   */
  @Deprecated
  @NotNull
  public abstract List<PropertiesFile> getPropertiesFiles(final Project project);

  @NotNull
  public abstract PropertiesFile getDefaultPropertiesFile();

  /**
   * @deprecated, use getDefaultPropertiesFile() instead this method
   */
  @Deprecated
  @NotNull
  public abstract PropertiesFile getDefaultPropertiesFile(final Project project);

  @NotNull
  public abstract String getBaseName();

  @NotNull
  public abstract VirtualFile getBaseDirectory();

  @NotNull
  public abstract Project getProject();
}
