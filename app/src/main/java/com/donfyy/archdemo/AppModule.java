package com.donfyy.archdemo;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;

@Module
@InstallIn(value = {ActivityComponent.class, FragmentComponent.class})
public class AppModule {
}
