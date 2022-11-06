package AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary {

    public void getBook(){
        System.out.println("take book from library");
    }

    public void returnBook() {
        System.out.println("return book library");
    }

    public void returnMagazine(){
        System.out.println("return magazine library");
    };

    public void addBook(){
        System.out.println("add book library");
    }
    public void addMagazine(){
        System.out.println("add magazine library");
    }

    public void getMagazine() {
        System.out.println("take magazine from Library");
    }
}
