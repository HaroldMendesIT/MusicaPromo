package irshaad.harold.carlos.com.loginmusicapromo1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashActivity extends AppCompatActivity {

    private static int splash_timeout = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent homeIntent = new Intent(SplashActivity.this, VideoActivity.class);

                startActivity(homeIntent);
                finish();
            }

        }, splash_timeout);
    }
}
