package com.example.test.hide_show;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txt1);
        textView.setVisibility(View.VISIBLE);

    }
    public void hideMe(View view)

    {
        boolean checked = ((ToggleButton) view).isChecked();
        if (checked)
        {
            textView.setVisibility(View.INVISIBLE);

        }
        else
        {
            textView.setVisibility(View.VISIBLE);
        }
    }
}
