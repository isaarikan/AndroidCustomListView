package arksoft.com.customlistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    Button btn;
    List<YemekModel> yemekModelList;
    ListView listView;

    //Veri Kaynaklarımızı oluşturuyoruz.
    public static final Integer[] resimler = {R.drawable.borek, R.drawable.kuru, R.drawable.makarna, R.drawable.omlet, R.drawable.zeytinyagli};

    public static final String[] baslik = {"Börek Tarifi", "Kuru Fasülye Tarifi", "Makarna Tarifi", "Omlet Tarifi", "Zeytingyağlı Yemek Tarifi"};

    public static final String[] tanim = {"4-Kişilik", "2-Kişilik", "4-Kişilik", "6-Kişilik", "10-Kişilik"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        yemekModelList = new ArrayList<YemekModel>();


        //Kaç tane eleman sıralamak istiyorsak o kadar uzunlukta veriyi model sınıfına  gönderiyoruz.
        for (int i = 0; i < tanim.length; i++) {
            YemekModel yemekModel = new YemekModel(resimler[i], baslik[i], tanim[i]);
            //Listeye her bir modeli ekliyoruz
            yemekModelList.add(yemekModel);
        }

        //Adaptöre oluşturduğumuz verileri yolluyoruz
        YemekAdaptor yemekAdaptor = new YemekAdaptor(this, yemekModelList);
        listView.setAdapter(yemekAdaptor);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    //Hangi pozisyona tıklandıysa o pozisyonu webview bulunan sınıfa gönderiyoruz
                    case 0:
                        Intent intent = new Intent(MainActivity.this, WebSitesi.class);
                        intent.putExtra("pozisyon", position);
                        startActivity(intent);
                    case 1:
                        Intent intent2 = new Intent(MainActivity.this, WebSitesi.class);
                        intent2.putExtra("pozisyon", position);
                        startActivity(intent2);
                }


            }
        });


    }


}
