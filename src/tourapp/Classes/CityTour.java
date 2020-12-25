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
public class CityTour extends TourPackage {
    
    private boolean withGuide;
    private double guideCost;
    public double value;

    //parameterized constructor with FIVE parameters withGuide,guideCost including TourPackage properties
    //also invoking the superclass(TourPackage) constructor using SUPER
    public CityTour(boolean WithGuide, double GuideCost, 
            String description, String location, double tourCost) {
        super(description, location, tourCost);
        this.withGuide = WithGuide;
        this.guideCost = GuideCost;
        
    }
    
    // declaring a standard getter methods for guideCost property
    public double getGuideCost(){
        return guideCost;
    }
    
    // declaring a standard setter for guideCost property
    //the newGuideCost cannot be less than the current guideCost
    public void updateGuideCost(double newGuideCost){
     if( newGuideCost >= guideCost){
        guideCost = newGuideCost;

     }
    }
    
    // declaring a standard getter methods for withGuide property
    public boolean isWithGuide(){
     return withGuide;
    }
    
    // a well formatted String that contains all the properties of City Tour object
    @Override
    public String toString(){
 
        // to retun the statement for which there is a tour guide 
          if(withGuide == true)
          return
        "A custom tour package created With Guide: A "+this.getDescription()+
                " in "+this.getLocation()+" with a total cost of "+this.getTourCost()+"£";
        
        // to retun the statement for which there is no tour guide 
        else
              return "A custom tour package created Without a Guide: A "+this.getDescription()+
                " in "+this.getLocation()+" with a total cost of "+this.getTourCost()+"£";
                
    }
    // the overridden abstract getCost gets the cost of guideCost if true 
    // and add to tour cost and returns the total value
    @Override
     public double getCost(){
         if( withGuide == true)
         value = guideCost + this.getTourCost();
         else value = this.getTourCost();
        return value;
        
    }
}
