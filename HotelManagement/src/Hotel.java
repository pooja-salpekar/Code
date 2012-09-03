
public class Hotel {
    private int rating;
    private HotelRates rates;

    public Hotel(int rating,int weekDayRateForRegularCustomer,int weekEndRateForRegularCustomer,int weekDayRateForRewardeeCustomer,int weekEndRateForRewardeeCustomer) {
        this.rating=rating;
        rates = new HotelRates(weekDayRateForRegularCustomer,weekEndRateForRegularCustomer,weekDayRateForRewardeeCustomer,weekEndRateForRewardeeCustomer);
    }

    public int showRatesFor(Customer customer, int weekDaysVisitCount, int weekEndDaysVisitCount) {
        if(customer.isRegular())
            return rates.costOfVisitForRegularCustomer(weekDaysVisitCount,weekEndDaysVisitCount);
        return (rates.costOfVisitForRewardeeCustomer(weekDaysVisitCount,weekEndDaysVisitCount));
    }

    public Hotel giveHotelWithMaximumRating(Hotel other) {
        if (this.rating>other.rating)
            return this;
        return other;
    }
}
