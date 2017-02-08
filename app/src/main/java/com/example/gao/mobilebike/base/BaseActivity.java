package com.example.gao.mobilebike.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import butterknife.ButterKnife;

/**
 * Created by 14369 on 2016/12/9.
 */

public abstract class BaseActivity extends AppCompatActivity {


	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
		//设置全屏显示
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(getLayoutId());
		ButterKnife.bind(this);
		initData();
		initListener();
	}
	protected void initListener() {
	}

	protected abstract int getLayoutId();

	protected abstract void initData();
}
