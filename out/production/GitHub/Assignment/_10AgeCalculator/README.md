# Age Calculator (Java Date Comparison)

## 📅 Overview
A Java console application that calculates a person's age by comparing their birth date with the current date, using `SimpleDateFormat` for parsing and `Calendar` for date manipulation.

## ✨ Key Features
- **Date Validation**: Ensures proper `yyyy-MM-dd` format
- **Precise Age Calculation**: Considers year, month, and day differences
- **Edge Case Handling**: Detects future dates (unborn cases)
- **User-Friendly**: Clear instructions and error messages

## 🛠 Implementation Details

### Core Components
| Component               | Purpose                                  |
|-------------------------|------------------------------------------|
| `SimpleDateFormat`      | Parses user input into Date objects      |
| `Calendar`              | Provides date comparison functionality   |
| Recursive Error Handling| Restarts on invalid input                |

### Age Calculation Logic
1. **Year Difference**: Base calculation
2. **Month Adjustment**:
    - If birth month hasn't occurred yet this year → subtract 1 year
3. **Day Adjustment**:
    - If same month but birth day hasn't occurred → subtract 1 year

## 🚀 Usage Example
```plaintext
Enter birth date (yyyy-MM-dd): 
1990-05-20
Age: 33

Enter birth date (yyyy-MM-dd):
2026-01-01
The person hasn't been born yet.
