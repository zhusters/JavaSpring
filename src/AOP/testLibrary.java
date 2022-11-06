package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testLibrary {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);



        UniLibrary uniLibrary = context.getBean("UniLibraryBean", UniLibrary.class);
        Book book = context.getBean("bookBean",Book.class);
        uniLibrary.addBook(book,"sanya");
        uniLibrary.getMagazine();



        context.close();
    }
}
