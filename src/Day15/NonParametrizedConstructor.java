package Day15;

 class Book {
    String title;
    String author;
    int publicationYear;

    // Non-parameterized constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Anonymous";
        this.publicationYear = 0; // Default year
        System.out.println("Book object created using the non-parameterized constructor.");
    }

    public void displayBookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Publication Year: " + this.publicationYear);
    }

    public static void main(String[] args) {
        // Creating an object using the non-parameterized constructor
        Book myBook = new Book();
        myBook.displayBookDetails();
    }
}