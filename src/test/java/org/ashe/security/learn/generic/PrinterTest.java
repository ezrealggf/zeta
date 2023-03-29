package org.ashe.security.learn.generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;


class PrinterTest {


    @Test
    void printerTest() {
        Assertions.assertDoesNotThrow(() -> {
            /*
                print instance of String, you will find String's toString method that is return itself
             */
            //
            // print instance of User
            Animal ashe = new Animal(1L, "Ashe", "music");
            Printer<Animal> userPrinter = new Printer<>(ashe);
            userPrinter.print();
        });
    }

    @Test
    void genericMethodTest() {
        Dog myDog = new Dog(9527L,"才", "licking");
        String word = "ha ha ha ~";
        Dog haHaHa = shout(myDog, word);
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(haHaHa);
        printAnimalList(dogs);
//        printAnimalList(Collections.singletonList("string"));
        Animal wong = new Animal(2L, "wong", "inject");
        printAnimalList(Collections.singletonList(wong));

    }

    /**
     * shout function
     * @param thing2Shout thing2Shout
     * @param other2Shout other2Shout
     * @param <T> 类型必须为Dog类的子类
     * @param <V> 无限制的类型
     */
    private static <T extends Dog, V> T shout (T thing2Shout, V other2Shout) {
        System.out.println(thing2Shout);
        System.out.printf(String.format("%s  -------%s------>%n", other2Shout, "you do make a difference"));
        return thing2Shout;
    }

    private static void printAnimalList (List<? extends Animal> list) {
        System.err.println(list);
    }
}