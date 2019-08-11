package domain;

public class Persion {
    public    String name;
    private  int age;

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  void eat(String food){
        System.out.println("eat foot"+food);
    }
}
