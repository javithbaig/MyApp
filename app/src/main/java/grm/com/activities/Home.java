package grm.com.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;

import grm.com.R;

public class Home extends AppCompatActivity {

    private AppCompatButton btn_inward, btn_outward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_inward = (AppCompatButton)findViewById(R.id.btn_inward);
        btn_outward = (AppCompatButton)findViewById(R.id.btn_outward);

        btn_inward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Stock_Inward.class);
                startActivity(intent);

            }
        });
    }
}
