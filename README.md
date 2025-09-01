```
# 🔐 PasswordGenerator (CLI-Based in Java)

```

██████╗  █████╗ ███████╗███████╗██╗    ██╗ ██████╗  █████╗ ██████╗ ███████╗
██╔══██╗██╔══██╗╚══███╔╝██╔════╝██║    ██║██╔════╝ ██╔══██╗██╔══██╗██╔════╝
██████╔╝███████║  ███╔╝ █████╗  ██║ █╗ ██║██║  ███╗███████║██████╔╝█████╗
██╔═══╝ ██╔══██║ ███╔╝  ██╔══╝  ██║███╗██║██║   ██║██╔══██║██╔═══╝ ██╔══╝
██║     ██║  ██║███████╗███████╗╚███╔███╔╝╚██████╔╝██║  ██║██║     ███████╗
╚═╝     ╚═╝  ╚═╝╚══════╝╚══════╝ ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚══════╝

````

---

## 🎭 About This Repo
This project started as a casual coding experiment.  
The goal? → Build a **password generator in Java** using nothing but the basics:
- User input
- Randomization
- String building
- Some questionable logic

I ended up creating **two versions**:
1. A clean, working file → **`CreatePassword.java`**
2. A buggy experiment → **`CreatePasswordWithMinMax.java`**

Why keep the broken one?  
Because broken code teaches more than flawless code. And it’s fun to show *what not to do*.  

---

## 📂 Project Structure

- `CreatePassword.java` → ✅ Stable file, generates passwords with a **Max length** option.  
- `CreatePasswordWithMinMax.java` → ⚠️ Experimental version that tries Min + Max… and fails.  
- `README.md` → This monster document explaining everything.  

---

## 🚀 How to Run

Clone the repo:
```bash
git clone https://github.com/your-username/java-password-generator.git
cd java-password-generator
````

Compile and run the working version:

```bash
javac CreatePassword.java
java CreatePassword
```

If you want to see chaos, run the buggy one:

```bash
javac CreatePasswordWithMinMax.java
java CreatePasswordWithMinMax
```

---

## ⚡ Features

✅ Supports 3 password types:

* **Numeric Passwords** → built with factorial logic
* **Word/Symbol Passwords** → randomized characters
* **Mixed (Both)** → numbers + letters + symbols

✅ Takes user input interactively
✅ Simple CLI interface
✅ Random password generation using `Random`
⚠️ Buggy Min/Max version included

---

## 📊 Example Output (Main File)

```
Do you want to generate a password? (1 = yes/2 = no)
1
All Done but,Do you want a num pass or word pass or both?
(3) for num , (4) for word , (5) for both
5
Okay! Please enter Max length of pass you want: 12

The Generated Password of 12 digit is :
a#K2}pZt@!Qs
```

---

## 💀 Example Output (Buggy Version)

```
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
```

⚠️ Issue: Max password is just the Min password with extra characters.
Reason: Forgot to reset the `StringBuilder`.
Lesson: Always reset state or you’ll stack data accidentally.

---

## 🤝 Contributing

Feel free to:

* Fix bugs
* Add features
* Improve randomness
* Make the output prettier

Open PRs, create issues, break it further — it’s all welcome.

---

## 👀 Why Two Versions?

Because coding isn’t just about *final products*.
It’s also about:

* Experimenting
* Failing
* Learning why things break
* Documenting the mess

That’s why this repo holds **both the clean and messy code**.

---

## 🎨 Badges (because GitHub loves them)

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge\&logo=java\&logoColor=white)
![CLI](https://img.shields.io/badge/CLI--App-Terminal-blue?style=for-the-badge)
![Password](https://img.shields.io/badge/Password-Generator-orange?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Experimental-yellow?style=for-the-badge)

---

## 📝 License

MIT License → Do whatever you want. Just don’t blame me if your password generator fails and your fridge gets hacked.LOL

---


