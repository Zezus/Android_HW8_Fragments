package com.example.hw8_fragments;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.UUID;

/**
 * Created by СадвакасовР on 04.04.2018.
 */

public class Item implements Parcelable {

    public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {

        @Override
        public Item createFromParcel(Parcel source) {
            return new Item(source);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };
    private UUID id;
    private String name;
    private String title;
    private float coast;

    public Item() {
    }

    public Item(Parcel in) {
        String[] data = new String[4];
        in.readStringArray(data);
        data[0] = id.toString();
        data[1] = name;
        data[2] = title;
        data[3] = String.valueOf(coast);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCoast() {
        return coast;
    }

    public void setCoast(float coast) {
        this.coast = coast;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{id.toString(), name, title, String.valueOf(coast)});
    }
}
