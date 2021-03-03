package com.example.clinical_decision_making;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Float;
import java.util.ArrayList;
public class Medical extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.medical);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");

        if(prevac.charAt(1) == '1')
        {
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Not significant");



        }
        else if(prevac.charAt(1) == '2'){

            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Not significant ");




        }
        else if(prevac.charAt(1) == '3')
        {
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Not significant");



        }
        else if(prevac.charAt(1) == '4'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Not significant");



        }
        else if(prevac.charAt(1) == '5'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Not significant");



        }
        else if(prevac.charAt(1) == '6'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Not significant");



        }
        else if(prevac.charAt(1) == '7'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Not significant");



        }
        else if(prevac.charAt(1) == '8'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("atient is diabetic since 12 years and is on   \n" +
                    " Medications for the same .\n" +
                    " Patient is asthmatic since 8 years and is on for the  same\n" +
                    " Patient is on ayurvedic medication for snoring.");



        }
        else if(prevac.charAt(1) == '9'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("She is a known case hypertension and is on medication for the same since last 4 years.\n" +
                    "       Amlodipine 5 mg once daily.");



        }
        else if(prevac.charAt(1) == '0'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Not significant");



        }

    }
}
