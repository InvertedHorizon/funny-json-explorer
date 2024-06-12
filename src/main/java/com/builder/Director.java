package com.builder;

public class Director {
    private Builder builder;
    Director(Builder builder){
        this.builder=builder;
    }
    public Product construct(){
        builder.buildStyleVisual();
        builder.buildIcon();
        return builder.getResult();
    }
}
