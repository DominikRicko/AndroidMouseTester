package hr.dominikricko.mousetester.drawing;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class DrawingPath {

    private final Paint paint;
    private final Path path;

    public DrawingPath(int color, int strokeWidth){

        this.path = new Path();
        this.paint = new Paint();

        this.paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setXfermode(null);
        this.paint.setAlpha(0xff);

        this.paint.setStrokeWidth(strokeWidth);
        this.paint.setColor(color);
        this.paint.setMaskFilter(null);
    }

    public void draw(Canvas canvas){

        canvas.drawPath(path,paint);

    }

    public void startPath(float x, float y){

        path.moveTo(x,y);

    }

    public void extendPathTo(float x, float y){

        path.lineTo(x,y);

    }

}
