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

import java.util.Random;

public class Plan extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.feedback);

        Intent activitthat = getIntent();

        String prevacg = activitthat.getExtras().getString("callAct");

        TextView v = (TextView) findViewById(R.id.ter1);





    }




    public void Cha(View view) {



        EditText r = (EditText) findViewById(R.id.yar);
        EditText s = (EditText) findViewById(R.id.yar2);
        EditText t = (EditText) findViewById(R.id.yar3);
        EditText v = (EditText) findViewById(R.id.yar4);
        EditText w = (EditText) findViewById(R.id.yar5);
        EditText w1 = (EditText) findViewById(R.id.yar6);

        String send = r.getText().toString() + "@" + s.getText().toString() + "%" + t.getText().toString() + "#" + v.getText().toString() + "$" + w.getText().toString() + "*" + w1.getText().toString();


    }



}