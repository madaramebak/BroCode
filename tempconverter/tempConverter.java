package tempconverter;


public class tempConverter{
    public static double toCelsius(double temp){
        return (temp - 32) * 5/9;
    }

    public static double toFarenheit(double temp){
        return (temp * 9/5) + 32;
    }
}