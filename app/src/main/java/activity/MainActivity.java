package activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.today.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button first_btn;
    private Button watermelon_btn;
    private Button top_line_btn;
    private Button small_video_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        first_btn = (Button)findViewById(R.id.activity_main_bottom_btn_first);
        watermelon_btn = (Button)findViewById(R.id.activity_main_bottom_btn_watermelon);
        top_line_btn = (Button)findViewById(R.id.activity_main_bottom_btn_top_line);
        small_video_btn = (Button)findViewById(R.id.activity_main_bottom_btn_small_video);
        first_btn.setOnClickListener(this);
        first_btn.setOnClickListener(this);
        first_btn.setOnClickListener(this);
        first_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_main_bottom_btn_first:
                break;
            case R.id.activity_main_bottom_btn_watermelon:
                break;
            case R.id.activity_main_bottom_btn_top_line:
                break;
            case R.id.activity_main_bottom_btn_small_video:
                break;
        }
    }
}
