package org.youtwo.betteradapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.Arrays;
import java.util.List;
import org.youtwo.betteradapter.adapter.BetterAdapter_Visitor;
import org.youtwo.betteradapter.adapter.TypeFactory;
import org.youtwo.betteradapter.adapter.TypeFactoryForList;
import org.youtwo.betteradapter.adapter.Visitable;
import org.youtwo.betteradapter.entities.Car;
import org.youtwo.betteradapter.entities.Duck;
import org.youtwo.betteradapter.entities.Mouse;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.recycler_view)
  RecyclerView recyclerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    TypeFactory typeFactory = new TypeFactoryForList();
    List<Visitable> elementList = Arrays.asList(
        new Car("Mercedes", 625),
        new Duck(),
        new Duck(),
        new Mouse("Mickey"),
        new Duck(),
        new Duck(),
        new Mouse("Not-Donald"),
        new Duck(),
        new Duck(),
        new Mouse("Mini"),
        new Car("Clownscar", 10)
    );

    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    recyclerView.setAdapter(new BetterAdapter_Visitor(
        elementList,
        typeFactory
    ));
  }
}
