package com.example.gao.mobilebike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;




public class PersonalCenterActivity extends AppCompatActivity {

    @BindView(R.id.login)
    TextView mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_personal_center);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login)
    public void onClick() {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);

    }
}
