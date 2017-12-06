package wit.ie.intentandroid4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.go_btn);
        et = (EditText) findViewById(R.id.someUserText);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("userName",et.getText().toString());
                startActivity(intent);
            }
        });
    }


}
