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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Second extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAct");

        TextView v = (TextView) findViewById(R.id.ter1);

        TextView x = findViewById(R.id.ter2);
        String i = "A dental implant (also known as an endosseous implant or fixture) is a surgical component that interfaces with the bone of the jaw or skull to support a dental prosthesis such as a crown, bridge, denture, facial prosthesis or to act as an orthodontic anchor. The basis for modern dental implants is a biologic process called osseointegration, in which materials such as titanium form an intimate bond to bone. The implant fixture is first placed so that it is likely to osseointegrate, then a dental prosthetic is added. A variable amount of healing time is required for osseointegration before either the dental prosthetic (a tooth, bridge or denture) is attached to the implant or an abutment is placed which will hold a dental prosthetic/crown.";
        x.setText(i);

        TextView xx = findViewById(R.id.ter3);
        String m = "Medical Uses: \nThe primary use of dental implants is to support dental prosthetics (i.e. false teeth). Modern dental implants make use of osseointegration, the biologic process where bone fuses tightly to the surface of specific materials such as titanium and some ceramics. The integration of implant and bone can support physical loads for decades without failure.";
        xx.setText(m);

        ImageView z = (ImageView) findViewById(R.id.ter4);
        z.setImageResource(R.drawable.single_crown_implant);
    }








}
