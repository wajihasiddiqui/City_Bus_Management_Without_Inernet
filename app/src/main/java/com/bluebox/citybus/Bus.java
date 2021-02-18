package com.bluebox.citybus;
public class Bus {

    String bus_id,bus_name,bus_route;

    public Bus(String bus_id, String bus_name, String bus_route) {
        this.bus_id = bus_id;
        this.bus_name = bus_name;
        this.bus_route = bus_route;
    }

    public String getBus_id() {
        return bus_id;
    }

    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }

    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public String getBus_route() {
        return bus_route;
    }

    public void setBus_route(String bus_route) {
        this.bus_route = bus_route;
    }
}
