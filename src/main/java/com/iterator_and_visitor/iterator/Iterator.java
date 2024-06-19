package com.iterator_and_visitor.iterator;

import com.iterator_and_visitor.element.Node;

public interface Iterator {
    boolean hasNext();
    Node next();
}
