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
public class GIngival extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gingival);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");

        if(prevac.charAt(1) == '1')
        {
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Localized");
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            v.setText("FURCATION INVOLVEMENT:  Grade-II furcation  with  16");
            v8.setText("RECESSION: Miller’s Class I gingival recession with  16");
            v9.setText("FRENAL ATTACHMENT: Mucosal attachment ");
            v10.setText("PROBING DEPTH (mm): Localized moderate – severe  pockets  with 17,16,15 region");
            v11.setText("CLINICAL ATTACHMENT LEVELS (mm): CAL with  16  - 6mm");
            v1.setText("Pale pink");
            v2.setText("Scalloped ");
            v3.setText("Soft & edematous");
            v4.setText("Normal");
            v5.setText("Stippling Reduced ");
            v6.setText("Apical to CEJ 16");
            v7.setText("Present");
            v12.setText("DIAGNOSIS-  Localized stage II periodontitis with 16");
            v13.setText("PROGNOSIS: Fair");


        }
        else if(prevac.charAt(1) == '2'){
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Generalized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("FURCATION INVOLVEMENT:  Grade III Furcation invovment seen with 16, 16, 36, 46");
            v8.setText("RECESSION: Generalizes Millers Class III Gingival recession present");
            v9.setText("FRENAL ATTACHMENT – Mucosal Attachment ");
            v10.setText("PERIODONTAL POCKET DEPTH: Average Probing pocket depth is 4-5 mm");
            v11.setText("CLINICAL ATTACHMENT LEVEL :  5-6 mm CAL ");
            v1.setText("Pigmented pink");
            v2.setText("Accentuated");
            v3.setText("Soft & oedematous");
            v4.setText("Slightly Enlarged");
            v5.setText("Stippling Reduced ");
            v6.setText("Apical to CEJ");
            v7.setText("Present");
            v13.setText("DIAGNOSIS- Generalized Aggressive Periodontitis\n" + "Generalized Stage III Periodontitis (As per new   classification)");
            v12.setText("MOBILITY :-  \n" +
                    "Grade II Mobility with 17, 16, 14 11 21 24 26\n" +
                    "Grade III Mobility with 12 11 22");
            v14.setText("PROGNOSIS- Overall: Fair  ");


        }
        else if(prevac.charAt(1) == '3')
        {
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Localized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("FRENAL ATTACHMENT – Mucosal Attachment ");
            v8.setText("PROBING DEPTH: Normal");
            v9.setText("CLINICAL ATTACHMENT LEVEL :  Normal ");
            v10.setText("FURCATION INVOLVEMENT:  Absent");
            v11.setText("RECESSION: Absent");
            v1.setText("Pale pink");
            v2.setText("Scalloped ");
            v3.setText("Firm and resilient");
            v4.setText("Normal");
            v5.setText("Stippling reduced");
            v6.setText("Apical to CEJ");
            v7.setText("Present");
            v13.setText("DIAGNOSIS – clinical crown height reduced ");
            v12.setText("MIDLINE DIESTEMA - Absent");
            v14.setText("PROGNOSIS- good");


        }
        else if(prevac.charAt(1) == '4'){

            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Generalized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("FRENAL ATTACHMENT – Mucosal Attachment");
            v8.setText("PROBING DEPTH: Normal");
            v9.setText("CLINICAL ATTACHMENT LEVEL :  Normal ");
            v10.setText("FURCATION INVOLVEMENT:  Absent");
            v11.setText("MOBILITY :-  Absent   ");
            v1.setText("Pigmented pink");
            v2.setText("Scalloped ");
            v3.setText("Firm and resilient");
            v4.setText("Normal");
            v5.setText("Stippling Present");
            v6.setText("At CEJ");
            v7.setText("Absent");
            v13.setText("DIAGNOSIS – Generalized melanin pigmentation");
            v12.setText("SUPPURATION- Absent ");
            v14.setText("PROGNOSIS – good");


        }
        else if(prevac.charAt(1) == '5'){
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Localized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("FURCATION INVOLVEMENT- Absent");
            v8.setText("RECESSION: Generalized Miller’s class I Gingival recession present.");
            v9.setText("FRENAL ATTACHMENT: Mucosal attachment ");
            v10.setText("PERIODONTAL POCKETS: Generalized mild to moderate periodontal pocket and localized pseudo pockets seen in mandibular anterior region.");
            v11.setText("CLINICAL ATTACHMENT LEVEL:  Generalized 5-6 mm (average)");
            v1.setText("Pigmented pink");
            v2.setText("Accentuated ");
            v3.setText("Soft & edematous");
            v4.setText("Slightly Enlarged");
            v5.setText("Reduced ");
            v6.setText("Coronal to CEJ");
            v7.setText("Stippling Present");
            v13.setText("PROVISIONAL DIAGNOSIS- Localized Inflammatory gingival enlargement with mandibular anterior\n" +
                    "Generalized stage I periodontitis");

            v12.setText("MIDLINE DIESTEMA - Present");
            v14.setText("PROGNOSIS- Overall: Fair");


        }
        else if(prevac.charAt(1) == '6'){
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Localized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("FURCATION: Absent");
            v8.setText("RECESSION: Absent");
            v9.setText("SUPPURATION : Present");
            v10.setText("PERIODONTAL POCKET DEPTH: 5 mm");
            v11.setText("CLINICAL ATTACHMENT LEVEL :  3 mm CAL ");
            v1.setText("Pale pink");
            v2.setText("Accentuated");
            v3.setText("Firm & resilient");
            v4.setText("Normal");
            v5.setText("Stippling absent ");
            v6.setText("At CEJ");
            v7.setText("Present");
            v13.setText("DIAGNOSIS : Localized peridontal abscess");
            v12.setText("MIDLINE DIESTEMA - Absent");
            v14.setText("PROGNOSIS- good.");




        }
        else if(prevac.charAt(1) == '7'){
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Localized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("FURCATION INVOLVEMENT: No furcation involvement present");
            v8.setText("RECESSION: Miller’s class II Gingival recession present. With 13");
            v9.setText("");
            v10.setText("SUPPURATION- Absent ");
            v11.setText("CLINICAL ATTACHMENT LEVEL :  6 mm CAL Present with 13");
            v1.setText("Pale pink");
            v2.setText("Accentuated");
            v3.setText("Firm & resilient");
            v4.setText("Normal");
            v5.setText("Stippling Present");
            v6.setText("At Apical to CEJ");
            v7.setText("Absent");
            v13.setText("PROVISIONAL DIAGNOSIS- Millers Class II Gingival recession with 13  ");
            v14.setText("PROGNOSIS-Overall: Good");
            v12.setText("MIDLINE DIESTEMA - Absent");


        }
        else if(prevac.charAt(1) == '8'){
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Generalized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("FURCATION INVOLVEMENT- Not Present");
            v8.setText("RECESSION- NOt seen");
            v9.setText("SUPPURATION- Present");
            v10.setText("PERIODONTAL POCKET- Not present");
            v11.setText("FRENAL ATTACHMENT – Mucosal Attachment");
            v1.setText("Reddish Pink");
            v2.setText("Scalloped ");
            v3.setText("Soft & oedematous");
            v4.setText("Enlarged");
            v5.setText("Stippling reduced");
            v6.setText("At CEJ");
            v7.setText("Present");
            v13.setText("PROVISIONAL DIAGNOSIS- Generalised marginal & papillary gingivitis.");
            v14.setText("PROGNOSIS- GOOD");
            v12.setText("CLINICAL ATTACHMENT LEVEL :  Normal");



        }
        else if(prevac.charAt(1) == '9'){
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Generalized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("FURCATION INVOLVEMENT: Grade II with 16 26");
            v8.setText("RECESSION: Generalized Miller’s class III Gingival recession present.");
            v9.setText("SUPPURATION- Present with – 11, 12 ,13,  21, 22 ,23 ");
            v10.setText("PERIODONTAL POCKETS :Generalized mild to moderate periodontal pocket");
            v11.setText("CLINICAL ATTACHMENT LEVEL : Generalized 5-6 mm (average)");
            v1.setText("Reddish Pink");
            v2.setText("Accentuated ");
            v3.setText("Soft & oedematous");
            v4.setText("Increased");
            v5.setText("Stippling reduced ");
            v6.setText("Apical to CEJ");
            v7.setText("Present");
            v13.setText("DIAGNOSIS: Generalised stage III Periodontitis  \n" +
                    "Chronic irreversible pulpitis and Periapical abscess with 25, 26");
            v14.setText("PROGNOSIS- Overall: Fair");
            v12.setText("FRENAL ATTACHMENT – Mucosal Attachment ");



        }
        else if(prevac.charAt(1) == '0'){
            TextView v100 = (TextView) findViewById(R.id.ter100);
            v100.setText("Generalized");
            TextView v = (TextView) findViewById(R.id.ter3);
            TextView v1 = (TextView) findViewById(R.id.t1);
            TextView v2 = (TextView) findViewById(R.id.t2);
            TextView v3 = (TextView) findViewById(R.id.t3);
            TextView v4 = (TextView) findViewById(R.id.t4);
            TextView v5 = (TextView) findViewById(R.id.t5);
            TextView v6 = (TextView) findViewById(R.id.t6);
            TextView v7 = (TextView) findViewById(R.id.t7);
            TextView v8 = (TextView) findViewById(R.id.ter4);
            TextView v9 = (TextView) findViewById(R.id.ter5);
            TextView v10 = (TextView) findViewById(R.id.ter6);
            TextView v11 = (TextView) findViewById(R.id.ter7);
            TextView v12 = (TextView) findViewById(R.id.ter8);
            TextView v13 = (TextView) findViewById(R.id.ter9);
            TextView v14 = (TextView) findViewById(R.id.ter10);
            v.setText("Suppuration- Absent");
            v8.setText("Recession: Absent");
            v9.setText("Midline Diestema- Present ");
            v10.setText("Periodontal Pockets: Absent");
            v11.setText("Clinical Attachment Level: Normal");
            v1.setText("pale pink");
            v2.setText("Scalloped");
            v3.setText("Firm and resilient ");
            v4.setText("Normal");
            v5.setText("Present");
            v6.setText("At CEJ");
            v7.setText("absent");
            v13.setText("DIAGNOSIS- High frenal  attachment with maxillary anterior region.");
            v14.setText("PROGNOSIS – Good");
            v12.setText("Frenal Attachment: High Frenal Attachment (Gingival) ");



        }

    }
}
