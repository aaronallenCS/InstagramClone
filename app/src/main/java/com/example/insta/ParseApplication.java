package com.example.insta;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application
{

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("6kz6Ez1zAFO4sQSnFp8QEl6vNnVejJJ6GqkqubU5")
            .clientKey("zHouMr0XsEaH8cnGHxOg0LqBQlbdBaITpkyPRD2a")
            .server("https://parseapi.back4app.com/")
            .build()
        );
    }
}
