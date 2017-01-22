package jp.ac.asojuku.st.familyapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        Button btnSend=(Button) this.findViewById(R.id.button2);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit =(EditText)findViewById(R.id.editText);
                String title= edit.getText().toString();
                Uri uri=Uri.parse("mailto: millefeuille7766@gmail.com");
                Intent intent=new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra(Intent.EXTRA_SUBJECT,title);
                startActivity(intent);
            }
        });
    }

}
