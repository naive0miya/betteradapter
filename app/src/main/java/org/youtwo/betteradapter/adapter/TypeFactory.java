package org.youtwo.betteradapter.adapter;

import android.view.View;
import org.youtwo.betteradapter.adapter.viewholders.AbstractBetterViewHolder;
import org.youtwo.betteradapter.entities.Car;
import org.youtwo.betteradapter.entities.Duck;
import org.youtwo.betteradapter.entities.Mouse;

/**
 * Created by Bill on 2017/9/6.
 */

public interface   TypeFactory {
  int type(Duck duck);

  int type(Mouse mouse);

  int type(Car car);

  AbstractBetterViewHolder createViewHolder(View parent, int type);
}
