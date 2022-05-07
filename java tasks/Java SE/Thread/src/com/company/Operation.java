package com.company;

public class Operation extends Thread{
    private String operationName;
    private int operationTime;
    public Operation() {
    }

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }
    public void run(){
        try{
        for (int i=0;i<5;i++){
            System.out.println(operationName+" "+ operationTime);
            Thread.sleep(1000);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
