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

public class MainActivity extends AppCompatActivity {
    private int mcounter = 0;
    Button btn;
    TextView txv;
    private Button button2;
    Button clk;
    VideoView videov;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.bt);
        txv = (TextView) findViewById(R.id.tx);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter ++;
                txv.setText(Integer.toString(mcounter));
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        clk = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.videoView);
        mediaC = new MediaController(this);
    }
    public void videoplay(View v)
    {
        String videopath = "android.resource://com.example.ayush.iosd_internship/"+R.raw.vid;
        Uri uri = Uri.parse(videopath);         //Uri used to identify source from string character
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
}
