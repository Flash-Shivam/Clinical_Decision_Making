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

public class Xray extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.xray);
        Intent activitythat = getIntent();
        String prevac = activitythat.getExtras().getString("callAc");
        if(prevac.equals("1")){
            ImageView z = (ImageView) findViewById(R.id.ter4);
            z.setImageResource(R.drawable.pateint1_xray);
        }
        else if(prevac.equals("2"))
        {
            ImageView z = (ImageView) findViewById(R.id.ter4);
            z.setImageResource(R.drawable.mona_xray);
        }
        else if(prevac.equals("3"))
        {
            ImageView z = (ImageView) findViewById(R.id.ter4);
            z.setImageResource(R.drawable.patient3_xray);
        }
        else if(prevac.equals("4"))
        {

        }
        else if(prevac.equals("5"))
        {
            ImageView z = (ImageView) findViewById(R.id.ter4);
            z.setImageResource(R.drawable.patient5_xray);
        }
        else if(prevac.equals("6"))
        {
            ImageView z = (ImageView) findViewById(R.id.ter4);
            z.setImageResource(R.drawable.amit_xray);
        }
        else if(prevac.equals("7"))
        {
            ImageView z = (ImageView) findViewById(R.id.ter4);
            z.setImageResource(R.drawable.recession);
        }
        else if(prevac.equals("8"))
        {

        }
        else if(prevac.equals("9"))
        {
            ImageView z = (ImageView) findViewById(R.id.ter4);
            z.setImageResource(R.drawable.patient9_xray);
        }


    }
}
