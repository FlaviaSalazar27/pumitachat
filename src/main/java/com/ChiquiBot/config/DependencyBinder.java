package com.ChiquiBot.config;

import com.ChiquiBot.core.FileSenderBotApi;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.telegram.telegrambots.meta.generics.UpdatesHandler;

import javax.inject.Singleton;

public class DependencyBinder extends AbstractBinder {
    @Override
    protected void configure(){
        bind(FileSenderBotApi.class).to(UpdatesHandler.class).in(Singleton.class);
    }
}
