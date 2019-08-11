package SuperMethod;

public class Man extends  Human {
    @Override
    public void sayHello() {
        System.out.println("我是 man");
    }

    public  void method(Grateable grateable){
        grateable.grate();
    }

    public  void show(){
//        method(()->{
//            Human human = new Human();
//            human.sayHello();
//        });
        //使用super调用父类中的方法
       // super.sayHello();

        //使用方法引用调用父类中的成员方法 super是已经存在的 父类中的成员方法也是已经存在的
            method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
