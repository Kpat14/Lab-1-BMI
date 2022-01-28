package ca.yorku.bmi.Model;

public class BMIModel {
    public static double toDouble(String input){
        return Double.parseDouble(input);
    }
    public static double getBMI(double weight, double height){
        return weight/(height*height);
    }
    public static String formatBMI(double bmi){
        return String.format("%.2f",bmi);
    }

}
