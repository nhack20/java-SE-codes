package FactoryMethod;

public class Main {
    public static void main(String[] args) {
//        Developer developer=new JavaDeveloper();
//        developer.writeCode();
        DeveloperFactory developerFactory=createspeciality("java");
        Developer developer=developerFactory.createDeveloper();
        developer.writeCode();
    }
    public static DeveloperFactory createspeciality(String speciality){
        if(speciality.equalsIgnoreCase("php")){
            return new JavaDeveloperFactory();
        }else if(speciality.equalsIgnoreCase("python")){
            return new PythonDeveloperFactory();
        }else {
            throw new RuntimeException(speciality+"not found this speciality");
        }
    }
}
