package ca.yorku.bmi.Model;

import org.junit.Test;

public class BMIModelTest {
    @Test
    public void toDoubleTest()
    {
        String s;
        System.out.println("Testing toDouble:");
        s = "60.78";
        System.out.println(s);
        System.out.println(BMIModel.toDouble(s));
    }
    @Test
    public void getAreaTest()
    {
        double w, h;
        System.out.println("Testing getArea:");
        w = 60; h = 0.5 + 2.5 * Math.random();
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w, h));
    }
    @Test
    public void formatBMITest()
    {
        double bmi;
        System.out.println("Testing formatBMI:");
        bmi = 31.14186851211073;
        System.out.println(bmi);
        System.out.println(BMIModel.formatBMI(bmi));
    }
}
