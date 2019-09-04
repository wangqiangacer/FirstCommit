package classloader;

public class ClassLoaderDemo01 {
    public static void main(String[] args) {
        //获取类的类加载器
      // System.out.println(ClassLoaderDemo01.class.getClassLoader());
        ClassLoader classLoader = ClassLoaderDemo01.class.getClassLoader();
        while (classLoader!=null){
            System.out.println(classLoader);
            classLoader=classLoader.getParent();

        }
        System.out.println(classLoader);
    }
}
