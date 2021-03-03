package com.example.clinical_decision_making;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

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

public class Details extends Activity {

    ArrayList<String> patients = new ArrayList<String>();
    String p = "";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.detail);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");

        if(prevac.charAt(1) == '1')
        {
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name : Patient 1");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 48";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Male";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Worker";
            xx1.setText(m1);


        }
        else if(prevac.charAt(1) == '2'){

            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name : Patient 2");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 39";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Female";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Housewife";
            xx1.setText(m1);



        }
        else if(prevac.charAt(1) == '3')
        {
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name : Patient 3");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 15";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Male";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Student";
            xx1.setText(m1);


        }
        else if(prevac.charAt(1) == '4'){
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name :Patient 4");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 27";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Male";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Unknown";
            xx1.setText(m1);


        }
        else if(prevac.charAt(1) == '5'){
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name : Patient 5");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 21";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Male";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Student";
            xx1.setText(m1);


        }
        else if(prevac.charAt(1) == '6'){
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Patient 6");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 28";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Male";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Unknown";
            xx1.setText(m1);


        }
        else if(prevac.charAt(1) == '7'){
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name : Patient 7");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 36";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Male";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Student";
            xx1.setText(m1);


        }
        else if(prevac.charAt(1) == '8'){
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name : Patient 8");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 54";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Female";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Housewife";
            xx1.setText(m1);


        }
        else if(prevac.charAt(1) == '9'){
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name : Patient 9");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 49";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Female";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Housewife";
            xx1.setText(m1);


        }
        else if(prevac.charAt(1) == '0'){
            TextView v = (TextView) findViewById(R.id.ter1);
            v.setText("Name : Patient 10");
            TextView x = findViewById(R.id.ter2);
            String i = "Age : 19";
            x.setText(i);

            TextView xx = findViewById(R.id.ter3);
            String m = "Sex: Female";
            xx.setText(m);

            TextView xx1 = findViewById(R.id.ter5);
            String m1 = "Occupation: Unknown";
            xx1.setText(m1);


        }




        p = prevac.substring(1,2);




    }


    public void get_xray(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Xray.class);

        changescreen.putExtra("callAc",p);


        startActivity(changescreen);
    }

    public void get_cbct(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Cbct.class);

        changescreen.putExtra("callAc",p);


        startActivity(changescreen);
    }

    public void get_view(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,VIew.class);

        changescreen.putExtra("callAc",p);


        startActivity(changescreen);
    }

}
