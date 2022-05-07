import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class Dog {
    String name;
    private static final Logger log = LoggerFactory.getLogger(Dog.class);
    public Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        log.debug("Debugging makeSound()");
        log.trace("Trace message from Dog class");
        String msg = "Barf";
        System.out.println(msg);
        log.debug("Finished debugging makeSound()");
    }
}
