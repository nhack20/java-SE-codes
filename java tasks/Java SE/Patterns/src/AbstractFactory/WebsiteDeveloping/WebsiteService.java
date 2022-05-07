package AbstractFactory.WebsiteDeveloping;

import AbstractFactory.company.Developer;
import AbstractFactory.company.ProjectManager;
import AbstractFactory.company.ProjectTeamFactory;
import AbstractFactory.company.Tester;
import AbstractFactory.Banking.QATester;

public class WebsiteService {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new WebsitePersonal();
        Developer developer=new PhpDeveloper();
        Tester tester=new QATester();
        ProjectManager projectManager=new ProjectManagerWebsite();
        System.out.println("website is working...........");
        developer.writecode();
        tester.testcode();
        projectManager.manageProject();
    }
}
