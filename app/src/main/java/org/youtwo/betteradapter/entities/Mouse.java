package org.youtwo.betteradapter.entities;

import org.youtwo.betteradapter.adapter.TypeFactory;

/**
 * Created by Bill on 2017/9/6.
 */

public class Mouse implements Animal {
  private final String name;

  public Mouse(String name) {
    this.name = name;
  }

  @Override
  public int type(TypeFactory typeFactory) {
    return typeFactory.type(this);
  }

  @Override
  public String getName() {
    return "Mimimi" + name;
  }
}
