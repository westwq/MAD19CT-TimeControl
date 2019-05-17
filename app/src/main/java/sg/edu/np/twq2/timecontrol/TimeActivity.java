package sg.edu.np.twq2.timecontrol;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TimeActivity extends AppCompatActivity {
    int player1;
    int player2;
    TextView tvPlayer1;
    TextView tvPlayer2;
    CountDownTimer cdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        Intent i = getIntent();
        int duration = Integer.parseInt(i.getStringExtra("duration"));

        player1 = duration*1000;
        player2 = duration*1000;

        tvPlayer1 = findViewById(R.id.textPlayer1);
        tvPlayer2 = findViewById(R.id.textPlayer2);

        startTimer1(duration);
    }

    private void startTimer1(int dur)
    {
        cdt = new CountDownTimer(dur, 1000 ) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

            }
        };
        cdt.start();
    }
}
