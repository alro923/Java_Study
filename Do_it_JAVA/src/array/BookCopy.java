package array;

public class BookCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("책이름11", "작가이름11");
        bookArray1[1] = new Book("책이름22", "작가이름22");
        bookArray1[2] = new Book("책이름33", "작가이름33");

        // 인스턴스 따로 만들고
        bookArray2[0] = new Book("책이름21", "작가이름21");
        bookArray2[1] = new Book("책이름22", "작가이름22");
        bookArray2[2] = new Book("책이름23", "작가이름23");


        // 이렇게 복사해야 한다!
       for(int i = 0; i<bookArray1.length;i++){
           bookArray2[i].setBookName(bookArray1[i].getBookName());
           bookArray2[i].setAuthor(bookArray1[i].getAuthor());
       }

        bookArray1[0].setBookName("바꾼 책 이름");
        bookArray1[0].setAuthor("바꾼 작가 이름");

        for(Book book : bookArray1){
            book.showBookIno();
        }
        System.out.println("--------------------");
        for(Book book : bookArray2){
            book.showBookIno();
        }

        // 그럼 주소가 아니라 값이 복사됐음을 알 수 있다.
    }
}
