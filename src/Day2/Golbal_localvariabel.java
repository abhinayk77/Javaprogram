package Day2;

import javax.sound.midi.Soundbank;

public class Golbal_localvariabel {
    String name ="Abhinay" ;// Gobal Variable

    public void Student()
    {
        int age = 32; //local  variable
        System.out.println("This is " + name + "and age is :" +age);
    }
}
class variable{
    public static void main(String[] args) {
 Golbal_localvariabel GL = new Golbal_localvariabel();
 GL.Student();
        System.out.println(GL.name);//Gobal Variable
    }
}