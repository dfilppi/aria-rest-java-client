package com.gigaspaces.aria.rest.client;

import com.gigaspaces.aria.rest.client.exceptions.StorageException;
import com.gigaspaces.aria.rest.client.exceptions.ValidationException;

import java.util.List;

/**
 * Created by DeWayne on 7/12/2017.
 */
public interface AriaClient {

    /**
     * Installs a service template
     *
     * @param template
     * @throws ValidationException
     * @throws StorageException
     */
    public void install_service_template( ServiceTemplate template)throws ValidationException, StorageException;

    /**
     * Validate a service template
     * @param template
     * @return
     */
    public ValidationResult validate_service_template( ServiceTemplate template)throws ValidationException;

    /**
     * Delete an existing template
     *
     * @param template_id
     * @throws IllegalArgumentException
     */
    public void delete_service_template(int template_id) throws IllegalArgumentException;

    /**
     * Returns a list of node templates for a given service template
     * @param template_id
     * @return
     */
    List<NodeTemplate> get_nodes(int template_id);

    /**
     * Fetch a given node template
     *
     * @param template_id
     * @param node_id
     * @return
     * @throws IllegalArgumentException
     */
    public NodeTemplate get_node(int template_id, int node_id) throws IllegalArgumentException;

    /**
     * List all services
     *
     * @return
     */
    public List<Service> get_services();

    /**
     * Fetch the specified service
     *
     * @param service_id
     * @return
     * @throws IllegalArgumentException
     */
    public Service get_service(int service_id) throws IllegalArgumentException;

    /**
     * Fetch the outputs of the specified service
     *
     * @param service_id
     * @return
     * @throws IllegalArgumentException
     */
    public List<Output> get_service_outputs(int service_id) throws IllegalArgumentException;

    /**
     * Fetch the inputs of the specified service
     *
     * @param service_id
     * @return
     * @throws IllegalArgumentException
     */
    public List<Input> get_service_inputs(int service_id) throws IllegalArgumentException;

    /**
     * Create a service
     *
     * @param service_name
     * @param inputs
     * @param template_id
     * @return
     * @throws Exception
     */
    public Service create_service(String service_name, List<Input> inputs, int template_id)throws Exception;

    /**
     * Delete the specified service
     *
     * @param service_id
     * @throws IllegalArgumentException
     */
    public void delete_service(int service_id)throws IllegalArgumentException;

    /**
     * List workflows for the provided service
     *
     * @param service_id
     * @return
     * @throws IllegalArgumentException
     */
    public List<Workflow> list_workflows(int service_id)throws IllegalArgumentException;

    /**
     * Fetch the specified workflow
     *
     * @param workflow_id
     * @return the requested Workflow
     * @throws IllegalArgumentException when the workflow_id doesn't exist
     */
    public Workflow get_workflow(int workflow_id)throws IllegalArgumentException;

    /**
     * List all executions
     *
     * @return
     * @throws Exception
     */
    public List<Execution> list_executions()throws Exception;

    /**
     * List executions for provided service
     *
     * @param service_id
     * @return
     * @throws Exception
     */
    public List<Execution> list_executions(int service_id)throws Exception;

    /**
     * Fetch the specified execution
     *
     * @param execution_id
     * @return
     * @throws IllegalArgumentException
     */
    public Execution get_execution(int execution_id)throws IllegalArgumentException;

    /**
     * Starts an execution
     *
     * @param service_id
     * @param workflow_name
     * @param details
     * @return
     * @throws IllegalArgumentException
     */
    public Execution start_execution(int service_id, String workflow_name, ExecutionDetails details)throws IllegalArgumentException;

    /**
     * Resumes an interrupted execution
     *
     * @param execution_id
     * @param details
     * @throws IllegalArgumentException
     */
    public void resume_execution(int execution_id, ExecutionDetails details)throws IllegalArgumentException;

    /**
     * Cancels the specified execution
     *
     * @param execution_id
     * @throws IllegalArgumentException
     */
    public void cancel_execution(int execution_id)throws IllegalArgumentException;
}
