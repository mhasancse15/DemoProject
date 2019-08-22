package com.mhasancse15.demoproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mhasancse15.demoproject.DetailsActivity;
import com.mhasancse15.demoproject.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mTitle = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mTitle, ArrayList<String> mDescription, Context mContext) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_button, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");



        holder.mTitleBtn.setText(mTitle.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Log.d(TAG, "onClick: clicked on: " + mTitle.get(position));

                Toast.makeText(mContext, mTitle.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtra("title", mTitle.get(position));
                intent.putExtra("description", mDescription.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTitle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView mDescription, mTitleBtn;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            mTitleBtn = itemView.findViewById(R.id.item_btn);

            parentLayout = itemView.findViewById(R.id.rootLayout);
        }
    }

}
