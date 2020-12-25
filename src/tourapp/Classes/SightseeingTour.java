/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourapp.Classes;

/**
 *
 * @author user
 */
public class SightseeingTour extends TourPackage{

    private double ticketCost;
    public double value;
    
    //parameterized constructor with FOUR parameters tourTicketCost including TourPackage properties
    public SightseeingTour(double ticketCost, String description,
            String location, double tourCost) {
        super(description, location, tourCost);
        this.ticketCost = ticketCost;
    }
    
    // declaring a standard getter methods for getTicketCost property
    public double getTicketCost(){
        return ticketCost;
    }
    
    // declaring a standard setter for updateTicketCost property
    //the newTicketCost cannot be less than the current ticketCost
    public void updateTicketCost(double newTicketCost){
    if (newTicketCost >= ticketCost)
        ticketCost = newTicketCost;
    }
    
    // a well formatted String that contains all the properties of SightseeingTour object including the ticket cost
    @Override
    public String toString(){
        return  "A custom tour package created With a ticket cost of "+ticketCost+": A "+this.getDescription()+
                " in "+this.getLocation()+" with a total cost of "+this.getTourCost()+"£";  
    }
    
    @Override
    public double getCost() {
         value = ticketCost + this.getTourCost();
        return value;
    }
    
}
