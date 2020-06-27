package com.hariofspades.customrecyclerview;

import android.view.View;

/**
 * RecyclerView: Implementing single item click and long press (Part-II)
 *
 * <p>- creating an Interface for single tap and long press - Parameters are its respective view and
 * its position
 */
public interface ClickListener {
  public void onClick(View view, int position);

  public void onLongClick(View view, int position);
}
