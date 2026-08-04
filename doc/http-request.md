
# HttpRequest

Class for creating and managing HTTP Requests.

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getHttpMethod()` | HttpMethod for the http request. | `HttpMethod` |
| `getHeaders()` | Headers for the http request. | [`Headers`](../doc/headers.md) |
| `getQueryUrl()` | Query url for the http request. | `String` |
| `getParameters()` | Parameters for the http request. | `List<SimpleEntry<String, Object>>` |
| `getQueryParameters()` | Query parameters for the http request. | `Map<String, Object>` |
| `addQueryParameter(String key, Object value)` | Add Query parameter in http request. | `void` |

## Static Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromHttpServletRequest(Map<String, List<String>> headersMap, Map<String, String[]> parameterMap, StringBuffer requestURL, String queryString, String method, Object body)` | Creates a new HttpRequest instance from HttpServletRequest-style request parameters. | `HttpRequest` |
| `fromSpringRequest(Map<String, List<String>> headersMap, String method, Object body, String url)` | Creates a new HttpRequest instance from SpringRequest-style request parameters. | `HttpRequest` |

