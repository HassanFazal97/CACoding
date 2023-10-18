package interface_adapter.clear_users;

import java.util.List;

public class ClearState {
    private List<String> clearedUsers;

    public ClearState(ClearState copy){
        this.clearedUsers = copy.clearedUsers;
    }

    public ClearState(){}

    public List<String> getClearedUsers(){
        return clearedUsers;
    }

    public void setClearedUsers(List<String> clearedUsers){
        this.clearedUsers = clearedUsers;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String username: clearedUsers){
            sb.append(username).append("\n");
        }
        return sb.toString();
    }
}
