package com.example.lenovo.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textUsername , textPassword ;
    String id=null, password=null;
    CharSequence status=null;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textUsername = (EditText) findViewById(R.id.username);
        textPassword = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);
        //textView = (TextView) findViewById(R.id.textView);
        //button = (Button) findViewById(R.id.buttonProses);
        Button tombol=(Button)findViewById(R.id.login);
        tombol.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Context context=getApplicationContext();
                        id = textUsername.getText().toString();
                        password = textPassword.getText().toString();
                        if(id.equals("135610157")&&password.equals("admin")){
                                Login.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View arg0) {
                                        Intent keli = new Intent(MainActivity.this,MenuUtama.class);
                                        startActivity(keli);
                                    }
                                });
                        }else{
                            status="username or password incorrect ";
                            int duration= Toast.LENGTH_SHORT;
                            Toast toast=Toast.makeText(context,status,duration);
                            toast.show();
                        }
                        //CharSequence text= "Hello Toast!";

                    }
                }
        );
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
