package use_case.clear_users;


import entity.User;

import java.util.Map;

public class ClearOutputData {
    private final Map<String, User> clearedUsers;

    public ClearOutputData(Map<String, User> clearedUsers){
        this.clearedUsers = clearedUsers;
    }

    public Map<String, User> getClearedUsers(){
        return clearedUsers;
    }
}
