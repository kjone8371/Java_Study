package minDB.User;

import java.util.HashMap;

public class User {
    private HashMap<String, String> userInfo = new HashMap<>();

    public void addInfo(String name, String info) {
        userInfo.put(name, info);
    }

    public String getInfo(String name) {
        return userInfo.get(name);
    }

    public HashMap<String, String> getAllInfo() {
        return userInfo;
    }
}
