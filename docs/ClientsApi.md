# ClientsApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClient**](ClientsApi.md#addClient) | **POST** /clients | Add one client.
[**deleteClient**](ClientsApi.md#deleteClient) | **DELETE** /clients/{refClient} | Delete one client.
[**editClient**](ClientsApi.md#editClient) | **PUT** /clients | Edit one client.
[**getClientById**](ClientsApi.md#getClientById) | **GET** /clients/{refClient} | Get one client.
[**getClients**](ClientsApi.md#getClients) | **GET** /clients | Get all clients.

<a name="addClient"></a>
# **addClient**
> Clients addClient(body)

Add one client.

Add one client.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
Clients body = new Clients(); // Clients | 
try {
    Clients result = apiInstance.addClient(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#addClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Clients**](Clients.md)|  |

### Return type

[**Clients**](Clients.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClient"></a>
# **deleteClient**
> IdInteger deleteClient(refClient)

Delete one client.

Delete one client.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
String refClient = "refClient_example"; // String | id to delete or search
try {
    IdInteger result = apiInstance.deleteClient(refClient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#deleteClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refClient** | **String**| id to delete or search |

### Return type

[**IdInteger**](IdInteger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editClient"></a>
# **editClient**
> Clients editClient(body)

Edit one client.

Edit one client.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
Clients body = new Clients(); // Clients | 
try {
    Clients result = apiInstance.editClient(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#editClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Clients**](Clients.md)|  |

### Return type

[**Clients**](Clients.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientById"></a>
# **getClientById**
> Clients getClientById(refClient, deleted)

Get one client.

Get one client.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
String refClient = "refClient_example"; // String | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Clients result = apiInstance.getClientById(refClient, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getClientById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refClient** | **String**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Clients**](Clients.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClients"></a>
# **getClients**
> InlineResponse2001 getClients(skip, limit, orderBy, filterBy, deleted, metadata, refClient)

Get all clients.

Get all clients.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
String refClient = "refClient_example"; // String | Data from a desired client
try {
    InlineResponse2001 result = apiInstance.getClients(skip, limit, orderBy, filterBy, deleted, metadata, refClient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| number of item to skip | [optional]
 **limit** | **Integer**| max records to return | [optional]
 **orderBy** | **String**| order by property. | [optional]
 **filterBy** | **String**| filter data. | [optional]
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]
 **metadata** | **Boolean**| If metadata is needed (for pagination controls) | [optional]
 **refClient** | **String**| Data from a desired client | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

