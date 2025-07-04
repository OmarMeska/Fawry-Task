# EcommerceApp

A Java-based console application developed to solve the **Fawry Full Stack Development Internship Challenge**. This system simulates a basic e-commerce process including product definition, cart management, checkout, and shipping functionalities.

---

## 🚀 Challenge Requirements Coverage

This application covers the following core features from the challenge:

- ✅ Define products with **name**, **price**, and **quantity**.
- ✅ Support for **perishable products** (e.g., Cheese, Biscuits) and **non-perishable products** (e.g., TV, Mobile).
- ✅ Support for **shippable products** that provide **weight** and **non-shippable** ones.
- ✅ Customers can:
  - Add items to a cart with specific quantity (not exceeding stock).
  - Checkout the cart, with the console printing:
    - Order subtotal
    - Shipping fees
    - Paid amount (subtotal + shipping)
    - Customer's remaining balance
  - Receive errors if:
    - Cart is empty
    - Insufficient balance
    - Product is out of stock or expired
- ✅ Shippable items are sent to `ShippingService`, using an interface with:
  - `String getName()`
  - `double getWeight()`

---

## 📦 Project Structure

- `src/` – Source code
- `test/` – Unit test files (if any)
- `build.xml` – Apache Ant build script
- `nbproject/` – NetBeans project configuration

---

## 🧪 Usage Example

```java
cart.add(cheese, 2);
cart.add(tv, 3);
cart.add(scratchCard, 1);
checkout(customer, cart);
```

Expected console output:

```
** Shipment notice **
2x Cheese        400g
1x Biscuits      700g
Total package weight 1.1kg

** Checkout receipt **
2x Cheese        200
1x Biscuits      150
----------------------
Subtotal         350
Shipping         30
Amount           380
```

---

## ✅ Requirements

- Java JDK 8 or later
- NetBeans IDE (preferably 12.x or newer)
- Apache Ant (built-in with NetBeans)

---

## 📌 Notes

- No external libraries are used.
- This project is built to match the Fawry Internship challenge, following OOP design principles and clean structure.

---

## 👨‍💻 Author

Omar Meska  
🗓️ Created: July 2025  
🎓 Faculty of Electronic Engineering, Menoufia University
