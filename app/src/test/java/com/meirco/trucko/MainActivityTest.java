package com.meirco.trucko;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk=21)
public class MainActivityTest {

    @Test
    public void onCreate_shouldInflateTheTextView() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        final TextView tv = (TextView) shadowOf(activity).findViewById(R.id.hello_world_text_view);
        assertThat(tv.getText()).isEqualTo("the text");
    }

}
