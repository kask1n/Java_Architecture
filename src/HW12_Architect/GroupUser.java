package HW12_Architect;

import java.util.ArrayList;
import java.util.List;

public class GroupUser {
    private List<User> userList;

    public GroupUser(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
//        return new ArrayList<>();  // Для UNIT-теста
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User findList(String name) {
        for (User user :
                userList) {
            if (user.getName().equals(name))
                return user;
        }
        return null;
    }

    public void addUser(User user) {
        userList.add(user);
    }

}
