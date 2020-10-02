//Author ---> Yashwanth Anand S
package com.yash.upgrad;

/*
Java HashSet class is used to create a collection that uses a hash table for storage.
 It inherits the AbstractSet class and implements Set interface.

HashSet stores the elements by using a mechanism called hashing.(Hashing is implemented in two steps: An element is converted into an integer by using a hash function. This element can be used as an index to store the original element, which falls into the hash table. The element is stored in the hash table where it can be quickly retrieved using hashed key.)
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.


 */


import java.util.HashSet;

public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Dhoni");//Adding object in linkedlist
        set.add("Kohli");
        set.add("Dravid");
        set.add("Ganguly");
        set.add("Samson");
        set.add("Pant");
        set.add("Stokes");
        set.add("Faf");
        set.add("AB");
        set.add("Saini");
        set.add("Sundar");
        set.add("Laxman");
        set.add("Ponting");
        set.add("Fleming");
        set.add("Astle");
        set.add("Mccullum");

        //Displaying HashSet elements
        System.out.println(set);

        //Removing specific element from HashSet
        set.remove("Astle");

        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);

        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);

        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: "+set);

        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);



    }
}
