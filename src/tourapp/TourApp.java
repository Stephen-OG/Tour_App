/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourapp;

import java.time.Instant;
import static java.time.Instant.now;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import tourapp.Classes.TourPackage;
import tourapp.Classes.BookingUtil;
import tourapp.Classes.CityTour;
import tourapp.Classes.Booking;
import tourapp.Classes.AudioLanguage;
import tourapp.Classes.Tourist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JFrame;
import tourapp.Classes.SightseeingTour;
import tourapp.Classes.TourAgent;
import tourapp.Views.TourAppAgentView;
import tourapp.Views.TourAppSystem;

/**
 *
 * @author user
 */
public class TourApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<TourPackage> tourPackages = new ArrayList<TourPackage>(); 
        
        
	   tourPackages.add(new CityTour(true, 20, "city tour", "NewYork", 300)) ;
	   tourPackages.add(new SightseeingTour(24, "SightSeeingTour", "London", 400));
           
           System.out.println(tourPackages);
           
           Tourist tourist = new Tourist("Jack","England",AudioLanguage.ENGLISH);

           System.out.println(tourist);
           
           Date bookingDate = new Date();
 
           Booking sightSeeingTourbooking = new Booking(tourist, tourPackages.get(1), bookingDate);

           
           System.out.println(sightSeeingTourbooking);
           
           CityTour cityTour = new CityTour(false, 20, "city tour", "Liverpool", 100);
           tourPackages.add(cityTour);
           
           Booking cityTourBooking = new Booking(tourist, tourPackages.get(2), bookingDate);
           
           System.out.println(cityTourBooking);
 
           ArrayList<Booking> bookings = new ArrayList<Booking>();
           bookings.add(sightSeeingTourbooking);             
           bookings.add(cityTourBooking);
           
           BookingUtil util = new BookingUtil();
           double [] billAndDiscountedBillArray = new double[2];
           
           billAndDiscountedBillArray = util.calculateBill(bookings, tourist);
           
           double bill = billAndDiscountedBillArray[0];
           double discountedBill = billAndDiscountedBillArray[1];
           
           System.out.println("Total Bill for " + tourist.getName()+": "+bill+'£');
           System.out.println("Discounted Bill for " + tourist.getName()+": "+discountedBill+'£');
           
           bookings.get(1).getTourPackage().updateTourCost(500);
           
           billAndDiscountedBillArray = util.calculateBill(bookings, tourist);
           bill = billAndDiscountedBillArray[0];
           discountedBill = billAndDiscountedBillArray[1];
           
           System.out.println("Total Bill for " + tourist.getName()+": "+bill+'$');
           System.out.println("Discounted Bill for " + tourist.getName()+": "+discountedBill+'$');
           
           
           
           
           ArrayList<TourAgent> agents = new ArrayList<TourAgent>();
           agents.add(new TourAgent("Mide","Ghana"));
           agents.add(new TourAgent("Josh","Ghana"));
           System.out.println(agents);

            TourAppAgentView agentGui = new TourAppAgentView();
            JFrame agentFrame = new JFrame();
            agentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            agentFrame.getContentPane().add(agentGui);
            agentFrame.pack();
            agentFrame.setVisible(true);
            
            TourAppSystem tourAppGui = new TourAppSystem();
            JFrame tourAppFrame = new JFrame();
            tourAppFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tourAppFrame.getContentPane().add(tourAppGui);
            tourAppFrame.pack();
            tourAppFrame.setVisible(true);
            
            
            
    }
    
}
