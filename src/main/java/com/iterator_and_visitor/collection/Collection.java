package com.iterator_and_visitor.collection;

import com.iterator_and_visitor.iterator.Iterator;

public interface Collection {
    Iterator createIterator();
}
