package com.demo.javis.danhsachmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditElement extends AppCompatActivity {
    private EditText edt;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_element);
        btn = (Button) findViewById(R.id.Button);
        edt = (EditText) findViewById(R.id.EditText);
        Bundle bundle = getIntent().getExtras();
       edt.setText(bundle.getString("contact"));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edt.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("result",s);
                setResult(100, intent);
                finish();
            }
        });
    }

}
