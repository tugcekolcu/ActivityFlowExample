package myprojects.activityflowexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "Flow Main : ";
    public final static String EXTRA_MESSAGE = "myprojects.activityflowexample.MESSAGE";
    Button gecisYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate()");

        gecisYap =(Button) findViewById(R.id.btnGecis);
        gecisYap.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mesajGonder(v);
            }
        });
    }
    public void mesajGonder(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Hello");
        startActivity(intent);
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
