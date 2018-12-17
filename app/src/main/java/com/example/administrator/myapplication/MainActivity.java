package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  hehe(View view){
        TextView textView = (TextView)findViewById(R.id.wjk);
        textView.setVisibility(View.GONE);

        Button button = (Button) view;
        String buttonStr =  button.getText().toString();
        Log.d("23",buttonStr);
        if (buttonStr.equals("按钮")){
           Log.d("1", "23");
        }
    }
}
