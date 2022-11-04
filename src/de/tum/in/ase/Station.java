package de.tum.in.ase;

public class Station {
    private String name;
    private int trains = 0;
    private int totalPassengers = 0;
    // TODO: Constructor

    public Station(String name) {
        this.name = name;
    }

    // TODO: Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrains() {
        return trains;
    }

    public void setTrains(int trains) {
        this.trains = trains;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }


    // TODO: acceptTrain
    public void acceptTrain(Train train) {
        this.trains += 1;
        this.totalPassengers += 1;

    }

    // TODO: equals (checks if the names of two stations are the same, returns true if that is the case)
    public boolean equals(Station station) {

    }
}
