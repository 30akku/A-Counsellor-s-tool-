package org.tensorflow.yolo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import org.tensorflow.yolo.view.ClassifierActivity;

public class splashactivity extends Activity {


    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashfile);
        ImageView iv= (ImageView) findViewById(R.id.logo_id);


        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splashactivity.this, ClassifierActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}

