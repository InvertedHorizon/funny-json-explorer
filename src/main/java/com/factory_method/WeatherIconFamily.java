package com.factory_method;

public class WeatherIconFamily implements IconFamily{
    public String getMiddle(){
        return "(wind)";
    }
    public String getLeaf(){
        return "(sun)";
    }
}
