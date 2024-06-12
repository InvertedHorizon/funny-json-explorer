package com.builder;
import com.fasterxml.jackson.databind.JsonNode;
public abstract class StyleVisualJson {
    protected JsonNode root;
    protected IconFamily iconFamily;
    StyleVisualJson(){
        iconFamily=new EmptyIconFamily();
    }
    public void setJsonRoot(JsonNode root){
        this.root=root;
    }
    public void setIconFamily(IconFamily iconFamily){
        this.iconFamily=iconFamily;
    }
    abstract void visualizeJson();
}
