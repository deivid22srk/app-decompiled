package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* loaded from: classes.dex */
final class ft implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5987a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f5988b;
    final /* synthetic */ fs c;

    ft(fs fsVar, String str, String str2) {
        this.c = fsVar;
        this.f5987a = str;
        this.f5988b = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.c.f5986b.getSystemService("download");
        try {
            String str = this.f5987a;
            String str2 = this.f5988b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.d.e().a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException e) {
            this.c.a("Could not store picture.");
        }
    }
}
