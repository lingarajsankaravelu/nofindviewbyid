package com.hourglass.lingaraj.nofindviewbyid;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hourglass.lingaraj.nofindviewbyid.databinding.RecyclerviewlayoutsampleBinding;

/**
 * Created by lingaraj on 6/27/16.
 */


public class DisplayNameListAdapter extends RecyclerView.Adapter<DisplayNameListAdapter.ViewHolder> {

     private String TAG = "Recycler Adapter";
    private Context mContext;
    private String[]  names = {"John","Leo","Luke","mark"};


    public DisplayNameListAdapter(Context context) {
        this.mContext = context;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerviewlayoutsampleBinding binding;

        public ViewHolder(Context context,View view) {
            super(view);
          binding = DataBindingUtil.bind(view);
        }

        public RecyclerviewlayoutsampleBinding getBinding()
        {
            return binding;
        }

    }

    @Override
    public DisplayNameListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(this.mContext).inflate(R.layout.recyclerviewlayoutsample, parent, false);

        ViewHolder viewHolder = new ViewHolder(this.mContext,view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(DisplayNameListAdapter.ViewHolder holder, int position) {
       // holder.getBinding().name.setText(this.names[position]);

        holder.getBinding().name.setText(this.names[position]);
        holder.getBinding().executePendingBindings();
        Log.d(TAG,this.names[position]);
    }

    @Override
    public int getItemCount() {
        return this.names.length;
    }


}

