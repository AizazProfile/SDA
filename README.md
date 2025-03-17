<h1>Problems in Without Creator</h1>
<ul>
<li>No Separation of Concerns – WithoutCreator directly creates a Product, mixing UI and logic.</li>
<li>Hard to Maintain – If we change Product's constructor, multiple places need modification.</li>
<li>Code Duplication – Every time a Product is created, we must repeat the constructor logic.</li>
</ul>

<h2>Benefits of WithCreator.java (Using Creator Principle)</h2>

<ul>
<li>Encapsulation – Centralizes object creation in ProductFactory.</li>
<li>Loose Coupling – WithCreator does not directly instantiate Product.</li>
<li>Better Maintainability – Changing the creation logic (e.g., validations, logging) only requires updating ProductFactory.</li>
<li>Code Reusability – ProductFactory can be used throughout the application.</li>
</ul>

<h3>Final Comparison</h3>

<ul>
<li>Feature	Without Creator ❌	With Creator ✅</li>
<li>Encapsulation	No	Yes</li>
<li>Code Duplication	High	None</li>
<li>Maintainability	Poor	Easy to modify</li>
<li>Scalability	Harder	Easier</li>
</ul
