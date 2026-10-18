package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class DetailsTitleCreatorBlock extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public FifeImageView f2969a;

    /* renamed from: b, reason: collision with root package name */
    public DecoratedTextView f2970b;
    public TextView c;
    public TextView d;

    public DetailsTitleCreatorBlock(Context context) {
        this(context, null);
    }

    public DetailsTitleCreatorBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        au auVar;
        super.onFinishInflate();
        this.f2969a = (FifeImageView) findViewById(R.id.creator_image);
        FifeImageView fifeImageView = this.f2969a;
        auVar = au.f3142a;
        fifeImageView.setBitmapTransformation(auVar);
        this.f2970b = (DecoratedTextView) findViewById(R.id.creator_title);
        this.c = (TextView) findViewById(R.id.creator_publisher);
        this.d = (TextView) findViewById(R.id.creator_date);
    }
}
