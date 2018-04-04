package com.example.hw8_fragments;

import java.util.UUID;

/**
 * Created by СадвакасовР on 04.04.2018.
 */

public class Item {

    private UUID id;
    private String name;
    private String title;
    private float coast;

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
}
