public class BankApplication {
    private String name;
    private String country;
    private Worker []workers = new Worker[100];
    private int sizeOfWorkers;///count of workers

    public BankApplication() {
    }

    public BankApplication(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }
    public void addWorker(Worker worker){
        workers[sizeOfWorkers]=worker;///add new workers in array
        sizeOfWorkers++;//increment that counter used count of workers
    }
    public void listworkers(){
        for(int i=0;i<sizeOfWorkers;i++){
            System.out.println(workers[i]);
        }
    }
}
