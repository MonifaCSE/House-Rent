/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

/**
 *
 * @author user
 */
public class Rental {
    private int Flat;
    private int House;
    private Double Cost;
    private Double Numberofroom;
    private  String Location;

    public int getFlat() {
        return Flat;
    }

    public void setFlat(int Flat) {
        this.Flat = Flat;
    }

    public int getHouse() {
        return House;
    }

    public void setHouse(int House) {
        this.House = House;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double Cost) {
        this.Cost = Cost;
    }

    public Double getNumberofroom() {
        return Numberofroom;
    }

    public void setNumberofroom(Double Numberofroom) {
        this.Numberofroom = Numberofroom;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
}
