package com.abstract_factory;

public class RectanglePokerFactory implements StyleAndIconFactory{
    public StyleVisualJson createStyleVisual(){
        return new Rectangle();
    }
    public IconFamily createIconFamily(){
        return new PokerIconFamily();
    }
}
