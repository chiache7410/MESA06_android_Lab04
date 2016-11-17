package tw.org.iii.lab04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button test1, test2;
    {Log.v("brad","New");}
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("brad","onCreate");
        test1 = (Button)findViewById(R.id.test1);
        test2 = (Button)findViewById(R.id.test2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad","onRestart");
    }

    public void test1(View view){
        if (view == test1) {
            Intent it = new Intent(this, Page2Activity.class);
            startActivity(it);
            Log.v("brad", "test1 return");
        }else if (view == test2) {
            finish();
        }
    }
    public void test3(View view){
        Intent it = new Intent(this, Page3Activity.class);
        it.putExtra("name", "Brad");
        it.putExtra("level", 4);
        it.putExtra("sound", true);
        //startActivity(it);
        startActivityForResult(it,123); //requestCode => 123
    }
    @Override
    public void onActivityReenter(int requestCode, int resultCode, Intent data) {
        super.onActivityReenter(requestCode, resultCode, data);
        String key1 = data.getStringExtra("key1");
        Log.v("brad", "onActivityReenter:" + requestCode + ":" + resultCode + ":" + key1);
    }
}
