package com.function;

import com.function.form.LogRequest;
import com.function.services.LogService;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

/**
 * Azure Functions with HTTP Trigger.
 */
public class Function {

    /*
     * Metodo de GET
     * 
     * @FunctionName("logevents") public HttpResponseMessage run(@HttpTrigger(name =
     * "req", methods = { HttpMethod.GET }, authLevel =
     * AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
     * final ExecutionContext context) {
     * context.getLogger().info("Request Recebido...");
     * 
     * LogService logService = new LogService();
     * 
     * return
     * request.createResponseBuilder(HttpStatus.OK).body(logService.getLogs()).build
     * (); }
     */

    @FunctionName("logevents")
    public HttpResponseMessage run(@HttpTrigger(name = "req", methods = {
            HttpMethod.POST }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<LogRequest>> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");

        LogRequest taskRequest = request.getBody().get();
        LogService logService = new LogService();

        if (taskRequest == null) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST)
                    .body("Please pass a name on the query string or in the request body").build();
        } else {
            return request.createResponseBuilder(HttpStatus.OK).body(logService.createLog(taskRequest)).build();
        }
    }
}
