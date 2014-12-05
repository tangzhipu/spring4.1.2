package ouc.jeep.proxy;
/**
 *
 * Date-2014年12月5日
 */
public class TestProxy {  
	  
    public static void main(String[] args) {  
        BookFacadeProxy proxy = new BookFacadeProxy();  
        BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());  
        bookProxy.addBook();  
        bookProxy.deleteBook();
    }  
  
}  