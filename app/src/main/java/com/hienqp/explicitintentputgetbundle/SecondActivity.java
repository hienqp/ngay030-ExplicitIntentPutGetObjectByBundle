package com.hienqp.explicitintentputgetbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textViewGetData;

    public static final String KEY_STRING = "key get string";
    public static final String KEY_INT = "key get int";
    public static final String KEY_ARRAY = "key get array";
    public static final String KEY_OBJECT = "key get object";
    public static final String KEY_BUNDLE = "key get bundle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewGetData = (TextView) findViewById(R.id.textView_get_data);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(SecondActivity.KEY_BUNDLE);

        // phải kiểm tra Bundle có khác null hay không
        if (bundle != null) {
            String stringData = bundle.getString(SecondActivity.KEY_STRING);
            int numberData = bundle.getInt(SecondActivity.KEY_INT, 0);
            String[] arrayData = bundle.getStringArray(SecondActivity.KEY_ARRAY);
            Student studentData = (Student) bundle.getSerializable(SecondActivity.KEY_OBJECT);

            textViewGetData.setText(stringData + "\n" +
                    numberData + "\n" +
                    arrayData[0] + "\n" +
                    studentData.getFirstName() + " - " + studentData.getYearBirth());
        }

    }
}