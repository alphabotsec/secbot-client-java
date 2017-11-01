# SecBotApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLastTestRun**](SecBotApi.md#getLastTestRun) | **GET** /Api/v0/Project/{projectId}/Env/{environmentId}/LastRun | 
[**getTestRunById**](SecBotApi.md#getTestRunById) | **GET** /Api/v0/Project/{projectId}/Env/{environmentId}/Run/{testRunId} | 
[**startTestRun**](SecBotApi.md#startTestRun) | **POST** /Api/v0/Project/{projectId}/Env/{environmentId}/start | 


<a name="getLastTestRun"></a>
# **getLastTestRun**
> TestRunApiResponse getLastTestRun(projectId, environmentId)



### Example
```java
// Import classes:
//import com.alphabot.secbot.client.v0.ApiClient;
//import com.alphabot.secbot.client.v0.ApiException;
//import com.alphabot.secbot.client.v0.Configuration;
//import com.alphabot.secbot.client.v0.auth.*;
//import com.alphabot.secbot.client.v0.codegen.SecBotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SecBotApi apiInstance = new SecBotApi();
String projectId = "projectId_example"; // String | 
String environmentId = "environmentId_example"; // String | 
try {
    TestRunApiResponse result = apiInstance.getLastTestRun(projectId, environmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecBotApi#getLastTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **environmentId** | **String**|  |

### Return type

[**TestRunApiResponse**](TestRunApiResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTestRunById"></a>
# **getTestRunById**
> TestRunApiResponse getTestRunById(projectId, environmentId, testRunId)



### Example
```java
// Import classes:
//import com.alphabot.secbot.client.v0.ApiClient;
//import com.alphabot.secbot.client.v0.ApiException;
//import com.alphabot.secbot.client.v0.Configuration;
//import com.alphabot.secbot.client.v0.auth.*;
//import com.alphabot.secbot.client.v0.codegen.SecBotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SecBotApi apiInstance = new SecBotApi();
String projectId = "projectId_example"; // String | 
String environmentId = "environmentId_example"; // String | 
String testRunId = "testRunId_example"; // String | 
try {
    TestRunApiResponse result = apiInstance.getTestRunById(projectId, environmentId, testRunId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecBotApi#getTestRunById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **environmentId** | **String**|  |
 **testRunId** | **String**|  |

### Return type

[**TestRunApiResponse**](TestRunApiResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startTestRun"></a>
# **startTestRun**
> TestRunApiStartResponse startTestRun(projectId, environmentId)



### Example
```java
// Import classes:
//import com.alphabot.secbot.client.v0.ApiClient;
//import com.alphabot.secbot.client.v0.ApiException;
//import com.alphabot.secbot.client.v0.Configuration;
//import com.alphabot.secbot.client.v0.auth.*;
//import com.alphabot.secbot.client.v0.codegen.SecBotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SecBotApi apiInstance = new SecBotApi();
String projectId = "projectId_example"; // String | 
String environmentId = "environmentId_example"; // String | 
try {
    TestRunApiStartResponse result = apiInstance.startTestRun(projectId, environmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecBotApi#startTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **environmentId** | **String**|  |

### Return type

[**TestRunApiStartResponse**](TestRunApiStartResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

