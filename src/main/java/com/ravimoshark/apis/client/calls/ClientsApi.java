/*
 * Ravimoshark Client API
 * This is an API to interact with Ravimoshark client database. # Introduction This API allow to create, modify and delete addresses and clients. # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.client.calls;

import com.ravimoshark.apis.client.ApiCallback;
import com.ravimoshark.apis.client.ApiClient;
import com.ravimoshark.apis.client.ApiException;
import com.ravimoshark.apis.client.ApiResponse;
import com.ravimoshark.apis.client.Configuration;
import com.ravimoshark.apis.client.Pair;
import com.ravimoshark.apis.client.ProgressRequestBody;
import com.ravimoshark.apis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ravimoshark.apis.client.model.Clients;
import com.ravimoshark.apis.client.model.CustomError;
import com.ravimoshark.apis.client.model.Deleted;
import com.ravimoshark.apis.client.model.IdInteger;
import com.ravimoshark.apis.client.model.InlineResponse2001;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientsApi {
    private ApiClient apiClient;

    public ClientsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClientsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addClient
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addClientCall(Clients body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/clients";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addClientValidateBeforeCall(Clients body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addClient(Async)");
        }
        
        com.squareup.okhttp.Call call = addClientCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add one client.
     * Add one client.
     * @param body  (required)
     * @return Clients
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Clients addClient(Clients body) throws ApiException {
        ApiResponse<Clients> resp = addClientWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add one client.
     * Add one client.
     * @param body  (required)
     * @return ApiResponse&lt;Clients&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Clients> addClientWithHttpInfo(Clients body) throws ApiException {
        com.squareup.okhttp.Call call = addClientValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Clients>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add one client. (asynchronously)
     * Add one client.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addClientAsync(Clients body, final ApiCallback<Clients> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addClientValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Clients>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteClient
     * @param refClient id to delete or search (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteClientCall(String refClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/clients/{refClient}"
            .replaceAll("\\{" + "refClient" + "\\}", apiClient.escapeString(refClient.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteClientValidateBeforeCall(String refClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'refClient' is set
        if (refClient == null) {
            throw new ApiException("Missing the required parameter 'refClient' when calling deleteClient(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteClientCall(refClient, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete one client.
     * Delete one client.
     * @param refClient id to delete or search (required)
     * @return IdInteger
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdInteger deleteClient(String refClient) throws ApiException {
        ApiResponse<IdInteger> resp = deleteClientWithHttpInfo(refClient);
        return resp.getData();
    }

    /**
     * Delete one client.
     * Delete one client.
     * @param refClient id to delete or search (required)
     * @return ApiResponse&lt;IdInteger&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdInteger> deleteClientWithHttpInfo(String refClient) throws ApiException {
        com.squareup.okhttp.Call call = deleteClientValidateBeforeCall(refClient, null, null);
        Type localVarReturnType = new TypeToken<IdInteger>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete one client. (asynchronously)
     * Delete one client.
     * @param refClient id to delete or search (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteClientAsync(String refClient, final ApiCallback<IdInteger> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteClientValidateBeforeCall(refClient, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdInteger>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for editClient
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editClientCall(Clients body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/clients";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call editClientValidateBeforeCall(Clients body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling editClient(Async)");
        }
        
        com.squareup.okhttp.Call call = editClientCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit one client.
     * Edit one client.
     * @param body  (required)
     * @return Clients
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Clients editClient(Clients body) throws ApiException {
        ApiResponse<Clients> resp = editClientWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Edit one client.
     * Edit one client.
     * @param body  (required)
     * @return ApiResponse&lt;Clients&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Clients> editClientWithHttpInfo(Clients body) throws ApiException {
        com.squareup.okhttp.Call call = editClientValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Clients>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit one client. (asynchronously)
     * Edit one client.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editClientAsync(Clients body, final ApiCallback<Clients> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = editClientValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Clients>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getClientById
     * @param refClient id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getClientByIdCall(String refClient, Deleted deleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/clients/{refClient}"
            .replaceAll("\\{" + "refClient" + "\\}", apiClient.escapeString(refClient.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (deleted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deleted", deleted));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getClientByIdValidateBeforeCall(String refClient, Deleted deleted, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'refClient' is set
        if (refClient == null) {
            throw new ApiException("Missing the required parameter 'refClient' when calling getClientById(Async)");
        }
        
        com.squareup.okhttp.Call call = getClientByIdCall(refClient, deleted, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get one client.
     * Get one client.
     * @param refClient id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @return Clients
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Clients getClientById(String refClient, Deleted deleted) throws ApiException {
        ApiResponse<Clients> resp = getClientByIdWithHttpInfo(refClient, deleted);
        return resp.getData();
    }

    /**
     * Get one client.
     * Get one client.
     * @param refClient id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @return ApiResponse&lt;Clients&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Clients> getClientByIdWithHttpInfo(String refClient, Deleted deleted) throws ApiException {
        com.squareup.okhttp.Call call = getClientByIdValidateBeforeCall(refClient, deleted, null, null);
        Type localVarReturnType = new TypeToken<Clients>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get one client. (asynchronously)
     * Get one client.
     * @param refClient id to delete or search (required)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getClientByIdAsync(String refClient, Deleted deleted, final ApiCallback<Clients> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getClientByIdValidateBeforeCall(refClient, deleted, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Clients>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getClients
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getClientsCall(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/clients";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderBy", orderBy));
        if (filterBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterBy", filterBy));
        if (deleted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deleted", deleted));
        if (metadata != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("metadata", metadata));
        if (refClient != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("refClient", refClient));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getClientsValidateBeforeCall(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getClientsCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all clients.
     * Get all clients.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2001 getClients(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient) throws ApiException {
        ApiResponse<InlineResponse2001> resp = getClientsWithHttpInfo(skip, limit, orderBy, filterBy, deleted, metadata, refClient);
        return resp.getData();
    }

    /**
     * Get all clients.
     * Get all clients.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2001> getClientsWithHttpInfo(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient) throws ApiException {
        com.squareup.okhttp.Call call = getClientsValidateBeforeCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all clients. (asynchronously)
     * Get all clients.
     * @param skip number of item to skip (optional)
     * @param limit max records to return (optional)
     * @param orderBy order by property. (optional)
     * @param filterBy filter data. (optional)
     * @param deleted Get all, deleted, not deleted data. Default not deleted. (optional)
     * @param metadata If metadata is needed (for pagination controls) (optional)
     * @param refClient Data from a desired client (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getClientsAsync(Integer skip, Integer limit, String orderBy, String filterBy, Deleted deleted, Boolean metadata, String refClient, final ApiCallback<InlineResponse2001> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getClientsValidateBeforeCall(skip, limit, orderBy, filterBy, deleted, metadata, refClient, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
