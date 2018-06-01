package com.example.ayush.iosd_internship;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Activity2 extends AppCompatActivity {

    private int mcounter = 0;
    private Button button4;
    Button btn;
    TextView txv;
    Button clk1;
    VideoView videov1;
    MediaController mediaC1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        btn = (Button) findViewById(R.id.bt);
        txv = (TextView) findViewById(R.id.tx);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter ++;
                txv.setText(Integer.toString(mcounter));
            }
        });

        clk1 = (Button) findViewById(R.id.button);
        videov1 = (VideoView) findViewById(R.id.videoView);
        mediaC1 = new MediaController(this);
    }
    public void videoplay1(View v)
    {
        String videopath = "android.resource://com.example.ayush.iosd_internship/"+R.raw.vidd;
        Uri uri2 = Uri.parse(videopath);
        videov1.setVideoURI(uri2);
        videov1.setMediaController(mediaC1);
        mediaC1.setAnchorView(videov1);
        videov1.start();
    }
    public void openActivity3()
    {
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }
}
