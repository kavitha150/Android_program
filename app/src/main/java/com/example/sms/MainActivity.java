package com.example.sms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.e1);
        t2=findViewById(R.id.e2);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String phone_number=t1.getText().toString();
                                      String msg=t2.getText().toString();
                                      Intent intent = new Intent(Intent.ACTION_SENDTO);
                                      intent.setData(Uri.parse("smsto:" + Uri.encode(phone_number))); // Set destination number
                                      intent.putExtra("sms_body", msg); // Add message content
                                      startActivity(intent);






                                  }
                              }
        );

    }
}