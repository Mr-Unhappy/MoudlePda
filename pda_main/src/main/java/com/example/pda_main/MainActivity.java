package com.example.pda_main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.pda_common.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pda_common_activity_main);

        Button btn_outer = findViewById(R.id.btn_outer);
        Button btn_inner = findViewById(R.id.btn_inner);


        btn_inner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/main/login").navigation();
            }
        });


        btn_outer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/moudleA/Main").navigation();
            }
        });


    }
}
