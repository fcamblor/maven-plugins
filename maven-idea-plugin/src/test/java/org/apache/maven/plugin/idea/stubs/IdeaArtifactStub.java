package org.apache.maven.plugin.idea.stubs;

/*
 * Copyright 2005-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;
import org.apache.maven.artifact.versioning.OverConstrainedVersionException;
import org.apache.maven.plugin.testing.stubs.ArtifactStub;

import java.io.File;

/**
 * @author Edwin Punzalan
 */
public class IdeaArtifactStub
    extends ArtifactStub
{
    private String groupId;

    private String artifactId;

    private String version;

    private File file;


    public void setGroupId( String groupId )
    {
        this.groupId = groupId;
    }

    public String getGroupId()
    {
        return groupId;
    }

    public void setArtifactId( String artifactId )
    {
        this.artifactId = artifactId;
    }

    public String getArtifactId()
    {
        return artifactId;
    }

    public void setVersion( String version )
    {
        this.version = version;
    }

    public String getVersion()
    {
        return version;
    }

    public File getFile()
    {
        return file;
    }

    public void setFile( File file )
    {
        this.file = file;
    }

    public String getType()
    {
        return "jar";
    }

    public ArtifactVersion getSelectedVersion()
        throws OverConstrainedVersionException
    {
        return new DefaultArtifactVersion( getVersion() );
    }

    public String getId()
    {
        return getGroupId() + ":" + getArtifactId() + ":" + getVersion();
    }
}
