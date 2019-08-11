package Annotation;



@Pro(className = "Annotation.demo01",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {


        //1.解析注解
        //1.1.获取该类的字节码文件
        Class<ReflectTest> aClass = ReflectTest.class;
        //1.2 获取上面的注解对象
        Pro annotation = aClass.getAnnotation(Pro.class);
        //调用注解中定义的抽象方法，获取返回值
        System.out.println(annotation.className());
        System.out.println(annotation.methodName());

    }
}
