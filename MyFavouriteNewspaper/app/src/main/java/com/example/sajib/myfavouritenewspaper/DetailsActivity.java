package com.example.sajib.myfavouritenewspaper;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DetailsActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        webView=findViewById(R.id.webview);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        String getUrl=getIntent().getExtras().getString("name");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true); //for enable java script in web page
        webView.getSettings().setBuiltInZoomControls(true);//for zoom
        webView.loadUrl(getUrl);


    }

    // for back press
    public boolean onKeyDown(int KeyCode, KeyEvent event)
    {
        if (KeyCode==KeyEvent.KEYCODE_BACK && webView.canGoBack())
        {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(KeyCode,event);

    }
}
