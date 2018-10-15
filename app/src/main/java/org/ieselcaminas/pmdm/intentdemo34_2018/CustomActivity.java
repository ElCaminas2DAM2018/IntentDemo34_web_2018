package org.ieselcaminas.pmdm.intentdemo34_2018;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        WebView webView = (WebView) findViewById(R.id.webView);
        Uri url = getIntent().getData();
        webView.loadUrl(url.toString());
    }
}
