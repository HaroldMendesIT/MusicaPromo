package mz.ac.ucm.musicapromoaapp;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    private DrawerLayout mDrayerLayout;
    private ActionBarDrawerToggle mToogle;
    private Toolbar mToolbar;




    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar =  (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);





        mDrayerLayout = (DrawerLayout) findViewById(R.id.DrawerLayout);
        mToogle = new ActionBarDrawerToggle(this, mDrayerLayout, R.string.open, R.string.close);

          mDrayerLayout.addDrawerListener(mToogle);
          mToogle.syncState();




            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToogle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
