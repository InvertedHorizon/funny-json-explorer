package com.iterator_and_visitor.iterator;

import java.util.Stack;

import com.iterator_and_visitor.element.Node;
import com.iterator_and_visitor.element.Container;
import com.iterator_and_visitor.element.Leaf;

public class TreeDFSIterator implements Iterator {
    private Stack<Node> stack=new Stack<>();
    public TreeDFSIterator(Node root){
        stack.push(root);
    }
    public boolean hasNext(){
        return !stack.empty();
    }
    public Node next(){
        if(stack.empty()){
            throw new RuntimeException("no elements!!!");
        }
        Node temp=stack.pop();
        if(temp.isContainer()){
            Container temp1=(Container)temp;
            int length=temp1.getChildren().size();
            for(int i=length-1;i>=0;i--){
                stack.push(temp1.getChildren().get(i));
            }
        }
        return temp;        
    }
}
