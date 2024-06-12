package com.abstract_factory;

public class TreeWeatherFactory implements StyleAndIconFactory {
    public StyleVisualJson createStyleVisual(){
        return new Tree();
    }
    public IconFamily createIconFamily(){
        return new WeatherIconFamily();
    }
}
