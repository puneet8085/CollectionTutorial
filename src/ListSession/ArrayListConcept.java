package ListSession;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static void main(String args[])
    {
        //Arraylist is dynamic in nature and duplicate values are allowed
        //maintain insertion order and not synchronized
        //allow random access to fetch values/element as it stores values on the basis on indexing


        //syntex for creating a arraylist
        ArrayList<String> ar1=new ArrayList<>();//generic type of arraylist i.e it can store only string values. if you enter another type value it give comppile time error.
        ar1.add("abc");


        ArrayList ar = new ArrayList();//non generic type arraylist i.e we can insert any type of value in this.

        //how to add value in a array list
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add("text");
        ar.add(12.33);
        ar.add('q');
        ar.add(true);
        // add a new value in array list at given index value , right shift other element
        ar.add(5,false);

        //update value at a given index
        ar.set(5,true);


        //get size of arraylist to see how many element are there
        System.out.println(ar.size());

        //to get a value from a particular index
       System.out.println( ar.get(1));

       //to print all values from arraylist  we need for loop or iterator
        //print using for loop
        for(int i=0;i<ar.size();i++)
        {
            System.out.println(ar.get(i));
        }
//creating object for employee class
        Employee e1= new Employee("John",23,"QA");
        Employee e2= new Employee("John1",21,"QA1");
        Employee e3= new Employee("John2",25,"QA2");

        //Arraylist of employee Class type
        ArrayList<Employee> are=new ArrayList<Employee>();
        are.add(e1);
        are.add(e2);
        are.add(e3);

        //Iterate arraylist using Iterator
        Iterator<Employee> itr= are.iterator();
        while(itr.hasNext())
        {
            System.out.println("-------------------------------------------------------------------------------------");
          //  System.out.println(itr.next()); // this will print only address of object
            //to get value you need to do like this

            Employee emp = itr.next();
            System.out.println(emp.age+"   "+emp.name+"  "+emp.title);

        }




    }
}
