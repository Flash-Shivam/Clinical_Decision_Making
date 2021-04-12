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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
public class Gallery extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gallery);

        Intent activitythat = getIntent();
        //final ImageView z1 = (ImageView ) findViewById(R.id.an);
        //final Animation zoomanimation = AnimationUtils.loadAnimation(this,R.anim.zoom);

        //z1.startAnimation(zoomanimation);

        String prevac = activitythat.getExtras().getString("callAct");
    }

}
