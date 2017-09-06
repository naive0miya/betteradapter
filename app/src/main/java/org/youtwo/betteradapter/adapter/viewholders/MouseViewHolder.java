package org.youtwo.betteradapter.adapter.viewholders;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import org.youtwo.betteradapter.R;
import org.youtwo.betteradapter.entities.Mouse;

/**
 * Created by Bill on 2017/9/6.
 */

public class MouseViewHolder extends AbstractBetterViewHolder<Mouse> {
  @LayoutRes
  public static final int LAYOUT = R.layout.viewholder_mouse;

  @BindView(R.id.viewholder_mouse_name)
  TextView name;

  public MouseViewHolder(View itemView) {
    super(itemView);
  }

  @Override
  public void bind(Mouse mouse) {
    name.setText(mouse.getName());
  }
}
