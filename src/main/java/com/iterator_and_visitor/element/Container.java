package com.iterator_and_visitor.element;
import com.iterator_and_visitor.visitor.AddOthers;

import java.util.ArrayList;


public class Container extends Node{
    private ArrayList<Node> children=null;
    public Container(String key,ArrayList<Node> children){
        super(key);
        this.children=children;
    }
    public void addChild(Node child){
        children.add(child);
    }
    public ArrayList<Node> getChildren(){
        return this.children;
    }
    public String getKey(){
        return this.key;
    }
    public boolean isContainer(){
        return true;
    }
    public boolean isLeaf(){
        return false;
    }
    public void accept(AddOthers a){
        // System.out.println("CCCCC");
        a.addToPrefix(this);
        a.addToPostfix(this);
    }
}
