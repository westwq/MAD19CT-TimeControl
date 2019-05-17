package sg.edu.np.twq2.timecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        EditText editText = findViewById(R.id.editText);

        Intent i = new Intent(this, TimeActivity.class);
        i.putExtra("duration", editText.getText().toString());
        startActivity(i);
    }
}
