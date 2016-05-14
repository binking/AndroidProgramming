package com.binking.messager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "receive_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent gotIntent = getIntent();
        String showMessageText = gotIntent.getStringExtra(EXTRA_MESSAGE);
        TextView showMessageView = (TextView) findViewById(R.id.receive_message);
        showMessageView.setText(showMessageText);
    }
}
