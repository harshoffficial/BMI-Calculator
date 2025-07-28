package com.harsh.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.splashscreen.SplashScreen;

public class MainActivity extends AppCompatActivity {

    EditText height, weight;
    Button button;
    TextView bmi;

    Spinner heightUnitSpinner;
    Spinner weightUnitSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);

        setContentView(R.layout.activity_main);

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        button = findViewById(R.id.button);
        bmi = findViewById(R.id.bmi);
        heightUnitSpinner = findViewById(R.id.height_unit_spinner);
        weightUnitSpinner = findViewById(R.id.weight_unit_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.height_units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        heightUnitSpinner.setAdapter(adapter);

        ArrayAdapter<CharSequence> weightAdapter = ArrayAdapter.createFromResource(this,
                R.array.weight_units, android.R.layout.simple_spinner_item);
        weightAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weightUnitSpinner.setAdapter(weightAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heightStr = height.getText().toString();
                String weightStr = weight.getText().toString();
                String selectedUnit = heightUnitSpinner.getSelectedItem().toString();
                String selectedWeightUnit = weightUnitSpinner.getSelectedItem().toString();

                if (!heightStr.isEmpty() && !weightStr.isEmpty()) {
                    double h = Double.parseDouble(heightStr);
                    double w = Double.parseDouble(weightStr);

                    // Convert height based on selected unit
                    if (selectedUnit.equals("feet")) {
                        h = h * 0.3048; // Convert feet to meters
                    } else if (selectedUnit.equals("cm")) {
                        h = h / 100; // Convert cm to meters
                    }
                    // Convert weight based on selected unit
                    if (selectedWeightUnit.equals("pounds")) {
                        w = w * 0.453592; // Convert pounds to kg
                    } else if (selectedWeightUnit.equals("stones")) {
                        w = w * 6.35029; // Convert stones to kg
                    }
                    // Calculate BMI



                    double bmiValue = w / (h * h);
                    bmi.setText(String.format("BMI: %.2f", bmiValue));
                    bmi.setVisibility(View.VISIBLE);
                } else {
                    bmi.setText("Please enter valid height and weight");
                    bmi.setVisibility(View.VISIBLE);
                }


            }

        });
    }
}