package com.cqc.paint01.view;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.cqc.paint01.R;

/**
 * Created by ${cqc} on 2017/9/27.
 * MaskFilter 有两种： BlurMaskFilter 和 EmbossMaskFilter。
 */

public class MaskFilterView extends View {

    private Paint paint;
    private Bitmap bitmap;

    public MaskFilterView(Context context) {
        this(context,null);
    }

    public MaskFilterView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MaskFilterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        paint = new Paint();

        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.a);
        MaskFilter blurMaskFilter = new BlurMaskFilter(50, BlurMaskFilter.Blur.NORMAL);
        paint.setMaskFilter(blurMaskFilter);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawBitmap(bitmap,100,100,paint);
    }
}
