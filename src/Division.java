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

    public String divide()
    {
        double divident = Double.parseDouble(this.dividend);
        double divisor = Double.parseDouble(this.divisor);

        if(divisor == 0.0)
        {
            return "ERROR: Divide by zero";
        }

        double result = divident / divisor;
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
