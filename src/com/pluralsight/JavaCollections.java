package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.pluralsight.MyClass;
public class JavaCollections {
    public static void main(String[] args) {
//        ArrayList<String> al= new ArrayList<>();
//
//        al.add("Foo");
//        al.add("Bar");
//
//        System.out.println("Elements Size "+al.size());
//
//        for(String  o:al){
//            System.out.println("The elements are "+o);
//        }
//        String s=al.get(0);
//        System.out.println("The First index element "+s);
//
//        ArrayList<String> as=new ArrayList<>();
//
//        as.add("Array1");
//        as.add("Array2");
//
//        for(String o:as)
//            System.out.println("The Array List are "+o.toString());
//
//        LinkedList<String> ll=new LinkedList<>();
//        ll.add("Linked1");
//        ll.add("Linked2");
//        for(String o:ll)
//            System.out.println("The Linked List are "+o.toString());
//        as.addAll(ll);
//
//        for(String o:as)
//            System.out.println("The Array List After add all are "+o.toString());
    ArrayList<MyClass> al=new ArrayList<MyClass>();
    MyClass[] myArray= {
            new MyClass("Val1", "abc"),
            new MyClass("Val2", "xyz"),
            new MyClass("Val3", "abc")
    };

    Collection<MyClass> arList=Arrays.asList(myArray);

    arList.forEach(m-> System.out.println(m.getLable()));
//    MyClass a1 = new MyClass("v1","abc");
//    MyClass a2 = new MyClass("v2","xyz");
//    MyClass a3 = new MyClass("v3","abc");
//    al.add(new MyClass("v1", "abc"));
//    al.add(new MyClass("v2", "xyz"));
//    al.add(new MyClass("v3", "abc"));
//    Object[] objA=al.toArray();
//    MyClass[] A1=al.toArray(new MyClass[0]);
//    MyClass[] A2=new MyClass[3];
//    MyClass[] A3= al.toArray(A2);
//    if(A2==A3)
//    {
//        System.out.println("a2 & a3 are same array reference");
//    }
//    al.add(a1);
//    al.add(a2);
//    al.add(a3);

   // al.remove(a3);

//        al.removeIf(m->m.getValue().equals("abc"));
//        al.forEach(m-> System.out.println(m.getLable()));
    }
}