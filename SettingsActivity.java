package group8.level2.learnado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        }
            public void onClick(View onClick) {
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
    }
}
