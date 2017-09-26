package com.cqc.paint01.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${cqc} on 2017/9/26.
 * paint  color
 */

public class ColorPractice extends View {

    private Paint paint;

    public ColorPractice(Context context) {
        this(context,null);
    }

    public ColorPractice(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ColorPractice(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStrokeWidth(20);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(200,200,150,paint);

        paint.setARGB(100,100,100,100);
        canvas.drawLine(400,20,500,300,paint);

        paint.setColor(Color.parseColor("#1A237E"));
        paint.setStrokeWidth(50);
        paint.setTextSize(50);
        canvas.drawText("AndroidCQC",300,600,paint);
    }
}
