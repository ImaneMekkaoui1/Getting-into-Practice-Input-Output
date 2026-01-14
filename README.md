# Getting-into-Practice-Input-Output
**Student:** Imane Mekkaoui 
**Class:** 1-SDIA / 2025-2027 


# Project Description

This practical work focuses on strengthening our understanding of Java Input/Output, object serialization, and exception handling using Object-Oriented Programming principles.

The main objective of this project is to learn how to:

.  Manipulate files and directories using Java

.  Persist objects using serialization (.dat files)

.  Handle runtime errors safely using exceptions

.  Create custom exceptions and manage exception propagation

1.  The work is divided into two main parts:

2.  Getting into Practice: Input / Output



## Key Concepts Used
### Java Input / Output (I/O)

* java.io.File for file and directory manipulation

Reading directory contents

Checking file permissions (read, write, hidden)

Object serialization using:

ObjectOutputStream

ObjectInputStream

Persistence of objects in a .dat file

### Object-Oriented Programming (OOP)

Classes and objects

Interfaces and implementations

Encapsulation of data

Menu-driven console applications

### Exception Handling

try / catch

throw and throws

Custom checked exceptions

Displaying the call stack using printStackTrace()





# Exercises
## 1 Getting into Practice: Input / Output
### 1.1 Simulate the ls Command
#### Description

This exercise simulates the Unix ls command using Java.
The program asks the user to enter the full path of a directory, then displays all files and subdirectories contained in that directory.

For each element, the program shows:

Full path

Type:

<DIR> for directories

<FILE> for files

Access permissions:

r → readable

w → writable

h → hidden (cache file)




### 1.2 Object Serialization – Products Management
#### Description

This exercise demonstrates how to save and reload objects using Java serialization.

A collection of Product objects is stored in a file named products.dat.


##### Classes and Interface
###### Product

###### Attributes:

- id

- name

- brand

- price

- description

- stock

######  Implements Serializable

###### IProduitMetier (Interface)

 Declares business methods:

- add(Product p)

- getAll()

- findById(long id)

- delete(long id)

- saveAll()

###### MetierProduitImpl

- Implements IProduitMetier

- Manages a list of products

- Handles file loading and saving (products.dat)

###### Application

- Contains the main method

- Provides a menu-driven console interface
  
## Getting into Practice: Handling Exceptions
### 2.1 Calculator with Error Handling
#### Description

This exercise consists of creating a calculator that safely handles common errors.

###### Implemented Methods

- divide(a, b)

  Displays an error if division by zero occurs

- convertToNumber(text)

  Displays an error if the string is not numeric

- calculate(operation, a, b)

  Supports +, -, *, /

  Displays an error for unsupported operations

All errors are handled without stopping the program.



### 2.2 Custom Exception – TooFastException
#### Description

This exercise demonstrates the creation and use of a custom checked exception.

##### Classes
###### TooFastException

-  Extends Exception

-  Displays a message including the speed value

###### Vehicle

-  Method testSpeed(int speed)

-  Throws TooFastException if speed > 90

-  The main method tests:

      . A valid speed

      . A speed that triggers the exception

-  Displays the call stack using printStackTrace()

# Conclusion

This practical work allowed us to apply several important Java concepts, including:

* File and directory manipulation

Object serialization and persistence

Interface-based design

Menu-driven console applications

Robust exception handling

Custom exception creation and propagation

Overall, this project helped reinforce both technical skills and good programming practices in Java Object-Oriented Programming.
