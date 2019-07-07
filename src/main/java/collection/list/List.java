package collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class List {

    public static void main(String[] args) {
        int x = 0x7fffffff+1;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add(null);
        Object[] array = arrayList.toArray();
        String[] strings = {"d","x","a","e","f","q"};
        String[] array1 = arrayList.toArray(strings);
        int length = array1.length;
        System.out.println(array1[3]==null&&array1[4]==null);
        System.out.println("array:"+array);
        System.out.println("array1:"+array1);
        System.out.println(arrayList.toString());
        for (String s:arrayList) {
            System.out.println(s);
        }

        arrayList.forEach(s-> System.out.println(s));
        arrayList.stream().filter(s -> {
            return s.equals("aa");
        }).count();
    }
}
