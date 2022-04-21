package br.com.dosanjosdeveloper.Academia.Registro.infra.utils;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTimeUtils {
    public JavaTimeUtils() {
    }

    private static final Locale LOCALE_BR = new Locale("pt","BR");

    public static final DateTimeFormatter LOCAL_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss", LOCALE_BR);
    public static final DateTimeFormatter LOCAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy",LOCALE_BR);
}
