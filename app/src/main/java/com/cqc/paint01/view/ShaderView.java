package com.cqc.paint01.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.cqc.paint01.R;

/**
 * Created by ${cqc} on 2017/9/26.
 */

public class ShaderView extends View {

    private Paint paint;

    public ShaderView(Context context) {
        this(context, null);
    }

    public ShaderView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
//        Shader shader = new LinearGradient(100, 100, 500, 500, Color.GREEN, Color.RED, Shader.TileMode.REPEAT);
//        Shader shader = new RadialGradient(300, 300, 200, Color.BLUE, Color.RED, Shader.TileMode.REPEAT);
//        Shader shader =   new SweepGradient(300,300,Color.BLACK,Color.GREEN);//扫描

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.liuyifei);
        Shader shader1 = new BitmapShader(bitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.liushishi);
        BitmapShader shader2 = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        /**
         * ComposeShader() 在硬件加速下是不支持两个相同类型的 Shader 的，所以这里也需要关闭硬件加速才能看到效果。
         * 没找到硬件加速
         */
        ComposeShader shader = new ComposeShader(shader1, shader2, PorterDuff.Mode.OVERLAY);
        paint.setShader(shader);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(300, 300, 200, paint);
    }
}
