package com.felight.nammabengaluruexplorer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
    private EditText etmail;
    private EditText etpassword;
    private Button btnlog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etmail=(EditText)findViewById(R.id.etmail);
        etpassword=(EditText)findViewById(R.id.etpassword);
        btnlog=(Button)findViewById(R.id.btnlog);

    }
}
