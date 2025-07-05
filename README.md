# String Calculator - TDD Kata (Java)

This project is a TDD-based implementation of the **String Calculator Kata** using Java and JUnit 5.  
Each feature is added incrementally through clean code, continuous testing, and small commits.

---

## ✅ Version 0 - Empty String Returns 0

### ✔️ Implemented:
- Basic method: `add(String input)`
- Returns 0 when the input is an empty string (`""`)
- First unit test to verify behavior

### 📁 Files:
- `StringCalculator.java`
- `StringCalculatorTest.java`

---

## ✅ Version 1 – One Number Returns That Number

### ✔️ Features Implemented
- Enhanced `add(String input)` to return the number itself if only one number is provided
- Added test cases for various single-number inputs (e.g., `"5"`, `"7"`)

---

## ✅ Version 2 – Two Numbers, Comma-Separated

### ✔️ Features Implemented
- Updated `add(String input)` to handle **two comma-separated numbers**
- Returns their sum (e.g., `"7,5"` returns `12`)
- Added multiple test cases for 2-number combinations

---

## ✅ Version 3 – Handle Any Amount of Numbers

### ✔️ Features Implemented
- Updated `add(String input)` to handle any number of comma-separated numbers
- Correctly sums inputs like `"1,2,3,4"` and `"90,38,58,40"`
- Improved test coverage to include multiple inputs of various lengths

---

## ✅ Version 4 – Support New Lines as Delimiters

### ✔️ Features Implemented
- Enhanced `add(String input)` to support newline (`\n`) as a valid delimiter alongside commas
- Correctly parses inputs like `"1\n2,3"` and `"90\n32\n6"`
- Added tests to verify mixed use of comma and newline delimiters

---

## ✅ Version 5 – Support Custom Delimiter (`//;\n1;2`)

### ✔️ Features Implemented
- Added support for a **single-character custom delimiter** defined at the start of the input
- Input format: `"//[delimiter]\n[numbers]"`, e.g., `"//;\n1;2"` uses `;` as the delimiter
- Fallback to default delimiters `,` and `\n` if no custom delimiter is provided
- Includes unit tests to verify correct parsing and summing

---

### ✔️ Features Implemented
- Extended custom delimiter support to allow **multi-character delimiters** enclosed in brackets
- Handles inputs like `"//[***]\n1***2***3"` and sums correctly
- Supports any length delimiter surrounded by brackets (e.g. `"[***]"`, `"[abc]"`)
- Regex-escaped the delimiters to handle special characters safely
- Added unit tests to verify the bracketed delimiter behavior

---

## 🔧 How to Run Tests

Make sure you have JDK 17+ and Maven.  
From terminal:

```bash
   mvn test
```

## 🔄 Progress Log

| Version | Description                                           |
|---------|-------------------------------------------------------| 
| 0       | Empty string returns 0                                |
| 1       | One number returns the number                         |
| 2       | Two comma-separated numbers supported                 |
| 3       | Handle any amount of comma-separated numbers          |
| 4       | Support newline (\n) as additional delimiter          |
| 5       | Support custom delimiter using //;\n1;2               |
| 6       | Support multi-character bracketed delimiters //[***]  |
| ...     | (To be updated in future commits)                     |
