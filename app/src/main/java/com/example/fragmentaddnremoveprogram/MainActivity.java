package com.example.fragmentaddnremoveprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    ReplaceOne replaceOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentFirst fragmentFirst=new FragmentFirst();

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.frame_container,fragmentFirst)

                        .commit();
            }
        });
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 FragmentFirst removefragment=(FragmentFirst)getSupportFragmentManager()
                         .findFragmentById(R.id.frame_container);

                 if(removefragment!=null) {


                        getSupportFragmentManager()
                             .beginTransaction()
                             .remove(removefragment)

                             .commit();
                 }

             }
         });
         b3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ReplaceOne replaceOne=new ReplaceOne();
                 getSupportFragmentManager()
                         .beginTransaction()
                         .replace(R.id.frame_container,replaceOne)
                         .commit();

             }
         });

    }
}
