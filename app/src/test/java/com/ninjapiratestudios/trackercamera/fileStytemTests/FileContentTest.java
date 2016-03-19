package com.ninjapiratestudios.trackercamera.fileStytemTests;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ninjapiratestudios.trackercamera.ItemFragment;
import com.ninjapiratestudios.trackercamera.fileContent.FileContent;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;

/**
 * Provides Unit tests for the File Content Class and the FileHolder Inner Class
 */
@PrepareForTest(ItemFragment.class)
@RunWith(PowerMockRunner.class)
public class FileContentTest {

    private FileContent fileContent;
    @Before
    public void setup()
    {

    }

    @Test
    public void ShouldCreateFileContentClassWith1FileHolderObject()
    {
        //Given
        given(fileContent);
    }
}
