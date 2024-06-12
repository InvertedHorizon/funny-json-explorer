package com.factory_method;
import com.fasterxml.jackson.databind.JsonNode;
public abstract class StyleVisualJson {
    protected JsonNode root;
    protected IconFamily iconFamily;

    public void setJsonRoot(JsonNode root){
        this.root=root;
    }
    public void setIconFamily(IconFamily iconFamily){
        this.iconFamily=iconFamily;
    }
    abstract void visualizeJson();
}
