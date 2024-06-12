package com.abstract_factory;

public class WeatherIconFamily implements IconFamily{
    public String getMiddle(){
        return "(wind)";
    }
    public String getLeaf(){
        return "(sun)";
    }
}
