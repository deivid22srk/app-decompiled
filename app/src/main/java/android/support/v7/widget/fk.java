package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class fk {

    /* renamed from: a, reason: collision with root package name */
    Method f821a;

    /* renamed from: b, reason: collision with root package name */
    Method f822b;
    Method c;
    private Method d;

    fk() {
        try {
            this.f821a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f821a.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.f822b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f822b.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            this.d = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.d.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
        try {
            this.c = InputMethodManager.class.getMethod("showSoftInputUnchecked", Integer.TYPE, ResultReceiver.class);
            this.c.setAccessible(true);
        } catch (NoSuchMethodException e4) {
        }
    }

    final void a(AutoCompleteTextView autoCompleteTextView) {
        if (this.d != null) {
            try {
                this.d.invoke(autoCompleteTextView, true);
            } catch (Exception e) {
            }
        }
    }
}
