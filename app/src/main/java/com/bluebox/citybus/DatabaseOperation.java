package com.bluebox.citybus;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseOperation extends SQLiteOpenHelper {
    public DatabaseOperation(@Nullable Context context) {
        super(context, "db_citybus",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table tbl_bus(bus_id integer primary key,bus_name varchar(250),bus_route varchar(250))");
        db.execSQL("create table tbl_stop(route_id integer primary key,stop_name varchar(250),bus_id integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean Delete_bus()
    {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("delete from tbl_bus");
        return true;
    }
    public boolean Delete_stop()
    {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("delete from tbl_stop");
        return true;
    }
    public boolean Add_Bus()
    {
        try {
            SQLiteDatabase db = getWritableDatabase();
            db.execSQL("insert into tbl_bus (bus_id,bus_name,bus_route) values (null,'D7','Sohrab Goth To Majeed Colony')");
            db.execSQL("insert into tbl_bus (bus_id,bus_name,bus_route) values (null,'U1','Manzoor Colony To Rasheedabad')");
            db.execSQL("insert into tbl_bus (bus_id,bus_name,bus_route) values (null,'D10','korangi 100 quarter To Taiser town')");
            db.execSQL("insert into tbl_bus (bus_id,bus_name,bus_route) values (null,'F16','Mianwali colony To Machine Tool Factory')");
            db.execSQL("insert into tbl_bus (bus_id,bus_name,bus_route) values (null,'F1','Saudabad To Nasir colony')");
            db.execSQL("insert into tbl_bus (bus_id,bus_name,bus_route) values (null,'Wali Afridi Coach','Orangi No.16 to Cantt')");
return true;
        }
        catch (Exception e)
        {
            return false;
        }

        }

    public boolean Add_Stop()
    {
        try {
            SQLiteDatabase db = getWritableDatabase();
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Sohrab Goth',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Gulshan Iqbal',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Nipa Chrowngi',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Johr Mour',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Drig Road',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Nata Khan',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Star Gate',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Malir',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Qaidabad',1)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Majeed Colony',1)");

            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Manzoor Colony',2)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Qaidabad',2)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'azam basti',2)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'corporation gate',2)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'kalapul',2)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'jinnah hospitall',2)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'empress markett',2)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Rasheedabad',2)");

            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'korangi 100 quarter',3)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'korangi no 5',3)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'landhi no 6',3)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'landhi no 1',3)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'dawood chowrangi',3)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Qaidabad',3)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'malir city',3)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Taiser town',3)");


            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Mianwali colony',4)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'qasba colony',4)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'banaras chowk',4)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'abdullah college',4)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'paposh nagar',4)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'abbasi shaheed hospital',4)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'nazimabad no 7',4)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'mujahid colony',4)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Machine Tool Factory',4)");

            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Saudabad',5)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Malir jinnah square',5)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'malir city',5)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'quaidabad',5)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'dawood chowrangi',5)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'babar market',5)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Nasir Colony',5)");

            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Orangi No.16',6)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Orangi No.7',6)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Qasba Mour',6)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Banaras Chowk',6)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Abdullah College',6)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Nazimabad Petrol Pump',6)");
            db.execSQL("insert into tbl_stop (route_id,stop_name,bus_id) values (null,'Cantt Station',6)");

            return true;
        }
        catch (Exception e)
        {
            return false;
        }

    }
    public Cursor getroute()
    {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from tbl_bus",null);
        return cursor;
    }
    public Cursor getrouteDetail(int busid)
    {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from tbl_stop where bus_id='"+busid+"'",null);
        return cursor;
    }
    public Cursor getroutes()
    {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from tbl_stop",null);
        return cursor;
    }
    public Cursor getbothSearch(String startpoint,String endpoint)
    {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from tbl_bus INNER JOIN tbl_stop on tbl_bus.bus_id=tbl_stop.bus_id where tbl_stop.stop_name Like'%"+startpoint+"%' or tbl_stop.stop_name Like'%"+endpoint+"%' ",null);
        return cursor;
    }
    public Cursor getstartSearch(String startpoint)
    {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from tbl_bus INNER JOIN tbl_stop on tbl_bus.bus_id=tbl_stop.bus_id where tbl_stop.stop_name Like'%"+startpoint+"%' ",null);

        return cursor;
    }
    public Cursor getendSearch(String endpoint)
    {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from tbl_bus INNER JOIN tbl_stop on tbl_bus.bus_id=tbl_stop.bus_id where tbl_stop.stop_name Like'%"+endpoint+"%' ",null);
        return cursor;
    }
}
