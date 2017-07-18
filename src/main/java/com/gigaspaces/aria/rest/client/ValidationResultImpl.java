package com.gigaspaces.aria.rest.client;

/**
 * Created by DeWayne on 7/17/2017.
 */
public class ValidationResultImpl implements ValidationResult {
    private boolean failed=false;

    public void setFailed(boolean failed){
        this.failed=failed;
    }
    public boolean getFailed() {
        return failed;
    }
}
