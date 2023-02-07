package com.example.way2job.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.way2job.CardsInfo;
import com.example.way2job.R;
import com.example.way2job.RoundsInformation;
import com.example.way2job.models.Information;
import com.example.way2job.models.Rounds;

import org.w3c.dom.Text;

import java.util.List;

public class RoundAdapter extends RecyclerView.Adapter<RoundAdapter.ViewHolder> {
    Context context;
    List<Rounds> roundInfoList;

    public RoundAdapter(Context context, List<Rounds> roundInfoList) {
        this.context = context;
        this.roundInfoList = roundInfoList;
    }

    @NonNull
    @Override
    public RoundAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.carditem, parent ,false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RoundAdapter.ViewHolder holder, int position) {
//        holder.location.setText(roundInfoList.get(position).getLocation());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, RoundsInformation.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return roundInfoList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView companyName  , companyType , roleOffered , location, ctc;

        CardView cardView;
        View parentView;



        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            this.parentView = itemView;
            this.cardView = itemView.findViewById(R.id.cardItem);
            this.companyName = itemView.findViewById(R.id.cname);
            this.companyType = itemView.findViewById(R.id.ctype);
            this.roleOffered = itemView.findViewById(R.id.role);
            this.ctc = itemView.findViewById(R.id.ctc);
            this.location = itemView.findViewById(R.id.location);


        }
    }

}
