package com.shamanland.facebook.likebutton.example;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.shamanland.facebook.likebutton.FacebookLikeBox;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_main);

        FacebookLikeBox box = (FacebookLikeBox) findViewById(R.id.com_facebook_like_box);
        box.setUrl("http://google.com");
    }
}
