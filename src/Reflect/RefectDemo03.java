package Reflect;

import java.lang.reflect.Constructor;

/**
 * 获取构造函数对象
 */
public class RefectDemo03 {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("domain.Persion");
        Constructor constructor = aClass.getConstructor(String.class, int.class);
        //通过构造器来创建对象
        Object o = constructor.newInstance("zhangsan", 23);
        System.out.println(o);//Persion{name='zhangsan', age=23}
        //默认使用内部提供的空参构造器
        Object o1 = aClass.newInstance();
        System.out.println(o1);

    }
}
