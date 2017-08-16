package com.blovvme.receivingbroadcast;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyDynamicBroadcastReceiver dynamicBroadcast;
    IntentFilter intentFilter;
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView)findViewById(R.id.tvText);
        dynamicBroadcast = new MyDynamicBroadcastReceiver(tvText);
    }


    @Override
    protected void onStart() {
        super.onStart();

        intentFilter =  new IntentFilter();
        intentFilter.addAction("doSomething1");
        registerReceiver(dynamicBroadcast,intentFilter);

    }

    @Override
    protected void onStop() {
        super.onStop();



    }
}
