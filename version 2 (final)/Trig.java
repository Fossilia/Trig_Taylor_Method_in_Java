


public class Trig {

    public double sine_func(double x){
        double output = 0;
        x = x % (2 * 3.14159265359);

        for(int k = 0; k<10; k++){
            double value = 2*k+1;
            output += (power(-1, k)/(factorial(2*k+1))) * power(x, (value));
            //System.out.println(2*k+1);
        }

        return output;
    }

    public double cos_func(double x){

        if(x == 0){
            return 1;
        }

        double output = 0;
        x = x % (2 * 3.14159265359);

        for(int k = 0; k<10; k++){
            double value = 2*k;
            output += (power(-1, k)/(factorial(2*k))) * power(x, (value));
        }

        return output;
    }

    public double tan_func(double x){
        double output = sine_func(x)/cos_func(x);
        return output;
    }

    public static double convert_to_Radians(double x){
        double output = x * (3.14159265358979323846/180);
        return output;

    }

    public static long factorial(long n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }


    public double power(double base, double power){
        if(power == 0) return 1;
        return base * power(base, --power);
    }

}

