/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourapp.Classes;

import java.text.SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author user
 */

public class Booking implements Comparable<Booking>{
    /*declaration of objects Tourist, TourPackage and a Date type
    representing date and time at which bookings are scheduled */
    private Tourist tourist;
    private TourPackage tourPackage;
    private Date datetime;
    
    
    //parameterized constructor with THREE parameters
    /*having an aggregation relationship with the Booking rather than being components of it
    by associating the objects passed Tourist, TourPackage as parameters with the Booking object
    */
    public Booking(Tourist tourist, TourPackage tourPackage, Date datetime){
        this.tourist = tourist;
        this.tourPackage = tourPackage;
        this.datetime = datetime; 
    }
    
    // declaring a standard getter methods for getTourPackage property
    public TourPackage getTourPackage(){
        return tourPackage;
    }
    
    // declaring a standard getter methods for getTourist property
    public Tourist getTourist(){
        return tourist;
    }
    
    // declaring a standard getter methods for getDateTime property
    public Date getDateTime(){
        return datetime;
    }
    
    String getDateTimeAsString(){
       SimpleDateFormat formatter = new SimpleDateFormat();
       return formatter.format(this.datetime);
    }
    
    /* a well formatted String that contains summary of the tourist name, 
    time of Booking and details of the tour Package*/
    @Override
    public String toString(){
             
             return        this.getTourist().getName()+", booked A "+this.getTourPackage().
                        getDescription()+" in and around "+this.getTourPackage()
                                .getLocation()+" with a total cost of "+this.
                                        getTourPackage().getTourCost()+"£ on " + this.getDateTimeAsString();
}
    
    @Override
    public int compareTo(Booking o) {
       return this.getDateTime().compareTo(o.getDateTime());
    }

}
