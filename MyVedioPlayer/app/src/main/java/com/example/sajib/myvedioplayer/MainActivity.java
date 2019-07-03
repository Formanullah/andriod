package com.example.sajib.myvedioplayer;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends Activity {

    VideoView videoView;
    MediaController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.videoView);

        controller=new MediaController(this);
        videoView.setMediaController(controller);

        //videoView.setVideoPath("https://r1---sn-nvacq-q5je.googlevideo.com/videoplayback?beids=%5B9466591%5D&key=yt6&expire=1531049755&sparams=dur%2Cei%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpcm2%2Cpcm2cms%2Cpl%2Cratebypass%2Crequiressl%2Csource%2Cexpire&pcm2cms=yes&ms=au%2Crdu&source=youtube&mv=m&dur=162.005&pl=24&ip=103.109.92.246&lmt=1529044184825062&pcm2=yes&id=o-AAl_yn56bWU4YY02qfYVvqIedb4o5DLf4lMPaSegYwtZ&mm=31%2C29&mn=sn-nvacq-q5je%2Csn-npoeenez&ei=u6JBW_OWCou-ogPT4oWgAw&signature=3F450BABBF4F8022D76A158B90C45C34F00531AA.D500504BDEA69BD264984856192E2E1D62CA2145&mt=1531028036&c=WEB&requiressl=yes&ratebypass=yes&fvip=4&itag=22&mime=video%2Fmp4&initcwndbps=267500&ipbits=0&fexp=23709359");

        videoView.setVideoURI(Uri.parse("android.resource://com.example.sajib.myvedioplayer/raw/video"));
        videoView.start();

    }
}
