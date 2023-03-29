package org.ashe.security.learn.lamda;


import org.ashe.security.learn.lambda.MyInterface;
import org.junit.jupiter.api.Test;

class MyInterfaceTest {

    @Test
    void lambdaTest() {
        /*
            printThing()方法的参数为一个函数式接口
            使用printThing()方法时需要自己实现参数的抽象方法
            *而不是将重心关注在实现接口的类，实例化一个对象，调用该抽象方法*
         */
        printThing(() -> System.err.println("keep hoping, keep loving"));
    }

    private static void printThing(MyInterface myInterface) {
        // 函数式接口MyInterface的抽象方法print()需要自己实现
        myInterface.print();
    }

}