
public class HotelRates {
    private int weekDayRateForRegularCustomer;
    private int weekDayRateForRewardeeCustomer;
    private int weekEndRateForRegularCustomer;
    private int weekEndRateForRewardeeCustomer;

    public HotelRates(int weekDayRateForRegularCustomer,int weekEndRateForRegularCustomer,int weekDayRateForRewardeeCustomer,int weekEndRateForRewardeeCustomer) {
        this.weekDayRateForRegularCustomer=weekDayRateForRegularCustomer;
        this.weekEndRateForRegularCustomer=weekEndRateForRegularCustomer;
        this.weekDayRateForRewardeeCustomer=weekDayRateForRewardeeCustomer;
        this.weekEndRateForRewardeeCustomer=weekEndRateForRewardeeCustomer;
    }


    public int costOfVisitForRegularCustomer(int weekDays, int weekEnds) {
         return((weekDays*weekDayRateForRegularCustomer)+(weekEnds*weekEndRateForRegularCustomer));
    }

    public int costOfVisitForRewardeeCustomer(int weekDays, int weekEnds) {
        return((weekDays*weekDayRateForRewardeeCustomer)+(weekEnds*weekEndRateForRewardeeCustomer));
    }
}
