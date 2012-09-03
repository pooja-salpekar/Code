import org.junit.Assert;
import org.junit.Test;


public class TestHotel {
    @Test
    public void testForWeekdayRatesToRegularCustomer(){
        int weekDaysVisitCount=2;
        int weekEndDaysVisitCount=1;
        Hotel x= new Hotel(3,100,90,90,95);
        Customer aRegularCustomer= new Customer("regular");
        Assert.assertEquals(290,x.showRatesFor(aRegularCustomer,weekDaysVisitCount,weekEndDaysVisitCount));
    }
}
