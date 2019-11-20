package com.example.prueba_startresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_Responder;
    EditText txt_Respuesta;
    final static String TAG_RESPUESTA = "respuesta";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        instancias();
        acciones();
    }

    private void acciones() {
        btn_Responder.setOnClickListener(this);
    }

    private void instancias() {
        btn_Responder = findViewById(R.id.btnResponder);
        txt_Respuesta = findViewById(R.id.txtRespuesta);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnResponder:
                if (txt_Respuesta.getText().toString().isEmpty()){
                    setResult(MainActivity.RES_COD_FAIL);
                }else {
                    Intent iRespuesta = new Intent();
                        iRespuesta.putExtra(TAG_RESPUESTA,txt_Respuesta.getText().toString());
                    setResult(MainActivity.RES_COD_OK,iRespuesta);
                }
                finish();
                break;
        }
    }
}
