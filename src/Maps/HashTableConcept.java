package Maps;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableConcept {
    public static void main(String args[])
    {
        //contains only unique value. i.e key should always be unique but value can be duplicate
        //no null key or null value  give null pointer exception on run time
        Hashtable hhu= new Hashtable();
        hhu.put(1,"QA");
        hhu.put(2,"QA-Manual");
        hhu.put(3,"QA-Performance");
        hhu.put(3,"QA-Performance");
        System.out.println(hhu);



        //also store values in key value pair
        // hash table is synchronised i.e thread safe
        //Key store as ---Object and each object -----Have a hash code which has a 32 bit number
        Hashtable h1=new Hashtable();
        h1.put(1,"QA");
        h1.put(2,"QA-Manual");
        h1.put(3,"QA-Performance");
        h1.put(4,"QA-Automation");
        h1.put(5,"QA- UFT");

        //copy/clone one hash table into another
        Hashtable h=new Hashtable();
        h= (Hashtable) h1.clone();
        System.out.println("Value from H1 Hash table : "+h1);
        System.out.println("Value from H Hash table:" +h);

        Hashtable h2=new Hashtable();
        h2= (Hashtable) h1.clone();
        //clear value from h1 hash table
        h1.clear();
        System.out.println("Value from H1 Hash table : "+h1);
        System.out.println("Value from H2 Hash table:" +h2);

        //creating a new hash table with other values
        Hashtable st = new Hashtable();
        st.put(1,"Sunday");
        st.put(2,"Monday");
        st.put(3,"Tuesday");
        st.put(4,"Wednesday");
        st.put(5,"Thursday");

        //to check if hash table contains a particular value
        if(st.containsValue("Tuesday"))
            System.out.println("Value is present in hash table");

        //to check if hash table contains a particular key
        if(st.containsKey(3))
            System.out.println("Key is present in hash table");

        //print all values from Hash Table using enumeration(has elements())
        Enumeration e=st.elements();
        System.out.println("print value from st hash table using enumeration");
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        //print all values from Hash table using Entry Set
        System.out.println("print value from st hash table using enumeration");
        Set ss=st.entrySet();
        System.out.println(ss);
        Iterator itr=ss.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //compare 2 hash table
        if(h2.equals(h))
            System.out.println("Both hash table are equal");

        //getting a value from hash table based on Key
        System.out.println(st.get(3));

        // how to get hash code for a hash table
        System.out.println("The hash code for Hash Table is :"+st.hashCode());
}}

