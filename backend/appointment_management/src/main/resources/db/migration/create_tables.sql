-- Table User
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

-- Table Patient
CREATE TABLE patients (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    user_id INT NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id)
);

-- Table Doctor
CREATE TABLE doctors (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    specialization VARCHAR(255) NOT NULL,
    user_id INT NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id)
);

-- Table Appointment
CREATE TABLE appointments (
    id SERIAL PRIMARY KEY,
    appointment_date TIMESTAMP NOT NULL,
    status VARCHAR(50) NOT NULL,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    CONSTRAINT fk_patient FOREIGN KEY (patient_id) REFERENCES patients(id),
    CONSTRAINT fk_doctor FOREIGN KEY (doctor_id) REFERENCES doctors(id)
);

-- Table Notification
CREATE TABLE notifications (
    id SERIAL PRIMARY KEY,
    message TEXT NOT NULL,
    timestamp TIMESTAMP NOT NULL,
    patient_id INT,
    doctor_id INT,
    CONSTRAINT fk_patient FOREIGN KEY (patient_id) REFERENCES patients(id),
    CONSTRAINT fk_doctor FOREIGN KEY (doctor_id) REFERENCES doctors(id)
);