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
public class Patient extends Activity {

    ArrayList<String> patients = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.patient);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAct");

        patients.add("Case #01");
        patients.add("Case #02");
        patients.add("Case #03");
        patients.add("Case #04");
        patients.add("Case #05");
        patients.add("Case #06");
        patients.add("Case #07");
        patients.add("Case #08");
        patients.add("Case #09");
        patients.add("Case #10");
        AutoCompleteTextView ed = findViewById(R.id.Auto);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,patients   );
        ed.setAdapter(adapter);







    }

    public void get_details(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String u = ed.getText().toString();
        if(u.equals("")){
            Toast.makeText(this, "Please select a patient", Toast.LENGTH_LONG).show();
        }
        else {
            String z = "";
            z = u.substring(6,8);
            Intent changescreen = new Intent(this,Details.class);
            changescreen.putExtra("callAc", z);
            startActivity(changescreen);

        }

    }

    public void get_chief(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String u = ed.getText().toString();
        if(u.equals("")){
            Toast.makeText(this, "Please select a patient", Toast.LENGTH_LONG).show();
        }
        else {
            String z = "";
            z = u.substring(6,8);
            Intent changescreen = new Intent(this,Chief.class);
            changescreen.putExtra("callAc", z);
            startActivity(changescreen);

        }

    }

    public void get_history_pre(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String u = ed.getText().toString();
        if(u.equals("")){
            Toast.makeText(this, "Please select a patient", Toast.LENGTH_LONG).show();
        }
        else {
            String z = "";
            z = u.substring(6,8);
            Intent changescreen = new Intent(this,History_pre.class);
            changescreen.putExtra("callAc", z);
            startActivity(changescreen);

        }

    }

    public void get_history_dental(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String u = ed.getText().toString();
        if(u.equals("")){
            Toast.makeText(this, "Please select a patient", Toast.LENGTH_LONG).show();
        }
        else {
            String z = "";
            z = u.substring(6,8);
            Intent changescreen = new Intent(this,Dental.class);
            changescreen.putExtra("callAc", z);
            startActivity(changescreen);

        }

    }

    public void get_history_medical(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String u = ed.getText().toString();
        if(u.equals("")){
            Toast.makeText(this, "Please select a patient", Toast.LENGTH_LONG).show();
        }
        else {
            String z = "";
            z = u.substring(6,8);
            Intent changescreen = new Intent(this,Medical.class);
            changescreen.putExtra("callAc", z);
            startActivity(changescreen);

        }

    }

    public void get_gingival_status(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String u = ed.getText().toString();
        if(u.equals("")){
            Toast.makeText(this, "Please select a patient", Toast.LENGTH_LONG).show();
        }
        else {
            String z = "";
            z = u.substring(6,8);
            Intent changescreen = new Intent(this,GIngival.class);
            changescreen.putExtra("callAc", z);
            startActivity(changescreen);

        }

    }


    public void get_plan(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String u = ed.getText().toString();
        if(u.equals("")){
            Toast.makeText(this, "Please select a patient", Toast.LENGTH_LONG).show();
        }
        else {
            String z = "";
            z = u.substring(6,8);
            Intent changescreen = new Intent(this,Plan.class);
            changescreen.putExtra("callAc", z);
            startActivity(changescreen);

        }

    }



}
