package com.example.prueba_startresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_Pasar;
    TextView texto_uno;
    final int REQ_COD = 1;
    final static int RES_COD_OK = 0;
    final static int RES_COD_FAIL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        btn_Pasar.setOnClickListener(this);
    }

    private void instancias() {
        btn_Pasar = findViewById(R.id.btnPasar);
        texto_uno = findViewById(R.id.textoUno);
    }


    //Espera el resultado
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RES_COD_FAIL){
            texto_uno.setText("No han contestado");
        }else if (resultCode == RES_COD_OK){
            String respuesta = (String) data.getExtras().get(Main2Activity.TAG_RESPUESTA);
            texto_uno.setText(respuesta);
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnPasar:

                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivityForResult(intent,REQ_COD);
                break;
        }

    }
}
