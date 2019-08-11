package Reflect;

import ConstructorMethodReference.Person;

/**
 * 将类的各个组成部分封装成对象反射机制
 * 在程序运行中，可以操作这些对象
 */
public class ReflectDemo {
    //获取class对象的三种方式
    public static void main(String[] args) throws ClassNotFoundException {

            Class aClass = Class.forName("domain.Persion");

            //类名.class
        Class<Person> aClass1 = Person.class;
        System.out.println(aClass1);


    }
}
