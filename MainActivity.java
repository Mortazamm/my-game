package com.morteza.hoosh;
import android.app.Activity;import android.os.Bundle;import android.webkit.WebView;import android.webkit.WebSettings;import android.view.View;import android.graphics.Color;
public class MainActivity extends Activity{
 @Override public void onCreate(Bundle b){super.onCreate(b);getWindow().setStatusBarColor(Color.rgb(7,21,47));getWindow().setNavigationBarColor(Color.rgb(7,21,47));WebView w=new WebView(this);w.setBackgroundColor(Color.rgb(7,21,47));WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setSupportZoom(false);w.setOverScrollMode(View.OVER_SCROLL_NEVER);setContentView(w);w.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){super.onBackPressed();}
}
