package com.example.akirisurely.sgdapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = LoginActivity.class.getSimpleName();
    //String email;
    EditText etext1;
    EditText etext2;
    Button login;
    TextView forgotpassword;
    //HttpURLConnection con;
//    EditText username, password, email;
//    Button cancel, submit, blogin;
//    ProgressDialog mProgressDialog;
//    public int count = 0;
//    ConnectionDetector cd;
//    RotateAnimation rotate;
//    android.support.v7.app.AlertDialog alertDialog;
//    Boolean checkstatus;
//    JSONObject json_data;
//    String query, resulta, prefuname, data, http,server, userid;
//    String regid = "";
//    SharedPreferences settings;
//    SharedPreferences.Editor editor;
    //UpperFirstWord ucase;

    private static final String REGISTER_URL = "http://appscom.000webhostapp.com/scripts/passwordrecover.php";

    public static final int CONNECTION_TIMEOUT=10000;
    public static final int READ_TIMEOUT=15000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etext1 = (EditText) findViewById(R.id.editTextUserName1);
        etext2 = (EditText) findViewById(R.id.editTextPassword1);
         //forgotpassword = (TextView) findViewById(R.id.txtpass);
        login= (Button) findViewById(R.id.btnlogin1);
        login.setOnClickListener(this);
//        forgotpassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                recoverPass();//triggers email to change password
//            }
//        });

    }
