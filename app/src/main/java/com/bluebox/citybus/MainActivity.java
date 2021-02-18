package com.bluebox.citybus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseOperation db=new DatabaseOperation(this);
    Button busroute,findroute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        boolean del=db.Delete_bus();
        boolean del2=db.Delete_stop();
        boolean res=db.Add_Bus();
        boolean res2=db.Add_Stop();
        busroute=findViewById(R.id.busroute);
        findroute=findViewById(R.id.findbus);

        busroute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BusRouteActivity.class);
                startActivity(intent);
            }
        });
        findroute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FindRouteActivity.class);
                startActivity(intent);
            }
        });
        if(res)
        {
            Toast.makeText(this, "Bus Added Successfully", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Bus Add Not Successfully", Toast.LENGTH_SHORT).show();
        }
        if(res2)
        {
            Toast.makeText(this, "Stop Successfully Added", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Stop Not Successfully Added", Toast.LENGTH_SHORT).show();
        }
    }
}
