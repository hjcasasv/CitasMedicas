package com.evidencia.godhc.CitasMedicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ListView;

import java.util.ArrayList;

public class Crear_citas extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener, AdapterView.OnItemClickListener{

    TextView hora_cita;
    EditText nombre;
    EditText apellido;
    Boolean fecha = false;
    Boolean hora = false;
    String doc = "";
    TextView textoscroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_citas);
        nombre = (EditText) findViewById(R.id.edit_name);
        apellido = (EditText) findViewById(R.id.edit_apellido);

        Button btn_date = (Button) findViewById(R.id.btn_date);
        Button btn_time = (Button) findViewById(R.id.btn_time);
        Button btn_agendar = (Button) findViewById(R.id.btn_agendar);

        btn_date.setOnClickListener(this);
        btn_time.setOnClickListener(this);
        btn_agendar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int btn_clicked = view.getId();
        switch (btn_clicked) {
            case R.id.btn_date:
                DialogFragment fragment_date = new DatePickerFragment();
                fragment_date.show(getSupportFragmentManager(), "Date Picker");
                Bundle intent2 = getIntent().getExtras();
                if(intent2 != null){
                    fecha = true;
                }

                break;
            case R.id.btn_time:
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getSupportFragmentManager(), "timPicker");
                Bundle intent3 = getIntent().getExtras();
                if(intent3 != null){
                    hora = true;
                }
                break;
            case R.id.btn_agendar:

                String complete_name = String.valueOf(nombre.getText())+String.valueOf(apellido.getText());

                if(fecha && (!nombre.getText().toString().equals("")) && (!apellido.getText().toString().equals(""))){
                    Bundle intent = getIntent().getExtras();
                    String fecha = intent.getString("fecha");
                    String hora = intent.getString("horas");
                    textoscroll.setText(fecha + " a las " + hora + "Paciente: \n" + nombre.getText().toString() + " " + apellido.getText().toString() + "\n");
                    nombre.setText("");
                    apellido.setText("");

                }else{
                    if(!fecha){
                        Toast.makeText(getApplicationContext(),"Ingrese Fecha de la cita", Toast.LENGTH_LONG).show();
                        return;
                    }
                    if (!hora){
                        Toast.makeText(getApplicationContext(),"Ingrese la hora de la cita", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if((nombre.getText().toString().equals(""))){
                        Toast.makeText(getApplicationContext(),"Ingrese Nombre del paciente", Toast.LENGTH_LONG).show();
                        return;
                    }
                    if((apellido.getText().toString().equals(""))){
                        Toast.makeText(getApplicationContext(),"Ingrese Apellido del paciente", Toast.LENGTH_LONG).show();
                        return;
                    }
                }



                break;


        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String doctor = (String) adapterView.getItemAtPosition(i);
        doc = doctor;

        Toast.makeText(getApplicationContext(), doctor , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),String.valueOf(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(getApplicationContext(),"Nothing", Toast.LENGTH_SHORT).show();
    }
}
