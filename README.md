🚀 Online Exam System - Spring Boot & Thymeleaf

<p align="center">
<img src="https://img.shields.io/badge/Java-17-blue%3Fstyle%3Dfor-the-badge%26logo%3Djava%26logoColor%3Dwhite" alt="Java 17">
<img src="https://img.shields.io/badge/Spring%2520Boot-3.x-brightgreen%3Fstyle%3Dfor-the-badge%26logo%3Dspring%26logoColor%3Dwhite" alt="Spring Boot 3.x">
<img src="https://img.shields.io/badge/Thymeleaf-green%3Fstyle%3Dfor-the-badge%26logo%3Dthymeleaf%26logoColor%3Dwhite" alt="Thymeleaf">
<img src="https://img.shields.io/badge/Spring%2520Security-6-blue%3Fstyle%3Dfor-the-badge%26logo%3Dspringsecurity" alt="Spring Security 6">
<img src="https://img.shields.io/badge/JPA%252FHibernate-red%3Fstyle%3Dfor-the-badge" alt="JPA/Hibernate">
<img src="https://img.shields.io/badge/H2%2520Database-lightgrey%3Fstyle%3Dfor-the-badge" alt="H2 Database">
</p>

A comprehensive, full-stack Online Examination System built with Spring Boot, Spring Security, and Thymeleaf. This platform provides a secure, role-based environment for Admins to create and manage exams, and for Students to register, take timed tests, upload profile pictures, and review their performance.

This project is 100% free and the complete source code is provided.

💖 Support & Contact

This project is created by LazyCoder. If you find it helpful, please consider supporting me!

📺 Subscribe to my YouTube Channel!

This is the best way to support my work. I post tutorials, project builds, and tips on Spring Boot, Java, and web development.

Click here to Subscribe to LazyCoder

🤝 Need Help or Have a Project Idea?

Facing issues with this project? I'm happy to help!

Want to get your own custom project built? I am available for freelance work.

WhatsApp: +91 9572181024

<p align="center">
<a href="https://www.youtube.com/c/LazyCoderOnline%3Fsub_confirmation%3D1">
<img src="https://img.shields.io/badge/Subscribe-LazyCoder-red%3Fstyle%3Dfor-the-badge%26logo%3Dyoutube" alt="Subscribe to LazyCoder on YouTube">
</a>
<a href="https://wa.me/919572181024">
<img src="https://img.shields.io/badge/WhatsApp-9572181024-green%3Fstyle%3Dfor-the-badge%26logo%3Dwhatsapp" alt="Contact on WhatsApp">
</a>
</p>

📸 Project Screenshots

(Note: Replace these placeholder URLs with your actual screenshots)

<table align="center" width="100%">
<tr>
<td align="center" width="50%"><b>Admin Dashboard (with Stats)</b></td>
<td align="center" width="50%"><b>Student Dashboard (with Chart)</b></td>
</tr>
<tr>
<td align="center" width="50%"><img src="https" alt="Admin Dashboard"></td>
<td align="center" width="50%"><img src="https" alt="Student Dashboard"></td>
</tr>
<tr>
<td align="center" width="50%"><b>Student Exam Page (with Pagination)</b></td>
<td align="center" width="50%"><b>Exam Review Page (Correct/Wrong)</b></td>
</tr>
<tr>
<td align="center" width="50%"><img src="https://placehold.co/600x400/e2e8f0/333%3Ftext%3DStudent%2BExam%2BPage" alt="Student Exam Page"></td>
<td align="center" width="50%"><img src="https://placehold.co/600x400/e2e8f0/333%3Ftext%3DExam%2BReview%2BPage" alt="Exam Review Page"></td>
</tr>
<tr>
<td align="center" width="50%"><b>Manage Students (Admin)</b></td>
<td align="center" width="50%"><b>Student Profile Management</b></td>
</tr>
<tr>
<td align="center" width="50%"><img src="https" alt="Admin Manage Students"></td>
<td align="center" width="50%"><img src="https://placehold.co/600x400/e2e8f0/333%3Ftext%3DStudent%2BProfile%2BPage" alt="Student Profile Page"></td>
</tr>
</table>

✨ Features

👨‍💻 Admin Features

Secure Admin Login

Statistical Dashboard: KPIs for Total Students, Exams, Questions, and Submissions.

Exam Management (CRUD): Create, read, edit, and delete exams (title, duration).

Question Management (CRUD): Create, read, edit, and delete questions for each exam.

Cascade Deletes: Safely delete exams (cascades to questions & results).

Safe Deletes: Prevents deletion of questions that have already been answered by students.

Student Management: View a list of all registered students.

Admin Actions: Reset any student's password.

Admin Actions: Delete a student's account (cascades to all their results and answers).

View Results: View a decorated list of all student submissions for a specific exam.

🧑‍🎓 Student Features

Secure Registration: Students can register with Full Name, Email, Mobile, and Profile Picture Upload.

Secure Login

Personalized Dashboard: Welcome message, KPIs (Exams Taken, Avg. Score, Best Score), and a line chart of past performance.

Take Exam: A professional, paginated exam-taking interface.

Question Palette: Students can see all question numbers, see which are answered (color change), and jump to any question.

Live Timer: A real-time, auto-submitting timer for each exam.

Instant Results: A decorated score and percentage page immediately after submission, with a "Pass" or "Fail" status.

Review Answers: A dedicated "My Results" page where students can review all past exams, see their answers, and see the correct answers highlighted.

Profile Management: Students can update their profile (full name, mobile) and upload a new profile picture.

Password Management: Students can change their own password.

🛠️ Tech Stack

Backend: Spring Boot 3, Spring Security 6 (with Role-Based Auth)

Frontend: Thymeleaf (Server-Side Rendering)

Database: Spring Data JPA (Hibernate)

Database: H2 (for development, configured for file persistence)

Styling: Bootstrap 5, Bootstrap Icons

Charting: Chart.js

File Storage: Local file system storage for profile picture uploads

Build: Apache Maven

🚀 How to Run

Prerequisites:

Java JDK 17 or later

Apache Maven

Clone the Repository:

git clone [https://github.com/sumitkumar1503/online-exam-system.git](https://github.com/sumitkumar1503/online-exam-system.git)
cd online-exam-system


Run the Application:

Open the project in your favorite IDE (like IntelliJ IDEA or VS Code).

Run the OnlineExamApplication.java file.

The application will start on http://localhost:7890.

Database Configuration:

By default, the project uses a file-based H2 database.

The database file will be auto-created in a data folder in the project's root directory.

You can access the H2 console at http://localhost:7890/h2-console

JDBC URL: jdbc:h2:file:./data/examdb

Username: sa

Password: password

Default Admin User:

The application auto-creates an admin user on first startup.

Username : admin

Password: adminpass

📜 License

This project is open-source and available under the MIT License.

<p align="center">
Happy Coding!
</p>