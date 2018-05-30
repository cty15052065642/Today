package activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.example.administrator.today.R;

/**
 * Created by Administrator on 2018/5/30.
 */

public class SplashActivity extends AppCompatActivity{
    private Handler handler = new Handler();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startMainActivity();
            }
        },2000);
    }
    private  boolean startMianActivity = false;//防止startMainActivity()被调用两次出现两个MianActivity
    private void startMainActivity() {
        if(!startMianActivity){
            startMianActivity = true;
            startActivity(new Intent(SplashActivity.this,MainActivity.class));
            finish();
        }
    }

    //点击Splash就进入MianActivity
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        startMainActivity();
        return super.onTouchEvent(event);
    }

    //移除hedler一切防止退出层序handler再运行
    @Override
    protected void onDestroy() {
        handler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
