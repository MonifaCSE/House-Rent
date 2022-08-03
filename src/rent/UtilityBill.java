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
public class UtilityBill {
   private Double  Localtax;
     private Double Waterbill;
     private Double Electricitybill;

    public Double getLocaltax() {
        return Localtax;
    }

    public void setLocaltax(Double Localtax) {
        this.Localtax = Localtax;
    }

    public Double getWaterbill() {
        return Waterbill;
    }

    public void setWaterbill(Double Waterbill) {
        this.Waterbill = Waterbill;
    }

    public Double getElectricitybill() {
        return Electricitybill;
    }

    public void setElectricitybill(Double Electricitybill) {
        this.Electricitybill = Electricitybill;
    }
}
