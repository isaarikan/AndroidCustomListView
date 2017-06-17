package arksoft.com.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

/**
 * Created by isaarikan on 17.06.2017.
 */

public class WebSitesi extends Activity{
    WebView webView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.websitesi);
        webView = (WebView) findViewById(R.id.webView);

        //Main Activiy'den gelen pozisyona göre gerekli  web sitesini açıyoruz
        int pozisyon=getIntent().getIntExtra("pozisyon",0);
        if(pozisyon==0){
            webView.loadUrl("http://yemek.com/hazir-yufkadan-borek-tarifleri/");
        }else if(pozisyon==1){
            webView.loadUrl("http://yemek.com/tarif/kuru-fasulye/");
        }




    }
}
