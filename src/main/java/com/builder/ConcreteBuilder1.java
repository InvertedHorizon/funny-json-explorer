package com.builder;

public class ConcreteBuilder1 extends Builder{
    @Override
    public void buildStyleVisual(){
        this.product.setStyleVisual(new Tree());
    }    
    @Override
    public void buildIcon(){
        this.product.setIconFamily(new PokerIconFamily());
    }
}
