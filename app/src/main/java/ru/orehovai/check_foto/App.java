package ru.orehovai.check_foto;

import android.app.Application;
import android.util.Base64;

public class App extends Application {

    public static final String STARTURL = "";
    public static final String DATEURL = "";

    public static final String USERNAME = "";
    public static final String PASSWORD = "";

    public static String studyName = "";


    public static final String BASE64LOGIN = new String(Base64.encode((App.USERNAME + ":" + App.PASSWORD).getBytes(), Base64.DEFAULT));

    public static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
