package br.com.dio.afazeres.datasource

import androidx.room.*
import br.com.dio.afazeres.model.Task

@Dao
interface TaskDAO {

    @Query("SELECT * FROM tasks")fun getList(): List<Task>

    @Query("SELECT * FROM tasks WHERE id = (:taskID)")
    fun findById(taskID: Int): Task

    @Insert(onConflict = OnConflictStrategy.REPLACE) fun insertTask(vararg tasks: Task)

    @Update fun updateTask(task: Task)

    @Delete fun deleteTask(task: Task)
}
