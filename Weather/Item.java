//Item.java
package com.example.vladislav.weather.data;

import org.json.JSONObject;

/**
 * Created by Vladislav on 5/23/2016.
 */
public class Item implements JSONPopulator {

    private Condition condition;

    public Condition getCondition(){
        return condition;
    }


    public void populate(JSONObject data){

        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));
    }
} 