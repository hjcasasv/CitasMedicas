package com.evidencia.godhc.CitasMedicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Citas extends AppCompatActivity implements View.OnClickListener {

    Button btn_create_citas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);

        btn_create_citas = (Button) findViewById(R.id.btn_create_citas);

        btn_create_citas.setOnClickListener(this);
    }

    public void goToSecondActivity() {
        Intent intent = new Intent(this, Crear_citas.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_create_citas:
                goToSecondActivity();
                break;
        }
    }
}
