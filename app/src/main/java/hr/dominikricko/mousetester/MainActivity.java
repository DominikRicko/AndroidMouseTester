package hr.dominikricko.mousetester;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.DisplayMetrics;

import hr.dominikricko.mousetester.drawing.DrawingPresenter;
import hr.dominikricko.mousetester.drawing.DrawingView;

public class MainActivity extends AppCompatActivity {

    private Toolbar currentToolbar;
    private DrawingView currentDrawboard;
    private DisplayMetrics metrics;
    private DrawingPresenter drawingPresenter;

    private void initComponents(){

        currentDrawboard = findViewById(R.id.drawingView);
        currentToolbar = findViewById(R.id.toolbar);

        drawingPresenter = new DrawingPresenter(currentDrawboard);
        currentDrawboard.bindPresenter(drawingPresenter);

        setSupportActionBar(currentToolbar);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

}