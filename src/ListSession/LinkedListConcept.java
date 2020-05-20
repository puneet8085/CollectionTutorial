package ListSession;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String args[])
    {
        //in Linked list data is store inside node. nodes are divided into 2 parts first part has value(data) and second has address of next node
    //In every Linked list , there is a head(only have one part) which point to first data and last element next is pointed to null.

        //Syntex to add generic linked list
        LinkedList<String> ll=new LinkedList<>();
        //add values in linked list

        ll.add("abc");
        ll.add("xyz");
        System.out.println(ll.size());
        System.out.println("Linked List content : "+ll);

        //adding value to first position in linked list
        ll.addFirst("Pqr");
        System.out.println(ll.size());
        System.out.println("Linked List content : "+ll);
//add element at last position in linked list
        ll.addLast("Opp");
        System.out.println(ll.size());
        System.out.println("Linked List content : "+ll);
// get a elment based on index
        ll.get(2);
        System.out.println(ll.get(2));

        //replacing value at a given index
        System.out.println("Linked List content : "+ll);
        ll.set(0,"puneet");
        System.out.println("Linked List content : "+ll);

        //remove first element from linked list
        ll.removeFirst();
        System.out.println("Linked List content : "+ll);

        //remove last element from linked list
        ll.removeLast();
        System.out.println("Linked List content : "+ll);

        //remove element from a given index value
        ll.remove(1);
        System.out.println("Linked List content : "+ll);

        ll.add("Selenium");
        ll.add("UFT");
        //how to print all values from linked list:   1. for loop 2. advance for loop i.e for each 3. Iterator   4. while loop

        //print using for loop
        System.out.println("Printing using for  loop");
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }

        //print using for each (advance for loop)
        System.out.println("Printing using for each loop");
        for(String str: ll)
        {
            System.out.println(str);
        }

        //print using iterator
        System.out.println("Printing using for Iterator");
        Iterator<String >  itr = ll.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Print using while loop
        System.out.println("Printing using for while loop");
        int num=0;
        while (ll.size()>num)
        {
            System.out.println(ll.get(num));
            num++;
        }

    }

}
