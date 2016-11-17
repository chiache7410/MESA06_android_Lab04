package tw.org.iii.lab04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page3Activity extends AppCompatActivity {
    private TextView mesg;
    private int random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Intent it = getIntent();
        int level = it.getIntExtra("level",0);
        String name = it.getStringExtra("name");
        boolean sound = it.getBooleanExtra("sound", false);
        random = (int)(Math.random());
        mesg = (TextView)findViewById(R.id.page3_mesg);
        mesg.setText("Name : " + name + "\n" +
                    "Level : " + level + "\n" +
                    "Sound : " + (sound?"On":"Off") + "\n" +
                    "Lottery : " + random);
    }

    @Override
    public void finish() {
        //setResult(random);
        Intent it = new Intent();
        it.putExtra("key1","kkey");
        setResult(random,it);
        super.finish();
    }
}
