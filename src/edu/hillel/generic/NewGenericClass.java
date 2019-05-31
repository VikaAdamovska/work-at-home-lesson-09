package edu.hillel.generic;

import java.util.*;

class Parent implements GrandPerent, GrandPerent2 {
}

interface GrandPerent{

}
interface GrandPerent2{

}

class Child extends Parent{
}


class Storage <T, T2>{
    List<T> innerStore;
    List<T2> innerStore2;
    T var;

    public void addToStore(T valueToAdd){
        innerStore.add(valueToAdd);

    }

    public <T2 extends Number> void printObjectToConcole(T2 param){
        System.out.println(param);

    }


}

class ParentProcessor<T extends Parent & GrandPerent & GrandPerent2>{

}

public class NewGenericClass {
    public static void main(String[] args) {
        List<Parent> list = new ArrayList<>();

        list.add(new Parent());
        list.add(new Child());
        //list.add(new Object());


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer val = iterator.next();
            System.out.println("Value is " + val );
        }

        Set<String> setLinked = new LinkedHashSet<>(); //собдюдаеться порядок в порядке добавления елементов!


        setLinked.add("one");
        setLinked.add("two");
        setLinked.add("three");

        Iterator<String> iterator1 = setLinked.iterator();
        while (iterator1.hasNext()){
            String elementSet;
            System.out.println(elementSet = iterator1.next()); // гарантированно возвращает в порядке добавления!
        }

        Storage<Integer, String> storage = new Storage<>();
        Storage<String, String> storage2 = new Storage<>();
        storage.addToStore(152);
        storage2.addToStore("Love");

        ParentProcessor<Parent> parentProcessor;
        ParentProcessor<Child> parentProcessor2;
        //ParentProcessor<String> parentProcessor3;

        User user = new User();
        storage.printObjectToConcole(1.4);
        storage.printObjectToConcole(3);







    }
}
