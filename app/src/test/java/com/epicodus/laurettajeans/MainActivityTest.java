package com.epicodus.laurettajeans;

import android.content.Intent;
import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;
import org.robolectric.shadows.support.v4.Shadows;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Guest on 6/29/16.
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent() {
        TextView mainTextView = (TextView) activity.findViewById(R.id.AppNameTextView);
        assertTrue("LaurettaJean's".equals(mainTextView.getText().toString()));
    }

    @Test
    public void secondActivityStarted() {
        activity.findViewById(R.id.menueButton).performClick();
        Intent expectedIntent = new Intent(activity, MenuActivity.class);
        ShadowActivity shadowActivit = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivit.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
}
