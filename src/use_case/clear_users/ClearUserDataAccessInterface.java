package use_case.clear_users;
import java.util.Map;

import entity.User;

public interface ClearUserDataAccessInterface {
    Map<String, User> clear();
}
