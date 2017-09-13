package com.example.thagadur.android_session15_assignment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Thagadur on 9/12/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyView> {
    //    Declare the objects for initialisation of constructor
    ArrayList<DataList> vNames;
    Context mContext;

    public CustomAdapter(Context mContext, ArrayList<DataList> vNames) {
        this.mContext = mContext;
        this.vNames = vNames;
    }

    //    inflate the layout
    @Override
    public MyView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view_data, parent, false);
        MyView myView = new MyView(view);
        return myView;
    }

    //Set the text view to cardView layout
    @Override
    public void onBindViewHolder(MyView holder, int position) {
        holder.textView.setText(vNames.get(position).getvName());

    }

    // get the arraylist count
    @Override
    public int getItemCount() {
        System.out.println(vNames.size());
        return vNames.size();
    }

    class MyView extends RecyclerView.ViewHolder {
        TextView textView;

        public MyView(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text_view_name);
        }
    }
}
