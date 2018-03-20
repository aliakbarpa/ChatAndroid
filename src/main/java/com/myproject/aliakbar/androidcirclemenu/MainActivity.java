package com.myproject.aliakbar.androidcirclemenu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

import java.util.concurrent.Delayed;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity
{
    String arrayName[] = {"Facebook", "Google", "Twitter", "Whatsapp", "Youtube", "Bla"  };

    public int status = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_add, R.drawable.ic_remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.ic_facebook_one)
                .addSubMenu(Color.parseColor("#30A400"),R.drawable.ic_google_one)
                .addSubMenu(Color.parseColor("#f5f8fa"),R.drawable.ic_twitter_one)
                .addSubMenu(Color.parseColor("#8A39FF"),R.drawable.ic_whatsapp_one)
                .addSubMenu(Color.parseColor("#ec1944"),R.drawable.ic_youtube_one)
                .addSubMenu(Color.parseColor("#ff1944"),R.drawable.ic_youtube_one)
                .setOnMenuSelectedListener(new OnMenuSelectedListener()
                {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this, "You selected " + arrayName[index], Toast.LENGTH_SHORT).show();
                        status = index;
                    }
                })
                .setOnMenuStatusChangeListener(new OnMenuStatusChangeListener()
                {
                    @Override
                    public void onMenuOpened()
                    {
                        Toast.makeText(MainActivity.this, "Please select the menu", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onMenuClosed()
                    {

                        if(status==0)
                        {
                            Delay(1);
                            Intent intent = new Intent(MainActivity.this, FacebookActivity.class);
                            startActivity(intent);
                            status = 5;
                        }
                        else if(status==1)
                        {
                            Delay(1);
                            Intent intent = new Intent(MainActivity.this, GoogleActivity.class);
                            startActivity(intent);
                            status = 5;
                        }
                        else if(status ==2)
                        {
                            Delay(1);
                            Intent intent = new Intent(MainActivity.this, TwitterActivity.class);
                            startActivity(intent);
                            status = 5;
                        }
                        else if(status ==3)
                        {
                            Delay(1);
                            Intent intent = new Intent(MainActivity.this, WhatsappActivity.class);
                            startActivity(intent);
                            status = 5;
                        }
                        else if(status == 4)
                        {
                            Delay(1);
                            Intent intent = new Intent(MainActivity.this, YoutubeActivity.class);
                            startActivity(intent); status = 5;

                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "Closed the menu ...", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        //End modification
        //
    }
    public void Delay(int x)
    {
        try
        {
            Thread.sleep(1000*x);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
