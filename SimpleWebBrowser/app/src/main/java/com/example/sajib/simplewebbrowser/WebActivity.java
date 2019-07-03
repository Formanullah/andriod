package com.example.sajib.simplewebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView=findViewById(R.id.webview);

        String getUrl=getIntent().getExtras().getString("url");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true); //for enable java script in web page
        webView.getSettings().setBuiltInZoomControls(true);//for zoom
        if (getUrl.equals("offline"))
        {
            webView.loadUrl("file:///android_asset/index.html");
        }
        else
        {
            webView.loadUrl("http://"+getUrl);
        }

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
