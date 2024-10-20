# LMS_Of_VIT_Melb

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [UML Class Diagram](#uml-class-diagram)
- [Installation](#installation)
- [Running the Project](#running-the-project)
- [Folder Structure](#folder-structure)
- [Classes and Relationships](#classes-and-relationships)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Project Overview
LMS_Of_VIT_Melb is a **Library Management System (LMS)** for managing the operations of a library, including:
- Managing books, patrons, employees, and loans.
- Handling reservations, fines, and notifications.
- Enabling library staff to issue and return books.
- Providing patrons with the ability to reserve books.
- Managing fines for overdue books.

This system is developed in **Java** using the **NetBeans IDE** and follows object-oriented programming principles. It supports different classes such as `Book`, `Patron`, `Employee`, `Loan`, `Reservation`, `Fine`, and more, with relationships between them like aggregation and association.

## Features
- **Library Management**: Add, update, and remove books, patrons, and employees.
- **Book Loan Management**: Issue, return, and track books.
- **Reservations**: Manage book reservations.
- **Fines**: Calculate and manage fines for overdue books.
- **Notifications**: Notify patrons about reservation status or overdue books.

## Technologies Used
- **Java**: Programming language for development.
- **NetBeans IDE**: Integrated Development Environment used for coding.
- **UML**: Used to design and structure the system.
  
## UML Class Diagram
This project is designed based on the following UML structure:

- **Library** ↔ **Book**: Aggregation (Library contains multiple books).
- **Library** ↔ **Patron**: Aggregation (Library manages multiple patrons).
- **Library** ↔ **Employee**: Aggregation (Library employs multiple staff).
- **Patron** ↔ **Loan**: Association (A patron can have multiple loans).
- **Loan** ↔ **Fine**: Composition (A loan may generate a fine).

The full UML diagram can be found in the [UML_diagrams](UML_diagrams/) directory.

## Installation
Follow the steps below to set up the project locally:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Mudasirrr/LMS-VIT-PROJECT.git
   cd LMS_Of_VIT_Melb
