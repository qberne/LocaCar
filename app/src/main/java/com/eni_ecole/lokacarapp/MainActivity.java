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
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void onClickLogin(View view)
    {
        if(username.getText().toString().equals("a") && password.getText().toString().equals("a"))
        {
            //correcct password
            Log.d("", "login: Success");
            username.setText("Success");

            Intent mainPageIntent = new Intent(this, MainPage.class);
            mainPageIntent.putExtra("main_page_key", "ma_page_value"); //Optional parameters
            this.startActivity(mainPageIntent);
            startActivity(mainPageIntent);
        }else{
            //wrong password
            Log.d("", "login: Error");
        }
    }
}
