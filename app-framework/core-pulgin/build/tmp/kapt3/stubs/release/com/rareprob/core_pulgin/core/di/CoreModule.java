package com.rareprob.core_pulgin.core.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/rareprob/core_pulgin/core/di/CoreModule;", "", "()V", "provideCoreDatabase", "Lcom/rareprob/core_pulgin/core/base/CoreDatabase;", "app", "Landroid/app/Application;", "core-pulgin_release"})
@dagger.Module()
public final class CoreModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.core.di.CoreModule INSTANCE = null;
    
    private CoreModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rareprob.core_pulgin.core.base.CoreDatabase provideCoreDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
}