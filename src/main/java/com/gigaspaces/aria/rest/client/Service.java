package com.gigaspaces.aria.rest.client;

import java.util.Date;

/**
 * Created by DeWayne on 7/12/2017.
 */
public interface Service {
    int getId();
    String getDescription();
    String getName();
    String getServiceTemplate();
    Date getCreated();
    Date getUpdated();
}
