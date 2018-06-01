package fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.today.R;

import base.BaseFragment;

/**
 * Created by Administrator on 2018/5/31.
 */

public class FragmentFrist extends BaseFragment{

    private void initData() {

    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.activity_main_frame_frist,null);
        return view;
    }
}
