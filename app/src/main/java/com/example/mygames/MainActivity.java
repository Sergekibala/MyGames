package com.example.mygames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    /** Variables globales **/
    int nbAleatoire;
    private static final String TAG = "MainActivity";

    /** Méthode perso **/
    public void devine(View view) {
            EditText EditText0 = findViewById(R.id.EditText0);
            int nbUser = Integer.parseInt(EditText0.getText().toString());
            Log.i(TAG, "devine: " + nbUser);

    }
    public void generateRandomNumber() {
        Random random = new Random();
        nbAleatoire = random.nextInt(20) + 1;
        Log.d(TAG, "generateRandomNumber: " + nbAleatoire);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}