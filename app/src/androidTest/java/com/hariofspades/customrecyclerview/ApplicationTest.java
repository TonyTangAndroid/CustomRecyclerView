package com.hariofspades.customrecyclerview;

import static com.google.common.truth.Truth.assertThat;

import android.content.Context;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

  @Test
  public void useAppContext() {
    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    assertThat(appContext.getPackageName()).isEqualTo("com.hariofspades.customrecyclerview.test");
  }
}
