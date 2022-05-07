package AbstractFactory.WebsiteDeveloping;

import AbstractFactory.company.Developer;
import AbstractFactory.company.ProjectManager;
import AbstractFactory.company.ProjectTeamFactory;
import AbstractFactory.company.Tester;

public class WebsitePersonal implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new TesterIT();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagerWebsite();
    }
}
