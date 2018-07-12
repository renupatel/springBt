package com.springbootexample.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.Locale;

@Service

public class I18nService {

    @Autowired
    private MessageSource messageSource;


    public String getMessage(String messageId) {
        Locale local = LocaleContextHolder.getLocale();
        return getMessage(messageId,local);
    }

    public String getMessage(String messageId, Locale local ) {

        return messageSource.getMessage(messageId,null,local);
    }
}
