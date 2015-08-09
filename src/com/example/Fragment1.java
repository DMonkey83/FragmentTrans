package com.example;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 9/19/12
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fragment1 extends Fragment{
    final public String LOGTAG = "Fragment1";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(LOGTAG, "onCreateView");

        View theView = inflater.inflate(
                R.layout.fragment1, container, false);

        return theView;
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d(LOGTAG, "onAttach");

        super.onAttach(activity);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(LOGTAG, "onCreate");

        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d(LOGTAG, "onActivityCreated");

        super.onActivityCreated(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onStart() {
        Log.d(LOGTAG, "onStart");

        super.onStart();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onStop() {
        Log.d(LOGTAG, "onStop");

        super.onStop();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onPause() {
        Log.d(LOGTAG, "onPause");

        super.onPause();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onResume() {
        Log.d(LOGTAG, "onResume");

        super.onResume();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDestroyView() {
        Log.d(LOGTAG, "onDestroyView");

        super.onDestroyView();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDestroy() {
        Log.d(LOGTAG, "onDestroy");

        super.onDestroy();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void onDetach() {
        Log.d(LOGTAG, "onDetach");

        super.onDetach();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
