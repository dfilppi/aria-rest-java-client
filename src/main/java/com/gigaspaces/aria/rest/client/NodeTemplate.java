package com.gigaspaces.aria.rest.client;

/**
 * Created by DeWayne on 7/12/2017.
 */
public interface NodeTemplate {
    int getId();
    String getName();
    String getDescription();
    int getServiceTemplateId();
    String getTypeName();
}
