package id.sch.smktelkom_mlg.tugas01.xiirpl4017.pendaftarananggotaclub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    TextView tvHasil1;

    RadioButton rbP, rbL;
    TextView tvHasil3;

    CheckBox cbB, cbM, cbD;
    TextView tvHasil5;

    Spinner spB;
    TextView tvHasil4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);

        rbP = (RadioButton) findViewById(R.id.radioButtonP);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);

        cbB = (CheckBox) findViewById(R.id.checkBoxB);
        cbM = (CheckBox) findViewById(R.id.checkBoxM);
        cbD = (CheckBox) findViewById(R.id.checkBoxD);

        spB = (Spinner) findViewById(R.id.spinnerB);

        tvHasil1 = (TextView) findViewById(R.id.textViewHasil);
        tvHasil3 = (TextView) findViewById(R.id.textViewHasil3);
        tvHasil5 = (TextView) findViewById(R.id.textViewHasil5);
        tvHasil4 = (TextView) findViewById(R.id.textViewHasil4);


    }
}

