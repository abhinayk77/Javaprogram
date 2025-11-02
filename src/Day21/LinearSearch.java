package Day21;

public class LinearSearch {
    public static void main(String[] args) {
        String[] arr ={"Ajay","Dahiya","is","Educator","at","Stad","Solution"};
        String search ="Dahiya";
        boolean check =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(search)){
                check=true;
                break;
            }
        }
        if(check){
            System.out.println("String " + search +" is present in array");

        }
        else {
            System.out.println("String " + search +" is not present in array");
        }
    }
}
