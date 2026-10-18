package com.google.android.wallet.nfc;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.wallet.nfc.exceptions.TagReadException;
import com.google.android.wallet.nfc.exceptions.TagReadTimeoutException;
import com.google.android.wallet.nfc.exceptions.UnsupportedTagException;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d extends AsyncTask<Intent, Void, a> {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<c> f7370a;

    /* renamed from: b, reason: collision with root package name */
    private int f7371b = 2;
    private long c;

    @Override // android.os.AsyncTask
    @TargetApi(11)
    protected final /* synthetic */ void onCancelled(a aVar) {
        a aVar2 = aVar;
        super.onCancelled(aVar2);
        a(aVar2);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(a aVar) {
        a aVar2 = aVar;
        super.onPostExecute(aVar2);
        a(aVar2);
    }

    public d(c cVar) {
        this.f7370a = new WeakReference<>(cVar);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        this.c = SystemClock.elapsedRealtime();
        super.onPreExecute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    @TargetApi(10)
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Intent... intentArr) {
        if (intentArr == null || intentArr.length == 0 || !"android.nfc.action.TAG_DISCOVERED".equals(intentArr[0].getAction())) {
            this.f7371b = 3;
            return null;
        }
        this.f7371b = 2;
        try {
            a a2 = com.google.android.wallet.nfc.apkg.e.a(intentArr[0]);
            if (!(!TextUtils.isEmpty(a2.f7352a))) {
                if (!((a2.f7353b == 0 || a2.c == 0) ? false : true)) {
                    if (!(TextUtils.isEmpty(a2.d) ? false : true)) {
                        this.f7371b = 3;
                        return null;
                    }
                }
            }
            this.f7371b = 1;
            return new a(a2.f7352a, a2.f7353b, a2.c, "");
        } catch (TagReadException e) {
            this.f7371b = 3;
            return null;
        } catch (TagReadTimeoutException e2) {
            this.f7371b = 6;
            return null;
        } catch (UnsupportedTagException e3) {
            this.f7371b = 4;
            return null;
        } catch (IOException e4) {
            this.f7371b = 5;
            return null;
        }
    }

    private void a(a aVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        c cVar = this.f7370a.get();
        if (cVar != null) {
            cVar.a(this.f7371b, aVar, elapsedRealtime);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        super.onCancelled();
        a((a) null);
    }
}
