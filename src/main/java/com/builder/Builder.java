package com.builder;

public abstract class Builder {
    protected Product product;
    Builder(){
        product=new Product();
    }
    public Product getResult(){
        return this.product;
    }
    public abstract void buildStyleVisual();
    public abstract void buildIcon();
}
