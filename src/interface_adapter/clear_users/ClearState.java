package interface_adapter.clear_users;


import entity.User;

import java.util.Map;

public class ClearState {
    private Map<String, User> clearedUsers;

    public ClearState(ClearState copy){
        this.clearedUsers = copy.clearedUsers;
    }

    public ClearState(){}

    public Map<String, User> getClearedUsers(){
        return clearedUsers;
    }

    public void setClearedUsers(Map<String, User> clearedUsers){
        this.clearedUsers = clearedUsers;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, User> entry : clearedUsers.entrySet()){
            sb.append(entry.getKey()).append("\n");
        }
        return sb.toString();
    }
}
