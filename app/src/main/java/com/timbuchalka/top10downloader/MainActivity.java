package com.timbuchalka.top10downloader;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity{
    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private class DownloadData extends AsyncTask<String,Void,String>{
        private static final Sting TAG="DownloadData";

    }
    @Override
    protected void onPostExecute(String s){
        super.onPostExecute(s);
        Log.d(TAG,"onPostExecute: " +s);
    }
    private String downloadXML(String urlPath){
        StringBuilder stringBuilder=new StringBuilder();
        try{
            URL url=new URL(urlPath);
            HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
            int response=httpURLConnection.getResponseCode();

    }
}








