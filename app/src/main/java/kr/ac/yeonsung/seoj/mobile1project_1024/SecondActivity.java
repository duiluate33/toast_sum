package kr.ac.yeonsung.seoj.mobile1project_1024;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        //저장되어있는 s1,s2값을 꺼냄
        int n1 = Integer.parseInt(intent.getStringExtra("s1"));
        int n2 = Integer.parseInt(intent.getStringExtra("s2"));
        //sum = n1 + n2; 자리 상관x
        Button btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = n1 + n2;
                Intent intentMain = new Intent(getApplicationContext(), MainActivity.class);
                intentMain.putExtra("sum", sum);
                setResult(RESULT_OK, intentMain); //***
                finish();
            }
        });
    }

        }
