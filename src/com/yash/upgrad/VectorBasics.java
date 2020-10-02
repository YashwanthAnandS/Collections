//Author ---> Yashwanth Anand S

package com.yash.upgrad;

/*
Vector is like the dynamic array which can grow or shrink its size.
Unlike array, we can store n-number of elements in it as there is no size limit.
It is a part of Java Collection framework since Java 1.2.
It is found in the java.util package and implements the List interface, so we can use all the methods of List interface here.

It is recommended to use the Vector class in the thread-safe implementation only.
If you don't need to use the thread-safe implementation, you should use the ArrayList, the ArrayList will perform better in such case.

The Iterators returned by the Vector class are fail-fast.
In case of concurrent modification, it fails and throws the ConcurrentModificationException.

Vector implements List Interface.
Like ArrayList it also maintains insertion order but it is rarely used in non-thread environment as it is synchronized and due to which it gives poor performance in searching, adding, delete and update of its elements.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
Method 1:

Vector vec = new Vector();
It creates an empty Vector with the default initial capacity of 10. It means the Vector will be re-sized when the 11th elements needs to be inserted into the Vector. Note: By default vector doubles its size. i.e. In this case the Vector size would remain 10 till 10 insertions and once we try to insert the 11th element It would become 20 (double of default capacity 10).

Method 2:
Syntax:    Vector object= new Vector(int initialCapacity)

It will create a Vector of initial capacity of 3.

Method 3:
Syntax:    Vector object= new vector(int initialcapacity, capacityIncrement)

Example:
Vector vec= new Vector(4, 6)
Here we have provided two arguments. T
he initial capacity is 4 and capacityIncrement is 6.
It means upon insertion of 5th element the size would be 10 (4+6) and on 11th insertion it would be 16(10+6).

 */
public class VectorBasics {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        vec.add("Dhoni");//Adding object in Vector using add()
        vec.add("Kohli");
        vec.add("Dravid");
        vec.add("Ganguly");
        vec.add("Samson");
        vec.add("Pant");
        vec.add("Stokes");
        vec.add("Faf");
        vec.add("AB");
        vec.add("Saini");
        vec.add("Sundar");
        vec.add("Laxman");
        vec.add("Ponting");
        vec.add("Fleming");
        vec.add("Astle");
        vec.add("Mccullum");

        System.out.println("Vector list"+vec);

        //Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Vector list"+vec);

        Vector<String> vec1=new Vector<String>();
        vec1.add("Ravi");
        vec1.add("Vijay");
        vec1.add("Ajay");
        vec1.add("Anuj");
        vec1.add("Gaurav");
        vec1.add("Harsh");
        vec1.add("Virat");
        vec1.add("Gaurav");
        vec1.add("Harsh");
        vec1.add("Amit");
        //Check size and capacity
        System.out.println("Size is: "+vec1.size());
        System.out.println("Default capacity is: "+vec1.capacity());

        //Checking if Vijay is present or not in this vector
        if(vec.contains("Vijay"))
        {
            System.out.println("Vijay is present at the index " +vec.indexOf("Vijay"));
        }
        else
        {
            System.out.println("Vijay is not present in the list.");
        }
        //Get the first element
        System.out.println("The first name of the vector is = "+vec.firstElement());
        //Get the last element
        System.out.println("The last name of the vector is = "+vec.lastElement());

        //Remove element using index from the vector list
        vec1.remove(0);

        //Remove element using Name from the vector list
        vec1.remove("Vijay");

        //Get the hashcode for this vector
        System.out.println("Hash code of this vector = "+vec1.hashCode());
        //Get the element at specified index
        System.out.println("Element at index 1 is = "+vec1.get(1));
    }
}

