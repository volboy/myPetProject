package com.mmurtazaliev.mypetproject.di

import android.app.Activity
import com.mmurtazaliev.mypetproject.Computer
import com.mmurtazaliev.mypetproject.Motherboard
import com.mmurtazaliev.mypetproject.Processor
import com.mmurtazaliev.mypetproject.RAM
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {

    // or fun computer(): Computer
    // or val computer: Computer
    fun injectComputer(activity: Activity)
}

@Module
class AppModule {

    @Provides
    fun provideComputer(
        processor: Processor,
        ram: RAM,
        motherboard: Motherboard
    ): Computer {
        return Computer(
            processor = processor,
            ram = ram,
            motherboard = motherboard
        )
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideRAM(): RAM {
        return RAM()
    }

    @Provides
    fun provideMotherboard(): Motherboard {
        return Motherboard()
    }
}