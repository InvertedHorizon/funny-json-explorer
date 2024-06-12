package com.abstract_factory;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Iterator;
import java.util.Map;

public class Tree extends StyleVisualJson{
    @Override
    public void visualizeJson(){
        draw(this.root,"","",true);
    }

    private void draw(JsonNode node,String prefix,String key,boolean isLast){
        String newPrefix=prefix;
        if(!key.isEmpty()){
            System.out.print(prefix);
            if(isLast){
                System.out.print("└─");
                newPrefix+="   ";
            }else{
                System.out.print("├─");
                newPrefix+="│  ";
            }
            
            if(node.isValueNode()){
                System.out.print(this.iconFamily.getLeaf());
            }else{
                System.out.print(this.iconFamily.getMiddle());
            }
            System.out.print(key);

            if(node.isValueNode()&&!node.isNull()){    
                System.out.print(": "+node.asText());
            }

            System.out.println();
        }

        if(node.isObject()){
            Iterator<Map.Entry<String,JsonNode>> fields=node.fields();
            while(fields.hasNext()){
                Map.Entry<String,JsonNode> field=fields.next();
                boolean last=!fields.hasNext();
                draw(field.getValue(),newPrefix,field.getKey(),last);
            }
        } 
        // else if (node.isArray()) {
        //     Iterator<JsonNode> elements = node.elements();
        //     int index = 0;
        //     int size = node.size();
        //     while (elements.hasNext()) {
        //         JsonNode element = elements.next();
        //         boolean last = index == size - 1;
        //         draw(element, newPrefix, "[" + index + "]", last);
        //         index++;
        //     }
        // }
    }
}
