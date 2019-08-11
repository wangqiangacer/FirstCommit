package Annotation;

/**
 * 注解本质就是一个接口
 *public interface Annotation.MyAnno extends java.lang.annotation.Annotation
 */
@MyAnno01
public class AnnoDemo01 {
    @MyAnno(age=12)
    public  void  show(){

    }
    @MyAnno01
    public  void eat(){

    }
}
