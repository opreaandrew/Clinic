-- Patients
INSERT INTO Patient (name, birth_date, sex, emergency_contact) VALUES
('Ana Popescu', '1987-03-25', 'FEMALE', 'EmergencyContact1'),
('Mihai Ionescu', '1995-12-10', 'MALE', 'EmergencyContact2'),
('Elena Vasile', '1980-06-08', 'FEMALE', 'EmergencyContact3'),
('Adrian Stanescu', '1972-09-17', 'MALE', 'EmergencyContact4'),
('Mihaela Dumitru', '1992-11-05', 'FEMALE', 'EmergencyContact5');

-- Doctors
INSERT INTO Doctor (name, specialization) VALUES
('Dr. Andrei Radu', 'RecoveryMedicine'),
('Dr. Maria Tudor', 'Pediatrics'),
('Dr. Ionescu Costin', 'RecoveryMedicine'),
('Dr. Larisa Dobre', 'Pediatrics');

-- Appointments
INSERT INTO Appointment (date, start_time, end_time, status, doctor_id, patient_id) VALUES
('2023-12-01', '11:00', '12:00', 'COMPLETED', 3, 3),
('2023-12-02', '09:30', '10:30', 'CANCELED', 1, 1),
('2023-12-04', '15:15', '16:15', 'SCHEDULED', 2, 2),
('2023-12-06', '13:45', '14:45', 'CANCELED', 4, 4),
('2023-12-07', '14:00', '15:00', 'SCHEDULED', 1, 5),
('2023-12-08', '08:45', '09:45', 'SCHEDULED', 2, 1),
('2023-12-09', '12:30', '13:30', 'SCHEDULED', 3, 2),
('2023-12-10', '10:15', '11:15', 'SCHEDULED', 4, 3);