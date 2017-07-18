package com.gigaspaces.aria.rest.client;

import java.net.URL;

/**
 * Created by DeWayne on 7/12/2017.
 */
public class AriaClientFactory {

    AriaClient createRestClient(String protocol, String address, int port, String version){
        return new AriaRestClient(protocol, address, port, version);
    }
}
