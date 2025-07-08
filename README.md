E-Commerce System 

This is a console-based Java application that simulates an e-commerce checkout system. 

** Features**

 Define products with:
- `name`, `price`, and `quantity`

 Product types:
- **Expirable** (e.g., Cheese, Biscuits)
- **Non-expirable** (e.g., TV, Mobile)
- **Shippable** products provide `getName()` and `getWeight()` methods

 Cart Management:
- Add items to cart
- Validate stock before adding
- Prevent expired items from being added

 Checkout Functionality:
- Calculates:
  - **Subtotal**
  - **Shipping fees** (`10 EGP/item`)
  - **Total paid**
  - **Customer remaining balance**
- Sends all shippable items to `ShippingService`
- Handles errors like:
  - Empty cart
  - Expired products
  - Out of stock
  - Insufficient balance
 
  Use Cases Covered

1.  **Normal Checkout** – with both expirable and shippable items  
2.  **Expired Product** – throws error during checkout  
3.  **Out of Stock** – throws error if requested quantity exceeds available  
4.  **Insufficient Balance** – prevents checkout  
5.  **Empty Cart** – throws error if cart is empty

 Project Structure

- `Product` – abstract class with name, price, quantity  
- `Cheese`, `Biscuits` – expirable and shippable products  
- `TV`, `Mobile` – non-expirable, some are shippable  
- `Customer` – has name and balance, can pay  
- `Cart` – holds product-quantity pairs  
- `CheckOut` – core checkout logic with validations  
- `ShippingService` – prints shipment details  
- `Interfaces:`  
  - `Expirable`: defines `isExpired()`  
  - `Shippable`: defines `getName()` and `getWeight()`
    
