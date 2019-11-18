package com.example.labcomdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationCode();
    }

    /*Navigation*/
    public void NavigationCode(){
        /*Buttons*/
        Button get_started_btn;
        /*Button ids*/
        get_started_btn=findViewById(R.id.get_started_btn);
        get_started_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login fragment=new login();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,fragment);
                transaction.commit();
            }
        });
    }
}
