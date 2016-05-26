//Units.java
package com.example.vladislav.weather.data;

import org.json.JSONObject;

/**
 * Created by Vladislav on 5/23/2016.
 */
public class Units implements JSONPopulator {

    private String temperature;

    public String getTemperature(){
        return temperature;
    }


    public void populate(JSONObject data){
        temperature = data.optString("temperature");
    }
}