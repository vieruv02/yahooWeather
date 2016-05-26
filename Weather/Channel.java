//Channel.java
package com.example.vladislav.weather.data;

import org.json.JSONObject;

/**
 * Created by Vladislav on 5/23/2016.
 */
public class Channel implements JSONPopulator {

    private Units units;
    private Item item;

    public Units getUnits(){
        return units;
    }

    public Item getItem(){
        return item;
    }

    public void populate(JSONObject data){

        units = new Units();
        item.populate(data.optJSONObject("units"));

        item= new Item();
        item.populate(data.optJSONObject("items"));
    }
}