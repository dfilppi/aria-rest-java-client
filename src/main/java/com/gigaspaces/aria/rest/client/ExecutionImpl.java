package com.gigaspaces.aria.rest.client;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by DeWayne on 7/17/2017.
 */
public class ExecutionImpl implements Execution {
    @JsonProperty("execution_id")
    int execution_id;
    @JsonProperty("workflow_name")
    String workflow_name;
    @JsonProperty("service_template_name")
    String service_template_name;
    @JsonProperty("service_name")
    String service_name;
    String status;

    public int getExecutionId() {
        return execution_id;
    }
    public String getWorkflowName() {
        return workflow_name;
    }

    public String getServiceTemplateName() {
        return service_template_name;
    }

    public String getServiceName() {
        return service_name;
    }

    public String getStatus() {
        return status;
    }
}
