package com.company;

public class RenaultEnigine extends Engine{
private double extraTurboEnergy;

    public RenaultEnigine(double extraTurboEnergy) {
        this.extraTurboEnergy = 0.0;
    }

    public RenaultEnigine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public  double efficiency(){
        return efficiency();
    }
    public  double throttleEnergy(){
        return getEngineVolume()*getCylinderAmount()*110+extraTurboEnergy;
    }
    public  double breakEnergy(){
        return getEngineWeight()*2.1;

    }
}
