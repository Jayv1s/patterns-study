# FACTORY
#### Programming to an Interface, not an implementation.

------

### WHAT IS?

---
It's a creational pattern that provides interfaces to create objects in a superclass but maintains the possibility for subclasses to alter the type of objects that will be created.

### WHY?

---
Instead of having many objects with the same implementation, you can abstract that implementation in a way that allows you to scale without replicating the code or object creation.

For example, imagine you're developing an app to handle household expenses, and you have three animals: a cat, a dog, and a fish.

All three animals are entities in your application, and they all have the same "behaviors" (think of these as functions): eat and veterinary treatment. They also share the same attributes: race, age, and name.

Now, consider the future addition of a new animal like a "bird" or a "horse," and so on. This could result in messy code with many duplications!

### HOW?

---
By removing the object creation using the keyword `new()` and creating an abstraction that has a *factory method*, which implements the common interface of your entities, you avoid duplication of instantiating a new object every time. Additionally, you centralize the creation logic.