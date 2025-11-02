package Day18;

public class ThisKeyword {
        int id;
        String name;

        // Constructor using 'this' keyword
        ThisKeyword(int id, String name) {
            this.id = id;       // refers to instance variable
            this.name = name;
        }

        void display() {
            System.out.println("ID: " + this.id + ", Name: " + this.name);
        }

        public static void main(String[] args) {
            ThisKeyword s1 = new ThisKeyword(101, "Raj");
            s1.display();
        }
    }


