package classloader;

public class MyClassLoader extends ClassLoader {
    private  String path; //加载类的路径
    private  String name; //类加载器的名称

    public MyClassLoader(ClassLoader parent, String path, String name) {
        super(parent);
        this.path = path;
        this.name = name;
    }

    public MyClassLoader(String path, String name) {
        this.path = path;
        this.name = name;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
