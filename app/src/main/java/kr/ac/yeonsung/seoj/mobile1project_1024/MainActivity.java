package kr.ac.yeonsung.seoj.mobile1project_1024;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        Button btnPlus = findViewById(R.id.btn_plus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = edit1.getText().toString();
                String s2 = edit2.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("s1", s1);
                intent.putExtra("s2", s2);
                startActivityForResult(intent, 0);
                //*** 후에 secondActivity에서 값을 꺼내야함 ->덧셈 후 -> 메인액티비티에 값을 돌려줌
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            int sum = data.getIntExtra("sum", 0);
            Toast.makeText(getApplicationContext(), "계산결과: " + sum, Toast.LENGTH_LONG).show();
        }
    }
}