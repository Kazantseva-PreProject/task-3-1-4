package apiclient;


import apiclient.apiClient.RestApiClient;

public class Application {
    public static void main(String[] args) {
        RestApiClient client = new RestApiClient();
        String code = client.performAllTasks();
        System.out.println("Final Code: " + code);
    }
}
