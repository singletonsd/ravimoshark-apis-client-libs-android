# AddressesApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAddress**](AddressesApi.md#addAddress) | **POST** /addresses | Add one address.
[**deleteAddress**](AddressesApi.md#deleteAddress) | **DELETE** /addresses/{id} | Delete one address.
[**editAddress**](AddressesApi.md#editAddress) | **PUT** /addresses | Edit one address.
[**getAddressById**](AddressesApi.md#getAddressById) | **GET** /addresses/{id} | Get one address.
[**getAddresses**](AddressesApi.md#getAddresses) | **GET** /addresses | Get all addresses.

<a name="addAddress"></a>
# **addAddress**
> Addresses addAddress(body)

Add one address.

Add one address.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.AddressesApi;


AddressesApi apiInstance = new AddressesApi();
Addresses body = new Addresses(); // Addresses | 
try {
    Addresses result = apiInstance.addAddress(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesApi#addAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Addresses**](Addresses.md)|  |

### Return type

[**Addresses**](Addresses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAddress"></a>
# **deleteAddress**
> IdInteger deleteAddress(id)

Delete one address.

Delete one address.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.AddressesApi;


AddressesApi apiInstance = new AddressesApi();
Long id = 789L; // Long | id to delete or search
try {
    IdInteger result = apiInstance.deleteAddress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesApi#deleteAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |

### Return type

[**IdInteger**](IdInteger.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editAddress"></a>
# **editAddress**
> Addresses editAddress(body)

Edit one address.

Edit one address.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.AddressesApi;


AddressesApi apiInstance = new AddressesApi();
Addresses body = new Addresses(); // Addresses | 
try {
    Addresses result = apiInstance.editAddress(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesApi#editAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Addresses**](Addresses.md)|  |

### Return type

[**Addresses**](Addresses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddressById"></a>
# **getAddressById**
> Addresses getAddressById(id, deleted)

Get one address.

Get one address.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.AddressesApi;


AddressesApi apiInstance = new AddressesApi();
Long id = 789L; // Long | id to delete or search
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
try {
    Addresses result = apiInstance.getAddressById(id, deleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesApi#getAddressById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id to delete or search |
 **deleted** | [**Deleted**](.md)| Get all, deleted, not deleted data. Default not deleted. | [optional]

### Return type

[**Addresses**](Addresses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAddresses"></a>
# **getAddresses**
> InlineResponse200 getAddresses(skip, limit, orderBy, filterBy, deleted, metadata, refClient)

Get all addresses.

Get all addresses.

### Example
```java
// Import classes:
//import com.ravimoshark.apis.client.ApiException;
//import com.ravimoshark.apis.client.calls.AddressesApi;


AddressesApi apiInstance = new AddressesApi();
Integer skip = 56; // Integer | number of item to skip
Integer limit = 56; // Integer | max records to return
String orderBy = "orderBy_example"; // String | order by property.
String filterBy = "filterBy_example"; // String | filter data.
Deleted deleted = new Deleted(); // Deleted | Get all, deleted, not deleted data. Default not deleted.
Boolean metadata = true; // Boolean | If metadata is needed (for pagination controls)
String refClient = "refClient_example"; // String | Data from a desired client
try {
    InlineResponse200 result = apiInstance.getAddresses(skip, limit, orderBy, filterBy, deleted, metadata, refClient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressesApi#getAddresses");
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

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

