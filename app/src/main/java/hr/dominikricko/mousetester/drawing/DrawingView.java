package hr.dominikricko.mousetester.drawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;

import java.security.KeyStore;

public class DrawingView extends View{

    private DrawingPresenter presenter;

    public DrawingView(Context context) {
        super(context);
    }

    public DrawingView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public void bindPresenter(DrawingPresenter presenter){

        this.presenter = presenter;

    }

    public void updateView() {
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        presenter.draw(canvas);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        
        presenter.onTouchEvent(event);
        return true;
    }

}