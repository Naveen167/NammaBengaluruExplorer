package com.felight.nammabengaluruexplorer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration1 extends Activity {
    private EditText etname;
    private EditText etmail;
    private EditText etpassword;
    private EditText etrep;
    private EditText etnum;
    private Button btnsubmit;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
    private Matcher matcher;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration1);
        etname=(EditText)findViewById(R.id.etname);
        etmail=(EditText)findViewById(R.id.etmail);
        etpassword=(EditText)findViewById(R.id.etpassword);
        etrep=(EditText)findViewById(R.id.etrep);
        etnum=(EditText)findViewById(R.id.etnum);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.tv4);
        tv5=(TextView)findViewById(R.id.tv5);



        btnsubmit=(Button)findViewById(R.id.btnsubmit);

    }
    public void onclick(View view){
        if (etname.getText().toString().length() == 0)
            etname.setError("Enter the name please");
      else   if (etpassword.getText().toString().length() == 0)
            etpassword.setError("Enter the password please");
        else if(etpassword.getText().toString().length()<6)
            etpassword.setError("Password is too short,it must contain 6 letters atleast");
        else if(etnum.getText().toString().length()<12)
            etnum.setError("Mobile number must be a 10 digit number");
       else if(etrep.getText().toString().length() == 0)
            etrep.setError("Repeat the password please");
        else   if (!etrep.getText().toString().equals(etpassword.getText().toString()))
            etrep.setError("Password is not matching");

       else {
            sendmail();

        }

    }
    private boolean isValidEmaillId(String EemailText) {


        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(EemailText).matches();


    }

    public static boolean isEditTextContainEmail(EditText argEditText) {

        try {
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcher = pattern.matcher(argEditText.getText());
            return matcher.matches();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }}
    public void sendmail(){
        try{
            SendMailActivity sm=new SendMailActivity(this,etmail.getText().toString(),"sucess","Welcome to Bangalore");
            Toast.makeText((getApplicationContext()),etmail.getText().toString(),Toast.LENGTH_SHORT).show();
            sm.execute();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }



}
