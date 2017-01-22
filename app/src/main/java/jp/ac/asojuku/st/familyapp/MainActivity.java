package jp.ac.asojuku.st.familyapp;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.cardList);


        Button mail=(Button) this.findViewById(R.id.button1);
        mail.setOnClickListener(this);


        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llManager =new LinearLayoutManager(this);

        llManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llManager);

        ArrayList<FamilyData> family= new ArrayList<FamilyData>();
        for(int i=0; i<MenuData.commentArray.length; i++){
            family.add(new FamilyData(
                    MenuData.commentArray[i]
            ));
        }
        RecyclerView.Adapter adapter =new FamilyAdapter(family);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(family.size()-1);

    }
    @Override
    public void onClick(View v){
        Intent intent =new Intent(MainActivity.this, MailActivity.class);
        startActivity(intent);
    }
}