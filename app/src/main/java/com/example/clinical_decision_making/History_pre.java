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
public class History_pre extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.history_pre);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");

        if(prevac.charAt(1) == '1')
        {
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 1 month back when he started noticing deposits on teeth.");



        }
        else if(prevac.charAt(1) == '2'){

            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 3-4 year  back, then he experienced soft and hard deposited over her teeth along with bleeding while brushing which eventually increased. She also experienced loosening of teeth in maxillary and mandibular region of jaw which is associated with swollen gingiva and bad odour");




        }
        else if(prevac.charAt(1) == '3')
        {
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 3-months  back, then he experienced carious deposited over his teeth and underwent  root canal treatment with the maxillary left posterior teeth and recommended for crown lengthening procedure with the same teeth. Hence came to the dept. of periodontology for the same.");



        }
        else if(prevac.charAt(1) == '4'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Melanin pigmentation was found in upper and lower gingiva which was aesthetically not acceptable to patient.");



        }
        else if(prevac.charAt(1) == '5'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 15 days back, then he experienced swelling and bleeding in the upper and lower front region of the jaw. Bleeding was aggravated on brushing. Hence, he came to the dental hospital with the same complain.");



        }
        else if(prevac.charAt(1) == '6'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 2 months backs when she started experiencing \n" +
                    "Pus drainage from swelling was seen on buccal side of 46.");



        }
        else if(prevac.charAt(1) == '7'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 1 year  back, then he experienced sensitivity in right\n" +
                    "maxillary anterior region of jaw on having sweet and cold beverages. No history of pain, mobility present.");



        }
        else if(prevac.charAt(1) == '8'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 2 months backs when she started experiencing bleeding from gums was insidious on onset and aggravated on brushing.\n" +
                    "History of swelling in gums 5-6 years back.");



        }
        else if(prevac.charAt(1) == '9'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 10 days back, then she experienced pain in left        \n" +
                    "      maxillary posterior region of jaw. Pain is of deep throbbing and intermittent  \n" +
                    "      type and aggravate on taking food. Patient also complaints of food lodgement in \n" +
                    "      maxillary and mandibular region of jaw which is associated with bleeding while \n" +
                    "      brushing. ");



        }
        else if(prevac.charAt(1) == '0'){
            TextView v = (TextView) findViewById(R.id.ter2);
            v.setText("Patient was apparently alright 2years ago, and then she experienced spacing between the upper anteripor front region of the jaw which was increasing. Hence, he came to the dental hospital with the same complain.");



        }
    }
}
