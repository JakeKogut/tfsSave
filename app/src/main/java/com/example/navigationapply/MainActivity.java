package com.example.navigationapply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rdoGroup;
    private RadioButton radioButton;
    private Button btnChange;
    private final int REQUEST_CODE=2;
    private String radio;
    private EditText nom;
    private EditText nomL;
    private EditText telephone;
    private EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom=findViewById(R.id.editTextName);
        nom=findViewById(R.id.editTextLName);
        telephone=findViewById(R.id.editTextPhone);
        email=findViewById(R.id.editTextEmail);


        btnChange=findViewById(R.id.btnChange);

        rdoGroup = findViewById(R.id.rdoGroup);
        rdoGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton=findViewById(checkedId);
                switch(radioButton.getId()){
                    case R.id.rdoVisit:
                        radio = "Visiteur";
                        break;
                    case R.id.rdoStaff:
                        radio = "Staff";

                        break;
                    case R.id.rdoStudent:
                        radio = "Élève";

                        break;





                }
            }
        });
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("radio",radio);
                intent.putExtra("name",nom.getText());
                intent.putExtra("nameL",nomL.getText());
                intent.putExtra("telephone",telephone.getText());
                intent.putExtra("email",email.getText());
                startActivityForResult(intent,REQUEST_CODE);

            }
        });


    }
}