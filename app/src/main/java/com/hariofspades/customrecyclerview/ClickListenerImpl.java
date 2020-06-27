package com.hariofspades.customrecyclerview;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class ClickListenerImpl implements ClickListener {

  private final MainActivity mainActivity;

  public ClickListenerImpl(MainActivity mainActivity) {
    this.mainActivity = mainActivity;
  }

  @Override
  public void onClick(View view, final int position) {
    // Values are passing to activity & to fragment as well
    Toast.makeText(mainActivity, "Single Click on position :" + position, Toast.LENGTH_SHORT)
        .show();
    ImageView picture = (ImageView) view.findViewById(R.id.picture);
    picture.setOnClickListener(
        new OnClickListener() {
          @Override
          public void onClick(View v) {
            Toast.makeText(mainActivity, "Single Click on Image :" + position, Toast.LENGTH_SHORT)
                .show();
          }
        });
  }

  @Override
  public void onLongClick(View view, int position) {
    Toast.makeText(mainActivity, "Long press on position :" + position, Toast.LENGTH_LONG).show();
  }
}
