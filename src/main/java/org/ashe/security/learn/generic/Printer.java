package org.ashe.security.learn.generic;

/**
 * 打印机
 */
public class Printer<T extends Animal> {

    private final T thing2Print;

    public Printer(T thing2Print) {
        this.thing2Print = thing2Print;
    }

    public void print() {
        System.err.println(thing2Print);
    }
}
