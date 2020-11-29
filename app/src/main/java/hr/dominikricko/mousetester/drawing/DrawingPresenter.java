package hr.dominikricko.mousetester.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.PathInterpolator;

import java.util.ArrayList;

public class DrawingPresenter {

    private DrawingView testerView;
    private ArrayList<DrawingPath> paths;

    private DrawingPath currentPath;

    private final int BACKGROUND_COLOR = Color.WHITE;
    private final int BRUSH_SIZE = 20;
    private final int BRUSH_COLOR = Color.BLUE;

    public DrawingPresenter(DrawingView drawingActivity){

        this.testerView = drawingActivity;

        this.paths = new ArrayList<>();

    }

    public void draw(Canvas canvas){

        canvas.drawColor(BACKGROUND_COLOR);
        for (DrawingPath path : paths)  path.draw(canvas);

    }

    public void onTouchEvent(MotionEvent event){
        float x = event.getX();
        float y = event.getY();

        switch(event.getAction()) {

            case MotionEvent.ACTION_DOWN :

                currentPath = new DrawingPath(BRUSH_COLOR, BRUSH_SIZE);
                paths.add(currentPath);
                currentPath.startPath(x,y);

                testerView.updateView();

                break;

            case MotionEvent.ACTION_MOVE :

                currentPath.extendPathTo(x,y);

                testerView.updateView();

                break;

        }

    }

}