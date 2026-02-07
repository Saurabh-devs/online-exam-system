# 🚀 Online Exam System – Java (Spring Boot)

<p align="center">
<img src="https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java&logoColor=white" alt="Java 17">
<img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot 3.x">
<img src="https://img.shields.io/badge/JPA%20%2F%20Hibernate-red?style=for-the-badge" alt="JPA / Hibernate">
<img src="https://img.shields.io/badge/H2%20Database-lightgrey?style=for-the-badge" alt="H2 Database">
</p>

A comprehensive **Online Examination System** built using **Spring Boot, Spring Security, Thymeleaf, Bootstrap 5**, and **JPA/Hibernate**.  
The platform provides a secure and user-friendly environment for **Admins** and **Students** to manage and take online tests effectively.

✔️ Completely Free  
✔️ Full Source Code Included

---



<p align="center">
<a href="https://www.youtube.com/c/LazyCoderOnline?sub_confirmation=1">
<img src="https://img.shields.io/badge/Subscribe-LazyCoder-red?style=for-the-badge&logo=youtube" >
</a>

<a href="https://wa.me/919572181024">
<img src="https://img.shields.io/badge/WhatsApp-Chat%20Now-green?style=for-the-badge&logo=whatsapp" >
</a>
</p>

---


# ✨ Features

## 👨‍💻 Admin Features
- Secure Admin Login
- Stats Dashboard (Total Students, Exams, Questions, Submissions)
- **Exam CRUD** (title, duration, description)
- **Question CRUD** per exam
- Cascade deletes for exams → questions → results
- Protect answered questions from accidental delete
- Manage Students
- Reset Student Password
- Delete Student Account (cascade all related data)
- View all submissions for any exam

---

## 🧑‍🎓 Student Features
- Student Registration (Full Name, Email, Mobile, Profile Picture)
- Secure Login
- Dashboard with KPIs + Performance Chart
- Take Exam (paginated interface + question palette)
- Live Timer (auto submit)
- Instant Results (score, percentage, pass/fail)
- Detailed Review Page (correct vs incorrect answers)
- Profile Update
- Upload New Profile Picture
- Change Password
- View All Previous Exam Results

---

# 🛠️ Tech Stack

| Layer | Technology                                 |
|------|--------------------------------------------|
| Backend | Spring Boot 3, Spring Security 6           |
| Frontend | Thymeleaf, Html, Bootstrap 5, Chart.js     |
| Database | H2 (file-based) (configurable to other DB) |
| ORM | Hibernate / JPA                            |
| Build | Maven                                      |
| Storage | Local File System for images               |

---

# 🚀 How to Run the Project

### ✔️ Prerequisites
- Java **17+**
- Maven
- Any IDE (IntelliJ, VS Code, Eclipse)

---

### ✔️ Clone the Repository

```bash
git clone https://github.com/Saurabh-devs/online-exam-system.git
cd online-exam-system
```

---

### ✔️ Start the Application

Open the project → Run:

`OnlineExamApplication.java`

Server will start at:

👉 http://localhost:7890

---

# 🗄️ Database (H2)

Access H2 Console:

👉 http://localhost:7890/h2-console

```
JDBC URL : jdbc:h2:file:./data/examdb  
Username : sa  
Password :  
```

---

# 🔐 Default Admin User

| Username | Password |
|---------|----------|
| admin | admin123 |

---

# 📜 License

This project is **open-source** under the **MIT License**.

---

<p align="center">
<strong>Happy Coding ❤️</strong>
</p>
