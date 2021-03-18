package com.example.clinical_decision_making;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import java.util.Random;

public class Plan extends Activity {

    String ed = "";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.feedback);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");


        ed = prevac.substring(1,2);












    }


    public void treatment(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        //AutoCompleteTextView ed = findViewById(R.id.Auto);



            Intent changescreen = new Intent(this,Treatment.class);
            changescreen.putExtra("callAc", ed);
            startActivity(changescreen);



    }







}