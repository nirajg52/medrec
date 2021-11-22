package com.example.medrecroomdb.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.medrecroomdb.DoctorRepository;
import com.example.medrecroomdb.PatientRepository;
import com.example.medrecroomdb.model.Doctor;
import com.example.medrecroomdb.model.Patient;
import java.util.List;

public class DoctorViewModel extends AndroidViewModel {
    private DoctorRepository doctorRepository;
    private LiveData<Integer> insertResult;
    private LiveData<List<Doctor>> allDoctors;

    public DoctorViewModel(@NonNull Application application) {
        super(application);
        doctorRepository = new DoctorRepository(application);
        insertResult = doctorRepository.getInsertResult();
        allDoctors = doctorRepository.getDoctorList();
    }
    //calls repository to insert a classroom
    public void insert(Doctor doctor) {
        doctorRepository.insert(doctor);
    }
    //gets insert results as LiveData object
    public LiveData<Integer> getInsertResult() {
        return insertResult;
    }
    //returns query results as live data object
    public LiveData<List<Doctor>> getAllDoctors() { return allDoctors; }

}
