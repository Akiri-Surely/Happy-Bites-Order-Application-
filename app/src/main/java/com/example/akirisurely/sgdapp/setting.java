package com.example.akirisurely.sgdapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Akiri Surely on 7/26/2017.
 */

public class setting extends Fragment {
Button buttonRegister;
    TextView text1;
    TextView text2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.settings,container, false);
        buttonRegister = v.findViewById(R.id.buttonRegister);
        text1= v.findViewById(R.id.textemail);
        text2= v.findViewById(R.id.textnum);
        buttonRegister.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getContext(),MainActivity.class);
                startActivity(i);
            }
        });

        text1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){


                Intent mIntent = new Intent(Intent.ACTION_SENDTO);
                mIntent.setData(Uri.parse("mailto:"));
                mIntent.putExtra(Intent.EXTRA_EMAIL  , new String[] {"surelyakiri011@gmail.com"});
                mIntent.putExtra(Intent.EXTRA_SUBJECT, "");
                startActivity(Intent.createChooser(mIntent, "Send Email Using..."));

            }
        });
       text2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String phone = "0703221031";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);



            }
        });
        return v;
    }
}
