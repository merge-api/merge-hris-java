
import merge_hris_client.ApiClient;
import merge_hris_client.ApiException;
import merge_hris_client.Configuration;
import merge_hris_client.auth.*;
import merge_hris_client.model.PaginatedTimeOffList;
import merge_hris_client.api.TimeOffApi;
import merge_hris_client.model.RequestTypeEnum;
import merge_hris_client.model.TimeOff;


public class EnumDeprecationExample {
    public static void main(String[] args) {
        // Configure API client
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        tokenAuth.setApiKeyPrefix("Bearer");

        // Make a request to the TimeOff endpoint
        TimeOffApi apiInstance = new TimeOffApi(defaultClient);
        String xAccountToken = "xAccountToken_example";
        String employeeId = "employeeId_example";
        Integer pageSize = 20;
        try {
            PaginatedTimeOffList result = apiInstance.timeOffList(xAccountToken, null, null, null, null, employeeId, true, null, null, pageSize, null);
            if (result.getResults() != null) {
                for (TimeOff timeOff: result.getResults()) {

                    // Deprecated Usage of Enum
                    if (timeOff.getRequestType() == RequestTypeEnum.SICK) {
                        System.out.format("Employee with ID %s took %f days off sick", employeeId, timeOff.getAmount());
                    }

                    // New approach
                    if (timeOff.getRequestType().equals("SICK")) {
                        System.out.format("Employee with ID %s took %f days off sick", employeeId, timeOff.getAmount());
                    }
                }
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeOffApi#timeOffList");
            e.printStackTrace();
        }
    }
}