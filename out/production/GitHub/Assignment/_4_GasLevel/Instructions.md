# Gasoline Level - Challenge

## Description
Program that checks the level of a gasoline tank (capacity: 70 liters) and displays its current status.

**Input:**
- Current tank measurement (can be `double` or `int`)

**Output:**
- Status according to these ranges:
    - 70 L → "Full tank"
    - 60-69.99 L → "Almost full"
    - 40-59.99 L → "3/4 tank"
    - 35-39.99 L → "Half tank"
    - 20-34.99 L → "Sufficient"
    - 1-19.99 L → "Insufficient"

## Example
**Input:** 42.5  
**Output:** "3/4 tank"