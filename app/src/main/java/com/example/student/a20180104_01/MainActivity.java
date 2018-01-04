package com.example.student.a20180104_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //不要第上面setContentView時，可以自己做TextView
        //TextView tv=new TextView(this);
        //tv.setText("HELLO,FRANK");
        //setContentView(tv);

        //同上，自己做button
        Button b1=new Button(this);
        b1.setText("click me");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();

            }
        });
        Button b2=new Button(this);
        b2.setText("click me2");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"2 is Clicked",Toast.LENGTH_SHORT).show();

            }
        });
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.addView(b1);
        ll.addView(b2);
        setContentView(ll);
    }
}
