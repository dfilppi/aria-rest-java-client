package com.gigaspaces.aria.rest.client;

/**
 * Created by DeWayne on 7/12/2017.
 */
public interface Execution {
    int getExecutionId();
    String getWorkflowName();
    String getServiceTemplateName();
    String getServiceName();
    String getStatus();
}
