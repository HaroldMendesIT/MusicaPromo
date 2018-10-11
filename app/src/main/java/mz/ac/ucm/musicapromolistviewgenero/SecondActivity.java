package mz.ac.ucm.musicapromolistviewgenero;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {


    Toolbar mToolbar;
    ImageView flag;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        flag = (ImageView) findViewById(R.id.imageView);


        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mToolbar.setTitle(bundle.getString("MusicGender"));
            if(mToolbar.getTitle().toString().equalsIgnoreCase("Afro House")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.ic_launcher_background));


            }


        }

    }
}
