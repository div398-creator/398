
# Child Vaccination Management System

## Project Overview

The **Child Vaccination Management System** is a console-based Java application designed to assist parents in managing their children's vaccinations. This system allows parents to book vaccination appointments, view their child's vaccination records, and receive reminders for upcoming vaccinations.

The primary goal of this system is to make it easier for parents to ensure their children receive timely vaccinations, which is crucial for protecting them from preventable diseases. The system is simple, user-friendly, and does not require any frontend or database storage, making it easy to use and maintain.

## Features

1. **Add Child**: Allows parents to add their child's details (name and age) to the system.
2. **Book Vaccination Appointment**: Allows parents to book a vaccination appointment for their child and records the type of vaccine.
3. **View Vaccination Details**: Allows parents to view their child's vaccination history.
4. **Show Vaccination Reminders**: Displays reminders for upcoming vaccinations, helping parents stay informed about their child's vaccination schedule.
5. **Console-Based Interface**: The application runs entirely in the console, with a simple menu-driven interface.

## How to Use

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- A text editor or IDE (e.g., IntelliJ, Eclipse, VS Code) for running Java code.

### Running the Program

1. **Download/Clone the Repository**: Download or clone this repository to your local machine.

2. **Compile the Program**: Open a terminal or command prompt and navigate to the directory where the Java file (`ChildVaccinationManagementSystem.java`) is located. Compile the program using the following command:
   ```
   javac ChildVaccinationManagementSystem.java
   ```

3. **Run the Program**: After compiling, run the program using the following command:
   ```
   java ChildVaccinationManagementSystem
   ```

4. **Using the Menu**:
   - You will be presented with a menu with the following options:
     1. Add Child
     2. Book Vaccination Appointment
     3. View Child's Vaccination Details
     4. Show Vaccination Reminders
     5. Exit
   - Choose an option by entering the corresponding number and follow the prompts.

### Example Usage

#### Adding a Child
- When you select "Add Child," the system will prompt you to enter the child's name and age. Once entered, the child will be added to the system.

#### Booking a Vaccination Appointment
- Select "Book Vaccination Appointment." The system will prompt you to enter the child's name and the vaccine name. If the child is found in the system, the appointment will be booked, and the vaccine will be added to the child's record.

#### Viewing Vaccination Details
- Select "View Child's Vaccination Details" to see the list of vaccines that have been administered to the child.

#### Showing Vaccination Reminders
- Select "Show Vaccination Reminders" to view reminders for any upcoming vaccinations based on the records stored in the system.

#### Exiting the Program
- Select "Exit" to close the application.

### Sample Output

Here's a sample interaction with the system:

```
--- Child Vaccination Management System ---
1. Add Child
2. Book Vaccination Appointment
3. View Child's Vaccination Details
4. Show Vaccination Reminders
5. Exit
Enter your choice: 1

Enter child's name: John Doe
Enter child's age: 2
Child added successfully.

--- Child Vaccination Management System ---
1. Add Child
2. Book Vaccination Appointment
3. View Child's Vaccination Details
4. Show Vaccination Reminders
5. Exit
Enter your choice: 2

Enter child's name: John Doe
Enter vaccine name: Polio
Appointment booked for John Doe for Polio vaccine.

--- Child Vaccination Management System ---
1. Add Child
2. Book Vaccination Appointment
3. View Child's Vaccination Details
4. Show Vaccination Reminders
5. Exit
Enter your choice: 

Enter child's name: John Doe
Vaccination Details for John Doe:
- Polio
```

## Project Structure

```
ChildVaccinationManagementSystem.java  // Main program file containing all the classes and methods.
```

## Classes and Methods

### 1. Child Class
- **Attributes**:
  - `String name`: Stores the child's name.
  - `int age`: Stores the child's age.
  - `ArrayList<String> vaccines`: Stores the list of vaccines administered to the child.
  
- **Methods**:
  - `Child(String name, int age)`: Constructor to initialize the child's name and age.
  - `void addVaccine(String vaccine)`: Adds a vaccine to the child's vaccination list.
  - `void showVaccinationDetails()`: Displays the child's vaccination history.

### 2. VaccinationSystem Class
- **Attributes**:
  - `HashMap<String, Child> records`: Stores the records of children and their vaccinations.

- **Methods**:
  - `void addChild(String name, int age)`: Adds a new child to the system.
  - `void bookAppointment(String name, String vaccine)`: Books a vaccination appointment for the child.
  - `void showChildDetails(String name)`: Displays the vaccination details of the specified child.
  - `void showReminders()`: Displays reminders for upcoming vaccinations for all children.

### 3. Main Class (`ChildVaccinationManagementSystem`)
- Contains the main method and the menu-driven interface for interacting with the system.

## Future Enhancements

- **Database Integration**: Store child and vaccination data in a database for persistence.
- **GUI Interface**: Implement a graphical user interface for improved user experience.
- **Vaccination Schedule Management**: Automatically manage and suggest vaccination schedules based on the child's age.

## Conclusion

The Child Vaccination Management System is a simple yet effective tool to help parents keep track of their children's vaccinations. It is designed to be user-friendly and efficient, ensuring that children receive the necessary vaccinations on time. This console-based system can be extended and enhanced with additional features as needed.
