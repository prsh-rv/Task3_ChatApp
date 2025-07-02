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
