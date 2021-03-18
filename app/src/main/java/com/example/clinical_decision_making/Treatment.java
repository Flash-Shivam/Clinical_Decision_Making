package com.example.clinical_decision_making;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

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

public class Treatment extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.treatment_plan);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");

        if(prevac.equals("1"))
        {
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency Phase: Not required");
            v2.setText("Phase I: NSPT (supra and subgingival scaling and root planing) ,\n" +
                    "Patient education and motivation,\n" +
                    "Modification of brushing technique,\n" +
                    "Adv. 0.2% Chlorhexidine mouthwash");
            v3.setText("Phase II: Adv. Conventional periodontal flap surgery with 17,16,15 region");
            v4.setText("Phase III - Not required");
            v5.setText("PHASE 1V-\n" +
                    "Recall after 1,3 and 6months.\n" +
                    "Re-evaluation of periodontal status.\n" +
                    "Re-inforcement of oral hygiene maintainance");

        }
        else if(prevac.equals("2")){

            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency  phase :  Extraction of hopeless teeth");
            v2.setText("Phase I Nonsurgical / Etiotropic phase)\n" +
                    "    • Patient education and motivation.\n" +
                    "    • NSPT (Complete SUPRA and sub gingival Scaling and root planning.)\n" +
                    "    • Adv.  Modified Bass technique for brushing.\n" +
                    "    • Interdental toothbrush for open contacts.\n" +
                    "    • Adv. chlorhexidine mouthwash 0.2%, 10ml twice daily for 15 days");
            v3.setText("EVALUATION AFTER PHASE 1:\n" +
                    "    • Re-checking for\n" +
                    "    • Plaque and calculus\n" +
                    "    • Gingival inflammation\n" +
                    "    • Pocket depth\n" +
                    "    • Bleeding on Probing\n" +
                    "    • Recession\n" +
                    "    • Tooth mobility");
            v4.setText("Phase II Surgical phase\n" +
                    "    • Consideration for flap surgery after re-evaluation.\n" +
                    "    • Conventional flap operation surgery by Kirkland 1931 along with Papilla preservation flap surgery with 11, and 21");
            v5.setText("Phase III Restorative phase  :Not Required");
            v6.setText("PHASE 1V Maintenance phase :\n" +
                    "    • Recall after 3 months\n" +
                    "    • Re-checking for\n" +
                    "    • Plaque and calculus\n" +
                    "    • Gingival inflammation\n" +
                    "    • Pocket depth\n" +
                    "    • Bleeding on Probing\n" +
                    "    • Recession\n" +
                    "    • Tooth mobility");



        }
        else if(prevac.equals("3"))
        {
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency  Phase:  Not Required");
            v2.setText("Phase I\n" +
                    "NSPT (Supra Gingival And Polishing)\n" +
                    "Proper brushing technique is demonstrated to the patient.");
            v3.setText("Evaluation of response to phase 1 –\n" +
                    "Re-evaluation of the patient for pocket depth, inflammation after 3- 6 weeks");
            v4.setText("Phase II \n" +
                    "Adv. Crown lengthening procedure with 16");
            v5.setText("Phase III -fixed prosthesis with 16");
            v6.setText("PHASE 1V \n" +
                    "- re-evaluation of plaque and calculus.\n" +
                    "Inflammation\n" +
                    "Recall after 6 months");


        }
        else if(prevac.equals("4")){
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency phase- NA");
            v2.setText("Phase I- \n" +
                    "NSPT (supra gingival scaling and polishing) \n" +
                    "Adv. Proper brushing technique ");
            v3.setText("Evaluation of response to phase 1 –\n" +
                    "Re-evaluation of the patient for pocket depth, inflammation after 3- 6 weeks");
            v4.setText("Phase II \n" +
                    "– Adv Depigmentation ");
            v5.setText("Phase III -NA");
            v6.setText("PHASE 1V \n" +
                    "- re-evaluation of plaque and calculus.\n" +
                    "Inflammation and pigmentation.\n" +
                    "Recall after 6 months. ");


        }
        else if(prevac.equals("5")){
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency  Phase: NA");
            v2.setText("Phase I \n" +
                    "NSPT (supra and subgingival scaling and root planing) \n" +
                    "Adv.  Modified Bass technique for brushing.\n" +
                    "Interdental toothbrush for open contacts.\n" +
                    "Adv.  chlorhexidine mouthwash 0.2%, 10ml twice daily for 15 days");
            v3.setText("EVALUATION AFTER PHASE 1:\n" +
                    "Re-checking for\n" +
                    "Plaque and calculus\n" +
                    "Gingival inflammation\n" +
                    "Pocket depth\n" +
                    "Bleeding on Probing\n" +
                    "Recession");
            v4.setText("Phase II \n" +
                    "Adv. Gingivectomy  with 31-33,41-43");
            v5.setText("Phase III - NA");
            v6.setText("PHASE 1V-\n" +
                    "Recall after 3 months\n" +
                    "Re-checking for\n" +
                    "Plaque and calculus\n" +
                    "Gingival inflammation\n" +
                    "Pocket depth\n" +
                    "Bleeding on Probing\n" +
                    "Recession\n" +
                    "Tooth mobility");

        }
        else if(prevac.equals("6")){
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency phase- draining of abscess on the buccal side of 46");
            v2.setText("Phase I \n" +
                    "– NSPT (supra gingival scaling and polishing) \n" +
                    "ADV. Proper brushing technique.");
            v3.setText("Evaluation of response to phase 1 –\n" +
                    "Re-evaluation of the patient for pocket depth, inflammation after 3- 6 weeks.");
            v4.setText("Phase II \n" +
                    "–Modified Widman flap surgery");
            v5.setText("Phase III- NA");
            v6.setText("Phase IV \n" +
                    "- re-evaluation of plaque and calculus.\n" +
                    "Inflammation\n" +
                    "Recall after 6 months. ");
        }
        else if(prevac.equals("7")){
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency Phase: Not required");
            v2.setText("Phase I \n" +
                    "    • NSPT (supra gingival scaling and polishing) \n" +
                    "    • Adv. Charters technique for brushing.\n" +
                    "    • Desensitizing tooth paste for hypersensitivity..\n" +
                    "    • Adv.  chlorhexidine mouthwash 0.2%, 10ml twice daily for 15 days");
            v3.setText("EVALUATION AFTER PHASE 1:\n" +
                    "    • Re-checking for\n" +
                    "    • Plaque and calculus\n" +
                    "    • Gingival inflammation\n" +
                    "    • Pocket depth\n" +
                    "    • Bleeding on Probing\n" +
                    "    • Recession\n" +
                    "    • Tooth mobility");
            v4.setText("Phase II \n" +
                    "    • Adv. Coronally advanced flap procedure with 13");
            v5.setText("Phase III - Not Required");
            v6.setText("Phase IV -\n" +
                    "    • Recall after 3 months\n" +
                    "    • Re-checking for\n" +
                    "    • Plaque and calculus\n" +
                    "    • Gingival inflammation\n" +
                    "    • Pocket depth\n" +
                    "    • Bleeding on Probing\n" +
                    "    • Recession\t\n" +
                    "    • Tooth mobility");

        }
        else if(prevac.equals("8")){
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency Phase: Not required");
            v2.setText("Phase I – NSPT (supra g scaling and polishing).\n" +
                    "Diet and oral hygiene counselling is given.\n" +
                    "Adv Proper brushing technique.");
            v3.setText("EVALUATION OF RESPONSE TO PHASE 1 –\n" +
                    "Re-evaluation of the patient for pocket depth, inflammation \n" +
                    "after 3- 6 weeks.");
            v4.setText("Phase II - NA");
            v5.setText("Phase III -NA");
            v6.setText("Phase IV- Re-evaluation of plaque and calculus & inflammation\n" +
                    "Recall after 6 months");

        }
        else if(prevac.equals("9")){
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency  Phase:  \n" +
                    "Extraction of 11 21 and prescribing medication.\n" +
                    "Root canal Opening with 25 26 \n" +
                    "Cap. Amoxicillin 500mg TDS  for 5 days\n" +
                    "Tab. Metronidazole 400mg TDS for 5 days\n" +
                    "Tab. Acelofenac100mg and serratiopeptidase 15 mg BD for 5 Days\n" +
                    "Tab Pantoprazol 40mg OD for 5 days");
            v2.setText("Etiotropic phase\n" +
                    "Patient education and motivation.\n" +
                    "NSPT (supra and sub gingival scaling and root planing)..\n" +
                    "Adv. Modified Bass technique for brushing.\n" +
                    "Interdental toothbrush for open contacts.\n" +
                    "Adv. chlorhexidine mouthwash 0.2%, 10ml twice daily for 15 days");
            v3.setText("EVALUATION AFTER PHASE 1:\n" +
                    "Re-checking for\n" +
                    "Plaque and calculus\n" +
                    "Gingival inflammation\n" +
                    "Pocket depth\n" +
                    "Bleeding on Probing\n" +
                    "Recession\n" +
                    "Tooth mobility");
            v4.setText("Phase II (Surgical phase)\n" +
                    "Root canal treatment with 25 26 15 16.\n" +
                    "Consideration for flap surgery after re-evaluation.\n" +
                    "Conventional flap operation by Kirkland 1931 followed by bone graft placement with 26,27,28.");
            v5.setText("Phase III (restorative phase)\n" +
                    "Fixed prosthesis with 13 12 11 21 22 23. \n" +
                    "Permanent restoration followed by crown prosthesis with 25 26 Permanent restoration of 15 16, 45, 46,47.\n" +
                    "Phase IV (Maintenance phase)\n" +
                    "Regular recall every 1-2 months upto 1 year.\n" +
                    "Reinforcement of oral hygiene instructions.\n" +
                    "Revaluation Periodic checking for,\n" +
                    "Plaque and calculus\n" +
                    "Gingival inflammation\n" +
                    "Periodontal pockets\n" +
                    "Bleeding on probing\n" +
                    "Tooth mobility\n" +
                    "Detection of new carious lesions.");
            v6.setText("PHASE IV (maintenance phase)\n" +
                    "Recall after 3 months\n" +
                    "Re-checking for\n" +
                    "Plaque and calculus\n" +
                    "Gingival inflammation\n" +
                    "Pocket depth\n" +
                    "Bleeding on Probing\n" +
                    "Recession\n" +
                    "Tooth mobility");

        }
        else if(prevac.equals("0")){
            TextView v = (TextView) findViewById(R.id.yar);
            TextView v2 = (TextView) findViewById(R.id.yar2);
            TextView v3 = (TextView) findViewById(R.id.yar3);
            TextView v4 = (TextView) findViewById(R.id.yar4);
            TextView v5 = (TextView) findViewById(R.id.yar5);
            TextView v6 = (TextView) findViewById(R.id.yar6);

            v.setText("Emergency Phase: Not required");
            v2.setText("hase 1- NSPT (supra gingival scaling and polishing) \n" +
                    "Adv. Proper brushing technique is demonstrated to the patient");
            v3.setText("Evaluation of response to phase 1 –\n" +
                    "Re-evaluation of the patient for pocket depth, inflammation after 3- 6 weeks");
            v4.setText("Phase 2- Adv. Frenectomy ");
            v5.setText("Phase 3-NA");
            v6.setText("Phase 4- re-evaluation of plaque and calculus.\n" +
                    "Inflammation\n" +
                    "Recall after 6 months");


        }






    }




}
