import edu.hillel.generic.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {

        User user = new User();

        List<Double> list = new ArrayList();
        list.add(1.2);
        //list.add(user);

        // нужно приводить к типы объектаб но это дублирование кода, не красиво и можно
        //сделать ошибку!
        Double element = (Double) list.get(0); // потому что get возвращает Object нужно приведение типов
        System.out.println(element);

        Object element2 = list.get(1);

        System.out.println(element2);


        // использование Generic в игловых скобках указываем тип елементв, который бцдет хранить у нас в
        //в Collection

        List<Integer> listInt = new LinkedList<Integer>();// во вторых скобках можно указывать или нет!
        //может быть ворнинг!

        listInt.add(356);

        Integer elem = listInt.get(0);
        // generic - это свойство только компилятора!
        // при компиляции программы в байт-код - никаких Generics не существует!
        // эта проверка только на этапе компиляции!

        addStringToGenericList(list);
        element = list.get(1); //(Integer) list.get(1)



        List<Number> listNumber = new LinkedList<>();

        listNumber.add(1.2); //new Double автобоксинг
        listNumber.add(522436565);

    }

    public static void addStringToGenericList(List list){ //row type collection
        //теперь можно добавлять все что угодно!
        list.add("");
    }
}
