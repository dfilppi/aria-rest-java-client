package com.gigaspaces.aria.rest.client;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by DeWayne on 7/18/2017.
 */
public class NodeTemplateImpl implements NodeTemplate {
    private int id;
    private String name;
    private String description="";
    @JsonProperty("service_template_id")
    private int service_template_id;
    @JsonProperty("type_name")
    private String type_name="";

    public NodeTemplateImpl(){}

    public NodeTemplateImpl(int id, String name, String description, int service_template_id, String type_name){
        this.id=id;
        this.description=description;
        this.service_template_id=service_template_id;
        this.type_name=type_name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getServiceTemplateId() {
        return service_template_id;
    }

    public String getTypeName() {
        return type_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
