package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gx;

/* loaded from: classes.dex */
public class PlayAvatarPack extends ViewGroup implements com.google.android.finsky.adapters.ap {

    /* renamed from: a, reason: collision with root package name */
    private PersonAvatarView f3297a;

    /* renamed from: b, reason: collision with root package name */
    private PersonAvatarView[] f3298b;
    private final int c;

    public PlayAvatarPack(Context context) {
        this(context, null);
    }

    public PlayAvatarPack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.PlayAvatarPack);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(R.dimen.play_profile_avatar_size));
        obtainStyledAttributes.recycle();
    }

    public final void a(gx gxVar, gx[] gxVarArr, com.google.android.finsky.navigationmanager.b bVar, cy cyVar) {
        if (gxVar == null) {
            setVisibility(4);
            return;
        }
        setVisibility(0);
        removeAllViews();
        com.google.android.play.image.e eVar = FinskyApp.a().d;
        getResources();
        int min = gxVarArr == null ? 0 : Math.min(4, (gxVarArr.length / 2) * 2);
        this.f3298b = new PersonAvatarView[min];
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                gx gxVar2 = gxVarArr[i];
                this.f3298b[i] = b();
                ad adVar = new ad(279, gxVar2.R, cyVar);
                cyVar.a(adVar);
                this.f3298b[i].a(gxVar2, new ak(this, bVar, gxVar2, adVar), eVar);
            }
            for (int i2 = 0; i2 < min; i2++) {
                addView(this.f3298b[(min - i2) - 1]);
            }
        }
        this.f3297a = b();
        ad adVar2 = new ad(279, cyVar);
        cyVar.a(adVar2);
        Document document = new Document(gxVar);
        this.f3297a.a(gxVar, com.google.android.finsky.navigationmanager.b.b(document) ? bVar.a(document, adVar2) : new al(this, bVar), eVar);
        addView(this.f3297a);
    }

    private PersonAvatarView b() {
        PersonAvatarView personAvatarView = new PersonAvatarView(getContext());
        personAvatarView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        personAvatarView.setBitmapTransformation(com.google.android.play.image.a.a(getResources()));
        personAvatarView.setHasFixedBounds(true);
        personAvatarView.setFocusable(true);
        return personAvatarView;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f3297a != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
            this.f3297a.measure(makeMeasureSpec, makeMeasureSpec);
        }
        int length = this.f3298b == null ? 0 : this.f3298b.length;
        if (length > 0) {
            int i3 = (int) (this.c * 0.7f);
            if (((int) (i3 * 0.66999996f)) * length > ((size - this.c) - getPaddingLeft()) - getPaddingRight()) {
                i3 = (int) ((r4 / length) / 0.66999996f);
            }
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            for (int i4 = 0; i4 < length; i4++) {
                this.f3298b[i4].measure(makeMeasureSpec2, makeMeasureSpec2);
            }
        }
        setMeasuredDimension(size, this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int i5 = (width / 2) - (this.c / 2);
        int i6 = i5 + this.c;
        if (this.f3297a != null) {
            this.f3297a.layout(i5, 0, i6, this.c);
        }
        int length = this.f3298b == null ? 0 : this.f3298b.length;
        if (length > 0) {
            for (int i7 = 0; i7 < length; i7 += 2) {
                PersonAvatarView personAvatarView = this.f3298b[i7];
                int measuredWidth = personAvatarView.getMeasuredWidth();
                int measuredHeight = personAvatarView.getMeasuredHeight();
                int i8 = i5 + ((int) (measuredWidth * 0.33f));
                int i9 = (height - measuredHeight) / 2;
                personAvatarView.layout(i8 - measuredWidth, i9, i8, measuredHeight + i9);
                i5 = i8 - measuredWidth;
                PersonAvatarView personAvatarView2 = this.f3298b[i7 + 1];
                int measuredWidth2 = personAvatarView2.getMeasuredWidth();
                int measuredHeight2 = personAvatarView2.getMeasuredHeight();
                int i10 = i6 - ((int) (measuredWidth2 * 0.33f));
                int i11 = (height - measuredHeight2) / 2;
                personAvatarView2.layout(i10, i11, i10 + measuredWidth2, measuredHeight2 + i11);
                i6 = i10 + measuredWidth2;
            }
        }
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        if (this.f3297a != null) {
            this.f3297a.a();
        }
        if (this.f3298b != null) {
            for (int i = 0; i < this.f3298b.length; i++) {
                if (this.f3298b[i] != null) {
                    this.f3298b[i].a();
                }
            }
        }
    }
}
