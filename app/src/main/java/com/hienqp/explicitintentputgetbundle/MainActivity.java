package com.hienqp.explicitintentputgetbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student_send = new Student("Jack Pham", 1990);
        String[] arrayCourse = {"Android", "IOS", "PHP", "NodeJS"};

        buttonSendData = (Button) findViewById(R.id.button_sent_data);
        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();

                bundle.putString(SecondActivity.KEY_STRING, "Khoa Pham Training !!!");
                bundle.putInt(SecondActivity.KEY_INT, 2021);
                bundle.putStringArray(SecondActivity.KEY_ARRAY, arrayCourse);

                // đưa dữ liệu đối tượng vào Bundle
                bundle.putSerializable(SecondActivity.KEY_OBJECT, student_send);

                /** có thể sử dụng 1 trong 2 phương thức putExtra() hoặc putExtras() */
                intent.putExtra(SecondActivity.KEY_BUNDLE, bundle);
//                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }
}