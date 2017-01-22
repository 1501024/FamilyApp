package jp.ac.asojuku.st.familyapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by MATSUO on 2016/11/02.
 */
public class FamilyAdapter extends RecyclerView.Adapter<FamilyViewHolder>{
    private ArrayList<FamilyData> rouletteDataSet;

    public FamilyAdapter(ArrayList<FamilyData> roulette){
        this.rouletteDataSet=roulette;
    }

    @Override
    public FamilyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout,parent,false);
        return new FamilyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final FamilyViewHolder holder,final int listPosition){
        holder.textViewComment.setText(rouletteDataSet.get(listPosition).getComment());

    }
    @Override
    public int getItemCount(){
        return rouletteDataSet.size();
    }
}
