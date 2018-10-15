package org.ieselcaminas.pmdm.intentdemo34_2018;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // First intent to use ACTION_VIEW action with correct data
        Button startBrowser_a = (Button) findViewById(R.id.start_browser_a);
        startBrowser_a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.example.com"));
                startActivity(i);
            }
        });

        // Second intent to use LAUNCH action with correct data
        Button startBrowser_b = (Button) findViewById(R.id.start_browser_b);
        startBrowser_b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent("org.ieselcaminas.pmdm.intentdemo34_2018.LAUNCH",
                        Uri.parse("https://www.example.com"));
                startActivity(i);
            }
        });

        // Third intent to use LAUNCH action with incorrect data
        Button startBrowser_c = (Button) findViewById(R.id.start_browser_c);
        startBrowser_c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent("org.ieselcaminas.pmdm.intentdemo34_2018.LAUNCH",
                        Uri.parse("https://www.example.com"));
                startActivity(i);
            }
        });

    }
}