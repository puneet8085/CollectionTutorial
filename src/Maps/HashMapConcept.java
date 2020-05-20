package Maps;

import ListSession.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapConcept {

    public static void main(String args[])
    {
        //hashmap is  class which extend abstract Map and implement Map Interface.
        // contains only unique elements  i.e key should be unique
        //store a element in the pair of Key and value
        //it may have 1 null key and multiple null values
        //no insertion order maintained
        //hash map is non- synchronized   ---- not thread safe i.e no accurate result if more than one thread do manipulation
        //concurrent modification exception-----fail fast condition . occur when more than one thread modify value.

        //Syntex to declare HashMap
        HashMap<Integer,String> hm=new HashMap<>();
        //adding value in hash mao
        hm.put(1,"Selenium");
        hm.put(2,"QTP");
        hm.put(3,"TFS");
        hm.put(4,"Jira");
        hm.put(5,"Zoho");

        //fetch a value based on key
        System.out.println(hm.get(2));
        System.out.println(hm.get(7));//if key is not present it return value as null

        //  print hash map
        for(Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }

        //remove one element from hash map (Note key and value pair both got removed this means that key will not appear when you print hash map
        System.out.println("Before removal----------------------------------------------");
        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);
        System.out.println("After removal----------------------------------------------");
    // store object of EMployee class in A Hash Map
        //1. create a hash map for storing employee values
        HashMap<Integer, Employee>  hme=new HashMap<>();

        //2. create object of employee class which need to store
        Employee em= new Employee("steve",21,"QA");
        Employee em1= new Employee("John",23,"Dev");
        Employee em2= new Employee("Nick",51,"BA");
        hme.put(1,em1);
        hme.put(2,em2);
        hme.put(3,em);

        //Traverse Hash Map
        for(Entry <Integer,Employee>m:hme.entrySet())
        {
            int key=m.getKey();
            Employee e= m.getValue();
            System.out.println("Info for key :"+key);
            System.out.println(e.name+" "+e.age+" "+e.title);
        }

    }
}
