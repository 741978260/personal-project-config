package com.mumu.config.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/2
 */
@Component
public class SpirngApplicationUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getContext() {
        return applicationContext;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        if (applicationContext != null) {
            return (T) applicationContext.getBean(name);
        } else {
            return null;
        }
    }
}
