package br.com.dio.afazeres.datasource

import br.com.dio.afazeres.model.Task
import androidx.room.*

@Database(version = 2, entities = arrayOf(Task::class))
abstract class TasksDataBase : RoomDatabase() {
    abstract fun taskDAO(): TaskDAO
}
