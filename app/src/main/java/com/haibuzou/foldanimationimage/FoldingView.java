package com.haibuzou.foldanimationimage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2015/7/3.
 */
public class FoldingView extends View {

    private Paint mpaint;

    public FoldingView(Context context) {
        super(context);
        init();
    }

    public FoldingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init() {
        mpaint = new Paint();

    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }
}
