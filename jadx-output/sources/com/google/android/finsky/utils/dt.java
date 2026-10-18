package com.google.android.finsky.utils;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.receivers.NotificationReceiver;
import com.google.android.vending.verifier.PackageVerificationService;
import com.google.android.vending.verifier.PackageWarningDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dt implements dw {

    /* renamed from: b, reason: collision with root package name */
    private static final int f4832b = "unknown package".hashCode();
    private static final boolean c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4833a;
    private ds d;

    static {
        c = Build.VERSION.SDK_INT >= 11;
    }

    public dt(Context context) {
        this.f4833a = context;
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(ds dsVar) {
        this.d = dsVar;
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2) {
        a(str2, this.f4833a.getString(R.string.internal_space_bar, str), this.f4833a.getString(R.string.internal_space_title, str), this.f4833a.getString(R.string.internal_space_message, str), true);
    }

    @Override // com.google.android.finsky.utils.dw
    public final void b(String str, String str2) {
        a(str2, this.f4833a.getString(R.string.external_space_bar, str), this.f4833a.getString(R.string.external_space_title, str), this.f4833a.getString(R.string.external_space_message, str), false);
    }

    private void a(String str, String str2, String str3, String str4, boolean z) {
        if (this.d != null && !this.d.a(str)) {
            if (FinskyApp.a().e().a(12603367L)) {
                this.d.a(str, str3, str4, 3);
                return;
            } else {
                this.d.a(str, new com.google.android.finsky.activities.ci().c(str3).b(str4).d(R.string.view_storage_button_text).e(R.string.cancel).a(null, z ? 47 : 48, null).a(324, null, 2904, 2903, null));
                return;
            }
        }
        b(str, str2, str3, str4, -1, "err");
    }

    @Override // com.google.android.finsky.utils.dw
    public final void c(String str, String str2) {
        b(str2, this.f4833a.getString(R.string.asset_removed_bar, str), this.f4833a.getString(R.string.asset_removed_title, str), this.f4833a.getString(R.string.asset_removed_message, str), "status");
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str) {
        String string = this.f4833a.getString(R.string.malicious_asset_removed_bar, str);
        this.f4833a.getString(R.string.malicious_asset_removed_title, str);
        e(string, this.f4833a.getString(R.string.malicious_asset_removed_message, str));
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2, String str3, int i) {
        Intent a2 = PackageWarningDialog.a(this.f4833a, PackageWarningDialog.k, 3, str, str2, str3, null, i);
        String string = this.f4833a.getString(R.string.verify_app_removed_notification_title);
        String string2 = this.f4833a.getString(R.string.verify_app_notification_text, str);
        a("package..removed..".concat(str2), string, string, string2, string2, R.drawable.stat_notify_shield, null, -1, a2, false, null);
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2, String str3, byte[] bArr, int i) {
        Intent a2 = PackageWarningDialog.a(this.f4833a, PackageWarningDialog.k, 2, str, str2, str3, bArr, i);
        String string = this.f4833a.getString(R.string.verify_app_remove_request_notification_title);
        String string2 = this.f4833a.getString(R.string.verify_app_notification_text, str);
        a("package..remove..request..".concat(str2), string, string, string2, string2, R.drawable.ic_warning_white_24dp, null, -1, a2, false, null, true, "status", null, null, this.f4833a.getResources().getColor(R.color.package_malware_notification_color), 2, new android.support.v4.app.bj(R.drawable.ic_delete_gray_24dp, this.f4833a.getString(R.string.uninstall), PendingIntent.getService(this.f4833a, 0, PackageVerificationService.a(this.f4833a, str2, bArr), 268435456)));
    }

    @Override // com.google.android.finsky.utils.dw
    public final void d(String str, String str2) {
        a(str2, this.f4833a.getString(R.string.external_space_missing_bar, str), this.f4833a.getString(R.string.external_space_missing_title, str), this.f4833a.getString(R.string.external_space_missing_message, str, a(901, 2)));
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2, int i, String str3, boolean z) {
        int i2;
        int i3;
        Context context = this.f4833a;
        switch (i) {
            case 927:
                i2 = R.string.error_while_downloading_timeout_error_title;
                break;
            case 944:
                i2 = R.string.error_while_downloading_outdated_response_title;
                break;
            default:
                if (!z) {
                    i2 = R.string.error_while_downloading_title;
                    break;
                } else {
                    i2 = R.string.error_while_downloading_update_title;
                    break;
                }
        }
        String string = context.getString(i2, str);
        if (str3 != null) {
            if (z) {
                i3 = R.string.error_while_downloading_update_message_server_message;
            } else {
                i3 = R.string.error_while_downloading_message_server_message;
            }
        } else {
            switch (i) {
                case 927:
                    i3 = R.string.error_while_downloading_timeout_error_message;
                    break;
                case 944:
                    i3 = R.string.error_while_downloading_outdated_response_message;
                    break;
                default:
                    if (!z) {
                        i3 = R.string.error_while_downloading_message;
                        break;
                    } else {
                        i3 = R.string.error_while_downloading_update_message;
                        break;
                    }
            }
        }
        Context context2 = this.f4833a;
        Object[] objArr = new Object[3];
        objArr[0] = str;
        Object obj = str3;
        if (str3 == null) {
            obj = Integer.valueOf(i);
        }
        objArr[1] = obj;
        objArr[2] = a(i, 1);
        a(str2, string, string, context2.getString(i3, objArr));
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2, boolean z) {
        a("package installing", String.format(this.f4833a.getString(z ? R.string.notification_updating_status : R.string.notification_installing_status), str), str, String.format(this.f4833a.getString(z ? R.string.notification_updating_message : R.string.notification_installing_message), str), null, android.R.drawable.stat_sys_download, null, 0, z ? MainActivity.b(this.f4833a) : a(this.f4833a, str2, (String) null, (String) null, com.google.android.finsky.api.s.a(str2)), false, null, "progress", null, null);
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2, String str3, boolean z) {
        Drawable applicationIcon;
        Bitmap bitmap;
        ArrayList a2;
        String string;
        b();
        if (z) {
            b(str2);
            String a3 = bg.aj.a();
            String replace = str.replace('\n', ' ');
            if (!TextUtils.isEmpty(a3)) {
                a2 = cz.a(a3.split("\n"));
                a2.remove(replace);
            } else {
                a2 = new ArrayList();
            }
            a2.add(0, replace);
            bg.aj.a((com.google.android.finsky.c.o<String>) TextUtils.join("\n", a2));
            int size = a2.size();
            String format = String.format(this.f4833a.getString(R.string.notification_update_success_status), replace);
            String quantityString = this.f4833a.getResources().getQuantityString(R.plurals.notification_update_success_message, size, Integer.valueOf(size));
            Resources resources = this.f4833a.getResources();
            switch (size) {
                case 0:
                    FinskyLog.c("App count is 0 in successful update notification", new Object[0]);
                    return;
                case 1:
                    string = (String) a2.get(0);
                    break;
                case 2:
                    string = resources.getString(R.string.multiple_items_2, a2.get(0), a2.get(1));
                    break;
                case 3:
                    string = resources.getString(R.string.multiple_items_3, a2.get(0), a2.get(1), a2.get(2));
                    break;
                case 4:
                    string = resources.getString(R.string.multiple_items_4, a2.get(0), a2.get(1), a2.get(2), a2.get(3));
                    break;
                case 5:
                    string = resources.getString(R.string.multiple_items_5, a2.get(0), a2.get(1), a2.get(2), a2.get(3), a2.get(4));
                    break;
                default:
                    string = resources.getString(R.string.notification_multiple_updates_more, a2.get(0), a2.get(1), a2.get(2), a2.get(3), Integer.valueOf(size - 4));
                    break;
            }
            if (size <= 1) {
                a(902, (Document) null);
            }
            a("successful update", format, quantityString, string, string, (!c || size <= 1) ? R.drawable.stat_notify_installed : R.drawable.stat_notify_installed_collapse, null, -1, NotificationReceiver.b(), true, NotificationReceiver.c());
            return;
        }
        String format2 = String.format(this.f4833a.getString(R.string.notification_installation_success_status), str);
        String string2 = this.f4833a.getString(R.string.notification_installation_success_message);
        if (!TextUtils.isEmpty(str3)) {
            string2 = this.f4833a.getString(R.string.notification_installation_continue_message);
        }
        a(901, (Document) null);
        Intent a4 = NotificationReceiver.a(str2, str3);
        Bitmap bitmap2 = null;
        if (c) {
            try {
                PackageManager packageManager = this.f4833a.getPackageManager();
                if (Build.VERSION.SDK_INT >= 22) {
                    applicationIcon = packageManager.getApplicationInfo(str2, 1024).loadUnbadgedIcon(packageManager);
                } else {
                    applicationIcon = packageManager.getApplicationIcon(str2);
                }
                if (applicationIcon != null) {
                    bitmap2 = a(applicationIcon, str2);
                }
                bitmap = bitmap2;
            } catch (Exception e) {
            }
            a(str2, format2, str, string2, null, R.drawable.stat_notify_installed, bitmap, 0, a4, true, null);
        }
        bitmap = null;
        a(str2, format2, str, string2, null, R.drawable.stat_notify_installed, bitmap, 0, a4, true, null);
    }

    private synchronized Bitmap a(Drawable drawable, String str) {
        Bitmap createBitmap;
        Resources resources = this.f4833a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(android.R.dimen.notification_large_icon_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(android.R.dimen.notification_large_icon_height);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= dimensionPixelSize && intrinsicHeight <= dimensionPixelSize2 && (drawable instanceof BitmapDrawable)) {
            createBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            FinskyLog.c("Resource for %s is %s of size %d*%d", str, drawable.getClass().getName(), Integer.valueOf(intrinsicWidth), Integer.valueOf(intrinsicHeight));
            float min = Math.min(1.0f, Math.min(dimensionPixelSize / intrinsicWidth, dimensionPixelSize2 / intrinsicHeight));
            int i = (int) (intrinsicWidth * min);
            int i2 = (int) (min * intrinsicHeight);
            createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
        }
        return createBitmap;
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2, int i) {
        int i2 = R.string.install_failed_already_exists;
        b();
        String string = this.f4833a.getString(R.string.install_failed_bar, str);
        String string2 = this.f4833a.getString(R.string.install_failed_title);
        String a2 = a(i, 1);
        switch (i) {
            case -109:
            case -108:
            case -107:
            case -106:
            case -105:
            case -104:
            case -103:
            case -101:
            case -100:
            case -23:
            case -22:
            case -21:
            case -16:
            case -14:
            case -12:
            case -11:
            case -9:
            case -8:
            case -7:
            case -3:
            case -2:
                i2 = R.string.install_failed_message;
                break;
            case -20:
            case -19:
                i2 = R.string.install_invalid_install_location;
                break;
            case -18:
                i2 = R.string.install_failed_container_error;
                break;
            case -17:
                i2 = R.string.install_failed_missing_feature;
                break;
            case -13:
                i2 = R.string.install_failed_conflicting_provider;
                break;
            case -10:
                i2 = R.string.install_failed_replace_couldnt_delete;
                break;
            case -5:
            case -1:
                break;
            case -4:
                i2 = R.string.install_failed_insufficient_storage;
                break;
            default:
                i2 = R.string.install_failed_message;
                break;
        }
        String string3 = this.f4833a.getString(i2, str, Integer.valueOf(i), a2);
        if (i == -18) {
            a(str2, string, string2, string3, false);
        } else {
            a(str2, string, string2, string3, i == -104 ? 1 : -1, "err");
        }
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2, String str3, String str4, String str5) {
        if (this.d == null || !this.d.a(str4, str, str3, str5)) {
            a(str4, str2, str, str3, a(this.f4833a, str4, str, str3, str5), "err");
        }
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(String str, String str2, String str3) {
        b(str2, str3, str, str3, 2, "err");
    }

    private void a(String str, String str2, String str3, String str4) {
        b(str, str2, str3, str4, "err");
    }

    private void b(String str, String str2, String str3, String str4, String str5) {
        a(str, str2, str3, str4, -1, str5);
    }

    private void a(String str, String str2, String str3, String str4, int i, String str5) {
        if (this.d == null || !this.d.a(str, str3, str4, i)) {
            Intent a2 = a(this.f4833a, str, str3, str4, com.google.android.finsky.api.s.a(str));
            a2.putExtra("error_return_code", i);
            a(str, str2, str3, str4, a2, str5);
        }
    }

    private void b(String str, String str2, String str3, String str4, int i, String str5) {
        String str6;
        String str7 = null;
        if (this.d == null || this.d.a(str)) {
            if (i == 2) {
                str6 = null;
            } else {
                str7 = str4;
                str6 = str3;
            }
            Intent a2 = a(this.f4833a, str, str6, str7, com.google.android.finsky.api.s.a(str));
            a2.putExtra("error_return_code", i);
            a(str, str2, str3, str4, a2, str5);
        }
    }

    @Override // com.google.android.finsky.utils.dw
    public final void e(String str, String str2) {
        a((String) null, str, str, str2, a(this.f4833a, (String) null, str, str2, (String) null), "status");
    }

    @SuppressLint({"NewApi"})
    private void a(String str, String str2, String str3, String str4, Intent intent, String str5) {
        String obj = Html.fromHtml(str4).toString();
        int e = e(str);
        PendingIntent activity = PendingIntent.getActivity(this.f4833a, e, intent, 1342177280);
        android.support.v4.app.bn c2 = new android.support.v4.app.bn(this.f4833a).a(android.R.drawable.stat_sys_warning).c(str2);
        c2.B.when = System.currentTimeMillis();
        c2.w = str5;
        c2.z = 0;
        c2.j = -1;
        c2.b(16);
        c2.v = true;
        android.support.v4.app.bn b2 = c2.a(str3).b(obj);
        b2.d = activity;
        hi.a(new du(this, e, b2.a(new android.support.v4.app.bm().a(str3).b(obj)).a(), str, str3, obj, intent));
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(List<Document> list, int i) {
        String string;
        Resources resources = this.f4833a.getResources();
        int size = list.size();
        if (size == 0) {
            FinskyLog.c("App count is 0 in new updates notification", new Object[0]);
            return;
        }
        String string2 = resources.getString(R.string.notification_new_updates_available_status);
        String quantityString = resources.getQuantityString(R.plurals.notification_new_updates_available_message, size, Integer.valueOf(size));
        if (size == i) {
            string = b(list);
        } else if (size < i) {
            string = resources.getString(R.string.notification_total_pending, Integer.valueOf(i));
        } else {
            FinskyLog.c("all updates count is less than new updates notification", new Object[0]);
            return;
        }
        int i2 = (!c || size <= 1) ? R.drawable.stat_notify_update : R.drawable.stat_notify_update_collapse;
        a(900, (Document) null);
        a("updates", string2, quantityString, string, string, i2, null, i, NotificationReceiver.a(), true, null, "status", NotificationReceiver.f(), resources.getQuantityString(R.plurals.notification_update_all_button_text, i));
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(List<Document> list) {
        Resources resources = this.f4833a.getResources();
        int size = list.size();
        if (size == 0) {
            FinskyLog.c("App count is 0 in new outstanding updates notification", new Object[0]);
            return;
        }
        String quantityString = resources.getQuantityString(R.plurals.notification_outstanding_updates_message, size, Integer.valueOf(size));
        String b2 = b(list);
        int i = (!c || size <= 1) ? R.drawable.stat_notify_update : R.drawable.stat_notify_update_collapse;
        a(903, (Document) null);
        a("updates", quantityString, quantityString, b2, b2, i, null, -1, NotificationReceiver.d(), true, null, "status", NotificationReceiver.f(), resources.getQuantityString(R.plurals.notification_update_all_button_text, size));
    }

    @Override // com.google.android.finsky.utils.dw
    public final void b(List<Document> list, int i) {
        String string;
        Resources resources = this.f4833a.getResources();
        int size = list.size();
        if (size == 0) {
            FinskyLog.c("App count is 0 in need approval notification", new Object[0]);
            return;
        }
        String quantityString = resources.getQuantityString(R.plurals.notification_need_approval_message, size, Integer.valueOf(size));
        if (size == i) {
            string = b(list);
        } else if (size < i) {
            string = resources.getString(R.string.notification_total_pending, Integer.valueOf(i));
        } else {
            FinskyLog.c("all updates count is less than updates requiring approval notification", new Object[0]);
            return;
        }
        int i2 = (!c || size <= 1) ? R.drawable.stat_notify_update : R.drawable.stat_notify_update_collapse;
        a(904, (Document) null);
        a("updates", quantityString, quantityString, string, string, i2, null, -1, NotificationReceiver.e(), true, null, "status", NotificationReceiver.f(), resources.getQuantityString(R.plurals.notification_update_all_button_text, i));
    }

    private String b(List<Document> list) {
        Resources resources = this.f4833a.getResources();
        int size = list.size();
        switch (size) {
            case 1:
                return resources.getString(R.string.notification_update_1, list.get(0).f1963a.i);
            case 2:
                return resources.getString(R.string.notification_update_2, list.get(0).f1963a.i, list.get(1).f1963a.i);
            case 3:
                return resources.getString(R.string.notification_update_3, list.get(0).f1963a.i, list.get(1).f1963a.i, list.get(2).f1963a.i);
            case 4:
                return resources.getString(R.string.notification_update_4, list.get(0).f1963a.i, list.get(1).f1963a.i, list.get(2).f1963a.i, list.get(3).f1963a.i);
            case 5:
                return resources.getString(R.string.notification_update_5, list.get(0).f1963a.i, list.get(1).f1963a.i, list.get(2).f1963a.i, list.get(3).f1963a.i, list.get(4).f1963a.i);
            default:
                return resources.getString(R.string.notification_update_more, list.get(0).f1963a.i, list.get(1).f1963a.i, list.get(2).f1963a.i, list.get(3).f1963a.i, Integer.valueOf(size - 4));
        }
    }

    private void a(String str, String str2, String str3, String str4, String str5, int i, Bitmap bitmap, int i2, Intent intent, boolean z, Intent intent2, String str6, Intent intent3, String str7) {
        a(str, str2, str3, str4, str5, i, bitmap, i2, intent, z, intent2, false, str6, intent3, str7, this.f4833a.getResources().getColor(R.color.play_apps_primary), -1, null);
    }

    private void a(String str, String str2, String str3, String str4, String str5, int i, Bitmap bitmap, int i2, Intent intent, boolean z, Intent intent2, boolean z2, String str6, Intent intent3, String str7, int i3, int i4, android.support.v4.app.bj bjVar) {
        PendingIntent broadcast;
        android.support.v4.app.bn b2 = new android.support.v4.app.bn(this.f4833a).c(str2).a(str3).b(str4);
        b2.w = str6;
        b2.z = 0;
        b2.v = true;
        if (!TextUtils.isEmpty(str5)) {
            b2.a(new android.support.v4.app.bm().b(str5));
        }
        b2.a(i);
        if (bitmap != null) {
            b2.g = bitmap;
        }
        if (i2 > 0) {
            b2.i = i2;
        }
        b2.y = i3;
        b2.j = i4;
        if (bjVar != null) {
            b2.u.add(bjVar);
        }
        int e = e(str);
        if (!z) {
            broadcast = PendingIntent.getActivity(this.f4833a, e, intent, 1342177280);
        } else {
            broadcast = PendingIntent.getBroadcast(this.f4833a, e, intent, 1342177280);
        }
        b2.d = broadcast;
        if (intent2 != null) {
            b2.B.deleteIntent = PendingIntent.getBroadcast(this.f4833a, e, intent2, 1342177280);
        }
        if (intent3 != null && !TextUtils.isEmpty(str7)) {
            b2.u.add(new android.support.v4.app.bj(R.drawable.stat_notify_update, str7, PendingIntent.getBroadcast(this.f4833a, e, intent3, 1342177280)));
        }
        if (z2) {
            b2.b(2);
        } else {
            b2.b(16);
        }
        hi.a(new dv(this, (NotificationManager) this.f4833a.getSystemService("notification"), e, b2, str, str3, str4, intent));
    }

    private static int e(String str) {
        return str == null ? f4832b : str.hashCode();
    }

    @Override // com.google.android.finsky.utils.dw
    public final void b(String str) {
        ((NotificationManager) this.f4833a.getSystemService("notification")).cancel(str == null ? f4832b : str.hashCode());
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a() {
        ((NotificationManager) this.f4833a.getSystemService("notification")).cancel("updates".hashCode());
    }

    @Override // com.google.android.finsky.utils.dw
    public final void b() {
        ((NotificationManager) this.f4833a.getSystemService("notification")).cancel("package installing".hashCode());
    }

    @Override // com.google.android.finsky.utils.dw
    public final void c(String str) {
        ((NotificationManager) this.f4833a.getSystemService("notification")).cancel("package..remove..request..".concat(str).hashCode());
    }

    @Override // com.google.android.finsky.utils.dw
    public final void d(String str) {
        ((NotificationManager) this.f4833a.getSystemService("notification")).cancel("package..removed..".concat(str).hashCode());
    }

    private static void a(int i, Document document) {
        FinskyApp.a().h().a(0L, (com.google.android.finsky.layout.play.cy) new com.google.android.finsky.layout.play.ad(i, document != null ? document.f1963a.R : null, null));
    }

    public static Intent a(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent();
        intent.setClass(context, MainActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent = cr.a(context, str4);
            intent.putExtra("error_doc_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("error_title", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("error_html_message", str3);
        }
        return intent;
    }

    private static String a(int i, int i2) {
        String b2;
        switch (i) {
            case 901:
                b2 = com.google.android.finsky.c.d.eR.b();
                break;
            case 920:
            case 922:
            case 923:
            case 924:
            case 925:
            case 927:
            case 928:
                b2 = com.google.android.finsky.c.d.eN.b();
                break;
            default:
                switch (i2) {
                    case 1:
                        b2 = com.google.android.finsky.c.d.eM.b();
                        break;
                    case 2:
                        b2 = com.google.android.finsky.c.d.eO.b();
                        break;
                    default:
                        b2 = com.google.android.finsky.c.d.eQ.b();
                        break;
                }
        }
        return b2.replace("%lang%", Locale.getDefault().getLanguage().toLowerCase());
    }

    @Override // com.google.android.finsky.utils.dw
    public final void a(Document document, String str, Bitmap bitmap) {
        String str2 = document.f1963a.f3890a;
        if (document.E() == null) {
            FinskyLog.e("appDocument doesn't have app details (%s)", str2);
            return;
        }
        a(905, document);
        Intent b2 = NotificationReceiver.b(str2, str);
        Intent a2 = NotificationReceiver.a(str2);
        Resources resources = this.f4833a.getResources();
        String string = resources.getString(R.string.notification_preregistration_released_title, document.f1963a.i);
        String string2 = resources.getString(R.string.notification_preregistration_released_subtitle);
        a("preregistration..released..".concat(str2), string, string, string2, string2, R.drawable.stat_notify_new_release, bitmap, -1, b2, true, a2);
    }

    private void a(String str, String str2, String str3, String str4, String str5, int i, Bitmap bitmap, int i2, Intent intent, boolean z, Intent intent2) {
        a(str, str2, str3, str4, str5, i, bitmap, i2, intent, z, intent2, "status", null, null);
    }

    static /* synthetic */ void a(boolean z, String str, String str2, String str3, Intent intent) {
        if (!com.google.android.finsky.c.d.f.b().booleanValue()) {
            return;
        }
        FinskyLog.a("%s notification: [ID=%s, Title=%s, Message=%s, returnCode=%d]", z ? "Showing" : "Suppressing", str, str2, str3, Integer.valueOf(intent.getIntExtra("error_return_code", -1)));
    }
}
