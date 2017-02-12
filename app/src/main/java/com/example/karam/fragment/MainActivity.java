package com.example.karam.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();

    }

    public void opencalls(View v)
    {



        FragmentTransaction ft = fm.beginTransaction();
        Fragment cm = new call_layout  ();

        ft.replace(R.id.frame_layout ,cm);

        ft.commit();

    }

    public void openchats(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment chat_frag = new chat_layout();
        ft.replace(R.id.frame_layout , chat_frag );

        ft.commit();

    }

    public void opencontacts(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment contact_frag = new contact_layout();

        ft.replace(R.id.frame_layout , contact_frag);


        ft.commit();
    }
}