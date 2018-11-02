package com.eni_ecole.lokacarapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.eni_ecole.lokacarapp.bo.Gerant;
import com.eni_ecole.lokacarapp.dao.GerantDao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText username ;
    EditText password ;
    Button btnLogin ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.editTextLogin);
        password = (EditText)findViewById(R.id.editTextPassword);
        btnLogin = (Button)findViewById(R.id.buttonConnect);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //ImageView iv = (ImageView) findViewById(R.id.imageview1);
                //iv.setVisibility(View.VISIBLE);
                onClickLogin(v);
            }
        });

        GestionBddHelper bdd = new GestionBddHelper(getApplicationContext());
        GerantDao gerantDao = new GerantDao(getApplicationContext());

        boolean isPresnent = false;

        Log.v("test",gerantDao.select_all().toString());

        for (Gerant g : gerantDao.select_all()
             ) {
            if (g.getNom().equals("admin"))
                isPresnent = true;
        }

        if (!isPresnent)
            gerantDao.insert(new Gerant("admin", "admin", "admin", "admin"));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void onClickLogin(View view)
    {
        GerantDao gerantDao = new GerantDao(getApplicationContext());

        for (Gerant g : gerantDao.select_all()){
            if(username.getText().toString().equals(g.getLogin()) && password.getText().toString().equals(g.getPassword()))
            {
                //correcct password
                Log.d("", "login: Success");
                username.setText("Success");

                Intent mainPageIntent = new Intent(this, MainPage.class);
                mainPageIntent.putExtra("main_page_key", "ma_page_value"); //Optional parameters
                this.startActivity(mainPageIntent);
                startActivity(mainPageIntent);
            }
        }
    }
}
