package com.example.com.example.filpclock;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
    	WebView webView = new WebView(this);
    	WebSettings webSettings = webView.getSettings();
    	// enable javascript
    	webSettings.setJavaScriptEnabled(true);    
        // TODO by Alex
        // now we directly using CDN which provider it.but later we will implement our own javascript
        webView.loadUrl("file:///android_asset/index.html");
        setContentView(webView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
