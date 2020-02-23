package com.example.versiones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.example.versiones.adaptadores.AdaptadorRecycler;
import com.example.versiones.utils.Version;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdaptadorRecycler.OnMiRecyclerListener {

    RecyclerView recyclerView;
    ArrayList<Version> listaVersiones;
    AdaptadorRecycler adaptadorRecycler;
    Context context;
    Intent intent;
    static final String TAG_1 = "Version";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenarRecycler();
        acciones();
    }

    private void instancias() {
        recyclerView = findViewById(R.id.recycler_view);
        listaVersiones = new ArrayList();
        adaptadorRecycler = new AdaptadorRecycler(MainActivity.this, listaVersiones);
    }

    private void rellenarRecycler() {
        recyclerView.setAdapter(adaptadorRecycler);
        listaVersiones.add(new Version("Beta", R.drawable.beta, "5 de noviembre de 2007", R.string.descripcion, "BETA", R.drawable.beta));
        listaVersiones.add(new Version("ApplePie", R.drawable.apple_pie, "23 de septiembre de 2008", R.string.descripcion, "1.0", R.drawable.apple_det));
        listaVersiones.add(new Version("Banana", R.drawable.banana, "9 de febrero de 2009", R.string.descripcion, "1.1", R.drawable.banana_det));
        listaVersiones.add(new Version("Cupcake", R.drawable.cupcake, "25 de abril de 2009", R.string.descripcion, "1.5", R.drawable.cupcake_det));
        listaVersiones.add(new Version("Donut", R.drawable.donut, "15 de septiembre de 2009", R.string.descripcion, "1.6", R.drawable.donut_det));
        listaVersiones.add(new Version("Eclair", R.drawable.eclair, "26 de octubre de 2009", R.string.descripcion, "2.0/2.1", R.drawable.eclair_det));
        listaVersiones.add(new Version("Froyo", R.drawable.froyo, "20 de mayo de 2010", R.string.descripcion, "2.2", R.drawable.froyo_det));
        listaVersiones.add(new Version("GingerBread", R.drawable.gingerbread, "6 de diciembre de 2010", R.string.descripcion, "2.3", R.drawable.gige_det));
        listaVersiones.add(new Version("HoneyComb", R.drawable.honeycomb, "22 de febrero de 2011", R.string.descripcion, "3.0", R.drawable.honey_det));
        listaVersiones.add(new Version("IceCream", R.drawable.icecream, "18 de octubre de 2011", R.string.descripcion, "4.0", R.drawable.ice_det));
        listaVersiones.add(new Version("Jelly_Bean", R.drawable.jelly_bean, "9 de julio de 2012", R.string.descripcion, "4.1/4.2/4.3", R.drawable.jelly_det));
        listaVersiones.add(new Version("KitKat", R.drawable.kitkat, "31 de octubre de 2013", R.string.descripcion, "4.4", R.drawable.kit_det));
        listaVersiones.add(new Version("Lollipop", R.drawable.lolli_det, "12 de noviembre de 2014", R.string.descripcion, "5.0", R.drawable.lolli_det));
        listaVersiones.add(new Version("Marshmallow", R.drawable.android_6, "5 de octubre de 2015", R.string.descripcion, "6.0", R.drawable.android_6_det));
        listaVersiones.add(new Version("Nougat", R.drawable.nougat, "15 de junio de 2016", R.string.descripcion, "7.0", R.drawable.nougat));
        listaVersiones.add(new Version("Oreo", R.drawable.android_oreo, "21 de agosto de 2017", R.string.descripcion, "8.0", R.drawable.android8));
        listaVersiones.add(new Version("Pie", R.drawable.android9, "6 de agosto de 2018", R.string.descripcion, "9.0", R.drawable.android9));
        listaVersiones.add(new Version("Android 10", R.drawable.android10, "3 de septiembre de 2019", R.string.descripcion, "10.0", R.drawable.android10));
        adaptadorRecycler.notifyDataSetChanged();
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }

    private void acciones() {
    }

    @Override
    public void onMiRecycler(Version version) {
        switch (version.getLogo()) {
            case R.drawable.beta:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.apple_pie:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.banana:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.cupcake:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.donut:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.eclair:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.froyo:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.gingerbread:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.honeycomb:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.icecream:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.jelly_bean:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.kitkat:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.lolli_det:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.android_6:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.nougat:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.android_oreo:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.android9:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;
            case R.drawable.android10:
                intent = new Intent(getApplicationContext(), Detalles.class);
                intent.putExtra(TAG_1, version);
                startActivity(intent);
                break;

        }
    }
}
