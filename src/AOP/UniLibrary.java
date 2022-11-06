package AOP;

import org.springframework.stereotype.Component;

@Component("UniLibraryBean")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("take book from uniLibrary");
        System.out.println("-------------------------------------");
    }

    public void returnBook() {
        System.out.println("return book unilibrary");
        System.out.println("-------------------------------------");

    }

    public void getMagazine() {
        System.out.println("take magazine from Library");
        System.out.println("-------------------------------------");

    }

    public void returnMagazine() {
        System.out.println("return magazine unilibrary");
        System.out.println("-------------------------------------");

    }

    ;

    public void addBook(Book book, String person_name) {
        System.out.println("add book unilibrary");
        System.out.println("-------------------------------------");

    }

    public void addMagazine() {
        System.out.println("add magazine unilibrary");
        System.out.println("-------------------------------------");

    }


}
