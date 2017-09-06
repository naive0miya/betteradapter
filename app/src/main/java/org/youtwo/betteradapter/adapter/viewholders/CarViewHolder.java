package org.youtwo.betteradapter.adapter.viewholders;

import android.annotation.SuppressLint;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import org.youtwo.betteradapter.R;
import org.youtwo.betteradapter.entities.Car;

/**
 * Created by Bill on 2017/9/6.
 */

public class CarViewHolder extends AbstractBetterViewHolder<Car> {
  @LayoutRes
  public static final int LAYOUT = R.layout.viewholder_car;

  @BindView(R.id.viewholder_car_name)
  TextView manufacturer;
  @BindView(R.id.viewholder_car_ps)
  TextView power;

  public CarViewHolder(View itemView) {
    super(itemView);
  }

  @SuppressLint("DefaultLocale")
  @Override
  public void bind(Car car) {
    manufacturer.setText(car.getManufacturer());
    power.setText(String.format("%d PS", car.getPowerInPs()));
  }
}
