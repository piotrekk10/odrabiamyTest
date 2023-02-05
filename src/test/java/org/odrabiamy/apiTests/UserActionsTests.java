package org.odrabiamy.apiTests;

import org.junit.jupiter.api.Test;
import org.odrabiamy.model.User;
import org.odrabiamy.steps.RestAssuredSteps;
import org.odrabiamy.utils.UniqueIdUtils;

public class UserActionsTests extends BaseSetupRestAssured {

    private int id = UniqueIdUtils.getUniqueId();
    private String username = "username" + id;
    private String password = "password" + id;
    private User user = new User(id, username, password);
    RestAssuredSteps restAssuredSteps = new RestAssuredSteps();

    @Test
    public void updateDataOnNewUser() {
        restAssuredSteps.createUser(user);
        restAssuredSteps.logUserIntoSystem();
        restAssuredSteps.updateUser();
    }
}
