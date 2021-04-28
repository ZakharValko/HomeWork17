package ua.alevel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MyObject object1 = new MyObject(12, "Car", 14);
        MyObject object2 = new MyObject(31, "Motorbike", 11);
        MyObject object3 = new MyObject(40, "Bicycle", 4);

        Collection<MyObject> collection = Arrays.asList(object1, object2, object3);

        List listNames = collection.stream().map(String -> String.name).collect(Collectors.toList());

        Object maxIdObject = collection.stream().max(Comparator.comparing(Integer -> Integer.id));

        int sum = collection.stream().filter(s -> s.name.contains("a")).mapToInt(i->i.count).sum();

        Map<Integer, String> map = collection.stream().collect(Collectors.toMap(MyObject::getId, MyObject::getName));

    }
}
