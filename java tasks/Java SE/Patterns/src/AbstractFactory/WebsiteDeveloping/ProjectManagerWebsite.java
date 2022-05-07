package AbstractFactory.WebsiteDeveloping;

import AbstractFactory.company.ProjectManager;

public class ProjectManagerWebsite implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM is ready to work");
    }
}
