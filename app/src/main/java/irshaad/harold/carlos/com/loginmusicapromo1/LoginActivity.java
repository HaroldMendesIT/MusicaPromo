package irshaad.harold.carlos.com.loginmusicapromo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {


    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
//        myImageView.setImageResource(R.drawable.MPLogo);

        login=(Button)findViewById(R.id.btn_login);
        username=(EditText)findViewById(R.id.emailtxt);
        password=(EditText)findViewById(R.id.passtxt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                login();

            }
        });
    }

    public void login() {

        String user=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("musicapromo@gmail.com")&& pass.equals("musicapromo"))
        {
            Toast.makeText(this,"Bem vindo a WebApp MusicaPromo!", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Email ou Password Incorrecto!",Toast.LENGTH_LONG).show();
        }

    }
    

}
