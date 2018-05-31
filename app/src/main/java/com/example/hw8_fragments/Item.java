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
    private String coast;
    private int photo;


    public Item() {
    }

    public Item(Parcel in) {
        String[] data = new String[5];
        in.readStringArray(data);
        data[0] = id.toString();
        data[1] = name;
        data[2] = title;
        data[3] = coast;
        data[4] = String.valueOf(photo);
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

    public String getCoast() {
        return coast;
    }

    public void setCoast(String coast) {
        this.coast = coast;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{id.toString(), name, title, String.valueOf(coast), String.valueOf(photo)});
    }
}
