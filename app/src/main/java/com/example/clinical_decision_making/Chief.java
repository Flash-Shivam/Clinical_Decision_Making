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
public class Chief extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chief);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");

        if(prevac.charAt(1) == '1')
        {
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient complains of bleeding gums while brushing poor esthetics due  deposits on teeth and wants to get it cleaned.");



        }
        else if(prevac.charAt(1) == '2'){

            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient reported with a complaint of mobility and bleeding gums since 3-4 years");




        }
        else if(prevac.charAt(1) == '3')
        {
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient referred for reduced clinical crown height");



        }
        else if(prevac.charAt(1) == '4'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient reported with complaint of poor esthetics due to pigmented gums.");



        }
        else if(prevac.charAt(1) == '5'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient c/o swelling and bleeding in the upper and lower front region of the jaw since 15 days.");



        }
        else if(prevac.charAt(1) == '6'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient reported with complaint of pus drainage and swelling from lower right back region of the jaw.");



        }
        else if(prevac.charAt(1) == '7'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient  reported with a complaint of displaced gums since 1 year.");



        }
        else if(prevac.charAt(1) == '8'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient complaints of bleeding gums since 2 months.");



        }
        else if(prevac.charAt(1) == '9'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient c/o pain and food lodgement in upper left back region of jaw since 10 days.");



        }
        else if(prevac.charAt(1) == '0'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient c/o spacing between upper front region of the jaw.");



        }

    }

}
