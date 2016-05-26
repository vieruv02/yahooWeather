//Condition.java
package com.example.vladislav.weather.data;

import org.json.JSONObject;

/**
 * Created by Vladislav on 5/23/2016.
 */
public class Condition implements JSONPopulator {

    private int code;
    private int temperature;
    private String description;


    public int getCode(){
        return code;
    }
    public int getTemperature(){
        return temperature;
    }
    public String getDescription(){
        return description;
    }


    public void populate(JSONObject data){

        code = data.optInt("code");
        temperature = data.optInt("temp");
        description = data.optString("text");
    }
}
