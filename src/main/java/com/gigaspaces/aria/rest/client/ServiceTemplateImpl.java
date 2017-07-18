package com.gigaspaces.aria.rest.client;

import java.net.URI;

/**
 * CSAR based implementation
 *
 * Created by DeWayne on 7/17/2017.
 */
public class ServiceTemplateImpl implements ServiceTemplate {
    public static final String DEFAULT_TEMPLATE_NAME = "service-template.yaml";
    private String name;
    private int id;
    private URI uri;
    private String filename = DEFAULT_TEMPLATE_NAME;
    private String description;

    public ServiceTemplateImpl(){}

    public ServiceTemplateImpl(String name, URI uri){
        this.name=name;
        this.uri=uri;
    }

    /**
     * Construct an instance
     * @param name a textual name for the template
     * @param uri a URI to a CSAR
     * @param filename the filename in the CSAR representing main yaml template
     */
    public ServiceTemplateImpl(String name, URI uri, String filename, String description){
        this.name=name;
        this.uri=uri;
        this.filename=filename;
        this.description=description;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public URI getURI() {
        return uri;
    }
    public void setPath(String path){
        this.uri=uri;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename){
        this.filename=filename;
    }

    public String getDescription(){ return description;}
}
