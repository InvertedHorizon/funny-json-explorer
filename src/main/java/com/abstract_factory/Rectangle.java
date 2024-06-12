package com.abstract_factory;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Iterator;
import java.util.Map;

public class Rectangle extends StyleVisualJson{

    private int width=50;

    @Override
    public void visualizeJson(){
        String temp="┌";
        String post="";
        for(int i=0;i<width-temp.length()+1;i++){
            post+="─";
        }
        post+="┐";
        temp+=post;
        System.out.println(temp);

        draw(root,"","");

        String temp1="└";
        String post1="";
        for(int i=0;i<width-temp1.length()+1;i++){
            post1+="─";
        }
        post1+="┘";
        temp1+=post1;
        System.out.println(temp1);
    }

    private void draw(JsonNode node,String key,String pre){
        String newPre=pre;

        if(!key.isEmpty()){
            String temp="";
            temp+=pre;
            temp+="├─ ";

            newPre+="│  ";

            if(node.isValueNode()){
                temp+=iconFamily.getLeaf();
            }else{
                temp+=iconFamily.getMiddle();
            }
            temp+=key;

            if(node.isValueNode()&&!node.isNull()){    
                temp+=": ";
                temp+=node.asText();
            }
            String post=" ";
            for(int i=0;i<width-temp.length();i++){
                post+="─";
            }
            post+="┤";
            temp+=post;
            System.out.println(temp);
        }
        if(node.isObject()){
            Iterator<Map.Entry<String,JsonNode>> fields=node.fields();
            while(fields.hasNext()){
                Map.Entry<String,JsonNode> field=fields.next();
                draw(field.getValue(),field.getKey(),newPre);
            }
        }
    }
}
