package com.android.phuc.nfc;

//import com.android.phuc.nfc.R;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class OTextView extends TextView {

	private float xTextOffset;
	private float yTextOffset;
	private Paint mTextPaint;
	private Paint mTextPaintOutline;
	private String text;

	public OTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initTextViewOutline();
	}

	public OTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initTextViewOutline();
	}

	public OTextView(Context context) {
		super(context);
		initTextViewOutline();
	}

	private void initTextViewOutline() {
		mTextPaint = new Paint();
		mTextPaint.setAntiAlias(true);
		mTextPaint.setTextSize(super.getTextSize());
		mTextPaint.setColor(getContext().getResources().getColor(
				R.color.light_blue));
		mTextPaint.setStyle(Paint.Style.FILL);

		mTextPaintOutline = new Paint();
		mTextPaintOutline.setAntiAlias(true);
		mTextPaintOutline.setTextSize(super.getTextSize());
		mTextPaintOutline.setColor(getContext().getResources().getColor(
				R.color.white));
		mTextPaintOutline.setStyle(Paint.Style.STROKE);
		mTextPaintOutline.setStrokeWidth(4);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		text = super.getText().toString();
		xTextOffset = (getWidth() / 2) - (getPaint().measureText(text) / 2);
		yTextOffset = (getHeight() / 2) - (getPaint().ascent() / 2);
		canvas.drawText(text, xTextOffset, yTextOffset, mTextPaintOutline);
		canvas.drawText(text, xTextOffset, yTextOffset, mTextPaint);
	}
}
