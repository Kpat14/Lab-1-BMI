package ca.yorku.bmi.Model;

public class BMIModel {
    public static double toDouble(String s){
        return Double.parseDouble(s);
    }
    public static double getBMI(double w, double h){
        return w/(h*h);
    }
    public static String formatBMI(double bmi){
        return String.format("%.2f",bmi);
    }

}
