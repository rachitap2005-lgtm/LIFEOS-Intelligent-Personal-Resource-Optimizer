🚀 LIFEOS
Intelligent Personal Resource Optimizer

A Java-based student decision-support system for managing tasks, study time, and personal budget.**
📖 1. Project Overview
**LIFEOS** is a Java-based application developed to help students manage their daily academic and financial resources efficiently.
It combines **task prioritization, smart study planning, budget tracking, and What-If financial analysis** into a single console-based system.

The main goal of LIFEOS is to help students answer:
<img width="808" height="539" alt="image" src="https://github.com/user-attachments/assets/62beebcf-f38b-4950-b06e-3d4af5fd8376" />
📚 What should I do first?**  
⏰ How should I use my available time?**  
💰 How much budget do I have left?**  
🔮 Can I afford an additional expense?**

✨ 2. Features
<img width="512" height="447" alt="image" src="https://github.com/user-attachments/assets/5c4e15e2-76b1-4ae1-a870-df84ebb53da3" />
📚 Task Prioritization
- Calculates priority for academic tasks.
- Considers importance, difficulty, estimated hours, and deadline.
- Displays tasks with their calculated priority.
⏰ Smart Study Planning
- Takes available study hours as input.
- Sorts tasks according to priority.
- Suggests tasks to **DO** or **POSTPONE**.
💰 Budget Management
- Maintains a monthly student budget.
- Tracks expenses.
- Calculates spent and remaining budget.
🔮 What-If Analysis
- Tests the effect of an additional expense.
- Calculates the remaining budget after the expense.
- Shows a warning when the budget is exceeded.
🛡️ Input Validation
- Validates task and expense values.
- Handles invalid data using Java exception handling.

🛠️ Technologies & Tools Used :-
☕ **Java** | Core application development.
🧩 **Object-Oriented Programming** | Modular class-based design.
📦 **ArrayList** | Storing tasks and expenses.
🔄 **Comparator** | Priority-based task sorting.
⚠️ **Exception Handling** | Invalid data handling.
⌨️ **Scanner** | User input.
💻 **Visual Studio Code** | Development.
🔗 **Git & GitHub** | Version control and repository management.

⚙️ Installation & Running
🔹 Step 1 — Install Java
Install **JDK 17 or later**.
Verify the installation:
java -version
javac -version
<img width="874" height="583" alt="image" src="https://github.com/user-attachments/assets/1bb91d71-4df9-4354-a4b7-f893b86b42af" />
🔹 Step 2 — Clone the Repository
git clone <YOUR-GITHUB-REPOSITORY-URL>
🔹 Step 3 — Open the Project
Open the downloaded LIFEOS project in VS Code or any Java-supported IDE.
🔹 Step 4 — Compile & Run
Compile the project according to the package structure and run: java LifeOS.Main
<img width="922" height="1184" alt="image" src="https://github.com/user-attachments/assets/7eaad41f-6818-433e-bc9b-16893349ac96" />
🚀 Step 5 — Use LIFEOS
After execution, the following menu is displayed:
<img width="940" height="761" alt="image" src="https://github.com/user-attachments/assets/e9180ad1-8f6f-4015-b27a-f4d6ab599f2a" />
🧪 Testing Summary
Feature	Test Performed	Expected Result
📚 Tasks	View tasks -	Priority displayed
⏰ Smart Plan	Enter available hours	-DO / POSTPONE plan generated
💰 Budget	View budget-	Spending and balance displayed
🔮 What-If	Enter extra expense	-New balance calculated
⚠️ Boundary Test- Excessive expense	Warning displayed
🚪 Exit	Select 5- Program terminates


