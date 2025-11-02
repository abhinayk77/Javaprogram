package Day18;

public class SuperKeywordChild extends SuperKeywordParent{
    String role= "child";
    SuperKeywordChild() {
        // call child constructor
        super();
        System.out.println("child constructor called");

    }
    void display()
    {
        System.out.println("abc : "+ role);
        System.out.println("parent class: " + super.role); //parent field

    }
    void show(){
        super.display(); // call parent method
    }
}
