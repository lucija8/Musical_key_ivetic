package hr.elpros.musical_key_ivetic;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button key1=findViewById(R.id.key1);
        Button key2=findViewById(R.id.key2);
        Button key3=findViewById(R.id.key3);
        Button key4=findViewById(R.id.key4);
        Button key5=findViewById(R.id.key5);
        Button key6=findViewById(R.id.key6);
        MediaPlayer do1=MediaPlayer.create(this, R.raw.soundofdo);
        MediaPlayer re=MediaPlayer.create(this, R.raw.resound);
        MediaPlayer mi=MediaPlayer.create(this, R.raw.misound);
        MediaPlayer fa=MediaPlayer.create(this, R.raw.fasound);
        MediaPlayer sol=MediaPlayer.create(this, R.raw.solsound);
        MediaPlayer la=MediaPlayer.create(this, R.raw.lasound);
        key1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                do1.start();

            }
        });
        key2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.start();

            }
        });
        key3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mi.start();


            }
        });
        key4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fa.start();

            }
        });
        key5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sol.start();

            }
        });
        key6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                la.start();

            }
        });
    }
}