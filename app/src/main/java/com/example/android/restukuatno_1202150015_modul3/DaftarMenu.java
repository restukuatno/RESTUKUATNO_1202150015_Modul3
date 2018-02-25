package com.example.android.restukuatno_1202150015_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;

    public static ArrayList<MinumanItem> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new MinumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    public ArrayList<MinumanItem> isi(){
        ArrayList<MinumanItem> data = new ArrayList<>();
        data.add(new MinumanItem("Aqua","Ini AMDK merk AQUA","Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.",R.drawable.aqua));
        data.add(new MinumanItem("Amidis","Ini AMDK merk AMIDIS","AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.",R.drawable.amidis));
        data.add(new MinumanItem("Cleo","Ini AMDK merk CLEAO","",R.drawable.cleo));
        data.add(new MinumanItem("Club","Ini AMDK merk CLUB","Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk",R.drawable.club));
        data.add(new MinumanItem("Equil","Ini AMDK merk EQUIL","Equil Natural Mineral Water adalah air mineral alami yang sangat ringan dan halus. Berasal dari mata air pilihan yang diproduksi menggunakan teknologi modern untuk menjaganya tetap murni dan higienis. Dikemas secara eksklusif dalam botol kaca untuk menjaga kualitas alaminya",R.drawable.equil));
        data.add(new MinumanItem("Evian","Ini AMDK merk EVIAN","",R.drawable.evian));
        data.add(new MinumanItem("Le Minerale","Ini AMDK merk LE MINERALE","",R.drawable.leminerale));
        data.add(new MinumanItem("Nestle","Ini AMDK merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new MinumanItem("Pristine","Ini AMDK merk PRISTINE","",R.drawable.pristine));
        data.add(new MinumanItem("Vit","Ini AMDK merk VIT","",R.drawable.vit));
        return data;
    }
}
