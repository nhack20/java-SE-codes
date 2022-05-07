package AbstractFactory.Banking;

import AbstractFactory.company.ProjectManager;

public class PM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM is working");
    }
}
