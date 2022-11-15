package me.joana.pmd3_radio_juegos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView message = findViewById(R.id.message);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Radio button
    public void onRadioChange(View view) {
        message.setText(R.string.message);
        message.append(((RadioButton) view).getText());
    }

    // Checkbox
    public void onCheckBoxChange(View view) {
        if(((CheckBox) view).isChecked())
            message.setText(R.string.like);
        else
            message.setText(R.string.dislike);
    }
}