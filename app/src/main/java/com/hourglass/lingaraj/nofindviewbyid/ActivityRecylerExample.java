package com.hourglass.lingaraj.nofindviewbyid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.hourglass.lingaraj.nofindviewbyid.databinding.ActivityRecyclerExampleBinding;

/**
 * Created by lingaraj on 6/27/16.
 */
public class ActivityRecylerExample extends AppCompatActivity {

    ActivityRecyclerExampleBinding activityRecyclerExampleBinding;
    DisplayNameListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_example);
        activityRecyclerExampleBinding  = DataBindingUtil.setContentView(this,R.layout.activity_recycler_example);
        activityRecyclerExampleBinding.nameList.setHasFixedSize(true);
        activityRecyclerExampleBinding.nameList.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        mAdapter = new DisplayNameListAdapter(ActivityRecylerExample.this);
        activityRecyclerExampleBinding.nameList.setAdapter(mAdapter);






    }
}
