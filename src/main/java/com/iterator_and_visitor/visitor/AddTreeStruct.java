package com.iterator_and_visitor.visitor;

import com.iterator_and_visitor.element.Container;
import com.iterator_and_visitor.element.Leaf;

public class AddTreeStruct implements AddOthers{
    
    public void addToPrefix(Container container){
        // System.out.println("ADDTOPREFIX_CONTAINER");
        if(container.isLast()){
            String old=container.getPrefix();
            container.setPrefix(old+"└─");
            int length=container.getChildren().size();
            for(int i=0;i<length;i++){
                container.getChildren().get(i).setPrefix(old+"   ");
            }
        }else{
            String old=container.getPrefix();
            container.setPrefix(old+"├─");
            int length=container.getChildren().size();
            for(int i=0;i<length;i++){
                container.getChildren().get(i).setPrefix(old+"│  ");
            }
        }
    }
    public void addToPrefix(Leaf leaf){
        // System.out.println("ADDTOPREFIX_LEAF");
        if(leaf.isLast()){
            String old=leaf.getPrefix();
            leaf.setPrefix(old+"└─");
        }else{
            String old=leaf.getPrefix();
            leaf.setPrefix(old+"├─");
        }
    }
    public void addToPostfix(Container c){}
    public void addToPostfix(Leaf l){}
}
