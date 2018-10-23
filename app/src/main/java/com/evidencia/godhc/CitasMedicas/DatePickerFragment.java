package com.evidencia.godhc.CitasMedicas;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment  extends DialogFragment implements DatePickerDialog.OnDateSetListener{




    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);

    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String selected = String.valueOf(i2) + " - " + String.valueOf(i1) + " - " + String.valueOf(i) + "\n" ;

        Intent fechas = getActivity().getIntent().putExtra("fecha",selected);

        //startActivity(fechas);

    }



}
