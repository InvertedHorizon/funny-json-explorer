package com.iterator_and_visitor.draw;

import com.iterator_and_visitor.collection.Collection;
import com.iterator_and_visitor.collection.TreeDFSCollection;
import com.iterator_and_visitor.element.Container;
import com.iterator_and_visitor.element.Leaf;
import com.iterator_and_visitor.element.Node;
import com.iterator_and_visitor.iterator.Iterator;

public class Draw {
    public Draw(){}
    public void draw(Node root){
        Collection collection=new TreeDFSCollection(root);
        Iterator iterator=collection.createIterator();
        while(iterator.hasNext()){
            Node temp=iterator.next();
            if(temp.isContainer()){
                Container temp1=(Container) temp;
                String str=temp1.getPrefix()+temp1.getKey();
                // System.out.println("GET_PREFIX_IS: "+temp1.getPrefix());
                System.out.println(str);
            }else if(temp.isLeaf()){
                Leaf temp1=(Leaf) temp;
                String str=temp1.getPrefix()+temp1.getKey()+": "+temp1.getValue();
                // System.out.println("GET_PREFIX_IS: "+temp1.getPrefix());
                System.out.println(str);
            }
        }
    }
}
