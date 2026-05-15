# 👋 Total Beginner? Start Here!

Welcome to your Java learning journey! This guide will help you get set up and running your first Java program in no time.

## Step 1: Install Java

Java requires the JDK (Java Development Kit) to compile and run programs.

### Windows:
1. Go to [oracle.com/java](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Download the latest JDK (currently JDK 21)
3. Run the installer and follow the prompts
4. Open Command Prompt and type `java -version` to verify

### Mac:
1. Go to [oracle.com/java](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Download the .dmg file for macOS
3. Open the installer and follow the prompts
4. Open Terminal and type `java -version` to verify

### Linux:
1. Open terminal
2. `sudo apt update` (Ubuntu/Debian) or `sudo dnf install java-latest-openjdk` (Fedora)
3. Type `java -version` to verify

## Step 2: Install VS Code (or IntelliJ)

### VS Code (Recommended for beginners):
1. Go to [code.visualstudio.com](https://code.visualstudio.com/)
2. Download and install VS Code
3. Open VS Code
4. Go to Extensions (Ctrl+Shift+X)
5. Search for "Java Extension Pack" by Microsoft
6. Install it

### IntelliJ IDEA (More advanced):
1. Go to [jetbrains.com/idea](https://www.jetbrains.com/idea/)
2. Download Community Edition (free)
3. Install and follow setup wizard

## Step 3: How to Run a .java File

### In VS Code:
1. Open the .java file
2. Click the play button (▶️) in the top right
3. Or right-click in the editor and select "Run Java"

### In IntelliJ:
1. Open the project
2. Right-click the .java file in Project view
3. Select "Run 'FileName.main()'"

### In Terminal/Command Prompt:
1. Open terminal in the file's folder
2. Compile: `javac FileName.java`
3. Run: `java FileName`

## Step 4: How to Use This Repo

1. **Clone or download** this repository
2. **Start with Module_01_Java_Basics**
3. **Read Notes_Introduction.java** first - it explains what Java is
4. **Complete Exercise_Introduction.java** - it has simple tasks
5. **Move to the next topic** when you're comfortable

## Step 5: Your First Java Program (Hello World)

Create a new file called `HelloWorld.java`:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java!");
    }
}
```

Run it using the methods above. You should see:
```
Hello, World!
Welcome to Java!
```

## What's Next?

- Read through the README.md for the full learning path
- Start with Module_01_Java_Basics/01_Introduction/
- Take it slow and have fun!
- If you get stuck, Google is your friend

---

Happy coding! ☕