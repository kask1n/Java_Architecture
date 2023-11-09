package HW12_Architect;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupUserTest {

    @org.junit.jupiter.api.Test
    void getUserList() {
        User user1 = new User("Анастасия");
        User user2 = new User("Алексей");
        User user3 = new User("Владимир");
        User user4 = new User("Марина");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        GroupUser groupUser = new GroupUser(userList);
        assertEquals(userList, groupUser.getUserList());
    }

    @org.junit.jupiter.api.Test
    void findList() {
        User user1 = new User("Анастасия");
        User user2 = new User("Алексей");
        User user3 = new User("Владимир");
        User user4 = new User("Марина");
//        User user5 = new User("Кирилл");  // Для UNIT-теста
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
//        userList.add(user5);  // Для UNIT-теста
        GroupUser groupUser = new GroupUser(userList);
        assertEquals(null, groupUser.findList("Кирилл"));
    }

    @org.junit.jupiter.api.Test
    void addUser() {
        User user1 = new User("Анастасия");
        User user2 = new User("Алексей");
        User user3 = new User("Владимир");
        User user4 = new User("Марина");
        List<User> userList = new ArrayList<>();
        List<User> userListTest = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userListTest.add(user1);
        userListTest.add(user2);
        GroupUser groupUser = new GroupUser(userList);
        groupUser.addUser(user3);
        groupUser.addUser(user4);
        userListTest.add(user3);  // Для UNIT-теста
        userListTest.add(user4);  // Для UNIT-теста
        System.out.println(userList);
        System.out.println(groupUser.getUserList());
        assertEquals(userListTest, groupUser.getUserList());
    }
}
