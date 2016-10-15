package id.sch.smktelkom_mlg.tugas01.xiirpl4017.pendaftarananggotaclub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;


    RadioButton rbP, rbL;


    CheckBox cbB, cbM, cbD;


    Spinner spB;

    Button bDaftar;
    TextView tvHasil1, tvHasil3, tvHasil5, tvHasil4;



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

        bDaftar = (Button) findViewById(R.id.buttonDaftar);

        tvHasil1 = (TextView) findViewById(R.id.textViewHasil);
        tvHasil3 = (TextView) findViewById(R.id.textViewHasil3);
        tvHasil5 = (TextView) findViewById(R.id.textViewHasil5);
        tvHasil4 = (TextView) findViewById(R.id.textViewHasil4);

        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText();
                RadioButton();
                Spinner();
                CheckBox();
            }
        });
    }

    private void RadioButton() {
        String hasil = null;
        if (rbL.isChecked()) {
            hasil = rbL.getText().toString();
        } else if (rbP.isChecked()) {
            hasil = rbP.getText().toString();
        }

        if (hasil == null) {
            tvHasil3.setText("Belum memilih Jenis Kelamin");
        } else {
            tvHasil3.setText("\nJenis Kelamin\n" + hasil);
        }
    }

    private void EditText() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            String alamat = etAlamat.getText().toString();
            int tgl = Integer.parseInt(etTgl.getText().toString());
            int tahun = Integer.parseInt(etTahun.getText().toString());
            int bulan = Integer.parseInt(etBulan.getText().toString());
            if (bulan == 1) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir \n" + tgl + " Januari "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 2) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " Februari "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 3) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " Maret "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 4) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " April "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 5) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " Mei "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 6) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n " + tgl + " Juni "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 7) {
                tvHasil.setText("Nama \n" + nama + " \n\nTanggal Lahir \n" + tgl + " Juli "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 8) {
                tvHasil.setText("Nama \n" + nama + "\n \nTanggal Lahir\n " + tgl + " Agustus "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 9) {
                tvHasil.setText("Nama \n" + nama + " \n\nTanggal Lahir\n" + tgl + " September "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 10) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n" + tgl + " Oktober "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 11) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n" + tgl + " November "
                        + tahun + "\n\nAlamat\n" + alamat);
            } else if (bulan == 12) {
                tvHasil.setText("Nama\n" + nama + " \n\nTanggal Lahir\n" + tgl + " Desember "
                        + tahun + "\n\nAlamat\n" + alamat);
            }
        }
    }

    private boolean isValid() {
        boolean valid = true;
        String nama = etNama.getText().toString();


        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }
        return valid;
    }

    private void Spinner() {
        tvHasil4.setText("\nBias \n" + spB.getSelectedItem().toString());
    }

    private void CheckBox() {
        String hasil = "\nStatus\n";
        int pilih = hasil.length();
        if (cbB.isChecked()) hasil += cbB.getText() + "\n";
        if (cbD.isChecked()) hasil += cbD.getText() + "\n";
        if (cbM.isChecked()) hasil += cbM.getText() + "\n";

        if (hasil.length() == pilih) hasil += "Tidak ada yang dipilih";
        tvHasil5.setText(hasil);
    }
}


