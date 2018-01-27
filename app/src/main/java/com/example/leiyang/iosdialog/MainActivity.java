package com.example.leiyang.iosdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import view.MDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void quit(View view) {
        final MDialog mDialog = new MDialog(this);
        mDialog.setOnCancelListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mDialog.isShowing()){
                    mDialog.dismiss();
                }
            }
        });

        mDialog.setOnExitListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mDialog.isShowing()){
                    mDialog.dismiss();
                    finish();
                }
            }
        });
        mDialog.show();
    }
}
