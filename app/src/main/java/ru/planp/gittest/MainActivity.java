package ru.planp.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_Button(View view) {
        TextView helloTextView = findViewById(R.id.textView);
        helloTextView.setText("TextButton");
    }

    public void onClick_IButton(View view) {
        TextView helloTextView = findViewById(R.id.textView);
        helloTextView.setText("Image Button");
    }

    public void onClick_IButton2(View view) {
        TextView helloTextView = findViewById(R.id.textView);
        helloTextView.setText("Image Button2");
    }

    public void onClick_IButton3(View view) {
        TextView helloTextView = findViewById(R.id.textView);
        helloTextView.setText("Image Button3");
    }

}
