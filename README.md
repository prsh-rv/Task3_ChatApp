#### 🏢 Internship Details

- **COMPANY**: CODTECH IT SOLUTIONS PVT. LTD  
- **NAME**: RAGHAV PARASHAR  
- **INTERN ID**: CT04DN144  
- **DOMAIN**: JAVA PROGRAMMING  
- **DURATION**: 4 WEEKS (FROM JUNE 10TH, 2025 TO JULY 10TH, 2025)  
- **MENTOR**: NEELA SANTOSH  

🛠️ This project was developed as part of my internship task.

### 📌 Instructions (Task 3: Multithreaded Chat App)

- Build a client-server chat application using Java Sockets
- Server must handle multiple clients using multithreading
- Messages from one client should be broadcast to all others
- Use `Socket`, `ServerSocket`, `InputStream`, `OutputStream`, and `Thread`
- Run server and clients in separate terminal windows

---

# Task 3 - Java Multithreaded Chat Application

## 🧑‍💻 Description
This is a basic Java **console-based chat app** using:
- **Sockets** for client-server communication
- **Multithreading** to support multiple clients

The server accepts multiple connections, and each client can send messages that are broadcast to all others.

---

## 🛠 How to Run

### 1. Open 3 terminals (or 3 command prompts)

- **Terminal 1** → Run the server
```bash
javac ChatServer.java
java ChatServer
```
- **Terminal 2 and 3** → Run the clients
```bash
javac ChatClient.java
java ChatClient
```
Enter messages in one client → see them appear in the other ✅

---



## 💡 Technologies Used
-Java Sockets
-Multithreading with Thread class
-Console I/O using BufferedReader and PrintWriter

---


## 📁 Files Included
-`ChatServer.java`: Server code that handles client threads
-`ChatClient.java`: Client code to send and receive messages
-`README.md`: This file
-`screenshot.png`: Console chat demo (optional)

---
