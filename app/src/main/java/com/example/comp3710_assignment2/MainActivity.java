package com.example.comp3710_assignment2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKm, txtMile, txtKg, txtLb, txtLitre, txtGallon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKm = findViewById(R.id.txtKm);
        txtMile = findViewById(R.id.txtMile);
        txtKg = findViewById(R.id.txtKg);
        txtLb = findViewById(R.id.txtLb);
        txtLitre = findViewById(R.id.txtLitre);
        txtGallon = findViewById(R.id.txtGallon);

            //F to C
        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );
        //C to F
        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );
        //Km to mile
        txtKm.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKm = s.toString();
                Log.i("UnitConverter", "Value in txtKm = " + strKm);

                if (!txtKm.isFocused()) return;
                if (strKm.length() == 0) return;


                try {
                    double valKm = Double.parseDouble(strKm);
                    double valMile = valKm * 0.62137;
                    String strMile = Double.toString(valMile);
                    Log.i("UnitConverter", "Value in txtMile = " + strMile);

                    MainActivity.this.txtMile.setText(strMile);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        //Mile to km
        txtMile.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strMile = s.toString();
                Log.i("UnitConverter", "Value in txtMile = " + strMile);

                if (!txtMile.isFocused()) return;
                if (strMile.length() == 0) return;


                try {
                    double valMile = Double.parseDouble(strMile);
                    double valKm = valMile * 1.609;
                    String strKm = Double.toString(valKm);
                    Log.i("UnitConverter", "Value in txtKm = " + strKm);

                    MainActivity.this.txtKm.setText(strKm);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        //kg to lb
        txtKg.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strKg = s.toString();
                Log.i("UnitConverter", "Value in txtKg = " + strKg);

                if (!txtKg.isFocused()) return;
                if (strKg.length() == 0) return;


                try {
                    double valKg = Double.parseDouble(strKg);
                    double valLb = valKg * 2.2046;
                    String strLb = Double.toString(valLb);
                    Log.i("UnitConverter", "Value in txtLb = " + strLb);

                    MainActivity.this.txtLb.setText(strLb);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        //lb to kg
        txtLb.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLb = s.toString();
                Log.i("UnitConverter", "Value in txtMile = " + strLb);

                if (!txtLb.isFocused()) return;
                if (strLb.length() == 0) return;


                try {
                    double valLb = Double.parseDouble(strLb);
                    double valKg = valLb / 2.2046;
                    String strKg = Double.toString(valKg);
                    Log.i("UnitConverter", "Value in txtKg = " + strKg);

                    MainActivity.this.txtKg.setText(strKg);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        //Litre to Gallon
        txtLitre.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strLitre = s.toString();
                Log.i("UnitConverter", "Value in txtLitre = " + strLitre);

                if (!txtLitre.isFocused()) return;
                if (strLitre.length() == 0) return;


                try {
                    double valLitre = Double.parseDouble(strLitre);
                    double valGallon = valLitre / 3.785;
                    String strGallon = Double.toString(valGallon);
                    Log.i("UnitConverter", "Value in txtGallon = " + strGallon);

                    MainActivity.this.txtGallon.setText(strGallon);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        //lb to kg
        txtGallon.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {
                String strGallon = s.toString();
                Log.i("UnitConverter", "Value in txtGallon = " + strGallon);

                if (!txtGallon.isFocused()) return;
                if (strGallon.length() == 0) return;


                try {
                    double valGallon = Double.parseDouble(strGallon);
                    double valLitre = valGallon *  3.785;
                    String strLitre = Double.toString(valLitre);
                    Log.i("UnitConverter", "Value in txtLitre = " + strLitre);

                    MainActivity.this.txtLitre.setText(strLitre);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );
    }
}