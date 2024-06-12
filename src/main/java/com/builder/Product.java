package com.builder;

import com.fasterxml.jackson.databind.JsonNode;

public class Product {
    private StyleVisualJson styleVisual;
    public void setStyleVisual(StyleVisualJson styleVisualJson){
        this.styleVisual=styleVisualJson;
    }
    public void setIconFamily(IconFamily iconFamily){
        this.styleVisual.setIconFamily(iconFamily);
    }
    public void show(JsonNode root){
        this.styleVisual.setJsonRoot(root);
        this.styleVisual.visualizeJson();
    }   
}
