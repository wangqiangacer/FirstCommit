package Annotation;

/**
 * 接口中的抽象方法  也叫属性,定义了属性在使用的时候就需要给他赋值
 * @Target 描述注解能够作用的位置
 * @Retention 描述注解被保留的阶段
 * @Documented 描述注解是否被抽取到api文档中
 * @Inherited  描述注解是否是被子类继承
 */
public @interface MyAnno {
    //属性的返回值类型：基本数据类型，String，枚举，注解
    public  String name() default "lisi";
    int age();
}
