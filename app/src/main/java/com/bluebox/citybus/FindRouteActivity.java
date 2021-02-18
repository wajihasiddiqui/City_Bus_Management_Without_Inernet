package com.bluebox.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FindRouteActivity extends AppCompatActivity {
    Bus bus;
    AutoCompleteTextView startpoint,endpoint;
    public static ArrayList<String> list=new ArrayList<>();
    Button btnsearch;
    DatabaseOperation db=new DatabaseOperation(this);
    public  static ArrayList<Bus> arraybuslist=new ArrayList<>();
    ListView searchlist;
    BusAdapter busAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_route);
        getSupportActionBar().setTitle("Find Buses");
        startpoint=findViewById(R.id.startpoint);
        endpoint=findViewById(R.id.endpoint);
        btnsearch=findViewById(R.id.btnsearch);
        searchlist=findViewById(R.id.searchlist);
        ArrayAdapter adapter;
        adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        ArrayAdapter adapter2;
        adapter2 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        startpoint.setAdapter(adapter);
        endpoint.setAdapter(adapter2);


        busAdapter=new BusAdapter(this,arraybuslist);
        searchlist.setAdapter(busAdapter);

        Cursor cus=db.getroutes();
        list.clear();
        while (cus.moveToNext())
        {

            list.add(cus.getString(1));


        }

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String spoint=startpoint.getText().toString().trim();
                String epoint=endpoint.getText().toString().trim();
                Cursor cus = null;
                if(!spoint.equals("") && !epoint.equals(""))
                {
                    cus=db.getbothSearch(spoint,epoint);
                }
                if(!spoint.equals("") && epoint.equals(""))
                {
                    cus=db.getstartSearch(spoint);
                }
                if(spoint.equals("") && !epoint.equals(""))
                {
                    cus=db.getendSearch(epoint);
                }

                arraybuslist.clear();
                while (cus.moveToNext())
                {
                    String busid=cus.getString(0);
                    String busname=cus.getString(1);
                    String busroute=cus.getString(2);

                    bus=new Bus(busid,busname,busroute);
                    arraybuslist.add(bus);
                    busAdapter.notifyDataSetChanged();      }


            }
        });
        searchlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(FindRouteActivity.this,RouteDetailActivity.class);
                intent.putExtra("busid",arraybuslist.get(position).getBus_id());
                intent.putExtra("busname",arraybuslist.get(position).getBus_name());
                startActivity(intent);
           }
        });

    }
}
