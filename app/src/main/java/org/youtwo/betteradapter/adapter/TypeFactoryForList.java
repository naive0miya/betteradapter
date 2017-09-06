package org.youtwo.betteradapter.adapter;

import android.annotation.SuppressLint;
import android.view.View;
import org.youtwo.betteradapter.adapter.exception.TypeNotSupportedException;
import org.youtwo.betteradapter.adapter.viewholders.AbstractBetterViewHolder;
import org.youtwo.betteradapter.adapter.viewholders.CarViewHolder;
import org.youtwo.betteradapter.adapter.viewholders.DuckViewHolder;
import org.youtwo.betteradapter.adapter.viewholders.MouseViewHolder;
import org.youtwo.betteradapter.entities.Car;
import org.youtwo.betteradapter.entities.Duck;
import org.youtwo.betteradapter.entities.Mouse;

/**
 * Created by Bill on 2017/9/6.
 */

public class TypeFactoryForList implements TypeFactory {
  @Override
  public int type(Duck duck) {
    return DuckViewHolder.LAYOUT;
  }

  @Override
  public int type(Mouse mouse) {
    return MouseViewHolder.LAYOUT;
  }

  @Override
  public int type(Car car) {
    return CarViewHolder.LAYOUT;
  }

  @Override
  @SuppressLint("DefaultLocale")
  public AbstractBetterViewHolder createViewHolder(View parent, int type) {
    AbstractBetterViewHolder createdViewHolder;
    switch (type) {
      case CarViewHolder.LAYOUT:
        createdViewHolder = new CarViewHolder(parent);
        break;
      case DuckViewHolder.LAYOUT:
        createdViewHolder = new DuckViewHolder(parent);
        break;
      case MouseViewHolder.LAYOUT:
        createdViewHolder = new MouseViewHolder(parent);
        break;
      default:
        throw TypeNotSupportedException.create(String.format("LayoutType: %d", type));
    }
    return createdViewHolder;
  }
}