//    public void recoverPass() {
//        android.support.v7.app.AlertDialog.Builder dialogBuilder = new android.support.v7.app.AlertDialog.Builder(LoginActivity.this);
//        LayoutInflater inflater = LoginActivity.this.getLayoutInflater();
//        View dialogView = inflater.inflate(R.layout.passwordrec, null);
//        dialogBuilder.setView(dialogView);
//        dialogBuilder.setCancelable(false);
//        email = (EditText) dialogView.findViewById(R.id.mail);
//        submit = (Button) dialogView.findViewById(R.id.submit);
//
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (email.length() == 0) {
//                    final AlertDialog.Builder alert = new AlertDialog.Builder(LoginActivity.this);
//                    LinearLayout lila1 = new LinearLayout(LoginActivity.this);
//                    lila1.setOrientation(LinearLayout.VERTICAL);
//                    alert.setView(lila1);
//                    alert.setTitle("Error");
//                    alert.setMessage("Enter the email address you used to create your account.");
//
//                    alert.setNegativeButton("Back To Login", new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int whichButton) {
//                            dialog.cancel();
//                        }
//
//
//                    });
//                    alert.show();
//                    return;
//                }else {
//                    final class Des extends AsyncTask<Void, Void, Void> {
//
//                        @Override
//                        protected void onPreExecute() {
//
//
//                            super.onPreExecute();
//
//                            mProgressDialog = new ProgressDialog(LoginActivity.this);
//                            mProgressDialog.setMessage("Verifying your account..A moment please");
//                            mProgressDialog.setIndeterminate(false);
//                            mProgressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//                            mProgressDialog.setCancelable(true);
//                            mProgressDialog.show();
//
//                            Uri.Builder builder = new Uri.Builder()
//                                    .appendQueryParameter("userid", email.getText().toString().trim());
//                            query = builder.build().getEncodedQuery();
//
//
//                        }
//
//                        @Override
//                        protected Void doInBackground(Void... params) {
//
//
//                            InputStream is = null;
//                            try {
//
//                                String url = server + settings.getString("church_domain", "") + "/passwordrecover.php";
//                                URL obj = new URL(url);
//                                con = (HttpURLConnection) obj.openConnection();
//                                con.setRequestMethod("POST");
//                                con.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)");
//                                con.setRequestProperty("Accept-Language", "UTF-8");
//                                con.setDoOutput(true);
//                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(con.getOutputStream());
//                                outputStreamWriter.write(query);
//                                outputStreamWriter.flush();
//                                Log.e("pass 1", "connection success ");
//                            } catch (Exception e) {
//                                Log.e("Fail 1", e.toString());
//
//                            }
//
//
//                            try {
//                                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//                                String line;
//                                StringBuffer sb = new StringBuffer();
//
//                                while ((line = in.readLine()) != null) {
//                                    sb.append(line + "\n");
//                                }
//                                //   is.close();
//                                resulta = sb.toString();
//                                Log.e("pass 2", "connection success ");
//                            } catch (Exception e) {
//                                Log.e("Fail 2", e.toString());
//                            }
//                            return null;
//                        }
//
//
//                        @Override
//                        protected void onPostExecute(Void result) {
//
//
//                            try {
//                                json_data = new JSONObject(resulta);
//                                int code = (json_data.getInt("code"));
//                                if (code == 1) {
//
//                                    final android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(LoginActivity.this);
//                                    LinearLayout lila1 = new LinearLayout(LoginActivity.this);
//                                    lila1.setOrientation(LinearLayout.VERTICAL);
//                                    alert.setView(lila1);
//                                    alert.setTitle("Success");
//                                    Log.e("Email", (json_data.getString("email")));
//                                    alert.setMessage("Link to change your password has been sent to your email.");
//                                    alert.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
//                                        public void onClick(DialogInterface dialog, int whichButton) {
//                                            alertDialog.cancel();
//                                        }
//                                    });
//                                    alert.show();
//                                } else if (code == 4) {
//
//                                    final android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(LoginActivity.this);
//                                    LinearLayout lila1 = new LinearLayout(LoginActivity.this);
//                                    lila1.setOrientation(LinearLayout.VERTICAL);
//                                    alert.setView(lila1);
//                                    alert.setTitle("Sorry");
//                                    alert.setMessage("Kindly note that the system is on maintenance mode. We will be back shortly.\nWe regret any inconveniences");
//
//                                    alert.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
//                                        public void onClick(DialogInterface dialog, int whichButton) {
//                                            alertDialog.cancel();
//                                        }
//                                    });
//                                    alert.show();
//                                } else {
//                                    final android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(LoginActivity.this);
//                                    LinearLayout lila1 = new LinearLayout(LoginActivity.this);
//                                    lila1.setOrientation(LinearLayout.VERTICAL);
//                                    alert.setView(lila1);
//                                    alert.setTitle("Failed!");
//                                    alert.setMessage((json_data.getString("error_info")));
//                                    Log.e("Fail 3", "Value " + code);
//                                    alert.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
//                                        public void onClick(DialogInterface dialog, int whichButton) {
//                                            dialog.cancel();
//                                        }
//
//
//                                    });
//                                    alert.show();
//
//                                }
//                            } catch (Exception e) {
//                                Log.e("Fail 3", e.toString());
//
//                            }
//
//                            mProgressDialog.dismiss();
//
//
//                        }
//                    }
//
//                   cd = new ConnectionDetector(getApplicationContext());
//                    if (cd.isConnectingToInternet()) {
//
//                        new Des().execute();
//
//                    } else {
//                        count++;
//
//                        String lable;
//                        if (count > 1) {
//                            lable = " attempts)";
//                        } else {
//                            lable = " attempt)";
//                        }
//                        Snackbar
//
//                                .make(v, "No Internet Connection(" + count + lable, Snackbar.LENGTH_LONG)
//                                .setAction("RETRY", new View.OnClickListener() {
//                                    @Override
//                                    public void onClick(View v) {
//                                        submit.performClick();
//                                    }
//                                })
//                                .show();
//
//
//                    }//end of else
//                }
//            }
//        });
//        alertDialog = dialogBuilder.create();
//
//        alertDialog.show();
//        Button cancel = (Button) dialogView.findViewById(R.id.cancel);
//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new android.app.AlertDialog.Builder(LoginActivity.this)
//                        .setTitle("Cancel?")
//                        .setMessage("Cancel password reset")
//
//                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                alertDialog.cancel();
//                            }
//                        })
//
//                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.cancel();
//                            }
//                        })
//                        .show();
//
//            }
//        });

    public void onClick(View v) {
        if(v == login){
            checkLogin();
        }
    }
    public void checkLogin() {

        // Get text from email and password field
         String email = etext1.getText().toString().trim().toLowerCase();
         String password = etext2.getText().toString().trim().toLowerCase();

        // Initialize  AsyncLogin() class with email and password
        new AsyncLogin().execute(email,password);

    }
    private class AsyncLogin extends AsyncTask<String, Void, String>
    {
        ProgressDialog pdLoading = new ProgressDialog(LoginActivity.this);
        HttpURLConnection conn;
        URL url = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //this method will be running on UI thread
            pdLoading.setMessage("Loging In...");
            pdLoading.setCancelable(false);
            pdLoading.show();

        }
        @Override
        protected String doInBackground(String... params) {
            try {

                // URL FOR PHP FILE LOCATION
                url = new URL("http://appscom.000webhostapp.com/scripts/login.php");

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "exception";
            }
            try {
                // HttpURLConnection class to send and receive data from php and mysql
                conn = (HttpURLConnection) url.openConnection();
                conn.setReadTimeout(READ_TIMEOUT);
                conn.setConnectTimeout(CONNECTION_TIMEOUT);
                conn.setRequestMethod("POST");

                // setDoInput and setDoOutput method depict handling of both send and receive
                conn.setDoInput(true);
                conn.setDoOutput(true);
                // Append parameters to URL
                Uri.Builder builder = new Uri.Builder()
                        .appendQueryParameter("username", params[0])
                        .appendQueryParameter("password", params[1]);
                String query = builder.build().getEncodedQuery();

                // Open connection for sending data
                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(query);
                writer.flush();
                writer.close();
                os.close();
                conn.connect();

            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
                e1.printStackTrace();
                return "exception";
            }

            try {

                int response_code = conn.getResponseCode();

                // Check if successful connection made
                if (response_code == HttpURLConnection.HTTP_OK) {

                    // Read data sent from server
                    InputStream input = conn.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                    StringBuilder result = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }

                    // Pass data to onPostExecute method
                    return(result.toString());

                }else{

                    return("unsuccessful");
                }
            } catch (IOException e) {
                e.printStackTrace();
                return "exception";
            } finally {
                conn.disconnect();
            }


        }

        @Override
        protected void onPostExecute(String result) {

            //this method will be running on UI thread

            pdLoading.dismiss();

            if(result.equalsIgnoreCase("Success"))
            {

                Intent intent = new Intent(LoginActivity.this,MapsActivity.class);
                startActivity(intent);
                LoginActivity.this.finish();

            }else if (result.equalsIgnoreCase("Failure")){

                // If username and password does not match display a error message
                Toast.makeText(LoginActivity.this, "Invalid email or password", Toast.LENGTH_LONG).show();

            } else if (result.equalsIgnoreCase("exception") || result.equalsIgnoreCase("unsuccessful")) {

                Toast.makeText(LoginActivity.this, "OOPs! Something went wrong. Connection Problem.", Toast.LENGTH_LONG).show();

            }
        }

    }
}


