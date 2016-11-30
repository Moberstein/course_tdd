import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Locale;

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
        if(dividend == null || divisor == null) return "ERROR: NULL Value";
        else if(isNullOrWhitespace(dividend) || isNullOrWhitespace(divisor))
        {
            return "ERROR: Empty Value";
        }

        double dividend = Double.parseDouble(this.dividend);
        double divisor = Double.parseDouble(this.divisor);

        if(divisor == 0.0)
        {
            return "ERROR: Divide by zero";
        }

        double result = dividend / divisor;
        return String.format(Locale.ENGLISH, String.format("%%.%df", precision), result);
    }

    public boolean isNullOrWhitespace(String s)
    {
        if (s == null) return true;
        for (int i = 0; i < s.length(); i++)
        {
            if (!Character.isWhitespace(s.charAt(i)))
            {
                return false;
            }
        }

        return true;
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
