package com.iterator_and_visitor.element;

import com.iterator_and_visitor.visitor.AddOthers;

public class Leaf extends Node{
    private String value="";
    public Leaf(String key,String value){
        super(key);
        this.value=value;
    }
    public String getKey(){
        return this.key;
    }
    public String getValue(){
        return this.value;
    }
    public boolean isLeaf(){
        return true;
    }
    public boolean isContainer(){
        return false;
    }
    public void accept(AddOthers a){
        // System.out.println("LLLLL");
        a.addToPrefix(this);
        a.addToPostfix(this);
    }
}
