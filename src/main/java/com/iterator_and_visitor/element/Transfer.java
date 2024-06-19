package com.iterator_and_visitor.element;
import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;

public class Transfer {
    public Node transfer(JsonNode root) {
        if (root == null) return null;
        Node newRoot=traverse(root, null);
        newRoot.setFirst(true);
        newRoot.setLast(true);
        return newRoot;
    }

    private Node traverse(JsonNode jsonNode, String key) {
        if (jsonNode.isObject() || jsonNode.isArray()) {
            ArrayList<Node> children = new ArrayList<>();
            Iterator<String> fieldNames = jsonNode.fieldNames();
            while (fieldNames.hasNext()) {
                String fieldName = fieldNames.next();
                JsonNode childNode = jsonNode.get(fieldName);
                Node newNode=traverse(childNode, fieldName);
                boolean last=!fieldNames.hasNext();
                newNode.setLast(last);
                children.add(newNode);
            }
            return new Container(key, children);
        } else {
            return new Leaf(key, jsonNode.asText());
        }
    }
}
