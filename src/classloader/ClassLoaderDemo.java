package classloader;

/**
 * 先执行类的构造器 static静态代码块，静态变量
 *
 * 双亲委派模型讲解：
 * 1.为什么要使用双亲委派机制？避免重复加载
 * 2.jdk已有的类加载器：
 * BootStrap Classloader(启动类加载器)  ->>>> rt.jar
 * Extension Classloader extends ClassLoader  ->>> %JAVA_HOME%/lib/*.jar
 * App Classloader  extends ClassLoader
 * 自定义类加载器  extends ClassLoader
 *
 *
 *
 *
 */
public class ClassLoaderDemo {
    public  static  int tem =1;
    static {
        tem=2;
        System.out.println(tem);
    }

    public static void main(String[] args) {
        tem=3;
        System.out.println(tem);
    }
}
