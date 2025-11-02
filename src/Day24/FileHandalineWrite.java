package Day24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileHandalineWrite {
    public static void main(String[] args) {

    File fw = new File("C:\\Users\\Abhin\\IdeaProjects\\JAVAAutomation\\src\\Day24\\Test.txt");
        try{
            if (fw.createNewFile()){
                System.out.println("File Created: "+fw.getName());
            }else  {
                System.out.println("File exist;");
            }

    System.out.println("Successfully Written to the file " +fw.getAbsoluteFile());
            System.out.println("can read: "+ fw.canRead());
            System.out.println("can Write " + fw.canWrite());
}
catch (IOException e){
    e.printStackTrace();
}
    }
}
