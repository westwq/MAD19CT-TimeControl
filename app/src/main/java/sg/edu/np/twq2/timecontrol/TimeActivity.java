package sg.edu.np.twq2.timecontrol;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TimeActivity extends AppCompatActivity {
    int[] timeLeft;
    TextView[] tv;
    Toast[] tt;

    CountDownTimer cdt;
    ArrayList<String> data = new ArrayList<>();

    int i;

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        Intent intent = getIntent();
        int duration = Integer.parseInt(intent.getStringExtra("duration"));

        timeLeft = new int[]{duration*1000, duration*1000};

        tv = new TextView[]{findViewById(R.id.textPlayer1), findViewById(R.id.textPlayer2)};
        for(TextView t:tv)
        {
            t.setText("" + duration);
        }

        tt = new Toast[]{
                Toast.makeText(TimeActivity.this, "Player 1's time runs out", Toast.LENGTH_LONG),
                Toast.makeText(TimeActivity.this, "Player 2's time runs out", Toast.LENGTH_LONG),
                };

        ListView list = findViewById(R.id.list);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        startTimer(timeLeft[i]);
    }

    private void startTimer(int dur)
    {
        cdt = new CountDownTimer(dur, 100) {
            @Override
            public void onTick(long l) {
                tv[i].setText("" + (l+500)/1000 );
                timeLeft[i] = (int)l;
            }

            @Override
            public void onFinish() {
                tv[i].setText("0");
                timeLeft[i] = 0;

                tt[i].show();
            }
        };
        cdt.start();
    }

    public void onClick(View v)
    {
        cdt.cancel(); //stop the timer
        data.add("Player " + (i+1) + " left " + timeLeft[i]/1000 + " sec");
        i++;i%=2;
        startTimer(timeLeft[i]);

        adapter.notifyDataSetChanged();
    }
}
