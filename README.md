# Proiect "Clinic Scheduler"

## Module Principale:

### 1. Controller pentru Programări (`AppointmentController`):

- **Endpoint-uri:**
  - `GET /appointments`: Returnează toate programările existente.
  - `GET /appointments/{id}`: Returnează detalii despre o anumită programare.
  - `POST /appointments`: Adaugă o nouă programare.
  - `PATCH /appointments/{id}/{status}`: Modifică starea unei programări.
- **Cross-Origin Resource Sharing (CORS):** Configurat pentru a permite accesul de pe `http://localhost:4200`.

### 2. Controller pentru Medici (`DoctorController`):

- **Endpoint-uri:**
  - `GET /doctors`: Returnează toți medicii existenți.
  - `GET /doctors/{id}`: Returnează detalii despre un medic specific.
  - `POST /doctors`: Adaugă un nou medic.
  - `PATCH /doctors/{id}`: Actualizează detaliile unui medic.
  - `DELETE /doctors/{id}`: Concediază un medic.
- **Cross-Origin Resource Sharing (CORS):** Configurat pentru a permite accesul de pe `http://localhost:4200`.

### 3. Controller pentru Pacienți (`PatientController`):

- **Endpoint-uri:**
  - `GET /patients`: Returnează toți pacienții existenți.
  - `GET /patients/{id}`: Returnează detalii despre un pacient specific.
  - `POST /patients`: Adaugă un nou pacient.
  - `PATCH /patients/{id}`: Actualizează detaliile unui pacient.
 - **Cross-Origin Resource Sharing (CORS):** Configurat pentru a permite accesul de pe `http://localhost:4200`.

### 4. Excepții (`ResourceNotFoundException`):
- O clasă de excepții personalizată pentru gestionarea situațiilor în care o resursă nu poate fi găsită.

### 5. Modelul de Date:
- Clasele pentru `Appointment`, `Doctor`, `Patient`, `NewAppointment`, `AppointmentStatus`, `Sex`, `Specialization`.

### 6. Repositories:
- Interfețe pentru `AppointmentRepository`, `DoctorRepository`, `PatientRepository` care extind JpaRepository.

### 7. Servicii:
- `AppointmentService`, `DoctorService`, `PatientService` - Servicii care gestionează logica de business și interacțiunea cu repositoriile.

## Tehnologii Utilizate:

- **Java Spring Boot:** Cadru de dezvoltare pentru construirea aplicației.
- **Hibernate:** Pentru maparea obiect-relațională a entităților.
- **Lombok:** Pentru generarea automată de cod boilerplate.
- **Spring Data JPA:** Pentru accesul simplificat la baza de date.

## Cum Funcționează:

- Prin intermediul endpoint-urilor expuse, aplicația permite adăugarea, actualizarea, ștergerea și obținerea informațiilor despre programări, medici și pacienți.
