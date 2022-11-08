package com.gongsi.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 张雷雷
 * 2022/11/7
 */
public class ListSort {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        User user1 =new User();
        user1.setField("ccc");
        user1.setFieldInt(1111);
        list.add(user1);

        User user2 =new User();
        user2.setField("aaa");
        user2.setFieldInt(222);
        list.add(user2);

        User user3 =new User();
        user3.setField("bbb");
        user3.setFieldInt(333);
        list.add(user3);
        System.out.println(list);

        list = list.stream().sorted(Comparator.comparing(user4 -> user4.field)).collect(Collectors.toList());
        System.out.println(list);
    }


//    User user1 = new User();


}
class User{
    String field;
    int fieldInt;

    @Override
    public String toString() {
        return "User{" +
                "field='" + field + '\'' +
                ", fieldInt=" + fieldInt +
                '}';
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getFieldInt() {
        return fieldInt;
    }

    public void setFieldInt(int fieldInt) {
        this.fieldInt = fieldInt;
    }

    public User(String field, int fieldInt) {
        this.field = field;
        this.fieldInt = fieldInt;
    }

    public User() {
    }
}