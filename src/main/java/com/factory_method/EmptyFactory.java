package com.factory_method;

public class EmptyFactory implements IconFactory{
    public IconFamily createIconFamily(){
        return new EmptyIconFamily();
    }
}
