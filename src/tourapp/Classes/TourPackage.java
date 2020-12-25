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
public abstract class TourPackage {
    //declaration of Tour package properties
    
    private String description;
    private String location;
    private double tourCost;
    
    //parameterized constructor with THREE parameters tour package name and tourist country
    public TourPackage(String description, String location, 
            double tourCost){
        this.description = description;
        this.location = location;
        this.tourCost = tourCost;
    }
    // decleration of Tourist Methods
    
    //declaring a getter for tour description
    public String getDescription(){
        return description;
    }
    
    //declaring a getter for tour location
    public String getLocation(){
        return location;
    }
    
    //declaring a getter for tour cost
    public double getTourCost(){
        return tourCost;
    }
    
    //an abstract method of tour cost
    public abstract double getCost();
    
    //update ONLY if new value is higher than the current tourCost
    public void updateTourCost(double newTourCost){
    if (newTourCost > tourCost)
    {
        tourCost = newTourCost;
        System.out.println("A custom tour package cost updated: A "+description+" in "+location+" with a total cost of " +this.getCost()+"£");
    }
    else
    {
        System.out.println("Base cost cannot be higher than the new Tour cost!");
    }
    }
     // a well formatted String that contains all the properties of Tour package object 
    @Override
    public String toString(){   
    return "A tour package added to TourApp: A "+description+", in "
            +location+", with a total cost of: "+tourCost+"£";
    }
    
}
