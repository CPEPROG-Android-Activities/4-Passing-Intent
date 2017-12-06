package wit.ie.intentandroid4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView nameView = (TextView) findViewById(R.id.result_txt);
        nameView.setText(getIntent().getExtras().getString("userName"));
    }

}
