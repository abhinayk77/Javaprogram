package Day16;

public class MainClass {
    public static void main(String[] args)
    {
        Childclass obj= new Childclass();
        obj.showDetails(32,"Abhinay");

        ParentClass obj1 = new Childclass();
        //this line shows error
        obj1.showDetail(11,"Shankar");

    }

    }

