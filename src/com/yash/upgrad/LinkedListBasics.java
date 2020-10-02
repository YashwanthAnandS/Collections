//Author ---> Yashwanth Anand S
package com.yash.upgrad;


/*
LinkedList class uses a doubly linked list(we can add or remove elements from both sides) to store the elements.
It provides a linked-list data structure.
It inherits the AbstractList class and implements List and Deque interfaces.

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
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

        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println("Linked List Elements through Iterator"+itr.next());
        }

        //For Each Loop
        for(String str:list){
            System.out.println(str);
        }

        //Adding an element at the specific position
        list.add(1, "Gawaskar");
        System.out.println("After invoking add(int index, E element) method: "+list);


        LinkedList<String> list2=new LinkedList<String>();
        list2.add("Stuart");
        list2.add("Steve");

        //Adding second list elements to the first list
        list.addAll(list2);

        //Adding an element at the first position
        list.addFirst("Raina");

        //Adding an element at the last position
        list.addLast("Jadeja");

        //Removing specific element from arraylist
        list.remove("Saini");
        System.out.println("After invoking remove(object) method: "+list);
        //Removing element on the basis of specific position
        list.remove(0);
        System.out.println("After invoking remove(index) method: "+list);

        //Removing first element from the list
        list.removeFirst();
        System.out.println("After invoking removeFirst() method: "+list);
        //Removing first element from the list
        list.removeLast();
        System.out.println("After invoking removeLast() method: "+list);


        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Virat");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Amit");

        //Removing first occurrence of element from the list
        ll.removeFirstOccurrence("Gaurav");
        System.out.println("After invoking removeFirstOccurrence() method: "+ll);
        //Removing last occurrence of element from the list
        ll.removeLastOccurrence("Harsh");
        System.out.println("After invoking removeLastOccurrence() method: "+ll);
        ll.clear();
        System.out.println("After invoking clear() method: "+ll);

        LinkedList<String> list3=new LinkedList<String>();
        list3.add("Ravi");
        list3.add("Vijay");
        list3.add("Ajay");
        //Traversing the list of elements in reverse order
        Iterator itr1=list3.descendingIterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
