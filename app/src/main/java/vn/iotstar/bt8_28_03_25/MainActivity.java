package vn.iotstar.bt8_28_03_25;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn_viewPager = findViewById(R.id.btn_viewpager);
        btn_viewPager.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ViewPager_tablayout.class);
            startActivity(intent);
        });
    }
}