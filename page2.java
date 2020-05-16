package com.example.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page2<count> extends AppCompatActivity {
    TextView tv1;
    int count = 0;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        tv1 = (TextView) findViewById(R.id.textView2);

        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button6);
        b4=findViewById(R.id.button7);
    }
    public void score(View v) {
        int id = v.getId();
        if (id == R.id.button2) {
            count++;
        }
        tv1.setText("Your Score="+count);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b2.setBackgroundColor(Color.parseColor("#00ff00"));
        b1.setBackgroundColor(Color.parseColor("#ff0000"));
        b3.setBackgroundColor(Color.parseColor("#ff0000"));
        b4.setBackgroundColor(Color.parseColor("#ff0000"));
    }
    public void next(View v) {
        Intent i1=new Intent(this,page3.class);
        i1.putExtra("val",count);
        startActivity(i1);
    }

    public void end(View view) {
        Intent i1=new Intent(this,Final.class);
        i1.putExtra("val",count);
        startActivity(i1);
    }
}
