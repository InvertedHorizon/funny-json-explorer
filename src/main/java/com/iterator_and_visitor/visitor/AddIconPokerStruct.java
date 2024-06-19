package com.iterator_and_visitor.visitor;

import com.iterator_and_visitor.element.Container;
import com.iterator_and_visitor.element.Leaf;

public class AddIconPokerStruct implements AddOthers{
    public void addToPrefix(Container container){
        String old=container.getPrefix();
        container.setPrefix(old+"方块");
    }
    public void addToPrefix(Leaf leaf){
        String old=leaf.getPrefix();
        leaf.setPrefix(old+"桃心");
    }
    public void addToPostfix(Container container){}
    public void addToPostfix(Leaf leaf){}
    
}
