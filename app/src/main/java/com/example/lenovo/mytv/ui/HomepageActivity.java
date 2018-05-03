package com.example.lenovo.mytv.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.lenovo.mytv.R;
import com.example.lenovo.mytv.ui.frament.CCTVFragment;
import com.example.lenovo.mytv.ui.frament.GuanFragment;
import com.example.lenovo.mytv.ui.frament.ShouFragment;
import com.example.lenovo.mytv.ui.frament.ZhiFragment;
import com.example.lenovo.mytv.ui.frament.ZhongFragment;

import java.util.ArrayList;
import java.util.List;

public class HomepageActivity extends AppCompatActivity {

    private RadioGroup Radio;
    private List<Fragment>fragments=new ArrayList<>();
    //private ImageView Panda, Interaction_img;
    private FragmentManager fragmentManager;
    private ShouFragment shouFragment;
    private GuanFragment guanFragment;
    private ZhiFragment zhiFragment;
    private ZhongFragment zhongFragment;
    private CCTVFragment cctvFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        initView();
    }

    private void initView() {
        Radio = (RadioGroup) findViewById(R.id.Radio);
        //Panda=findViewById(R.id.);


        add();
        Radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.RadioButton_shouye:
                        for (int i = 0; i < fragments.size(); i++){
                            fragmentManager.beginTransaction().hide(fragments.get(i)).commit();
                        }
                        fragmentManager.beginTransaction().hide(shouFragment).commit();
                        setTitle("");
                        //Panda.setVisibility(View.VISIBLE);
                        break;
                    case R.id.RadioButton_guancha:
                        for (int i1=0;i1<fragments.size();i1++){
                            fragmentManager.beginTransaction().hide(fragments.get(i1)).commit();
                        }
                        fragmentManager.beginTransaction().hide(guanFragment).commit();
                        setTitle("熊猫观察");
                        //Panda.setVisibility(View.GONE);
                        break;
                    case R.id.RadioButton_zhibo:
                        for (int i1=0;i1<fragments.size();i1++){
                            fragmentManager.beginTransaction().hide(fragments.get(i1)).commit();
                        }
                        fragmentManager.beginTransaction().hide(zhiFragment).commit();
                        setTitle("熊猫直播");
                        //Panda.setVisibility(View.GONE);
                        break;
                    case R.id.RadioButton_zhongguo:
                        for (int i1=0;i1<fragments.size();i1++){
                            fragmentManager.beginTransaction().hide(fragments.get(i1)).commit();
                        }
                        fragmentManager.beginTransaction().hide(zhongFragment).commit();
                        setTitle("直播中国");
                        //Panda.setVisibility(View.GONE);
                        break;
                    case R.id.RadioButton_cctv:
                        for (int i1=0;i1<fragments.size();i1++){
                            fragmentManager.beginTransaction().hide(fragments.get(i1)).commit();
                        }
                        fragmentManager.beginTransaction().hide(cctvFragment).commit();
                        setTitle("CCTV");
                        //Panda.setVisibility(View.GONE);
                        break;

                }
            }
        });
    }
    private void add() {
        shouFragment = new ShouFragment();
        guanFragment = new GuanFragment();
        zhiFragment = new ZhiFragment();
        zhongFragment = new ZhongFragment();
        cctvFragment = new CCTVFragment();
        fragments.add(shouFragment);
        fragments.add(guanFragment);
        fragments.add(zhiFragment);
        fragments.add(zhongFragment);
        fragments.add(cctvFragment);
        fragmentManager =getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fram, shouFragment).hide(shouFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fram, guanFragment).hide(guanFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fram, zhiFragment).hide(zhiFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fram, zhongFragment).hide(zhongFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fram, cctvFragment).hide(cctvFragment).commit();
        fragments.add(shouFragment);
        fragments.add(guanFragment);
        fragments.add(zhiFragment);
        fragments.add(zhongFragment);
        fragments.add(cctvFragment);
        fragmentManager.beginTransaction().show(shouFragment).commit();
    }
}
