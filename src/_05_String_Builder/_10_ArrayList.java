package _05_String_Builder;

import java.util.ArrayList;

public class _10_ArrayList {
    public static void main(String[] args) {
        // Arraylist == dynamic Array

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println( list + " -> " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list + " => " + list.size());


        list.add(1 , 1000);
        System.out.println(list + "=>" +  list.size());


        int val = list.get(1); // not list[1[
        System.out.println(val);


        list.set(1, 2000);
        System.out.println(list + "=>" + list.size());


        list.remove(1);
        System.out.println(list +" =>" + list.size());


        // Arraylist for String
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Bello");
        l2.add("Cello");

        System.out.println(l2 + " => " + l2.size());

        for( int i = 0 ; i < l2.size() ; i++){
            String val1 = l2.get(i);
            System.out.println(val1);
        }


        for( int val5  :  list){
            System.out.println(list);
        }

        System.out.println(l2);



    }
}
