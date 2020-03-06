package huuhien.dao;

import huuhien.model.Login;
import huuhien.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(30);
        u1.setName("huu hien");
        u1.setAccount("huuhien");
        u1.setEmail("huuhien@mail.mail.mail");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(30);
        u2.setName("hong son");
        u2.setAccount("hongson");
        u2.setEmail("hongson@gmail.com.vn.qn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(30);
        u3.setName("anh tuan");
        u3.setAccount("anhtuan");
        u3.setEmail("anhtuan@gmail.com.vn.hu");
        u3.setPassword("123456");
        users.add(u3);

        User u4 = new User();
        u4.setAge(30);
        u4.setName("TuanChan");
        u4.setAccount("tuanchan");
        u4.setEmail("TuanChan@gmail.com.vn.qt");
        u4.setPassword("123456");
        users.add(u4);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getTaiKhoan()) && u.getPassword().equals(login.getMatKhau())) {
                return u;
            }
        }
        return null;
    }
}
