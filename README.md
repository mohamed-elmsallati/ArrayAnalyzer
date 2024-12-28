# Array Analyzer

Array Analyzer is a practical project for getting started with arrays in Java. This application provides a menu with various options to analyze and manipulate arrays.

## Getting Started

To get started with this project, follow the instructions below.

### Prerequisites

- Java Development Kit (JDK) installed.
- An IDE or text editor (e.g., Visual Studio Code , nvim).
- install extensions for Visual Studio code for java from microsoft. 
[Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).

### Running the Application

1. Open a terminal and navigate to the project directory.
2. Compile the Java source files:
    ```sh
    javac -d bin src/App.java
    ```
3. Run the application:
    ```sh
    java -cp bin App
    ```

## Features

The application provides the following options:

1. **Length of an array after removing duplicate elements**: Enter the size and elements of the array, and the application will display the length of the array after removing duplicates.
2. **Find the sum of two elements in the array which equals to a target integer**: Enter the size, elements of the array, and the target integer. The application will find and display pairs of elements whose sum equals the target.
3. **Merge elements of array A with B by maintaining the sorted order**: Enter the sizes and elements of two arrays. The application will merge them while maintaining the sorted order.
4. **Return the missing letter from an array of increasing letters**: Enter the size and elements of the array of letters. The application will find and display the missing letter.
5. **Check whether an array is negative dominant or not**: Enter the size and elements of the array. The application will check and display whether the array is negative dominant.
6. **Exit**: Exit the application.

## Folder Structure

The workspace contains the following folders:

- [src](http://_vscodecontentref_/2): The folder to maintain source files.
- [lib](http://_vscodecontentref_/3): The folder to maintain dependencies.
- [bin](http://_vscodecontentref_/4): The folder where compiled output files are generated.

> If you want to customize the folder structure, open [settings.json](http://_vscodecontentref_/5) and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view in Visual Studio Code allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## License

This project is licensed under the MIT License.