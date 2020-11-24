package hr.dominikricko.mousetester;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.DisplayMetrics;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar currentToolbar;
    private DrawingView currentDrawboard;
    private DisplayMetrics metrics;

    private void initComponents(){
        currentDrawboard = findViewById(R.id.drawingView);
        currentToolbar = findViewById(R.id.toolbar);
        metrics = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        currentDrawboard.init(metrics);
        setSupportActionBar(currentToolbar);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

}