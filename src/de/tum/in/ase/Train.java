package de.tum.in.ase;

public class Train {
    private int vehicleNumber;
    private int passengers = 0;
    private boolean moving = false;
    private Station currentStation;
    // TODO: Constructor
    public Train(int vehicleNumber, Station currentStation) {
        this.vehicleNumber = vehicleNumber;
        this.currentStation = currentStation;
    }
    // TODO: Getters and setters

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public Station getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(Station currentStation) {
        this.currentStation = currentStation;
    }

    // TODO: Board and Deboard
    public void boardPassenger() {
        this.passengers += 1;
    }

    public void deboardPassenger() {
        this.passengers -= 1;
    }


    // TODO: Delay train
//    question: this or not this
    public void delayTrain() {
        moving = false;
        this.setPassengers(getPassengers() / 2);
    }

    // TODO: Finish shift
//    TODO: need to change to Station class
    public void finishShift() {
        setCurrentStation(new Station("Munich Central Station"));
        moving = false;
        passengers = 0;
    }

    // TODO: Choo choo!
    public void choochoo() {
        System.out.println("Choo choo, here comes the train!");
    }

    // TODO: toString
    public String toString() {
        return String.format("The train with the vehicle number %d is currently in the station %s. There are currently %d passengers on board.", vehicleNumber, currentStation.getName(), passengers);
    }

}
