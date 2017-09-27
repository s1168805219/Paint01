package com.cqc.paint01.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.cqc.paint01.R;

/**
 * Created by ${cqc} on 2017/9/26.
 */

public class TransferModeView extends View {

    private Paint paint;
    private Bitmap rectBitmap;
    private Bitmap cirlceBitmap;
    private Xfermode xfermode;

    public TransferModeView(Context context) {
        this(context,null);
    }

    public TransferModeView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TransferModeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
        rectBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.rect);
        cirlceBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.circle);

        xfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawBitmap(rectBitmap,50,50,paint);
        paint.setXfermode(xfermode);
        canvas.drawBitmap(cirlceBitmap,200,200,paint);
        paint.setXfermode(null);//用完要清空
    }
}
