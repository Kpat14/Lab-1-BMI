package ca.yorku.bmi.Model;

import org.junit.Test;

public class BMIModelTest {
    @Test
//    public void getAreaTest()
//    {
//        double w, h;
//        System.out.println("Testing getArea:");
//        w = 90; h = 1.7;
//        System.out.println(w + "," + h);
//        System.out.println(BMIModel.getBMI(w, h));
//    }

    public void formatBMITest()
    {
        double bmi;
        System.out.println("Testing formatBMI:");
        bmi = 31.14186851211073;
        System.out.println(bmi);
        System.out.println(BMIModel.formatBMI(bmi));
    }
}
