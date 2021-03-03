package com.example.clinical_decision_making;

import android.app.Activity;
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
public class Material3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.material3);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAct");

        ImageView z = (ImageView) findViewById(R.id.ter4);
        z.setImageResource(R.drawable.r3);
    }

}
