//Author ---> Yashwanth Anand S
package com.yash.upgrad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
Array List uses dynamic array for storing the elements.
Its like array but it has no size limit.
We can add or remove elements anytime.
ArrayList inherits AbstractList class which implements List Interface which again inherits Collections and extends Iterable

Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.

 */

public class ArrayListBasics {
    public static void main(String[] args) {
        //Initialize an arraylist
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


        //Add an element through index in arraylist
        list.add(2,"Lee");
        System.out.println(list);
        //Printing the arraylist object
        System.out.println("Displaying Array List Objects");
        System.out.println(list);

        //Traversing list through Iterator
        System.out.println("Displaying Array List Objects Using Iterator");
        Iterator itr = list.iterator();//getting the Iterator
        while (itr.hasNext()) {//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }

        //Traversing list through for-each loop
        System.out.println("Displaying Array List Objects Using for each loop");
        for (String players : list) {
            System.out.println(players);

        }

        //Changing an element in arraylist
        list.set(0,"Sachin");
        System.out.println(list);

        //Remove an element in arraylist
        list.remove("Sachin");
        System.out.println(list);

        //Remove an element through index in arraylist
        list.remove(2);
        System.out.println(list);

        //ArrayList Size
        System.out.println("Size of elements in ArrayList"+list.size());

        //Sort ArrayList
        Collections.sort(list);
        System.out.println("Sort elements in ArrayList(Ascending)"+list);


        /* Sorting in decreasing order*/
        Collections.sort(list, Collections.reverseOrder());

        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for(String str: list){
            System.out.println(str);
        }
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Gilchrist");//Adding object in arraylist
        list1.add("Hayden");
        list1.add("Kevin");
        list1.add("Collingwood");
        list1.add("Rhodes");
        list1.add("Warne");
        list1.add("Muralidharan");

        System.out.println("Second Array list"+list1);

        //Append list with list1
        list.addAll(list1);

        System.out.println("Two list print"+list);

        //Adding ArrayList2 in ArrayList1 at 3rd position(index =2)
        list.addAll(2, list1);
        System.out.println("ArrayList1 after adding ArrayList2 at 3rd Pos:\n"+list);

        //Sublist to ArrayList
        ArrayList<String> innerlist1 = new ArrayList<String>(list.subList(1, 4));
        System.out.println("SubList stored in ArrayList: "+innerlist1);


        System.out.println("Last occurrence of element 1: "+list.lastIndexOf("Dravid"));

        System.out.println("First element of the ArrayList: "+list.get(0));

        System.out.println("Index of 'AB': "+list.indexOf("AB"));

        System.out.println("'Kohli' is present in arraylist: "+list.contains("Kohli"));

    }
}
