package com.cqc.paint01.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.cqc.paint01.R;

/**
 * Created by ${cqc} on 2017/9/26.
 * ColorFilter
 */

public class ColorFilterView extends View {

    private Paint paint;
    private Bitmap bitmap;

    public ColorFilterView(Context context) {
        this(context, null);
    }

    public ColorFilterView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ColorFilterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.liuyifei);
//        ColorFilter colorFilter = new LightingColorFilter(Color.RED, 0x000000);
        ColorFilter colorFilter = new PorterDuffColorFilter(Color.YELLOW, PorterDuff.Mode.OVERLAY);
        float[] array = {0.5f,0.2f,5.2f,3.0f};
//        ColorFilter colorFilter = new ColorMatrixColorFilter(array);//?
        paint.setColorFilter(colorFilter);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawBitmap(bitmap, 20, 20, paint);
    }
}
