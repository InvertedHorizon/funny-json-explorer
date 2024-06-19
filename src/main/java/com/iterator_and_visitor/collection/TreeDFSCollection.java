package com.iterator_and_visitor.collection;

import com.iterator_and_visitor.element.Node;
import com.iterator_and_visitor.iterator.Iterator;
import com.iterator_and_visitor.iterator.TreeDFSIterator;

public class TreeDFSCollection implements Collection{
    private Node root;
    public TreeDFSCollection(Node root){
        this.root=root;
    }
    public Iterator createIterator(){
        Iterator iterator=new TreeDFSIterator(root);
        return iterator;
    }
}
