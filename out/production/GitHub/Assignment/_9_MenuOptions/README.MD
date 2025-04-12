# Product Manager (Swing GUI)

## 🖥️ System Overview
A Java Swing application for managing products through a graphical user interface (JOptionPane dialogs). Provides full CRUD functionality with input validation and error handling.

## 🌟 Key Features
- **GUI Interface**: Uses Swing's `JOptionPane` for all user interactions
- **Product Management**:
    - Add new products with quantities
    - Update existing product details
    - Remove products from inventory
    - View complete product list
- **Data Validation**:
    - Prevents invalid quantity inputs
    - Blocks operations on default placeholder products
- **User Experience**:
    - Persistent menu until explicit exit
    - Contextual success/error messages
    - Default values for smoother navigation

## 🛠️ Technical Implementation
| Component            | Purpose                                  |
|----------------------|------------------------------------------|
| `JOptionPane`        | Handles all user input/output dialogs    |
| `HashMap<String,Int>`| Stores product-name:quantity pairs       |
| Recursive Validation | Re-prompts for invalid numeric inputs   |
| Null Handling        | Graceful exit on window close/cancel     |

## 📋 Operation Flow
1. **Main Menu** appears with 5 options
2. User selects action via dropdown
3. System guides through operation with sequential dialogs
4. Returns to main menu after each operation
5. Exit option terminates application cleanly

## 🚀 Usage Example
1. Launch program → See main menu
2. Select "Add" → Enter: "Laptop", Quantity: 5
    - System: "Product added"
3. Select "List" → See "Laptop" in product list
4. Select "Exit" → Program closes

## 📌 Key Code Strengths
- **Separation of Concerns**: Dedicated methods for product selection (`selectionProduct`) and quantity input (`takeCount`)
- **Error Prevention**: Recursive retry for invalid quantity inputs
- **State Management**: Real-time updates to product list array
- **User Guidance**: Clear dialog titles and contextual messages

## ⚠️ Note
This implementation uses in-memory storage (HashMaps) - product data doesn't persist between runs. Focuses on demonstrating:
- Swing GUI programming
- Map-based data handling
- Dialog-driven workflow