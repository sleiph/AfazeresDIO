package br.com.dio.afazeres

import br.com.dio.afazeres.datasource.TasksDataBase
import android.app.Application
import androidx.room.*

open class MyApplication : Application() {

    companion object {
        var database: TasksDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        //Room
        database = Room.databaseBuilder(this, TasksDataBase::class.java, "tasks").allowMainThreadQueries().build()

    }
}