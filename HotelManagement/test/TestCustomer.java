
import org.junit.Assert;
import org.junit.Test;

public class TestCustomer {
    @Test
    public void testIfCustomerIsRegular(){
    String dayOfVisit="sunday";
    Customer customer = new Customer("regular");
    Assert.assertTrue(customer.isRegular());
    }
}
