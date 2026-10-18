package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.et;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.jm;
import com.google.android.play.image.FifeImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PlayCardClusterViewContent extends ViewGroup implements com.google.android.finsky.adapters.ap {

    /* renamed from: a, reason: collision with root package name */
    private LayoutInflater f3310a;

    /* renamed from: b, reason: collision with root package name */
    private Document f3311b;
    private Document c;
    private List<Document> d;
    private String e;
    private final int f;
    protected as g;
    protected int h;
    protected int i;
    protected int j;
    protected com.google.android.finsky.utils.ac k;
    private final int l;
    private com.google.android.finsky.navigationmanager.b m;
    private com.google.android.play.image.e n;
    private cy o;

    public PlayCardClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3310a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.PlayCardClusterViewContent);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(R.dimen.play_small_card_content_min_height);
        this.l = resources.getDimensionPixelSize(R.dimen.play_card_default_inset);
    }

    public void setClusterDocumentData(Document document) {
        if (this.d != null) {
            throw new IllegalStateException("Already initialized with loose documents");
        }
        this.f3311b = document;
        this.e = this.f3311b.f1963a.f3890a;
    }

    public final void a(List<Document> list, String str) {
        if (this.f3311b != null) {
            throw new IllegalStateException("Already initialized with cluster document");
        }
        this.d = list;
        this.e = str;
    }

    public void ab_() {
        this.f3311b = null;
        this.d = null;
    }

    public Document getClusterLoggingDocument() {
        return this.c == null ? this.f3311b : this.c;
    }

    public void setClusterLoggingDocument(Document document) {
        this.c = document;
    }

    public void setCardContentVerticalPadding(int i) {
        this.i = i;
        this.j = i;
        requestLayout();
    }

    public void setCardContentHorizontalPadding(int i) {
        if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }

    public int getCardContentHorizontalPadding() {
        return this.h;
    }

    public void a(as asVar, com.google.android.finsky.utils.ac acVar) {
        this.g = asVar;
        this.k = acVar;
    }

    protected final int getDocCount() {
        return this.f3311b != null ? this.f3311b.a() : this.d.size();
    }

    protected final Document a(int i) {
        if (i < 0 || i >= getDocCount()) {
            return null;
        }
        return this.f3311b != null ? this.f3311b.a(i) : this.d.get(i);
    }

    public as getMetadata() {
        return this.g;
    }

    protected int getIndexOfFirstCard() {
        return 0;
    }

    public final void b() {
        int indexOfFirstCard = getIndexOfFirstCard();
        if (indexOfFirstCard == 0) {
            removeAllViews();
        } else {
            while (getChildCount() > indexOfFirstCard) {
                removeViewAt(indexOfFirstCard);
            }
        }
    }

    public final int a(View view) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) == view) {
                return i - getIndexOfFirstCard();
            }
        }
        return -1;
    }

    public final com.google.android.play.layout.a b(int i) {
        return (com.google.android.play.layout.a) getChildAt(getIndexOfFirstCard() + i);
    }

    public int getCardChildCount() {
        return getChildCount() - getIndexOfFirstCard();
    }

    public void a(com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, az azVar, bc bcVar, cy cyVar) {
        com.google.android.play.layout.a remove;
        this.m = bVar2;
        this.n = eVar;
        this.o = cyVar;
        int numberOfTilesToBind = getNumberOfTilesToBind();
        int i = 0;
        while (i < this.g.a()) {
            at atVar = this.g.a(i).f3415a;
            LayoutInflater layoutInflater = this.f3310a;
            jm.a();
            int i2 = atVar.f3413a;
            List<com.google.android.play.layout.a> list = bcVar.f3427a.get(i2);
            if (list == null) {
                list = new ArrayList<>();
                bcVar.f3427a.put(i2, list);
            }
            if (list.isEmpty()) {
                remove = (com.google.android.play.layout.a) layoutInflater.inflate(i2, (ViewGroup) null, false);
            } else {
                remove = list.remove(0);
            }
            remove.setThumbnailAspectRatio(atVar.d);
            a(remove, i, i < numberOfTilesToBind ? c(i) : -1, azVar);
            addView(remove);
            i++;
        }
    }

    protected int getNumberOfTilesToBind() {
        return this.g.a();
    }

    protected int c(int i) {
        return i;
    }

    public final void d(int i) {
        com.google.android.play.layout.a b2 = b(i);
        b2.startAnimation(et.b(getContext(), 250L, new aw(this, b2)));
    }

    public final void a(int i, int i2, az azVar) {
        a(b(i), i, i2, azVar);
    }

    private void a(com.google.android.play.layout.a aVar, int i, int i2, az azVar) {
        float f;
        Document a2 = a(i2);
        if (a2 == null) {
            aVar.d();
            return;
        }
        boolean aQ = a2.aQ();
        at atVar = this.g.a(i).f3415a;
        as asVar = this.g;
        if (asVar.f || asVar.d.get(i).d) {
            f = as.b(a2.f1963a.e);
        } else {
            f = atVar.d;
        }
        aVar.setThumbnailAspectRatio(f);
        ((FifeImageView) aVar.getThumbnail().getImageView()).d = true;
        fe.a(aVar, a2, this.e, this.n, this.m, aQ && azVar != null && this.k.c(a2.f1963a.f3890a), aQ ? azVar : null, this.o, false, -1, false);
    }

    public final int e(int i) {
        return ((int) (g(i) * this.g.h)) + getPaddingLeft();
    }

    public final int f(int i) {
        return ((int) (g(i) * this.g.b())) + getPaddingRight();
    }

    protected final float g(int i) {
        return (i - (this.h * 2)) / this.g.f3411a;
    }

    private float a(float f) {
        at atVar = this.g.g;
        if (atVar == null) {
            return f;
        }
        return (((atVar.d * ((atVar.f3414b * f) - (this.l * 2))) + this.f) + (this.l * 2)) / atVar.c;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.g.f3412b;
        float g = g(size);
        float a2 = a(g);
        boolean z = this.g.e;
        int a3 = this.g.a();
        int indexOfFirstCard = getIndexOfFirstCard();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < a3; i7++) {
            au a4 = this.g.a(i7);
            int i8 = a4.f3415a.f3414b;
            int i9 = a4.f3415a.c;
            View childAt = getChildAt(indexOfFirstCard + i7);
            int i10 = (int) (i9 * a2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (i8 * g), 1073741824);
            if (z) {
                childAt.measure(makeMeasureSpec, 0);
                i6 = Math.max(i6, childAt.getMeasuredHeight());
            } else {
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            }
            if (childAt.getVisibility() == 0) {
                i5++;
            }
        }
        if (i5 == 0) {
            setMeasuredDimension(size, 0);
            return;
        }
        int i11 = this.i + this.j;
        if (z) {
            i3 = i6 + i11;
        } else {
            i3 = ((int) (i4 * a2)) + i11;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a(android.support.v4.view.by.h(this) == 0);
    }

    protected final void a(boolean z) {
        int height = getHeight();
        int width = getWidth();
        float g = g(width);
        float a2 = a(g);
        int i = this.h;
        int a3 = this.g.a();
        int i2 = this.g.f3412b;
        int indexOfFirstCard = getIndexOfFirstCard();
        int extraColumnOffset = getExtraColumnOffset();
        for (int i3 = 0; i3 < a3; i3++) {
            au a4 = this.g.a(i3);
            int i4 = a4.f3416b + extraColumnOffset;
            int i5 = a4.c;
            int i6 = i + ((int) (i4 * g));
            com.google.android.play.layout.a aVar = (com.google.android.play.layout.a) getChildAt(indexOfFirstCard + i3);
            int i7 = height - this.j;
            if (!this.g.e) {
                i7 -= (int) ((i2 - (a4.f3415a.c + i5)) * a2);
            }
            int measuredWidth = aVar.getMeasuredWidth();
            int a5 = com.google.android.play.utils.j.a(width, measuredWidth, z, i6);
            aVar.layout(a5, i7 - aVar.getMeasuredHeight(), measuredWidth + a5, i7);
            ((FifeImageView) aVar.getThumbnail().getImageView()).a(true);
        }
    }

    protected int getExtraColumnOffset() {
        int i = 0;
        int a2 = this.g.a();
        int indexOfFirstCard = getIndexOfFirstCard();
        if (!this.g.i) {
            return 0;
        }
        int i2 = this.g.f3411a;
        for (int i3 = 0; i3 < a2; i3++) {
            if (getChildAt(indexOfFirstCard + i3).getVisibility() != 4) {
                au a3 = this.g.a(i3);
                i = Math.max(i, a3.f3415a.f3414b + a3.f3416b);
            }
        }
        if (i == 0) {
            return i2 - this.g.h;
        }
        return i2 - i;
    }
}
