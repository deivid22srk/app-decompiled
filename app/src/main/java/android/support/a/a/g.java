package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
/* loaded from: classes.dex */
public final class g extends f {

    /* renamed from: b, reason: collision with root package name */
    static final PorterDuff.Mode f45b = PorterDuff.Mode.SRC_IN;
    private m c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Rect getDirtyBounds() {
        return super.getDirtyBounds();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    @TargetApi(23)
    public final /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    @TargetApi(23)
    public final /* bridge */ /* synthetic */ int getLayoutDirection() {
        return super.getLayoutDirection();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    @TargetApi(23)
    public final /* bridge */ /* synthetic */ boolean isFilterBitmap() {
        return super.isFilterBitmap();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    @TargetApi(23)
    public final /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.a.a.f, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    /* synthetic */ g(byte b2) {
        this();
    }

    /* synthetic */ g(m mVar, byte b2) {
        this(mVar);
    }

    private g() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new m();
    }

    private g(m mVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = mVar;
        this.d = a(mVar.c, mVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.f44a != null) {
            this.f44a.mutate();
        } else if (!this.f && super.mutate() == this) {
            this.c = new m(this.c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f44a != null) {
            return new n(this.f44a.getConstantState());
        }
        this.c.f52a = getChangingConfigurations();
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        if ((r2 == r7.f.getWidth() && r3 == r7.f.getHeight()) == false) goto L29;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.a.a.g.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        if (this.f44a != null) {
            return this.f44a.getAlpha();
        }
        return this.c.f53b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f44a != null) {
            this.f44a.setAlpha(i);
        } else {
            if (this.c.f53b.e == i) {
                return;
            }
            this.c.f53b.e = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f44a != null) {
            this.f44a.setColorFilter(colorFilter);
        } else {
            this.e = colorFilter;
            invalidateSelf();
        }
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (this.f44a != null) {
            this.f44a.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f44a != null) {
            this.f44a.setTintList(colorStateList);
            return;
        }
        m mVar = this.c;
        if (mVar.c != colorStateList) {
            mVar.c = colorStateList;
            this.d = a(colorStateList, mVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f44a != null) {
            this.f44a.setTintMode(mode);
            return;
        }
        m mVar = this.c;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.d = a(mVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.f44a != null) {
            return this.f44a.isStateful();
        }
        return super.isStateful() || !(this.c == null || this.c.c == null || !this.c.c.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        if (this.f44a != null) {
            return this.f44a.setState(iArr);
        }
        m mVar = this.c;
        if (mVar.c != null && mVar.d != null) {
            this.d = a(mVar.c, mVar.d);
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f44a != null) {
            return this.f44a.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f44a != null ? this.f44a.getIntrinsicWidth() : (int) this.c.f53b.f50a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f44a != null ? this.f44a.getIntrinsicHeight() : (int) this.c.f53b.f51b;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        if (this.f44a != null) {
            return this.f44a.canApplyTheme();
        }
        return false;
    }

    public static g a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f44a != null) {
            this.f44a.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f44a != null) {
            this.f44a.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.c;
        mVar.f53b = new l();
        TypedArray a2 = a(resources, theme, attributeSet, a.f38a);
        m mVar2 = this.c;
        l lVar = mVar2.f53b;
        int a3 = e.a(a2, xmlPullParser, "tintMode", 6);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        switch (a3) {
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 9:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 14:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 15:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 16:
                mode = PorterDuff.Mode.ADD;
                break;
        }
        mVar2.d = mode;
        ColorStateList colorStateList = a2.getColorStateList(1);
        if (colorStateList != null) {
            mVar2.c = colorStateList;
        }
        boolean z = mVar2.e;
        if (e.a(xmlPullParser, "autoMirrored")) {
            z = a2.getBoolean(5, z);
        }
        mVar2.e = z;
        lVar.c = e.a(a2, xmlPullParser, "viewportWidth", 7, lVar.c);
        lVar.d = e.a(a2, xmlPullParser, "viewportHeight", 8, lVar.d);
        if (lVar.c <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (lVar.d <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        lVar.f50a = a2.getDimension(3, lVar.f50a);
        lVar.f51b = a2.getDimension(2, lVar.f51b);
        if (lVar.f50a <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (lVar.f51b <= 0.0f) {
            throw new XmlPullParserException(a2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        lVar.e = (int) (e.a(a2, xmlPullParser, "alpha", 4, lVar.e / 255.0f) * 255.0f);
        String string = a2.getString(0);
        if (string != null) {
            lVar.f = string;
            lVar.g.put(string, lVar);
        }
        a2.recycle();
        mVar.f52a = getChangingConfigurations();
        mVar.k = true;
        b(resources, xmlPullParser, attributeSet, theme);
        this.d = a(mVar.c, mVar.d);
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        j jVar;
        boolean z;
        m mVar = this.c;
        l lVar = mVar.f53b;
        boolean z2 = true;
        Stack stack = new Stack();
        jVar = lVar.p;
        stack.push(jVar);
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                j jVar2 = (j) stack.peek();
                if ("path".equals(name)) {
                    i iVar = new i();
                    TypedArray a2 = f.a(resources, theme, attributeSet, a.c);
                    iVar.a(a2, xmlPullParser);
                    a2.recycle();
                    jVar2.f49b.add(iVar);
                    if (iVar.n != null) {
                        lVar.g.put(iVar.n, iVar);
                    }
                    z = false;
                    mVar.f52a = iVar.o | mVar.f52a;
                } else if ("clip-path".equals(name)) {
                    h hVar = new h();
                    if (e.a(xmlPullParser, "pathData")) {
                        TypedArray a3 = f.a(resources, theme, attributeSet, a.d);
                        hVar.a(a3);
                        a3.recycle();
                    }
                    jVar2.f49b.add(hVar);
                    if (hVar.n != null) {
                        lVar.g.put(hVar.n, hVar);
                    }
                    mVar.f52a |= hVar.o;
                    z = z2;
                } else {
                    if ("group".equals(name)) {
                        j jVar3 = new j();
                        TypedArray a4 = f.a(resources, theme, attributeSet, a.f39b);
                        jVar3.l = null;
                        jVar3.c = e.a(a4, xmlPullParser, "rotation", 5, jVar3.c);
                        jVar3.d = a4.getFloat(1, jVar3.d);
                        jVar3.e = a4.getFloat(2, jVar3.e);
                        jVar3.f = e.a(a4, xmlPullParser, "scaleX", 3, jVar3.f);
                        jVar3.g = e.a(a4, xmlPullParser, "scaleY", 4, jVar3.g);
                        jVar3.h = e.a(a4, xmlPullParser, "translateX", 6, jVar3.h);
                        jVar3.i = e.a(a4, xmlPullParser, "translateY", 7, jVar3.i);
                        String string = a4.getString(0);
                        if (string != null) {
                            jVar3.m = string;
                        }
                        jVar3.j.reset();
                        jVar3.j.postTranslate(-jVar3.d, -jVar3.e);
                        jVar3.j.postScale(jVar3.f, jVar3.g);
                        jVar3.j.postRotate(jVar3.c, 0.0f, 0.0f);
                        jVar3.j.postTranslate(jVar3.h + jVar3.d, jVar3.i + jVar3.e);
                        a4.recycle();
                        jVar2.f49b.add(jVar3);
                        stack.push(jVar3);
                        if (jVar3.m != null) {
                            lVar.g.put(jVar3.m, jVar3);
                        }
                        mVar.f52a |= jVar3.k;
                    }
                    z = z2;
                }
            } else {
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    stack.pop();
                }
                z = z2;
            }
            z2 = z;
            eventType = xmlPullParser.next();
        }
        if (z2) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + ((Object) stringBuffer) + " defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        if (this.f44a != null) {
            this.f44a.setBounds(i, i2, i3, i4);
        } else {
            super.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        if (this.f44a != null) {
            this.f44a.setBounds(rect);
        } else {
            super.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f44a != null ? this.f44a.getChangingConfigurations() : super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f44a != null) {
            this.f44a.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.f44a != null) {
            this.f44a.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return this.f44a != null ? this.f44a.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        if (this.f44a != null) {
            this.f44a.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    static /* synthetic */ int a(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }
}
