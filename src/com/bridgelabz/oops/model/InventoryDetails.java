package com.bridgelabz.oops.model;

import java.util.ArrayList;

public class InventoryDetails {
    private ArrayList<Rice> rices;
    private ArrayList<Wheat> wheats;
    private ArrayList<Pulses> pulses;

    public ArrayList<Rice> getRices() {
        return rices;
    }

    public void setRices(ArrayList<Rice> rices) {
        this.rices = rices;
    }

    public ArrayList<Wheat> getWheats() {
        return wheats;
    }

    public void setWheats(ArrayList<Wheat> wheats) {
        this.wheats = wheats;
    }

    public ArrayList<Pulses> getPulses() {
        return pulses;
    }

    public void setPulses(ArrayList<Pulses> pulses) {
        this.pulses = pulses;
    }
}
