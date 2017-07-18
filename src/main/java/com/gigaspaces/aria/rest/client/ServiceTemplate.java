package com.gigaspaces.aria.rest.client;

import java.net.URI;

/**
 * Created by DeWayne on 7/12/2017.
 */
public interface ServiceTemplate {
    String getName();
    URI getURI();
    int getId();
    String getFilename();
    String getDescription();
}
