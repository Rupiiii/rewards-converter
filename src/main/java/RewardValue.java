public class RewardValue {
    private final double cashValue;
    public static final double RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = ToCash(milesValue);
    }
    

    public  int ToMiles(double cashValue) {
        return (int) (cashValue / RATE);
    }

    public double ToCash(int milesValue) {
        return milesValue * RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return ToMiles(this.cashValue);
    }
}