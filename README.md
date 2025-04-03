# Zero-One Square Pattern Generator

This Java program generates a square pattern of alternating 1s and 0s, resembling a checkerboard. The user inputs the size of the square, and the program prints the corresponding pattern.

## Code Overview
The program takes an integer input from the user, representing the size of the square. It then uses nested `for` loops to iterate through rows and columns, determining whether to print `1` or `0` based on the sum of row and column indices.

---

## Code Explanation
```java
package number_patterns;

import java.util.Scanner;

public class Zero_One_Square
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);  // Creating a Scanner object for user input
        System.out.println("Enter the Size");
        int n = s.nextInt();  // Taking an integer input from the user
        
        for(int i = 0; i < n; i++) // Outer loop for rows
        {
            for(int j = 0; j < n; j++) // Inner loop for columns
            {
                if((i + j) % 2 == 0)  // Condition to check even sum of indices
                    System.out.print(1 + " "); // Print 1 if sum is even
                else
                    System.out.print(0 + " "); // Print 0 if sum is odd
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
```

---

## Breakdown of Components
### 1. **Package Declaration**
```java
package number_patterns;
```
- The program is placed inside the `number_patterns` package.

### 2. **Importing Scanner Class**
```java
import java.util.Scanner;
```
- `Scanner` is imported from the `java.util` package to take user input.

### 3. **Scanner Class**
```java
Scanner s = new Scanner(System.in);
```
- The `Scanner` class is used to read input from the keyboard.
- `System.in` specifies that input is taken from the console.
- `s.nextInt()` reads an integer value entered by the user.

### 4. **Variable Declaration**
```java
int n = s.nextInt();
```
- `n` stores the user-input size of the square.

### 5. **Outer Loop (Rows)**
```java
for(int i = 0; i < n; i++)
```
- Runs from `0` to `n-1`, controlling the number of rows.

### 6. **Inner Loop (Columns)**
```java
for(int j = 0; j < n; j++)
```
- Runs from `0` to `n-1`, controlling the number of columns in each row.

### 7. **Condition for Printing 1 or 0**
```java
if((i + j) % 2 == 0)
    System.out.print(1 + " ");
else
    System.out.print(0 + " ");
```
- If the sum of row (`i`) and column (`j`) indices is even, print `1`.
- If the sum is odd, print `0`.

### 8. **Printing New Line for Each Row**
```java
System.out.println();
```
- Moves to the next line after printing a row.

---

## Sample Output
**Example Input:**
```
Enter the Size
5
```

**Output:**
```
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
```

---

## Key Features
- Uses `Scanner` for user input.
- Implements nested `for` loops to control row and column iteration.
- Uses an `if-else` condition to print 1 or 0.
- Displays an alternating pattern similar to a checkerboard.

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Zero_One_Square.git
```
