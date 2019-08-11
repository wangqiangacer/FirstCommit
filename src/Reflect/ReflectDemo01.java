package Reflect;


import domain.Persion;

import java.lang.reflect.Field;

/**
 * 获取成员变量对象
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        Class<Persion> cls = Persion.class;
        //获取成员变量
        Field[] fields = cls.getFields();//获取所有public修饰的变量
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==================");

        //对获取的成员变量设置值
        Field name = cls.getField("name");
        Persion persion = new Persion();
        Object value = name.get(persion);
        System.out.println(value);
        System.out.println("==========");
        name.set(persion,"zhangsan");
        System.out.println(persion);
    }
}
