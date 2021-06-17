package com.example.imagenesdesdeservidorweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img1;
    ImageView img2;
    ImageView img3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.iv1);
        img2 = (ImageView) findViewById(R.id.iv2);
        img3 = (ImageView) findViewById(R.id.iv3);

        Picasso.with(this)
                .load("http://10.0.2.2:80/ProyectoPlatos/img/tortilla.jfif")
                .error(R.mipmap.ic_launcher)
                .fit()
                .centerInside()
                .into(img1);
        Picasso.with(this)
                .load("http://10.0.2.2:80/ProyectoPlatos/img/callos.jpg")
                .error(R.mipmap.ic_launcher)
                .fit()
                .centerInside()
                .into(img2);
        Picasso.with(this)
                .load("http://10.0.2.2:80/ProyectoPlatos/img/paella.jfif")
                .error(R.mipmap.ic_launcher)
                .fit()
                .centerInside()
                .into(img3);


    }
}