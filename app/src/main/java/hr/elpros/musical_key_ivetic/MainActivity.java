package hr.elpros.musical_key_ivetic;
import android.widget.Button;
import android.media.SoundPool;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button key1, key2, key3, key4, key5, key6;

    int sdo, re, mi, fa, sol, la;
    SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        key1=(Button) findViewById(R.id.key1);
        key2=(Button) findViewById(R.id.key2);
        key3=(Button) findViewById(R.id.key3);
        key4=(Button) findViewById(R.id.key4);
        key5=(Button) findViewById(R.id.key5);
        key6=(Button) findViewById(R.id.key6);
        soundPool = new SoundPool.Builder().setMaxStreams(6).build();
        sdo = soundPool.load(this, R.raw.soundofdo,1);
        re = soundPool.load(this, R.raw.resound,1);
        mi = soundPool.load(this, R.raw.misound,1);
        fa = soundPool.load(this, R.raw.fasound,1);
        sol = soundPool.load(this, R.raw.solsound,1);
        la = soundPool.load(this, R.raw.lasound,1);
        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(sdo, 1,1,0,0,1);
            }
        });
        key2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(re, 1,1,0,0,1);
            }
        });
        key3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(mi, 1,1,0,0,1);
            }
        });
        key4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(fa, 1,1,0,0,1);
            }
        });
        key5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(sol, 1,1,0,0,1);
            }
        });
        key6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPool.play(la, 1,1,0,0,1);
            }
        });


    }
}
