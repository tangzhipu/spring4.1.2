package ouc.jeep.cglib;
/**
 *
 * Date-2014年12月5日
 */
public class TestCglib {  
    
    public static void main(String[] args) {  
        BookFacadeCglib cglib=new BookFacadeCglib();  
        BookFacadeImpl bookCglib = (BookFacadeImpl)cglib.getInstance(new BookFacadeImpl());  
        bookCglib.addBook();  
        bookCglib.deleteBook();
    }  
}  