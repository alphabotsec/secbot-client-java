package com.alphabot.secbot.client.v0.codegen;

import com.alphabot.secbot.client.v0.ApiClient;

import com.alphabot.secbot.client.v0.codegen.model.TestRunApiResponse;
import com.alphabot.secbot.client.v0.codegen.model.TestRunApiStartResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


@Component("com.alphabot.secbot.client.v0.codegen.SecBotApi")
public class SecBotApi {
    private ApiClient apiClient;

    public SecBotApi() {
        this(new ApiClient());
    }

    @Autowired
    public SecBotApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param projectId The projectId parameter
     * @param environmentId The environmentId parameter
     * @return TestRunApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestRunApiResponse getLastTestRun(String projectId, String environmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getLastTestRun");
        }
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getLastTestRun");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("projectId", projectId);
        uriVariables.put("environmentId", environmentId);
        String path = UriComponentsBuilder.fromPath("/Api/v0/Project/{projectId}/Env/{environmentId}/LastRun").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Bearer" };

        ParameterizedTypeReference<TestRunApiResponse> returnType = new ParameterizedTypeReference<TestRunApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param projectId The projectId parameter
     * @param environmentId The environmentId parameter
     * @param testRunId The testRunId parameter
     * @return TestRunApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestRunApiResponse getTestRunById(String projectId, String environmentId, String testRunId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getTestRunById");
        }
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling getTestRunById");
        }
        
        // verify the required parameter 'testRunId' is set
        if (testRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'testRunId' when calling getTestRunById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("projectId", projectId);
        uriVariables.put("environmentId", environmentId);
        uriVariables.put("testRunId", testRunId);
        String path = UriComponentsBuilder.fromPath("/Api/v0/Project/{projectId}/Env/{environmentId}/Run/{testRunId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Bearer" };

        ParameterizedTypeReference<TestRunApiResponse> returnType = new ParameterizedTypeReference<TestRunApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param projectId The projectId parameter
     * @param environmentId The environmentId parameter
     * @return TestRunApiStartResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TestRunApiStartResponse startTestRun(String projectId, String environmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling startTestRun");
        }
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling startTestRun");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("projectId", projectId);
        uriVariables.put("environmentId", environmentId);
        String path = UriComponentsBuilder.fromPath("/Api/v0/Project/{projectId}/Env/{environmentId}/start").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Bearer" };

        ParameterizedTypeReference<TestRunApiStartResponse> returnType = new ParameterizedTypeReference<TestRunApiStartResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
