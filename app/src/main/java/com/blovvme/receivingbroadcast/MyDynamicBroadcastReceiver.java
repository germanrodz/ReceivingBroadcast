package com.blovvme.receivingbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class MyDynamicBroadcastReceiver extends BroadcastReceiver {

    TextView txt;

    public MyDynamicBroadcastReceiver(TextView txt){
        this.txt=txt;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        txt.setText(intent.getStringExtra("send"));
    }
}
