# Database Schema Design - MySQL

## Tables
1. **admin**: id, username, password
2. **doctor**: id, name, email, password, speciality, available_times
3. **patient**: id, name, email, phone, password
4. **appointment**: id, patient_id, doctor_id, appointment_time, status
5. **prescription**: id, appointment_id, details, date
