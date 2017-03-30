package com.qun.xutils_viewutilsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.tv1)
    private TextView tv1;

    @ViewInject(R.id.tv2)
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewUtils.inject(this);
    }

    @OnClick(R.id.btn)
    public void get(View v) {
        tv1.setText(tv1.toString());
        tv2.setText(tv2.toString());
    }
}
