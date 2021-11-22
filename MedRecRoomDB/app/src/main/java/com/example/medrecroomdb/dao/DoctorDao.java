package com.example.medrecroomdb.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.medrecroomdb.model.Doctor;

import java.util.List;

@Dao
public interface DoctorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Doctor Doctor);

    @Query("select * from Doctor order by doctorId")
    LiveData<List<Doctor>> getAllDoctors();
}
