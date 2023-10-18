package use_case.clear_users;


import entity.User;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class ClearOutputData {
    private final Map<String, User> clearedUsers;

    private final List<String> deletedUsers;

    public ClearOutputData(Map<String, User> clearedUsers){
        this.clearedUsers = clearedUsers;
        this.deletedUsers = new ArrayList<>(clearedUsers.keySet());
    }

    public List<String> getClearedUsers(){
        return deletedUsers;
    }
}
