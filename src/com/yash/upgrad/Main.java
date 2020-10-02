package com.yash.upgrad;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list = new ArrayList<String>();
        list.add("Dhoni");//Adding object in arraylist
        list.add("Kohli");
        list.add("Dravid");
        list.add("Ganguly");
        list.add("Samson");
        list.add("Pant");
        list.add("Stokes");
        list.add("Faf");
        list.add("AB");
        list.add("Saini");
        list.add("Sundar");
        list.add("Laxman");
        list.add("Ponting");
        list.add("Fleming");
        list.add("Astle");
        list.add("Mccullum");

        list.clear();
        System.out.println("list"+list);
        list.removeAll(list);
        System.out.println("removeAll list"+list);
    }
}
