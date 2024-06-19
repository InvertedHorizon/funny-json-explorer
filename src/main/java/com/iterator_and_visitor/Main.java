package com.iterator_and_visitor;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iterator_and_visitor.draw.Draw;
import com.iterator_and_visitor.element.Container;
import com.iterator_and_visitor.element.Leaf;
import com.iterator_and_visitor.element.Node;
import com.iterator_and_visitor.element.Transfer;
import com.iterator_and_visitor.iterator.Iterator;
import com.iterator_and_visitor.iterator.TreeDFSIterator;
import com.iterator_and_visitor.object_structure.ObjectStructure;
import com.iterator_and_visitor.visitor.AddIconPokerStruct;
import com.iterator_and_visitor.visitor.AddOthers;
import com.iterator_and_visitor.visitor.AddTreeStruct;

public class Main {
    public static void main(String[] args) {
        // String jsonString = "{ \"name\": \"John\", \"age\": 30, \"children\": [ { \"name\": \"Jane\", \"age\": 10 }, { \"name\": \"Jake\", \"age\": 8 } ] }";
        String filePath="./src/main/resources/data.json";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // 读取json文件转成node节点
            JsonNode jsonNode = objectMapper.readTree(new File(filePath));
            Transfer transfer = new Transfer();
            Node root = transfer.transfer(jsonNode);

            // 访问者模式对节点的前缀后缀进行修改
            AddOthers aaa=new AddTreeStruct();
            AddOthers bbb=new AddIconPokerStruct();
            ObjectStructure ooo=new ObjectStructure(root);
            ooo.visit(aaa);
            ooo.visit(bbb);

            // 画图，
            Draw ddd=new Draw();
            ddd.draw(root);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

