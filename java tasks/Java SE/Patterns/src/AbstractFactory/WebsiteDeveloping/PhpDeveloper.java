package AbstractFactory.WebsiteDeveloping;

import AbstractFactory.company.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writecode() {
        System.out.println("Php developer writing a new code");
    }
}
