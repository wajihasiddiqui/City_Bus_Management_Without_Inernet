package com.bluebox.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;

import java.util.ArrayList;

public class BusRouteActivity extends AppCompatActivity {

    ListView showroute;
    DatabaseOperation db=new DatabaseOperation(this);
    Bus bus;
    BusAdapter busAdapter;
    public  static ArrayList<Bus> arraybuslist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_route);
        getSupportActionBar().hide();
        showroute=findViewById(R.id.routelist);
        busAdapter=new BusAdapter(this,arraybuslist);
        showroute.setAdapter(busAdapter);

        Cursor cus=db.getroute();
        arraybuslist.clear();
        while (cus.moveToNext())
        {

            String busid=cus.getString(0);
            String busname=cus.getString(1);
            String busroute=cus.getString(2);

            bus=new Bus(busid,busname,busroute);
            arraybuslist.add(bus);
            busAdapter.notifyDataSetChanged();
        }

        showroute.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(BusRouteActivity.this,RouteDetailActivity.class);
                intent.putExtra("busid",arraybuslist.get(position).getBus_id());
                intent.putExtra("busname",arraybuslist.get(position).getBus_name());
                startActivity(intent);
                Toast.makeText(BusRouteActivity.this, arraybuslist.get(position).getBus_id(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
