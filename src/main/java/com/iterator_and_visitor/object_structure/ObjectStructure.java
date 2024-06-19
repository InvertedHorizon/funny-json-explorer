package com.iterator_and_visitor.object_structure;
import com.iterator_and_visitor.element.*;
import com.iterator_and_visitor.iterator.Iterator;
import com.iterator_and_visitor.iterator.TreeDFSIterator;
import com.iterator_and_visitor.visitor.*;

import java.util.ArrayList;

public class ObjectStructure {
    // private ArrayList<Node> elements=new ArrayList<>();
    private Node root;
    public ObjectStructure(Node root){
        // Iterator iterator=new TreeDFSIterator(root);
        // while (iterator.hasNext()) {
        //     elements.add(iterator.next());
        // }
        this.root=root;
    }
    public void visit(AddOthers a){
        // int length=elements.size();
        // for(int i=0;i<length;i++){
        //     elements.get(i).accept(a);
        // }
        Iterator iterator=new TreeDFSIterator(root);
        while(iterator.hasNext()){
            iterator.next().accept(a);
        }
    }
}
