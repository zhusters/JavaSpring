package IoCDIwithClassConfig;

import IoCDI.Pet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
public class Cat implements Pet {


        public Cat() {
            System.out.println("cat bean was created");
        }

        @Override
        public void Say() {
            System.out.println("meow");
        }
    }


