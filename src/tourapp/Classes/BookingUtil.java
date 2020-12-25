/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourapp.Classes;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BookingUtil {
    
    public double[] calculateBill(ArrayList<Booking> bookings, Tourist tourist){
        double[] arrayTotalCostDisCost = new double [2];
        double  totalCost = 0;
        double totalDiscount = 0;
        double discountPercent = 0;
        
        arrayTotalCostDisCost[0] = totalCost;
        arrayTotalCostDisCost[1] = totalDiscount;
        
        ArrayList<Booking> touristBookings = new ArrayList<>();
        for (Booking b: bookings)
        {
            if (b.getTourist() == tourist)
            {
                touristBookings.add(b);
            }
        }
        
        for (Booking b: touristBookings)
        {
               totalCost += b.getTourPackage().getCost();
               totalDiscount += discountPercent * b.getTourPackage().getCost();
               
               if(touristBookings.indexOf(b) == 0){
                   discountPercent = 0.05;
               }
               
               if(discountPercent > 0.5){
                 discountPercent = 0.5;
               } else {
                   discountPercent += 0.05;
               }
        }
                arrayTotalCostDisCost[0] = totalCost;
                arrayTotalCostDisCost[1] = totalCost - totalDiscount;   
                
        return arrayTotalCostDisCost;
    }
}
