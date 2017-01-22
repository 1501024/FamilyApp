package jp.ac.asojuku.st.familyapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by MATSUO on 2016/11/02.
 */
public class FamilyViewHolder extends RecyclerView.ViewHolder{

    View base;
    TextView textViewComment;

    public FamilyViewHolder(View v){
        super(v);
        this.base=v;
        this.textViewComment=(TextView) v.findViewById(R.id.comment);

    }
}
