package arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(int i = 0 ; i< list.size();i++){
            System.out.println(list.get(i)); // list[i] 아님!!
        }

        // enhanced
        for(String s : list){
            System.out.println(s);
        }
    }
}
