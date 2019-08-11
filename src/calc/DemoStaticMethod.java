package calc;

public class DemoStaticMethod {
    public  static  int method(int number,Calcable calcable){
        return  calcable.calcAbs(number);
    }

    public static void main(String[] args) {
        //使用lambda  绝对值
       int number= method(-10,(n)->{
            return Math.abs(n);
        });

        System.out.println(number);

        //使用方法引用优化lambda
        System.out.println(method(-2, Math::abs));
    }
}
