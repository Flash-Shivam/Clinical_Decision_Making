package com.example.clinical_decision_making;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.webkit.WebViewClient;


import java.util.Random;

public class Google_plan extends Activity {

    String ed = "";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form_google);

        Intent activitythat = getIntent();

        String prevac = activitythat.getExtras().getString("callAc");
        WebView myWebView =  findViewById(R.id.webview);
        myWebView.setWebViewClient(new Mybrowser());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        //WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        //myWebView.setWebViewClient(webViewClient);
        myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScp3lAu9n7f3EUVB50ddcS3psdDMi2JBGRExU4aLVCf-9HoLg/viewform");

        ed = prevac.substring(1,2);












    }


    private class  Mybrowser extends  WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }
    }






}