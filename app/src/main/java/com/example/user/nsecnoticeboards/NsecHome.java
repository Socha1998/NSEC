package com.example.user.nsecnoticeboards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class NsecHome extends AppCompatActivity {

    public void noticeClick(View view)
    {
        Intent i= new Intent(this,Notices.class);
        startActivity(i);
    }
    public void examClick(View view)
    {
    }
    public void studentClick(View view)
    {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nsechome);
    }

}
