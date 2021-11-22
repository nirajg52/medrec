package com.example.medrecroomdb.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.medrecroomdb.PatientRepository;
import com.example.medrecroomdb.model.Patient;
import java.util.List;

public class PatientViewModel extends AndroidViewModel {
    private PatientRepository patientRepository;
    private LiveData<Integer> insertResult;
    private LiveData<List<Patient>> allPatients;

    public PatientViewModel(@NonNull Application application) {
        super(application);
        patientRepository = new PatientRepository(application);
        insertResult = patientRepository.getInsertResult();
        allPatients = patientRepository.getPatientList();
    }
    //calls repository to insert a classroom
    public void insert(Patient patient) {
        patientRepository.insert(patient);
    }
    //gets insert results as LiveData object
    public LiveData<Integer> getInsertResult() {
        return insertResult;
    }
    //returns query results as live data object
    public LiveData<List<Patient>> getAllPatients() { return allPatients; }

}
