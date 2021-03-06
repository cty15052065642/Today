package activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.today.R;

import java.util.ArrayList;

import base.BaseFragment;
import fragment.FragmentFrist;
import fragment.FragmentSmallVideo;
import fragment.FragmentTopLine;
import fragment.FragmentWatermelon;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView first_iv;
    private ImageView watermelon_iv;
    private ImageView top_line_iv;
    private ImageView small_video_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        first_iv = (ImageView) findViewById(R.id.activity_main_bottom_iv_first);
        watermelon_iv = (ImageView)findViewById(R.id.activity_main_bottom_iv_watermelon);
        top_line_iv = (ImageView)findViewById(R.id.activity_main_bottom_iv_top_line);
        small_video_iv = (ImageView)findViewById(R.id.activity_main_bottom_iv_small_video);
        first_iv.setOnClickListener(this);
        watermelon_iv.setOnClickListener(this);
        top_line_iv.setOnClickListener(this);
        small_video_iv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        switch (v.getId()){
            case R.id.activity_main_bottom_iv_first:
                ft.replace(R.id.activity_main_frame,new FragmentFrist());
                break;
            case R.id.activity_main_bottom_iv_watermelon:
                ft.replace(R.id.activity_main_frame,new FragmentWatermelon());
                break;
            case R.id.activity_main_bottom_iv_top_line:
                ft.replace(R.id.activity_main_frame,new FragmentTopLine());
                break;
            case R.id.activity_main_bottom_iv_small_video:
                ft.replace(R.id.activity_main_frame,new FragmentSmallVideo());
                break;
        }
        ft.commit();
    }
}
