public class Demo01PrintDemo {
    public static void main(String[] args) {
//        printString((s)->{
//            MethodObject methodObject = new MethodObject();
//            methodObject.printStringtoUpperCase(s);
//        });

        MethodObject methodObject = new MethodObject();
        //方法引用就是对象是存在的和成员方法也是存在的
        printString(methodObject::printStringtoUpperCase);
    }

    public  static  void printString(Printable printable ){
        printable.print("Hello");
    }


    //使用方法引用表达式优化lambda
    //对象是已经存在的 成员方法也是已经存在的 我们可以使用对象名来引用方法

}
