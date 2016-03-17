package com.ninjapiratestudios.trackercamera;

import android.app.DialogFragment;
import android.app.Fragment;

import org.powermock.api.mockito.PowerMockito;

/**
 * This class should contain common methods and fields used for different
 * test classes
 */
public class BaseTest {
    protected final String UNIT_TEST_SETUP_ERROR = "There was an error while " +
            "setting up the test: ";
    protected final String UNIT_TEST_SUT_ERROR = "There was an error " +
            "while " +
            "executing the method under test: ";
    protected final String UNIT_TEST_EXECUTE_ERROR = "The test either failed," +
            " or there was an error while executing the test: ";
    protected final String UNIT_TEST_BEFORE_ERROR = "Error in @Before setup " +
            "method: ";

    public void fragmentOnCreateMock() {
        PowerMockito.suppress(PowerMockito.methods(Fragment.class,
                "onCreate"));
    }
}
