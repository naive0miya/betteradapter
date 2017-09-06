package org.youtwo.betteradapter.entities;

import org.youtwo.betteradapter.adapter.TypeFactory;
import org.youtwo.betteradapter.adapter.Visitable;

/**
 * Created by Bill on 2017/9/6.
 */

public class Car implements Visitable {
  private final String manufacturer;
  private final int powerInPs;

  public Car(String manufacterer, int powerInPs) {
    this.manufacturer = manufacterer;
    this.powerInPs = powerInPs;
  }

  @Override
  public int type(TypeFactory typeFactory) {
    return typeFactory.type(this);
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getPowerInPs() {
    return powerInPs;
  }
}
