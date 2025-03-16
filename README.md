🔴 Problems in WithoutCreator.java
❌ No Separation of Concerns – WithoutCreator directly creates a Product, mixing UI and logic.
❌ Hard to Maintain – If we change Product's constructor, multiple places need modification.
❌ Code Duplication – Every time a Product is created, we must repeat the constructor logic.



✅ Benefits of WithCreator.java (Using Creator Principle)
✔ Encapsulation – Centralizes object creation in ProductFactory.
✔ Loose Coupling – WithCreator does not directly instantiate Product.
✔ Better Maintainability – Changing the creation logic (e.g., validations, logging) only requires updating ProductFactory.
✔ Code Reusability – ProductFactory can be used throughout the application.



Final Comparison
Feature	Without Creator ❌	With Creator ✅
Encapsulation	No	Yes
Coupling	Tight (Direct creation)	Loose (Delegated creation)
Code Duplication	High	None
Maintainability	Poor	Easy to modify
Scalability	Harder	Easier