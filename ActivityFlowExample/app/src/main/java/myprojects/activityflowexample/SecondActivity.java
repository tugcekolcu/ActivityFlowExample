package myprojects.activityflowexample;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private final String TAG = "Flow Second : ";
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG,"onCreate()");
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        text = (TextView)findViewById(R.id.textSecond);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy()");
    }
}
