package com.ibrahim.demo.mycamera.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class FocusView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
): View(context, attrs, defStyleAttr){

    private var mTransparentPaint = Paint()
    private var mSemiBlackPaint = Paint()
    private val mPath = Path()
    init {
        initPaints()
    }

    private fun initPaints() {
        mTransparentPaint = Paint()
        mTransparentPaint.color = Color.TRANSPARENT
        mTransparentPaint.setStrokeWidth(10f)

        mSemiBlackPaint = Paint()
        mSemiBlackPaint.color = Color.TRANSPARENT
        mSemiBlackPaint.setStrokeWidth(10f)

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        mPath.reset()

//        mPath.addCircle(width / 2f, height / 2f, 300f, Path.Direction.CW)
        mPath.addOval(150f, 200f, width - 150f,height /2f + 150f, Path.Direction.CW) //left,top,right,bottom
        mPath.setFillType(Path.FillType.INVERSE_EVEN_ODD)

        canvas.drawCircle(width / 2f, height / 2f, 550f, mTransparentPaint)

        canvas.drawPath(mPath, mSemiBlackPaint)
        canvas.clipPath(mPath)
        canvas.drawColor(Color.parseColor("#A6000000"))
    }
}