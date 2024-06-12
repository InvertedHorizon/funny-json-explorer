package com.factory_method;

public class TreeFactory implements StyleVisualFactory{
    public StyleVisualJson createStyleVisual(){
        return new Tree();
    }    
}
