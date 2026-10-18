package com.google.android.libraries.bind.card;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.bind.data.i;
import com.google.android.libraries.bind.data.k;
import com.google.android.libraries.bind.data.o;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CardListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.android.libraries.bind.cpkg.b f6666a = com.google.android.libraries.bind.cpkg.b.a(CardListView.class);

    /* renamed from: b, reason: collision with root package name */
    protected static final boolean f6667b;
    private static final Interpolator d;
    private static final Interpolator e;
    private static Bitmap f;
    private static final int[] p;
    SavedState c;
    private final DataSetObserver g;
    private final DataSetObserver h;
    private final com.google.android.libraries.bind.widget.c i;
    private boolean j;
    private final Map<Object, e> k;
    private final RectF l;
    private boolean m;
    private int n;
    private AbsListView.OnScrollListener o;

    static {
        f6667b = Build.VERSION.SDK_INT >= 14;
        d = new AccelerateDecelerateInterpolator();
        e = new LinearInterpolator();
        p = new int[3];
    }

    public CardListView(Context context) {
        this(context, null, 0);
    }

    public CardListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new com.google.android.libraries.bind.widget.c();
        this.j = true;
        this.k = new HashMap();
        this.l = new RectF();
        this.n = 0;
        setSelector(android.R.color.transparent);
        super.setOnScrollListener(this.i);
        this.h = new c(this);
        this.g = new d(this);
    }

    public void setInvisibleHeight(int i) {
        this.n = i;
    }

    public int getInvisibleHeight() {
        return this.n;
    }

    public int getVisibleHeight() {
        return getHeight() - this.n;
    }

    public void setAnimateChanges(boolean z) {
        if (this.j != z) {
            this.j = z;
            i iVar = (i) getAdapter();
            if (iVar != null) {
                if (z) {
                    iVar.a(this.g, -1);
                } else {
                    iVar.unregisterDataSetObserver(this.g);
                }
            }
        }
    }

    protected boolean getAnimateChanges() {
        return this.j;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = getAdapter();
        if (adapter != null) {
            adapter.unregisterDataSetObserver(this.h);
            if (this.j) {
                adapter.unregisterDataSetObserver(this.g);
            }
        }
        super.setAdapter(listAdapter);
        if (listAdapter != null) {
            i iVar = (i) listAdapter;
            iVar.a(this.h, 1);
            if (this.j) {
                iVar.a(this.g, -1);
            }
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        if (onScrollListener == null) {
            if (this.o == null) {
                return;
            }
            this.i.f6722a.remove(this.o);
            this.o = null;
            return;
        }
        com.google.android.libraries.bind.dpkg.a.a(this.o == null);
        this.o = onScrollListener;
        this.i.f6722a.add(this.o);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAdapter((ListAdapter) null);
        this.i.f6722a.clear();
    }

    private static RectF a(View view, View view2, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        while (view != view2) {
            rectF.offset(view.getLeft(), view.getTop());
            view = (View) view.getParent();
        }
        return rectF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(16)
    private void a(View view, boolean z) {
        if (view instanceof o) {
            k dataRow = ((o) view).getDataRow();
            if (dataRow != null && dataRow.b() > 0) {
                Object b2 = dataRow.b(0);
                if (z) {
                    com.google.android.libraries.bind.data.e eVar = this.m ? com.google.android.libraries.bind.data.e.FADE_SOURCE_ONLY : null;
                    e eVar2 = new e((byte) 0);
                    RectF a2 = a(view, this, new RectF());
                    Rect rect = new Rect();
                    rect.left = Math.round(a2.left);
                    rect.top = Math.round(a2.top);
                    rect.right = Math.round(a2.right);
                    rect.bottom = Math.round(a2.bottom);
                    eVar2.f6674a = rect;
                    eVar2.c = 250L;
                    if ((view instanceof com.google.android.libraries.bind.data.d) && eVar != null && getScrapBitmap() != null) {
                        if (!((com.google.android.libraries.bind.data.d) view).a(f, eVar2.f6674a.left, eVar2.f6674a.top)) {
                            eVar = null;
                        }
                        eVar2.f6675b = eVar;
                    }
                    this.k.put(b2, eVar2);
                    view.animate().cancel();
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    view.setRotation(0.0f);
                    return;
                }
                e remove = this.k.remove(b2);
                if (remove != null) {
                    Rect rect2 = remove.f6674a;
                    a(view, this, this.l);
                    float centerX = rect2.centerX() - this.l.centerX();
                    float centerY = rect2.centerY() - this.l.centerY();
                    boolean z2 = remove.f6675b != null && (view instanceof com.google.android.libraries.bind.data.d);
                    if (Math.abs(centerX) > 5.0f || Math.abs(centerY) > 5.0f || z2) {
                        if (z2) {
                            ((com.google.android.libraries.bind.data.d) view).a(f, remove.f6674a, remove.c, remove.f6675b);
                            view.setScaleX(rect2.width() / view.getWidth());
                            view.setScaleY(rect2.height() / view.getHeight());
                        }
                        view.setTranslationX(centerX);
                        view.setTranslationY(centerY);
                        view.setRotation(0.0f);
                        view.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(remove.c).setInterpolator(d).setStartDelay(0L);
                        a(view.getParent());
                        return;
                    }
                    return;
                }
                view.setAlpha(0.0f);
                view.animate().alpha(1.0f).rotation(0.0f).setStartDelay(250L).setInterpolator(e).setDuration(250L);
                if (Build.VERSION.SDK_INT >= 16) {
                    view.animate().withLayer();
                    return;
                }
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), z);
            }
        }
    }

    private void a(ViewParent viewParent) {
        ViewParent viewParent2;
        do {
            viewParent2 = viewParent;
            if (viewParent2 instanceof ViewGroup) {
                ((ViewGroup) viewParent2).setClipChildren(false);
                viewParent = viewParent2.getParent();
                if (!(viewParent instanceof ViewGroup)) {
                    return;
                }
            } else {
                return;
            }
        } while (viewParent2 != this);
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ListAdapter adapter = getAdapter();
        if (adapter instanceof com.google.android.libraries.bind.data.c) {
            com.google.android.libraries.bind.data.c cVar = (com.google.android.libraries.bind.data.c) adapter;
            int i = 0;
            for (int i2 = 0; i2 < getFirstVisiblePosition(); i2++) {
                int b2 = cVar.b(i2);
                f6666a.d("position %d, count: %d", Integer.valueOf(i2), Integer.valueOf(b2));
                i += b2;
            }
            p[0] = i;
            for (int firstVisiblePosition = getFirstVisiblePosition(); firstVisiblePosition < getLastVisiblePosition(); firstVisiblePosition++) {
                int b3 = cVar.b(firstVisiblePosition);
                f6666a.d("position %d, count: %d", Integer.valueOf(firstVisiblePosition), Integer.valueOf(b3));
                i += b3;
            }
            p[1] = i;
            for (int lastVisiblePosition = getLastVisiblePosition(); lastVisiblePosition < cVar.getCount(); lastVisiblePosition++) {
                int b4 = cVar.b(lastVisiblePosition);
                f6666a.d("position %d, count: %d", Integer.valueOf(lastVisiblePosition), Integer.valueOf(b4));
                i += b4;
            }
            p[2] = i;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            accessibilityEvent.setFromIndex(p[0]);
            if (Build.VERSION.SDK_INT >= 14) {
                accessibilityEvent.setToIndex(p[1] - 1);
            }
            accessibilityEvent.setItemCount(p[2]);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState b2 = b();
        return b2 == null ? super.onSaveInstanceState() : b2;
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        f6666a.d("onRestoreInstanceState", new Object[0]);
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            a(savedState);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    final SavedState b() {
        if (getChildCount() > 0) {
            if (getFirstVisiblePosition() == 0 && getChildAt(0).getTop() == 0) {
                return a(0);
            }
            if (getFirstVisiblePosition() + getChildCount() == getAdapter().getCount() && getChildAt(getChildCount() - 1).getBottom() <= getHeight()) {
                return a(getChildAt(getChildCount() - 1).getBottom() - 1);
            }
        }
        return a(getHeight() / 2);
    }

    private SavedState a(int i) {
        Object a2;
        ListAdapter adapter = getAdapter();
        if (adapter instanceof com.google.android.libraries.bind.data.c) {
            com.google.android.libraries.bind.data.c cVar = (com.google.android.libraries.bind.data.c) adapter;
            int pointToPosition = pointToPosition(getWidth() / 2, i);
            if (pointToPosition != -1 && (a2 = cVar.a(pointToPosition)) != null) {
                f6666a.d("Saving state - cardId: %s", a2);
                return new SavedState(super.onSaveInstanceState(), a2, getChildAt(pointToPosition - getFirstVisiblePosition()).getTop());
            }
        }
        return null;
    }

    final void a(SavedState savedState) {
        Object obj = savedState.f6668a;
        ListAdapter adapter = getAdapter();
        if (adapter instanceof com.google.android.libraries.bind.data.c) {
            com.google.android.libraries.bind.data.c cVar = (com.google.android.libraries.bind.data.c) adapter;
            if (cVar.a()) {
                int a2 = cVar.a(obj);
                if (a2 != -1) {
                    setSelectionFromTop(a2, savedState.f6669b);
                    f6666a.d("Restoring for cardId %s to position %d", obj, Integer.valueOf(a2));
                    return;
                }
                return;
            }
            this.c = savedState;
            f6666a.d("Stashing restore state", new Object[0]);
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();

        /* renamed from: a, reason: collision with root package name */
        public final Object f6668a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6669b;

        /* synthetic */ SavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        SavedState(Parcelable parcelable, Object obj, int i) {
            super(parcelable);
            this.f6668a = obj;
            this.f6669b = i;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            Object obj = this.f6668a;
            boolean z = obj instanceof Parcelable;
            parcel.writeByte((byte) (z ? 1 : 0));
            if (z) {
                parcel.writeParcelable((Parcelable) obj, i);
            } else {
                parcel.writeSerializable((Serializable) obj);
            }
            parcel.writeInt(this.f6669b);
        }

        public String toString() {
            return this.f6668a.toString();
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            Object readSerializable;
            ClassLoader classLoader = SavedState.class.getClassLoader();
            if (parcel.readByte() == 1) {
                readSerializable = parcel.readParcelable(classLoader);
            } else {
                readSerializable = parcel.readSerializable();
            }
            this.f6668a = readSerializable;
            this.f6669b = parcel.readInt();
        }
    }

    protected final void a() {
        f6666a.d("captureCardPositions", new Object[0]);
        if (f6667b && this.k.isEmpty()) {
            if (!com.google.android.libraries.bind.widget.d.a(this)) {
                f6666a.d("Skipping capture since we're offscreen", new Object[0]);
                return;
            }
            if (getChildCount() == 0) {
                f6666a.d("Skipping capture since we're offscreen", new Object[0]);
                return;
            }
            f6666a.d("capturing", new Object[0]);
            if (this.m) {
                getScrapBitmap();
            }
            a(this, true);
            this.m = false;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.j && !this.k.isEmpty()) {
            f6666a.d("animateTransition", new Object[0]);
            if (f6667b) {
                a(this, false);
                this.k.clear();
                com.google.android.libraries.bind.apkg.f fVar = com.google.android.libraries.bind.apkg.f.f6644b;
                if (!com.google.android.libraries.bind.apkg.f.f6643a) {
                    if (!com.google.android.libraries.bind.apkg.f.f6643a) {
                        com.google.android.libraries.bind.apkg.a.a();
                        fVar.c.lock();
                        try {
                            fVar.e = true;
                        } finally {
                            fVar.c.unlock();
                        }
                    }
                    fVar.f.a();
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    protected Bitmap getScrapBitmap() {
        if (!com.google.android.libraries.bind.dpkg.a.a()) {
            if (f != null && ((f.getWidth() != getWidth() || f.getHeight() != getHeight()) && f != null)) {
                f.recycle();
                f = null;
            }
            if (f == null) {
                f = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            }
        }
        return f;
    }
}
