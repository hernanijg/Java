# 🔢 Count and Say - LeetCode Solution

## 🚀 Overview
Elegant Java solution for LeetCode's "Count and Say" problem using recursive approach with `StringBuilder` optimization.

## 🧩 Problem Statement
Generate the nth term in the count-and-say sequence where:
- n = 1 → "1"
- n > 1 → Describe the previous term

## 💡 Key Features
- **Recursive Logic**: Clean self-referential implementation
- **Optimal Building**: Uses `StringBuilder` for O(n) string operations
- **Base Case Handling**: Direct return for n=1

## 📈 Sequence Examples
| Term | Result    |
|------|-----------|
| 1    | "1"       |
| 2    | "11"      |
| 3    | "21"      |
| 4    | "1211"    |
| 5    | "111221"  |

## ⚡ Performance
| Metric       | Value   |
|-------------|---------|
| Time        | O(2ⁿ)   |
| Space       | O(n)    |

## 🛠 Usage
```java
// Get specific term
String term6 = Solution.countAndSay(6); // "312211"

// Print sequence
for (int i = 1; i <= 5; i++) {
    System.out.println(Solution.countAndSay(i));
}