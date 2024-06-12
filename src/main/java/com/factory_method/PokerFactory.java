package com.factory_method;

public class PokerFactory implements IconFactory{
    public IconFamily createIconFamily(){
        return new PokerIconFamily();
    }
}
