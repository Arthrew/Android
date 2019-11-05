package com.example.botones_tema3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    ImageButton botonImagen;
    ToggleButton togImagen;
    CheckBox checkNormal;
    Switch switchNormal;
    RadioGroup grupoRadios;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        botonImagen.setOnClickListener(this);
        togImagen.setOnCheckedChangeListener(this);
        checkNormal.setOnCheckedChangeListener(this);
        switchNormal.setOnCheckedChangeListener(this);
    }

    private void instancias() {

        botonImagen = findViewById(R.id.boton_imagen);
        togImagen = findViewById(R.id.tog_imagen);
        checkNormal = findViewById(R.id.check_normal);
        switchNormal = findViewById(R.id.switch_normal);
        grupoRadios = findViewById(R.id.grupo_radios);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.boton_imagen:
                /*Log.v("tag",String.valueOf(togglebtn.isChecked()));
                Log.v("tag",String.valueOf(check1.isChecked()));
                Log.v("tag",String.valueOf(swtch.isChecked()));*/
                RadioButton radioSE = findViewById(grupoRadios.getCheckedRadioButtonId());
                //Toast.makeText(getApplicationContext(),radioSE.getText(),)
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        String elemento = "";
        Boolean estado = false;

        switch (buttonView.getId()){
            case R.id.check_normal:
                elemento = "check";
                estado = isChecked;
                break;

            case R.id.tog_imagen:
                if (isChecked){
                    botonImagen.setEnabled(true);
                }else{
                    botonImagen.setEnabled(false);
                }
                elemento = "toggle";
                estado = isChecked;
                break;

            case R.id.switch_normal:
                elemento = "Switch";
                estado = isChecked;
                break;

        }

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        String elemento = "";
        switch (checkedId) {
            case R.id.radio_uno:
                elemento = "opcion1";
                break;
            case R.id.radio_dos:
                elemento = "opcion2";
                break;
            case R.id.radio_tres:
                elemento = "opcion3";
                break;
        }
        Toast.makeText(getApplicationContext(), elemento, Toast.LENGTH_SHORT).show();
    }
}
