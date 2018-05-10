package org.airsonic.test.api;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class PingStepDef implements En {

    public PingStepDef() {
        When("^A ping request is sent$", () -> {
            throw new PendingException();
        });
        Then("^A ping response is received$", () -> {
            throw new PendingException();
        });
    }

}
