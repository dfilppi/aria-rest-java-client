package com.gigaspaces.aria.rest.client;

import com.gigaspaces.aria.rest.client.exceptions.StorageException;
import com.gigaspaces.aria.rest.client.exceptions.ValidationException;

import java.net.URL;
import java.util.List;

/**
 * Created by DeWayne on 7/12/2017.
 */
public class AriaRestClient implements AriaClient {
    public void install_service_template(ServiceTemplate template) throws ValidationException, StorageException {
        
    }

    public ValidationResult validate_service_template(ServiceTemplate template) throws ValidationException {
        return null;
    }

    public void delete_service_template(int template_id) throws IllegalArgumentException {

    }

    public List<NodeTemplate> get_nodes(int template_id) {
        return null;
    }

    public NodeTemplate get_node(int template_id, int node_id) throws IllegalArgumentException {
        return null;
    }

    public List<Service> get_services() {
        return null;
    }

    public Service get_service(int service_id) throws IllegalArgumentException {
        return null;
    }

    public List<Output> get_service_outputs(int service_id) throws IllegalArgumentException {
        return null;
    }

    public List<Input> get_service_inputs(int service_id) throws IllegalArgumentException {
        return null;
    }

    public Service create_service(String service_name, List<Input> inputs, int template_id) throws Exception {
        return null;
    }

    public void delete_service(int service_id) throws IllegalArgumentException {

    }

    public List<Workflow> list_workflows(int service_id) throws IllegalArgumentException {
        return null;
    }

    public Workflow get_workflow(int workflow_id) throws IllegalArgumentException {
        return null;
    }

    public List<Execution> list_executions() throws Exception {
        return null;
    }

    public List<Execution> list_executions(int service_id) throws Exception {
        return null;
    }

    public Execution get_execution(int execution_id) throws IllegalArgumentException {
        return null;
    }

    public Execution start_execution(int service_id, String workflow_name, ExecutionDetails details) throws IllegalArgumentException {
        return null;
    }

    public void resume_execution(int execution_id, ExecutionDetails details) throws IllegalArgumentException {

    }

    public void cancel_execution(int execution_id) throws IllegalArgumentException {

    }

    public AriaRestClient(URL server_address) {

    }
}
