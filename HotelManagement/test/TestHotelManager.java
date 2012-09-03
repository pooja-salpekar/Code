import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.XMLFormatter;


public class TestHotelManager {
    Hotel hotelX = new Hotel(3,100,120,90,95);
    Hotel hotelY = new Hotel(5,120,100,100,90);
    Hotel hotelZ = new Hotel(4,195,150,120,90);
    List<Hotel> hotels =new ArrayList<Hotel>();
    List<String> daysOfVisit =new ArrayList<String>();

    @Test
    public void testForNumberOfWeekendDaysInGivenVisitDayLists(){
        daysOfVisit.add("sunday");
        daysOfVisit.add("monday");
        daysOfVisit.add("tuesday");
        HotelManager hotelManager = new HotelManager(hotels,daysOfVisit);
        Assert.assertEquals(1,hotelManager.numberOfWeekEnds(daysOfVisit));

    }

    @Test
    public void testForNumberOfWeekDaysInGivenVisitDayLists(){
        daysOfVisit.add("sunday");
        daysOfVisit.add("monday");
        daysOfVisit.add("tuesday");
        HotelManager hotelManager = new HotelManager(hotels,daysOfVisit);
        Assert.assertEquals(2,hotelManager.numberOfWeekDays(daysOfVisit));

    }

    @Test
    public void testIfCustomerGetsHotelWithMinimumCost(){
      hotels.add(hotelX);
      hotels.add(hotelY);
      daysOfVisit.add("sunday");
      daysOfVisit.add("monday");
      daysOfVisit.add("tuesday");
      HotelManager hotelManager = new HotelManager(hotels,daysOfVisit);
      Customer aRewardeeCustomer = new Customer("rewardee");
      Assert.assertEquals(hotelX,hotelManager.selectHotelFor(aRewardeeCustomer));

    }

    @Test
    public void testIfCustomerGetsHotelWithMaximumRatimgInCaseOfTie(){
        hotels.add(hotelX);
        hotels.add(hotelY);
        hotels.add(hotelZ);
        daysOfVisit.add("saturday");
        daysOfVisit.add("sunday");
        daysOfVisit.add("monday");
        daysOfVisit.add("tuesday");
        HotelManager hotelManager = new HotelManager(hotels,daysOfVisit);
        Customer aRegularCustomer = new Customer("regular");
        Assert.assertEquals(hotelY,hotelManager.selectHotelFor(aRegularCustomer));
    }

}
