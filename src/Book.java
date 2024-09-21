public class Book {

    public String name;
    public String author;
    public int publishing_date;
    public int last_page_number;
    public int current_page_number;
    public boolean is_open;

    public Book(String name, String author, int last_page_number, int publishing_date) {
        this.name = name;
        this.author = author;
        this.last_page_number = last_page_number;
        this.publishing_date = publishing_date;
        this.is_open = false;
    }

    void open_book() {
        // Check if the book is open or not
        if (is_open)
            System.out.println("Is opened");
        // Open the book if it's not open as the function is for opening the book
        else
            is_open = true;
    }

    void close_book() {
        if (is_open)
            this.is_open = false;
        else
            System.out.println("Is closed");
    }

}
