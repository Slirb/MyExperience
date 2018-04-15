package com.example.vance.myexperience;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void javaClick(View view){
        Intent i =new Intent(this,JavaActivity.class);

        startActivity(i);
    }

    public void mvcClick(View view){
        Intent i =new Intent(this,MVCActivity.class);

        startActivity(i);
    }
    public void sqlClick(View view){
        Intent i =new Intent(this,SQLActivity.class);

        startActivity(i);
    }
    public void otherClick(View view){
        Intent i =new Intent(this,OtherActivity.class);

        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_avctivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*
        Handle action bar item clicks here. The action bar will
        automatically handle clicks on the Home/Up button, so long
        as you specify a parent activity in AndroidManifest.xml.
        */
        int id = item.getItemId();


        switch (item.getItemId()){
            case R.id.menu_Github:
                //Open up Git Hub
                String url = "https://github.com/Slirb";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }

}


