package com.factory_method;

public class WeatherFactory implements IconFactory{
    public IconFamily createIconFamily(){
        return new WeatherIconFamily();
    }
}
