### Valorant OOP Simulation (SE416 - Assignment 1, Problem 4)

**Course:** SE 416 - Spring 2025  
**Professor:** Ahmed Tamrawi  
**Assignment:** 1, Problem 4  
**Due Date:** March 7, 2025  

---

## **Project Overview**
This project demonstrates Object-Oriented Programming (OOP) concepts through a **Valorant**-inspired Java simulation.  
The program features agents with abilities, shooting mechanics, damage calculation, weapon upgrades, and health boosts.

The ValorantGame.java main class simulation **validates OOP principles**, including:
- **Inheritance** (Agents inherit from `Agent` class)
- **Polymorphism** (Method overriding with `useAbility()`)
- **Encapsulation** (Health updates within `Agent`)
- **Interfaces** (Gun implements `Shootable`)
- **Data Coupling** (Passing primitive types in `heal()`)
- **Stamp Coupling** (Passing object instances in `upgradeGun()`)

---
## **Project Structure**

`assignment1code/`

`Agent.java`              # Abstract class for all agents

`Duelist.java`            # Inherits from Agent

`Sentinel.java`           # Inherits from Agent

`Initiator.java`          # Inherits from Agent

`Controller.java`         # Inherits from Agent

`Gun.java`                # Implements Shootable interface

`Shootable.java`          # Interface for shooting mechanics

`DuelistWithGun.java`     # Extends Duelist, adds a gun

`WeaponUpgrade.java`      # Demonstrates stamp coupling

`HealthBoost.java`        # Demonstrates data coupling

`ValorantGame.java`       # Main execution file

`README.md`               # Documentation

---


## 🚀 **How to Run**
Follow these steps **inside the project folder** (`assignment1code/`):
 
`rm -rf *.class` (clears old compiled classes before recompiling)

`javac *.java`

`java ValorantGame`

Thanks for looking!!

Once finished, you should see an output like this:

![Image](https://github.com/user-attachments/assets/0d9074a7-cbc5-4e16-89e9-3724263a1874)

---

###
