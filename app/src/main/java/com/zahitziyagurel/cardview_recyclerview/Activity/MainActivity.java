package com.zahitziyagurel.cardview_recyclerview.Activity;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.zahitziyagurel.cardview_recyclerview.Adapter.SimpleRecyclerAdapter;
import com.zahitziyagurel.cardview_recyclerview.Interface.ICustomItemClickListener;
import com.zahitziyagurel.cardview_recyclerview.R;
import com.zahitziyagurel.cardview_recyclerview.Value.person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        manager.scrollToPosition(0);
        recyclerView.setLayoutManager(manager);
        personList = new ArrayList<>();

        personList.add(new person("Zahit Ziya GÜREL", "23 YAŞ", R.drawable.ziyagurel));
        SimpleRecyclerAdapter recyclerAdapter = new SimpleRecyclerAdapter(personList, new ICustomItemClickListener() {
            @Override
            public void onItemClick(View v, int possition) {
                Log.d("Position", "Tıklanan Pozisyon:" + possition);
                person person = personList.get(possition);
                Toast.makeText(getApplicationContext(),"pozisyon" + " " + possition+ "" + "Ad:" +  person.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
