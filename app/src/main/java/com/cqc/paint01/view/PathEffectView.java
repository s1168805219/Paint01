package com.cqc.paint01.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${cqc} on 2017/9/26.
 * PathEffect:
 * 单一效果：CornerPathEffect  discretePathEffect DashPathEffect  PathDashPathEffect
 * 组合效果：SumPathEffect ComposePathEffect
 */

public class PathEffectView extends View {

    private Paint paint;
    private Path path;

    public PathEffectView(Context context) {
        this(context, null);
    }

    public PathEffectView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);

        //虚线
//        float[] intervals = {100,50};
//        PathEffect pathEffect = new DashPathEffect(intervals,0);
//        paint.setPathEffect(pathEffect);
//        paint.setStyle(Paint.Style.STROKE);


        path = new Path();
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
        path.addArc(200, 200, 400, 400, -225, 225);
        path.lineTo(500, 500);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        canvas.drawCircle(300,300,200,paint);
        canvas.drawPath(path, paint);
    }
}
