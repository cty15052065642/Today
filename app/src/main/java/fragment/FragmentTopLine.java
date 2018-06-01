package fragment;

import android.view.View;

import com.example.administrator.today.R;

import base.BaseFragment;

/**
 * Created by Administrator on 2018/5/31.
 */

public class FragmentTopLine extends BaseFragment{

    private void initData() {

    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.activity_main_frame_top_line,null);
        return view;
    }
}
