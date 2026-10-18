package com.caverock.androidsvg;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public abstract class ac extends bi implements ae {
    public Matrix e;

    protected ac() {
    }

    @Override // com.caverock.androidsvg.ae
    public final void a(Matrix matrix) {
        this.e = matrix;
    }
}
