package com.iterator_and_visitor.visitor;

import com.iterator_and_visitor.element.Container;
import com.iterator_and_visitor.element.Leaf;

public interface AddOthers {
    public void addToPrefix(Container container);
    public void addToPrefix(Leaf leaf);
    public void addToPostfix(Container container);
    public void addToPostfix(Leaf leaf);
}
