package io.camunda.getstarted;

import io.camunda.zeebe.client.ZeebeClient;

public class ZeebeClientFactory {

    public static ZeebeClient getZeebeClient() {
        return ZeebeClient.newClientBuilder().usePlaintext().build(); // for self-managed camunda 8
    }

}
