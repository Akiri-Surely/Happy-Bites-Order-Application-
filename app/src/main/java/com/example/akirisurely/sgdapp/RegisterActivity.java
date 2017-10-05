package com.example.akirisurely.sgdapp;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editTextName;
    EditText editTextUsername;
    EditText editTextPassword;
    EditText editTextEmail;
    Button btnregister;
    private static final String REGISTER_URL = "http://appscom.000webhostapp.com/scripts/register.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextUsername = (EditText) findViewById(R.id.editTextUserName);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        btnregister = (Button) findViewById(R.id.buttonRegister);
        btnregister.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v == btnregister){
            registerUser();
        }
    }
    public void registerUser() {
        String name = editTextName.getText().toString().trim().toLowerCase();
        String username = editTextUsername.getText().toString().trim().toLowerCase();
        String password = editTextPassword.getText().toString().trim().toLowerCase();
        String email = editTextEmail.getText().toString().trim().toLowerCase();

        register(name,username,password,email);
    }
    public void register(String name, String username, String password, String email) {
        String urlSuffix = "?name="+name+"&username="+username+"&password="+password+"&email="+email;

        class RegisterUser extends AsyncTask<String, Void, String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(RegisterActivity.this, "Please Wait",null, true, true);
            }
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Log.d("TAG", "onPostExecute: "+s);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();

            }
            @Override
            protected String doInBackground(String... params) {
                String s = params[0];
                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(REGISTER_URL+s);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();

//                    bufferedReader  = new BufferedReader(new InputStreamReader(con.getInputStream()));
//
//                    String result;
//
//                    result = bufferedReader.readLine();
//                    Log.d("TAG", "onPostExecute: "+result.toString());
//                    return (result.toString());

                    // Read data sent from server
                    InputStream input = con.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                    StringBuilder result = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }

                    // Pass data to onPostExecute method
                    return(result.toString());
                }catch(Exception e){
                    return null;
                }
            }

        }
        RegisterUser user = new RegisterUser();
        user.execute(urlSuffix);
    }
}
