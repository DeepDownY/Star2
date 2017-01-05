package com.example.y1247.star;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bu_Movie)
    Button bu_Movie;

    @BindView(R.id.bu_News)
    Button bu_News;

    @BindView(R.id.bu_Reader)
    Button bu_Reader;

    @BindView(R.id.bu_Shares)
    Button bu_Share;

    @BindView(R.id.bu_Weather)
    Button bu_Weather;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        bu_Movie.setOnClickListener(this);
        bu_News.setOnClickListener(this);
        bu_Weather.setOnClickListener(this);
        bu_Share.setOnClickListener(this);
        bu_Reader.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String word = null;
        switch (view.getId()){
            case R.id.bu_News:
                word = "News";
                break;
            case R.id.bu_Movie:
                word = "Movie";
                break;
            case R.id.bu_Reader:
                word = "Reader";
                break;
            case R.id.bu_Shares:
                word = "Shares";
                break;
            case R.id.bu_Weather:
                word = "Weather";
                break;
        }
        if(word!=null){
            Toast.makeText(this,word+" will be finish soon",Toast.LENGTH_SHORT).show();
        }
    }
}
