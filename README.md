# SecBot Java Client (under development)

Automatically generated Java based client for the [SecBot](https://secbot.com/) REST API. Please note that the SecBot API is currently under development and might change anytime.

## Requirements

Java 1.8 or later.
Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.alphabot.secbot</groupId>
    <artifactId>secbot-client-java</artifactId>
    <version>0.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.alphabot.secbot:secbot-client-java:0.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/secbot-client-java-0.0.1.jar
* target/lib/*.jar


## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.alphabot.secbot.client.v0.*;
import com.alphabot.secbot.client.v0.auth.*;
import com.alphabot.secbot.client.v0.codegen.model.*;
import com.alphabot.secbot.client.v0.codegen.ApiApi;

import java.io.File;
import java.util.*;

public class ApiApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = new ApiClient().setBasePath("https://PATH_TO_YOUR_SECBOT_INSTACE");
        
        // Configure API key authorization: Bearer
        ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setApiKey("YOUR API KEY");
        Bearer.setApiKeyPrefix("Bearer");

        ApiApi apiInstance = new ApiApi();
        String projectId = "projectId_example"; // String | 
        String environmentId = "environmentId_example"; // String | 
        String testRunId = "testRunId_example"; // String | 
        try {
            TestRunApiResponse result = apiInstance.getTestRunById(projectId, environmentId, testRunId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#getTestRunById");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiApi* | [**getTestRunById**](docs/ApiApi.md#getTestRunById) | **GET** /Api/v0/Project/{projectId}/Env/{environmentId}/Run/{testRunId} | 
*ApiApi* | [**startTestRun**](docs/ApiApi.md#startTestRun) | **POST** /Api/v0/Project/{projectId}/Env/{environmentId}/start | 


## Documentation for Models

 - [TestRunApiResponse](docs/TestRunApiResponse.md)
 - [TestRunApiStartResponse](docs/TestRunApiStartResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

(c) 2017 [Alphabot Security](https://www.alphabot.com/)

