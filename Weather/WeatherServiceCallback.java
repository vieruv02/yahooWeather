//WeatherServiceCallback.java
package com.example.vladislav.weather.service;

import com.example.vladislav.weather.data.Channel;

/**
 * Created by Vladislav on 5/23/2016.
 */
public interface WeatherServiceCallback {

    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);
}