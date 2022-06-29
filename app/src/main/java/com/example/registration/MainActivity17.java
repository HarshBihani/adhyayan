package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        WebView webView=findViewById(R.id.webView);
        ProgressBar progressBar=findViewById(R.id.progressBar);

        progressBar.setVisibility(View.VISIBLE);
        String url="https://drive.google.com/file/d/1fag7U1zr18EciIdb6hOzYYylSlduR4ac/view?usp=sharing";
        //String finalURL="https://drive.google.com/viewerng/viewer?embedded=true&url="+url;

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebChromeClient(new WebChromeClient(){

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);

                //     getSupportActionBar().setTitle("Loading...");

                if(newProgress==100){

                    progressBar.setVisibility(View.GONE);
                    //   getSupportActionBar().setTitle((R.string.app_name));
                }
            }
        });
        webView.loadUrl((url));
    }

}