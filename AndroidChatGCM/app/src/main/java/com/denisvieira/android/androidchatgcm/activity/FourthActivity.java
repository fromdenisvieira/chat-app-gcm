package com.denisvieira.android.androidchatgcm.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.denisvieira.android.androidchatgcm.R;

/**
 * Created by denisvieira on 02/05/16.
 */
public class FourthActivity extends AppCompatActivity {
    private TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvContent = (TextView) findViewById(R.id.tv_content);
        if( getIntent() != null ){
            tvContent.setText( getIntent().getStringExtra("data1") );
        }
    }
}
