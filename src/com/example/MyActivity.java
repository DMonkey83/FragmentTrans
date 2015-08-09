package com.example;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends Activity
{
    final String _fragmentTag = "dynamicFragment";
    public static final String LOGTAG = "FragmentTrans";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    public void onClickBtnAdd(View theView) {
        Log.i(LOGTAG, "onClickBtnAdd");
    }

    public void onClickBtnRemove(View theView) {
        Log.i(LOGTAG, "onClickBtnRemove");

        FragmentManager fm = getFragmentManager();

    }

    public void onClickBtnReplace(View theView) {
         Log.i(LOGTAG, "onClickBtnReplace");

         FragmentManager fm = getFragmentManager();
     }

    public void onClickBtnAttach(View theView) {
        Log.i(LOGTAG, "onClickBtnAttach");

        FragmentManager fm = getFragmentManager();
    }

    public void onClickBtnDetach(View theView) {
        Log.i(LOGTAG, "onClickBtnDetach");

        FragmentManager fm = getFragmentManager();
    }

    public void onClickBtnPrevious(View theView) {
        Log.i(LOGTAG, "onClickBtnDetach");

        FragmentManager fm = getFragmentManager();
    }

    public void showMsg(String msg) {
        Log.i(LOGTAG, msg);
        Toast t = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        t.show();
    }

    public static void LogBackStackEntry(FragmentManager.BackStackEntry entry) {
        if(entry != null) {
            Log.d(LOGTAG, "BackStackEntry Name:" + entry.getName());
        }
        else {
            Log.d(LOGTAG, "BackStackEntry Name:<NULL>");
        }
    }
}
