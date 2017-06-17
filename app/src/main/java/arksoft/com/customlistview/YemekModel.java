package arksoft.com.customlistview;

/**
 * Created by isaarikan on 17.06.2017.
 */

public class YemekModel {
    private int goruntuId;
    private  String baslik;
    private String  tanim;

    public YemekModel(int goruntuId, String baslik, String tanim) {
        this.goruntuId = goruntuId;
        this.baslik = baslik;
        this.tanim = tanim;
    }

    public int getGoruntuId() {
        return goruntuId;
    }

    public void setGoruntuId(int goruntuId) {
        this.goruntuId = goruntuId;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getTanım() {
        return tanim;
    }

    public void setTanım(String tanim) {
        this.tanim = tanim;
    }
}
