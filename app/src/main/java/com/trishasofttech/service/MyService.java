package com.trishasofttech.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.IBinder;

public class MyService extends Service {
    MediaPlayer mediaPlayer;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /*to attach the music*/

    @Override
    public void onCreate() {
        super.onCreate();
        /*to pass the music into mediaplayer*/
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mysong);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        /*to start play music*/
        mediaPlayer.start();

    }

    /*to stop the music*/

    @Override
    public void onDestroy() {
        super.onDestroy();
        /*to stop the music*/
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}