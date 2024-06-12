package com.factory_method;

public class RectangleFactory implements StyleVisualFactory{
    public StyleVisualJson createStyleVisual(){
        return new Rectangle();
    }
}
