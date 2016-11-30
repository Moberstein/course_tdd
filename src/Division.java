import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Division {

    private String dividend,
            divisor;
    private int precision;

    //----- Constructor -----
    public Division(String dividend, String divisor) {
        this(dividend, divisor, 0);
    }

    public Division(String dividend, String divisor, int precision) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.precision = precision;
    }
    //-----  -----


    //----- Methods -----
    /*public Object divide() {
        throw new NotImplementedException();
    }*/

    public Object divide()
    {
        double result = Double.parseDouble(this.dividend) / Double.parseDouble(this.divisor);
        return String.format(String.format("%%.%df", precision), result);
    }
    //-----  -----


    //----- Getter and Setter
    public String getDividend() {
        return dividend;
    }

    public void setDividend(String dividend) {
        this.dividend = dividend;
    }

    public String getDivisor() {
        return divisor;
    }

    public void setDivisor(String divisor) {
        this.divisor = divisor;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    //-----  -----
}
