package dev.alimansour.retrofitcleanarchitecture;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        assertEquals("dev.alimansour.retrofitcleanarchitecture", appContext.getPackageName());
    }

    @Test
    public void CheckApplicationVersion() {
        assertEquals("RetrofitCleanArchitecture", appContext.getString(R.string.app_name));
    }
}