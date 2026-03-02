# Practice 0 - Intelligent Agents in "The Grid" (Tron)

**Course:** Artificial Intelligence (Inteligencia Artificial)  
**Practice:** Practice 0 - Agent Navigation in Tron  
**University:** Universidad de Huelva  
**Year:** 2025-2026  

## 📄 Description

Agent-based simulation inspired by the Tron universe. A "Light Cycle" must navigate 
a grid from its starting position to the exit portal (S). Every move leaves a trail (.) 
that becomes a permanent wall, so the agent cannot backtrack. Hitting a wall or trail 
ends the game.

## 🎯 Learning Objectives

- Understanding intelligent agent architecture (perception → thinking → action)
- Implementing interactive agents controlled via keyboard input
- Working with grid-based environments and movement constraints
- Understanding the effect of dynamic obstacles (trail) on navigation

## 🗺️ Maps Available

- **MAPA_CALLEJON**: Small trap map with a dead-end corridor
- **MAPA_GRANDE**: Large maze requiring careful navigation

## 🤖 Agents Implemented

- **AgenteInteractivo**: Manual agent controlled via keyboard (N/S/E/O)

## 💻 Technologies Used

- **Language:** Java  
- **IDE:** Eclipse / IntelliJ  
- **Package:** P0  

## 🚀 How to Run

1. Clone the repository
2. Open the project in Eclipse or IntelliJ
3. Run `Tron.java`
4. Select the desired map and agent in `main()`
5. Input directions via console: `N` (North), `S` (South), `E` (East), `O` (West)

## 📁 Project Structure
src/
└── P0/
    ├── Tron.java              # Main simulation loop
    ├── Entorno.java           # Game engine (grid, rules, physics)
    ├── AgenteInteractivo.java # Interactive keyboard-controlled agent
    └── package-info.java

## 🧠 What I Learned

- Agent perception-action cycle design
- Validating moves against dynamic environment state
- Structuring a Java project with packages
- Separating game logic (Entorno) from agent logic
