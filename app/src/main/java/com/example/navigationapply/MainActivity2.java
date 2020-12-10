package com.example.navigationapply;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView disFirstLName;
    private TextView disTelephone;
    private TextView disEmail;
    private TextView disRole;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        disFirstLName=findViewById(R.id.disFirstLName);
        disTelephone=findViewById(R.id.disTelephone);
        disEmail=findViewById(R.id.disEmail);
        disRole=findViewById(R.id.disRole);

        Bundle extras=getIntent().getExtras();

        if(extras!=null)
        {
            String radio=extras.getString("radio");
            String firstName= extras.getString("name");
            String lastName= extras.getString("nameL");
            String telephone= extras.getString("telephone");
            String email= extras.getString("email");

            disRole.setText(radio);
            disFirstLName.setText(firstName+" "+ lastName);
            disTelephone.setText(telephone);
            disEmail.setText(email);

        }





    }
}