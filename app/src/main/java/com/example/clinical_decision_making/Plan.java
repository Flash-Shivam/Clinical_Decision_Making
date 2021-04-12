package com.example.clinical_decision_making;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



import java.util.Random;

public class Plan extends Activity {

    String ed = "";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.feedback);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");

        WebView myWebView =  findViewById(R.id.webview);
        myWebView.setWebViewClient(new Mybrowser());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        ed = prevac.substring(1,2);

        if(ed.equals("0"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScnmY0pnG3L5rhopSdZRLjggaO2XuBierrbnkiVq1VL2LYLSw/viewform?usp=sf_link");
        }
        else if(ed.equals("1"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScp3lAu9n7f3EUVB50ddcS3psdDMi2JBGRExU4aLVCf-9HoLg/viewform");
        }
        else if(ed.equals("2"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeC9wu5U3wzYILMX3C5xwkl4ZvyZHDqA_7z3p__30bchQQ2Gw/viewform?usp=sf_link");
        }
        else if(ed.equals("3"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdIHwuUqC_Kj7Q_VNXoX3d8EpOuMuMSWuCMgvyobQvailuzPQ/viewform?usp=sf_link");
        }
        else if(ed.equals("4"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSf9KdAVRh9UDZSWcJ8907VmQst-i2a2O0f2_9WxOiuSsAja0Q/viewform?usp=sf_link");
        }
        else if(ed.equals("5"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSekhQfTU4Jw0X3cR0sWhgwoSuyNiFUkBJJR_NiGg4TM0NeyHg/viewform?usp=sf_link");
        }
        else if(ed.equals("6"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeNRGWt03RtvWWQ1fCqPZbzPqxSKxBu9uosrDavSDR0cQT3Eg/viewform?usp=sf_link");
        }
        else if(ed.equals("7"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeC_7GOi1MX8u-ygQGuYrExv4g12udUpfTXFWa7eOV_tfqohg/viewform?usp=sf_link");
        }
        else if(ed.equals("8"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScy08QVSsM9o_epdt2QH4R9AVBuVjvaB0bV8hjVqFsk6xV9MQ/viewform?usp=sf_link");
        }
        else if(ed.equals("9"))
        {
            myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdx5jtfyjC_iND727sdn5R64WbVdngnQxJcvl4Z9Iv1xmjkyQ/viewform?usp=sf_link");
        }












    }

    private class  Mybrowser extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }
    }



    public void treatment(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();


        //AutoCompleteTextView ed = findViewById(R.id.Auto);



            Intent changescreen = new Intent(this,Treatment.class);
            changescreen.putExtra("callAc", ed);
            startActivity(changescreen);



    }







}