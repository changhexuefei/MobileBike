package com.example.gao.mobilebike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.rules)
    TextView mRules;
    @BindView(R.id.confirm)
    TextView mConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.rules,R.id.confirm})
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rules:
                Intent intent = new Intent(this, DisplayRulesActivity.class);
                startActivity(intent);
                break;
            case R.id.confirm:
                Intent i1 = new Intent(this,RechargeActivity.class);
                startActivity(i1);
                break;
        }

    }


}
