package com.binking.messager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.binking.messager.R.id.send_message;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    public void onSendMessage(View view){
        EditText messageView = (EditText)findViewById(send_message); // 由ID获得编辑框对
        String messageText = messageView.getText().toString(); // 从编辑框提取信息
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        // this: current CreateMessageActivity object
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText); // 将编辑框的内容放进intent
        startActivity(intent);
    }
}
