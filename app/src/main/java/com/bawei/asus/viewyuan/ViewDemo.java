package com.bawei.asus.viewyuan;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by asus on 2016/11/5.
 */
public class ViewDemo extends View {

    private Bitmap bitmap;


    public ViewDemo(Context context) {
        super(context);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }

    public ViewDemo(Context context, AttributeSet attrs) {
        super(context, attrs);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }

    public ViewDemo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        //new一个画笔
        Paint paint = new Paint();
        //设置画笔的粗细
        paint.setTextSize(10);
        //设置画笔的颜色
        paint.setColor(0xffff0000);
        /*
        画直线
        1、(第一个参数:线的左边距)
        2、(第二个参数:线的头部的上边距)
        3、(第三个参数:线的尾部的上边距)
        4、(第四个参数:线的长度)
        5、(画笔paint)
        */
//        canvas.drawLine(50, 200, 500, 100, paint);
        /*
        画矩形
        1、第一个参数：矩形左边的X坐标
        2、第二个参数：矩形顶部的Y坐标
        3、第三个参数：矩形右边的X坐标
        4、第四个参数：矩形底部的Y坐标
        */
//        Rect rect = new Rect(100, 80, 500, 300);
//        canvas.drawRect(rect, paint);

        /*
        画圆角矩形
        */
//        RectF rectrf = new RectF(100, 100, 500, 500);
//        canvas.drawRoundRect(rectrf, 10, 10, paint);
//        paint.setTextSize(30);
//        canvas.drawText("This is a canvas,坐标为左下（0，50）", 200, 200, paint);

        /*正常的圆*/
//        canvas.drawCircle(100, 350, 50, paint);
        /*仅描边*/
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(100, 100, 100, paint);
        paint.setTextSize(30);
        canvas.drawText("圆", 100, 100, paint);
        /*填充内部和描边*/
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);
//        canvas.drawCircle(320, 350, 50, paint);
        /*填充内部*/
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawCircle(430, 350, 50, paint);

        /*自定义图片*/
//        canvas.drawBitmap(bitmap,0,50,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
