package hr.dominikricko.mousetester;

import android.view.MotionEvent;
import android.view.View;

public class MouseTester implements View.OnHoverListener{




    @Override
    public boolean onHover(View v, MotionEvent event) {

        if(event.getToolType(event.getActionIndex()) == MotionEvent.TOOL_TYPE_MOUSE) {

            //mouse testing stuff here

        }

        return false;
    }
}
