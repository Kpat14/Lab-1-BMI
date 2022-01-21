package ca.yorku.bmi;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText weight,height;
    TextView resultText;
    String calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weightBox);
        height = findViewById(R.id.heightBox);
        resultText = findViewById(R.id.answer);


    }
    public void calculateBMI(View view){
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();

        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2);

        float bmi = weightValue / (heightValue * heightValue);

        DecimalFormat df = new DecimalFormat(".00");
        calculation = String.valueOf(df.format(bmi));

        resultText.setText(calculation);


    }
}