package com.bluebox.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RouteDetailActivity extends AppCompatActivity {

    DatabaseOperation db=new DatabaseOperation(this);
    TextView busname;
    ListView stopname;
    public  static ArrayList<String> arraybuslist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_detail);
        getSupportActionBar().setTitle("Route Detail");

        stopname=findViewById(R.id.stopname);
        busname=findViewById(R.id.busname);
        busname.setText(getIntent().getStringExtra("busname"));
        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arraybuslist);
        stopname.setAdapter(adapter);
        Cursor cus=db.getrouteDetail(Integer.parseInt(getIntent().getStringExtra("busid")) );
        arraybuslist.clear();
        while (cus.moveToNext())
        {

            arraybuslist.add(" * " + cus.getString(1) + "\n");


        }


    }
}
