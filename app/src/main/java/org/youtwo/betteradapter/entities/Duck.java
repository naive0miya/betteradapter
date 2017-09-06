package org.youtwo.betteradapter.entities;

import android.annotation.SuppressLint;
import org.youtwo.betteradapter.adapter.TypeFactory;

/**
 * Created by Bill on 2017/9/6.
 */

public class Duck implements Animal {
  private static int instanceId = 0;
  private String name;
  private int duckNumber;

  @SuppressLint("DefaultLocale")
  public Duck() {
    duckNumber = ++instanceId;
    name = String.format("Duck-%d", duckNumber);
  }

  @Override
  public int type(TypeFactory typeFactory) {
    return typeFactory.type(this);
  }

  @Override
  public String getName() {
    return name;
  }

  public int getDuckNumber() {
    return duckNumber;
  }
}
