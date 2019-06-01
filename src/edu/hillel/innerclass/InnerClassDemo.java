package edu.hillel.innerclass;

import static edu.hillel.innerclass.Dog.*;

interface  Test{

}

interface Cat{

}



class Dog implements Cat{

    private int privateVar = 10;
    private static int staricVar = 3;


    ///////////////////////////////////////////////////////////


    private class InnerDog implements Test{
        public int getParentPrivateVar(){
            return privateVar;
        }
    }
//////////////////////////////////


    public static class InnerDogStatic{

        public int getOuterStaticField(){

            return staricVar;
        }

    }




    public Test getPrivateObj(){

        return new InnerDog();
    }
}


//////////////////////////////////////////////////////
public class InnerClassDemo {


    public static void main(String[] args) {

        Dog dog = new Dog();

       // Dog.InnerDog  innerDog = dog.new InnerDog();

        Test test = dog.getPrivateObj();

        Cat cat = new Dog();

        Test test2 = dog.getPrivateObj();

        Dog.InnerDogStatic dogStatic = new Dog.InnerDogStatic();

    }
}
