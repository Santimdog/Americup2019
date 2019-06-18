package com.example.americup.model;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.americup.R;

import java.util.ArrayList;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {
    private Context mcontext;
    private ArrayList<Team> mlist;
    public TeamAdapter(Context context, ArrayList<Team> list){
        mcontext = context;
        mlist = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        View view = layoutInflater.inflate(R.layout.team_list_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int pos) {

        Team team = mlist.get(pos);
        ImageView image = holder.itemImage;
        TextView name,points;
        name= holder.itemName;
        points=holder.itemPoints;

        image.setImageResource(mlist.get(pos).getFlag());
        name.setText(team.getName());
        points.setText(team.getPoints());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView itemName,itemPoints;
        public ViewHolder( View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.imgFlag);
            itemName = itemView.findViewById(R.id.teamTextView);
            itemPoints = itemView.findViewById(R.id.pointsTextView);
        }
    }

}
