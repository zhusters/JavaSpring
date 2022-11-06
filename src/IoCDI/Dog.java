package IoCDI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope("singleton")
public class Dog implements Pet {

    public Dog() {
        System.out.println("dog bean was created");

    }

    @Override
    public void Say() {
        System.out.println("woof");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("dog destroy method");
    }
}
