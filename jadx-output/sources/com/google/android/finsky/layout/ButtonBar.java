package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class ButtonBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2932a;

    /* renamed from: b, reason: collision with root package name */
    private Button f2933b;
    private Button c;
    private r d;
    private Paint e;

    static {
        f2932a = Build.VERSION.SDK_INT >= 11 && Build.VERSION.SDK_INT < 21;
    }

    public ButtonBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (f2932a) {
            this.e = new Paint();
            this.e.setColor(context.getResources().getColor(R.color.play_multi_primary));
            this.e.setStrokeWidth(1.0f);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2933b = (Button) findViewById(R.id.positive_button);
        this.c = (Button) findViewById(R.id.negative_button);
        this.f2933b.setText(this.f2933b.getText().toString().toUpperCase());
        this.c.setText(this.c.getText().toString().toUpperCase());
    }

    public void setPositiveButtonTitle(int i) {
        setPositiveButtonTitle(getResources().getString(i));
    }

    public void setPositiveButtonTitle(String str) {
        this.f2933b.setText(str.toUpperCase());
    }

    public void setNegativeButtonTitle(int i) {
        setNegativeButtonTitle(getResources().getString(i));
    }

    public void setNegativeButtonTitle(String str) {
        this.c.setText(str.toUpperCase());
    }

    public void setPositiveButtonTextColor(int i) {
        this.f2933b.setTextColor(i);
    }

    public void setNegativeButtonTextColor(int i) {
        this.c.setTextColor(i);
    }

    public void setPositiveButtonEnabled(boolean z) {
        this.f2933b.setEnabled(z);
    }

    public void setNegativeButtonEnabled(boolean z) {
        this.c.setEnabled(z);
    }

    public void setPositiveButtonVisible(boolean z) {
        this.f2933b.setVisibility(z ? 0 : 8);
    }

    public void setNegativeButtonVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setClickListener(r rVar) {
        this.d = rVar;
        this.f2933b.setOnClickListener(this);
        this.c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.d != null) {
            if (view == this.f2933b) {
                this.d.z_();
            } else if (view == this.c) {
                this.d.b();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, this.e);
        }
    }
}
