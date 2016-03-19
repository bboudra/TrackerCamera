package com.ninjapiratestudios.trackercamera.fileStytemTests;

import android.app.Fragment;
import android.os.Bundle;

import com.ninjapiratestudios.trackercamera.ItemFragment;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.any;

/**
 * Created by benjamin on 3/15/16.
 */
@PrepareForTest(ItemFragment.class)
@RunWith(PowerMockRunner.class)
public class ItemFragmentTest extends BaseTest{
    private ItemFragment itemFragment;

    @Before
    public void setup()
    {
        itemFragment = Mockito.spy(new ItemFragment());
    }

    public void columnCountShouldEqual1(){
        //Given
        int mColumnCount = 1;
        fragmentOnCreateMock();
        Bundle itemFragmentBundle = Mockito.mock(Bundle.class);
        //When
        Mockito.when(itemFragment.getArguments()).thenReturn(itemFragmentBundle);
        //Then
        Mockito.verify(itemFragmentBundle).getInt("column-count");
    } //NOTHING IS HAPPENING HERE THAT CAN BE VERIFIED. STILL WANT TO KEEP AS REFERENCE.


    //HELPER METHODS

    /**
     * Creates a mock of the OnCreate Class
     *
     */
    public void fragmentOnCreateMock() {
        PowerMockito.suppress(PowerMockito.methods(Fragment.class,
                "onCreate"));
    }
}
