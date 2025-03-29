package vn.iotstar.bt8_28_03_25;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import vn.iotstar.bt8_28_03_25.SearchRecylerView.IndicatorActivity;
import vn.iotstar.bt8_28_03_25.ViewPager2.ViewPager_tablayout;

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
        Button btn_indicator = findViewById(R.id.btn_indicator);
        btn_indicator.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, IndicatorActivity.class);
            startActivity(intent);
        });
    }
}