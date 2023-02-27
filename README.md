# HospitalManager
HospitalManager is a Spring Boot Java Web app which aim is to manage, track and inform patients and doctors of a medical clinic. It has the ability to monitor doctor and patient relation based upon appointments. The list of doctors, arranged in a specific medical specialisation, are edited by an administrator, that has complete control over what a clinic might need. 
  
  Administrator can: View, Create, Edit or Hide, Delete a Specialisation, a Doctor or a Patient; has the ability to view active or completed appointments for all patients, for a specific doctor or a patient, as well as edit or delete them.
  
  A doctor is authorised to view all patients, to view his profile, to view and edit active or historical appointments made by patients for his specialisation and name. He also can made some notes regarding an appointment, can write an diagnosis and prescribe some medications.
  
  A patient can sing up to the clinic by making an account. He can view all his active or completed appointments, delete confirmed appointments and view the notes left by doctor after an appointment is completed. Also he can view all medical specialisations and all doctors by specialisation. After viewing a doctor profile he can create an appointment. On creation he will receive an email regarding appointments details.
  
  All input data is validated in order not to save wrong information to SQL database and to avoid any possible malfunction related to this.


Some usefull info for configuring app:

Make sure to DROP SCHEMA in MySQL;

Postman JSON for creating admin on /mvc/admin/create. Set /** permitAll in SecurityConfig for this*/: 
{ "userName": "admin",
"password": "1234",
"roles": "ROLE_ADMIN",
"isActive": true }

Specialisation ideas: ALLERGY_AND_IMMUNOLOGY("Allergy and immunology"), ANESTHESIOLOGY("Anesthesiology"), DERMATOLOGY("Dermatology"), DIAGNOSTIC_RADIOLOGY("Diagnostic radiology"), EMERGENCY_MEDICINE("Emergency medicine"), FAMILY_MEDICINE("Family medicine"), INTERNAL_MEDICINE("Internal medicine"), MEDICAL_GENETICS("Medical genetics"), NEUROLOGY("Neurology"), NUCLEAR_MEDICINE("Nuclear medicine"), OBSTETRICS_AND_GYNECOLOGY("Obstetrics and gynecology"), OPHTHALMOLOGY("Ophthalmology"), PATHOLOGY("Pathology"), PEDIATRICS("Pediatrics"), PHYSICAL_MEDICINE_AND_REHABILITATION("Physical medicine and rehabilitation"), PREVENTIVE_MEDICINE("Preventive medicine"), PSYCHIATRY("Psychiatry"), RADIATION_ONCOLOGY("Radiation oncology"), SURGERY("Surgery"), UROLOGY("Urology");
