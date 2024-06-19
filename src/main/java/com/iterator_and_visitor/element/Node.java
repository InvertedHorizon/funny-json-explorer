package com.iterator_and_visitor.element;
import com.iterator_and_visitor.visitor.*;

public abstract class Node {
    protected String key;
    protected boolean First=false;
    protected boolean Last=false;
    protected String prefix="";
    protected String postfix="";

    public Node(String key) {
        this.key = key;
    }
    
    public void setFirst(boolean First){
        this.First=First;
    }
    public void setLast(boolean Last){
        this.Last=Last;
    }
    public boolean isFirst(){
        return First;
    }
    public boolean isLast(){
        return Last;
    }
    public void setPrefix(String newStr){
        this.prefix=newStr;
    }
    public String getPrefix(){
        return prefix;
    }
    
    public abstract boolean isContainer();
    public abstract boolean isLeaf();
    
    public void accept(AddOthers a){
        // System.out.println("NNNNN");
    }
}
