package org.keyczar.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.keyczar.annotations.ForTesting;

/* loaded from: classes2.dex */
public class Messages {
    private static final String BUNDLE_NAME = "org.keyczar.i18n.messages";
    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

    private Messages() {
    }

    @ForTesting
    public static void changeLocale(Locale locale) {
        RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, locale);
    }

    public static String getString(String str, Object... objArr) {
        try {
            return MessageFormat.format(RESOURCE_BUNDLE.getString(str), objArr);
        } catch (MissingResourceException e) {
            return "!" + str + '!';
        }
    }
}
