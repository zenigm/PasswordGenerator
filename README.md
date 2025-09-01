 🔐 PasswordGenerator (CLI-Based)

A simple **command-line password generator** written in Java.  
Built while experimenting with user input, randomization, and string manipulation in Java.

This repo contains **two versions** of the program:  

1. **Main Working File → `main.java`**  
   - Cleaner implementation  
   - Asks user for **max length only**  
   - Generates either:
     - Numeric password (via factorial trick)
     - Word/symbol password
     - Both (numbers + letters + symbols)  

2. **Experimental Buggy File → `SubsituteFile.java`**  
   - Extended version that asks for **both Min and Max password lengths**  
   - Intention: generate two passwords (one at Min length, one at Max length)  
   - Reality:  
     - Min and Max passwords sometimes overlap (just longer versions of the same string)  
     - `both` option doesn’t respect boundaries correctly → appends to previous password  

I left the buggy one here **on purpose** to show the difference between a clean approach and what can go wrong when adding complexity without thinking ahead.

---

## 📂 Files in Repo

- `CreatePassword.java` → main working program  
- `CreatePasswordWithMinMax.java` → experimental version with min/max issue  
- `README.md` → this file  

---

## 🚀 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/java-password-generator.git
   cd java-password-generator
   compile "javac CreatePassword.java"
   run "java CreatePassword"

 ---


##📊 Example Output (Main File)

Do you want to generate a password? (1 = yes/2 = no)
1
All Done but,Do you want a num pass or word pass or both?
(3) for num , (4) for word , (5) for both
5
Okay! Please enter Max length of pass you want: 12

The Generated Password of 12 digit is :
a#K2}pZt@!Qs

---

##⚡ Buggy Version Behavior

File: SubsituteFile.java

Example problem:
Do you want to generate a password? (1 = yes/2 = no)
1
All Done but,Do you want a num pass or word pass or both?
(3) for num , (4) for word , (5) for both
5
Okay! Please enter Max length of pass you want: 12
Please enter Min length of pass you want: 10

The Generated Password of 10 digit is :
@Oig==J,x]

The Generated Password of 12 digit is :
@Oig==J,x]d9


⚠️ See the issue? → Max password is just the Min password plus extra characters, not a new unique one.
That’s why this file is here: to demonstrate how logic can break if you don’t reset state properly.I actually tried to fix it,But cant solve it,if you can then contri this
