package com.example.gao.mobilebike;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;

import com.example.gao.mobilebike.base.BaseActivity;

import butterknife.BindView;




public class SplashActivity extends BaseActivity {
	@BindView(R.id.rl_splash_root)
	RelativeLayout mRlSplashRoot;

	private Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
				case 1001:
					switchPage();
					break;
			}
		}
	};

	@Override
	protected int getLayoutId() {
		return R.layout.activity_splash ;
	}

	@Override
	protected void initData() {
		AlphaAnimation animation = new AlphaAnimation(0, 1);
		animation.setDuration(1000);
		animation.setFillAfter(true);
		mRlSplashRoot.startAnimation(animation);
		handler.sendEmptyMessageDelayed(1001, 2000);
	}

	private void switchPage() {
//		if (SPUtils.isLogin()) {
//			LogUtils.e("已经登录...");
			startActivity(new Intent(this, MainActivity.class));
			finish();
//		} else {
//			LogUtils.e("没有登录...");
//			boolean isStartGuide = (boolean) SPUtils.get(App.getContext(), "isStartGuide", false);
//			if (isStartGuide) {
//				startActivity(new Intent(this, LoginActivity.class));
//				finish();
//			} else {
//				startActivity(new Intent(this, GuideActivity.class));
//				finish();
//			}
//		}
	}

//	@Override
//	protected void onResume() {
//		super.onResume();
//		JPushInterface.onResume(this);
//	}
//
//	@Override
//	protected void onPause() {
//		super.onPause();
//		JPushInterface.onPause(this);
//	}
}
