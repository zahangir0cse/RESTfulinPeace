
package com.zahangir.dao;

import com.zahangir.model.Admission;

public interface AdmissionDao {
    void addAdmission(Admission admission);
    void removeAdmissionById(int id);
}