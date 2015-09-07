package com.meirco.trucko;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.meirco.truckolib.TruckO;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.hello_world_text_view);
        tv.setText(TruckO.getInstance().getString());
    }

}
