package arksoft.com.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by isaarikan on 17.06.2017.
 */

public class YemekAdaptor extends BaseAdapter{
     Context context;
    List<YemekModel> yemekListesi;


    private class Tutucu{
        ImageView image;
        TextView baslik;
        TextView tanim;
    }

    //Bu yapıcı method MainActiviy'den veriyi alıyor
    public YemekAdaptor(Context c,List<YemekModel> y){
        context=c;
        yemekListesi=y;
    }

    //Listemizde kaç tane eleman varsa pozisyonuna göre elde ediyoruz
    @Override
    public int getCount() {
        return  yemekListesi.size();
    }
    @Override
    public Object getItem(int position) {
        return yemekListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //Gelen veriyi imageview ve textViewlara set ediyoruz
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Tutucu t=null;

        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        convertView=layoutInflater.inflate(R.layout.tasarim,null);
        t=new Tutucu();

        t.image=(ImageView) convertView.findViewById(R.id.imageView);
        t.baslik=(TextView)convertView.findViewById(R.id.baslik);
        t.tanim=(TextView)convertView.findViewById(R.id.tanim);

        YemekModel yemekModel=(YemekModel) getItem(position);


        t.baslik.setText(yemekModel.getBaslik());
        t.tanim.setText(yemekModel.getTanım());
        t.image.setImageResource(yemekModel.getGoruntuId());
        return convertView;
    }
}
