import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    private List<Hotel> hotels =new ArrayList<Hotel>();
    private List<String> daysOfVisit =new ArrayList<String>();
    int[] cost = new int[3];


    public HotelManager(List<Hotel> hotels, List<String> daysOfVisit) {
        this.hotels=hotels;
        this.daysOfVisit=daysOfVisit;
    }


    public int numberOfWeekEnds(List<String> daysOfVisit) {
       int weekEndDayCount=0;
        for(String dayOfVisit:daysOfVisit){
            if (dayOfVisit=="saturday"||dayOfVisit=="sunday") weekEndDayCount++;

        }
        return weekEndDayCount;
    }

    public int numberOfWeekDays(List<String> daysOfVisit) {
        int weekDayCount=0;
        for(String dayOfVisit:daysOfVisit){
            if (!(dayOfVisit=="saturday")&&!(dayOfVisit=="sunday")) weekDayCount++;

        }
        return weekDayCount;
    }

    public Hotel selectHotelFor(Customer customer) {
        int minCost=100000,counter=0;

        for(Hotel hotel:hotels){
            cost[counter]=hotel.showRatesFor(customer,numberOfWeekDays(this.daysOfVisit),numberOfWeekEnds(this.daysOfVisit));
            if(cost[counter]<minCost)
                minCost=cost[counter];
            counter++;
        }
        return hotelCostMatchingWithMinCost(minCost, counter);
         //To change body of created methods use File | Settings | File Templates.
    }

    private Hotel hotelCostMatchingWithMinCost(int minCost, int counter) {
        boolean duplicateCostFound = false;
        Hotel bestHotel = null;
        for(int count=0;count<counter;count++){
            for(int innerLoopCount = count+1;innerLoopCount<counter;innerLoopCount++){
                if (cost[count]==cost[innerLoopCount]){
                    duplicateCostFound=true;
                    bestHotel = getHotelWithMaximumRating(hotels.get(count),hotels.get(innerLoopCount));
                }
            }
        }
        if(!duplicateCostFound){
        for(int count=0;count<counter;count++){
            if(cost[count]==minCost)
                bestHotel=hotels.get(count);
        }
        }
        return bestHotel;
    }

    private Hotel getHotelWithMaximumRating(Hotel hotel, Hotel hotelWithSameCost) {
        return hotel.giveHotelWithMaximumRating(hotelWithSameCost) ;
    }
}
