package com.gigaspaces.aria.rest.client;

import java.net.URL;

/**
 * Created by DeWayne on 7/12/2017.
 */
public class AriaClientFactory {

    AriaClient createRestClient(URL server_address){
        return new AriaRestClient(server_address);
    }
}
