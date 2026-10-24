# Database Schema Design - MySQL

## Tables
1. **admin**
   - id: INT PRIMARY KEY AUTO_INCREMENT
   - username: VARCHAR(50)
   - password: VARCHAR(255)

2. **doctor**
   - id: INT PRIMARY KEY AUTO_INCREMENT
   - name: VARCHAR(100)
   - email: VARCHAR(100)
   - password: VARCHAR(255)
   - speciality: VARCHAR(100)
   - available_times: TEXT

3. **patient**
   - id: INT PRIMARY KEY AUTO_INCREMENT
   - name: VARCHAR(100)
   - email: VARCHAR(100)
   - phone: VARCHAR(20)
   - password: VARCHAR(255)

4. **appointment**
   - id: INT PRIMARY KEY AUTO_INCREMENT
   - patient_id: INT, FOREIGN KEY (patient_id) REFERENCES patient(id)
   - doctor_id: INT, FOREIGN KEY (doctor_id) REFERENCES doctor(id)
   - appointment_time: DATETIME
   - status: VARCHAR(50)

5. **prescription**
   - id: INT PRIMARY KEY AUTO_INCREMENT
   - appointment_id: INT, FOREIGN KEY (appointment_id) REFERENCES appointment(id)
   - details: TEXT
   - date: DATE
