package Day15;

public class ParameterizedConstructor {
        private String title;
        private String author;
        private int publicationYear;

        // Parameterized constructor
        public ParameterizedConstructor(String title, String author, int publicationYear) {
            this.title = title; // 'this' keyword refers to the current object's instance variable
            this.author = author;
            this.publicationYear = publicationYear;
        }

        // Method to display book details
        public void displayBookDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publication Year: " + publicationYear);
        }

        public static void main(String[] args) {
            // Creating an object of Book using the parameterized constructor
            ParameterizedConstructor myBook = new ParameterizedConstructor("The Great Gatsby", "F. Scott Fitzgerald", 1925);

            // Displaying the initialized values
            myBook.displayBookDetails();
        }
    }

