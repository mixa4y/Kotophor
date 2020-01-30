package com.example.kotophor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = findViewById(R.id.constraintLayout);
        mInfoTextView = findViewById(R.id.textView);

        Button yellowButton = findViewById(R.id.buttonYellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));
            }
        });
    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.redColor));
        //Мы обращаемся к созданным ресурсам через специальный класс R и через точку указываем тип ресурсов, а затем имя ресурса.
    }
    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.greenColor));
    }
}
