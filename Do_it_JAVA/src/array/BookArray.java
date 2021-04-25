package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for (Book book : library) {
            System.out.println(book);
        }

        library[0] = new Book("책이름1", "작가이름1");
        library[1] = new Book("책이름2", "작가이름2");
        library[2] = new Book("책이름3", "작가이름3");
        library[3] = new Book("책이름4", "작가이름4");
        library[4] = new Book("책이름5", "작가이름5");

        for (Book book : library) {
            book.showBookIno();
        }
    }
}
