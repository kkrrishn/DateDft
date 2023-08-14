package com.krrishn.aaosikhe.datedft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.krrishn.aaosikhe.datedft_lib.DateDft;

public class MainActivity extends AppCompatActivity {
        private EditText date1, date2;
        TextView text;
    String d1= "";
    String d2 ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date1 = findViewById(R.id.editTextDate);
        date2 = findViewById(R.id.editTextDate2);
        text = findViewById(R.id.textView);


        d1= date1.getText().toString();
         d2 = date2.getText().toString();

        DateDft dd = new DateDft("14/10/2023","11/05/2000","dd/mm/yyy");
        text.setText(String.valueOf(dd.getYear()));
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Date 1 "+d1,Toast.LENGTH_SHORT).show();
            }
        });
    }
}