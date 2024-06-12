package com.factory_method;

public class PokerIconFamily implements IconFamily{
    public String getMiddle(){
        return "(方块)";
    }
    public String getLeaf(){
        return "(黑桃)";
    }
}
