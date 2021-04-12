package com.example.clinical_decision_making;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
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
public class Front extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);







    }

    public void feedit(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Second.class);

        changescreen.putExtra("callAc","j");


        startActivity(changescreen);
    }

    public void patient(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Patient.class);

        changescreen.putExtra("callAc","j");


        startActivity(changescreen);
    }

    public void material3(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Material3.class);

        changescreen.putExtra("callAc","j");


        startActivity(changescreen);
    }

    public void material1(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Material1.class);

        changescreen.putExtra("callAc","j");


        startActivity(changescreen);
    }

    public void material2(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Material2.class);

        changescreen.putExtra("callAc","j");


        startActivity(changescreen);
    }


    public void feedbackit(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Feedback2.class);

        changescreen.putExtra("callAc","j");


        startActivity(changescreen);
    }

    public void gallery(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent changescreen = new Intent(this,Gallery.class);

        changescreen.putExtra("callAc","j");


        startActivity(changescreen);
    }

}