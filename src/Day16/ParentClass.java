package Day16;

public class ParentClass {
    int age;
    String name;

    void showDetail(int age, String name)
    {
        this.age= age ;
        this.name=name;
        System.out.println("Age= "+ this.age);
        System.out.println("Name= "+ this.name);
    }

}
