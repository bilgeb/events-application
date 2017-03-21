package com.bb.events.app.evts.model.weather;

import com.bb.events.app.evts.model.City;
import com.bb.events.app.evts.util.Ignore;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bilge on 21/03/17.
 */
public class Response<T> {

    private final City city;
    private final int cod;
    private final Float message;
    private int cnt;

    @Ignore
    private final Object sys;

    @SerializedName("list")
    private T list;

    public Response(City city, int cod, Float message, int cnt, Object sys, T list) {
        this.city = city;
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.sys = sys;
        this.list = list;
    }

    public T getList() {
        return list;
    }

    public City getCity() {
        return city;
    }

    public void setList(T list) {
        this.list = list;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
