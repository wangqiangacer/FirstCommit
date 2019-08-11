package ThisMethodReference;

/**
 * 通过this引用本类的成员方法
 *
 */
public class Husband {
    public  void buyHouse(){
        System.out.println("成都买了一套房子");
    }

    //定义一个结婚的方法
    public  void marry(Rechable rechable){
        rechable.buy();
    }

    //定义一个高兴的方法
    public  void beHappy(){
        //调用结婚的方法  是一个函数接口可以传递lambda表达式
//        marry(()->{
//            //使用this调用本类的成员方法
//            this.buyHouse();
//        });

        //使用方法引用
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().beHappy();
    }
}
