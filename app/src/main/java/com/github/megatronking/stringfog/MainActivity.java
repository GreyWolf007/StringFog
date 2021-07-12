package com.github.megatronking.stringfog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 范例请参考：
        // https://github.com/MegatronKing/StringFog-Sample1
        // https://github.com/MegatronKing/StringFog-Sample2

        Toast.makeText(this, StringTest.finalStaticStr, Toast.LENGTH_LONG).show();
    }

}
