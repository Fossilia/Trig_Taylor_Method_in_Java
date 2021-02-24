


public class Trig {

    /**
     * Calculates the sine function using the taylor polynomial equation,
     * @param x input to go through the sine function
     * @return function file
     */
    public double sine_func(double x){
        double output = 0;
        x = x % (2 * 3.14159265359); //makes sure value is in the right range

        for(int k = 0; k<10; k++){ //go through 10 terms
            double value = 2*k+1;
            output += (power(-1, k)/(factorial(2*k+1))) * power(x, (value));
        }
        return output;
    }

    /**
     * Calculates the cos function using the taylor polynomial equation,
     * @param x input to go through the cos function
     * @return function file
     */
    public double cos_func(double x){

        if(x == 0){ //special case if input is 0
            return 1;
        }

        double output = 1;
        x = x % (2 * 3.14159265359); //makes sure value is in range

        for(int k = 0; k<10; k++){ //go through 10 terms
            double value = 2*k;
            output += ((power(-1, k) * power(x, (value))/(factorial(2*k))));
        }

        return output;
    }

    /**
     * Calculates the tan function using the taylor polynomial equation,
     * @param x input to go through the tan function
     * @return function file
     */
    public double tan_func(double x){
        double output = sine_func(x)/cos_func(x); //simply divide sin by cos to get the tan value
        return output;
    }

    /**
     * Converts degree value to radian
     * @param x degree value to radian
     * @return returns
     */
    public static double convert_to_Radians(double x){
        double output = x * (3.14159265358979323846/180);
        return output;

    }

    /**
     * gets the factorial of a number
     * @param n number to get factorial for
     * @return
     */
    public static long factorial(long n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

    /**
     * calculates the value the first number to the power of the second
     * @param a base value
     * @param b power value
     * @return
     */
    public double power(double a, double b){
        if(b == 0) return 1;
        return a * power(a, --b);
    }

}

