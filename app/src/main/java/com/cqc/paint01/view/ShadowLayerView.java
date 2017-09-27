package com.cqc.paint01.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${cqc} on 2017/9/27.
 * setShadowLayer() 阴影
 */

public class ShadowLayerView extends View {

    private Paint paint;

    public ShadowLayerView(Context context) {
        this(context,null);
    }

    public ShadowLayerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ShadowLayerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();

        paint.setShadowLayer(20,0,0, Color.RED);
        paint.setTextSize(100);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText("AndroidCQC",100,200,paint);
    }
}
