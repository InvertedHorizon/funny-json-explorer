package com.builder;

public class ConcreteBuilder2 extends Builder{
    @Override
    public void buildStyleVisual(){
        this.product.setStyleVisual(new Rectangle());
    }    
    @Override
    public void buildIcon(){
        this.product.setIconFamily(new WeatherIconFamily());
    }
}
