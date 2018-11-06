package irshaad.harold.carlos.com.navmenu;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class NavMenu extends AppCompatActivity {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_menu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        } else {

            super.onBackPressed();
        }
    }

    public void website(MenuItem item) {
        Intent intent = new Intent(this,WebAppActivity.class);
        startActivity(intent);
    }

    public void settings(MenuItem item) {
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }

    public void artists(MenuItem item) {
        Intent intent = new Intent(this,ArtistWebAppActivity.class);
        startActivity(intent);
    }

    public void albums(MenuItem item) {
        Intent intent = new Intent(this,AlbumWebAppActivity.class);
        startActivity(intent);
    }

    public void genre(MenuItem item) {
        Intent intent = new Intent(this,GenreWebAppActivity.class);
        startActivity(intent);
    }

    public void signup(MenuItem item) {
        Intent intent = new Intent(this,SignupWebAppActivity.class);
        startActivity(intent);
    }

    public void login(MenuItem item) {
        Intent intent = new Intent(this,LoginWebAppActivity.class);
        startActivity(intent);
    }

    public void about(MenuItem item) {
        Intent intent = new Intent(this,SobreNosActivity.class);
        startActivity(intent);
    }
}
