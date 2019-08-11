package ConstructorMethodReference;

public class demo {

    public static void printName(String name,PersonBuilder pb){
        Person person = pb.buildPerson(name);
        System.out.println(person.getName());


    }

    public static void main(String[] args) {
//        printName("王强",(name)->{
//            return new Person(name);
//        });
        //使用方法引用来优化lambda表达式
        //构造方法new Person() 已知
        printName("小明",Person::new);
    }

}
