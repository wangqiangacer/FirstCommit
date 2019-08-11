package Reflect;

import domain.Persion;

import java.lang.reflect.Method;

/**
 * 方法对象来执行方法
 *
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("domain.Persion");
        //反射获取方法名使用invoke执行方法
//        Method method = aClass.getMethod("eat");
         Persion persion = new Persion();
//        method.invoke(persion);
        System.out.println("===============");

        Method eat = aClass.getMethod("eat", String.class);
        eat.invoke(persion,"玉米");

        System.out.println("============");
        //获取所有public修饰的方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            //获取方法名
            String name = method.getName();
            System.out.println(name);
        }
    }
}
