package AbstractFactory.company;

import AbstractFactory.Banking.BankingTeamFactory;

public class SuperBank {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new BankingTeamFactory();
        Developer developer=projectTeamFactory.getDeveloper();
        Tester tester=projectTeamFactory.getTester();
        ProjectManager projectManager=projectTeamFactory.getProjectManager();
        System.out.println("Creating bank system.....");
        developer.writecode();
        tester.testcode();
    }
}
