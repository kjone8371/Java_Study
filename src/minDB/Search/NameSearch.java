package minDB.Search;

import minDB.Filter.NameFilter;
import minDB.User.User;

import java.util.HashMap;

public class NameSearch {
    public static void searchName(User userInfo, String name) {
        HashMap<String, String> allInfo = userInfo.getAllInfo();
        String filteredName = NameFilter.filterName(name);
        String info = allInfo.get(filteredName);
        if (info != null) {
            System.out.println(filteredName + "의 정보: " + info);
        } else {
            System.out.println("해당하는 이름의 정보를 찾을 수 없습니다.");
        }
    }

    public static void searchAll(User userInfo) {
        HashMap<String, String> allInfo = userInfo.getAllInfo();
        System.out.println("전체 정보:");
        for (String name : allInfo.keySet()) {
            System.out.println(name + ": " + allInfo.get(name));
        }
    }
}
