import org.junit.Assert;
import org.junit.Test;


public class TestHotelRates {
    @Test
    public void testForCostOfVisitOfRegularCustomer(){
        HotelRates rates = new HotelRates(100,90,90,95);
        Assert.assertEquals(290,rates.costOfVisitForRegularCustomer(2, 1));

    }

    @Test
    public void testForCostOfVisitOfRewardeeCustomer(){
        HotelRates rates = new HotelRates(100,90,90,95);
        Assert.assertEquals(275,rates.costOfVisitForRewardeeCustomer(2, 1));

    }
}
