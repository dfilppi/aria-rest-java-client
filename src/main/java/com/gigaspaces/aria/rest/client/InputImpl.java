package com.gigaspaces.aria.rest.client;

/**
 * Created by DeWayne on 7/17/2017.
 */
public class InputImpl implements Input {
    private String name, description, value;

    public InputImpl(){}

    public InputImpl(String name,String value,String description){
        if(name==null || value==null){
            throw new IllegalArgumentException("null argument supplied");
        }
        this.name=name;
        this.value=value;
        if(description!=null)this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getValue() {
        return value;
    }

}
