package com.cqc.paint01.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${cqc} on 2017/9/26.
 */

public class LineView extends View {

    private Paint paint;

    public LineView(Context context) {
        this(context, null);
    }

    public LineView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);//抖动
        paint.setFilterBitmap(true);//双线性过滤
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStrokeWidth(0);
        canvas.drawCircle(150, 150, 100, paint);

        paint.setStrokeWidth(5);
        canvas.drawCircle(400, 150, 100, paint);

        paint.setStrokeWidth(50);
        canvas.drawCircle(150, 400, 100, paint);


        paint.setStrokeWidth(40);
        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawLine(50, 600, 500, 600, paint);

        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(50, 650, 500, 650, paint);

        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawLine(50, 700, 500, 700, paint);

        float[] points = {50, 750, 500, 750, 500, 750, 100, 1000};
//        canvas.drawLine(50, 750, 500, 750, paint);
//        canvas.drawLine(500, 750, 100, 1000, paint);
        paint.setStrokeJoin(Paint.Join.ROUND);//不知道用在哪里，无效
        canvas.drawLines(points, paint);
    }
}
