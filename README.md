# Minecraft Quality Of Life Mod

Small additions to make Minecraft experience less tedious and more fun.

--------------------------------------------------
ABOUT
--------------------------------------------------

This is a Minecraft 1.21.10 Fabric mod that is meant to make the Minecraft experience all the more pleasant by adding functionalities to the base game without fundamentally changing the gameplay.

--------------------------------------------------
FEATURES
--------------------------------------------------

- Auto replaces tools when they break, with replacements from inventory, ignoring moving tools already in the hotbar, also autoswitches based on type of block broken with proper tool (breaking a piece of dirt with a shovel/axe/pickaxe will replace the broken tool with a shovel)
- Allows sorting items in inventory while ignoring items in players' hotbar
- Shows the coordinates of players and their biomes
- Shows a numeric representation of armor health points in the HUD
- Shows a mob health bar when looking at them

--------------------------------------------------
TECH STACK
--------------------------------------------------

- Language: Java 21
- Framework: Fabric API 1.21.10
- Build Tool: Gradle + Fabric Loom

--------------------------------------------------
SETUP / INSTALLATION
--------------------------------------------------

Requirements:
- Java 21+
- Fabric Loader + Fabric API

Steps:
1. Clone the repo:
   `git clone https://github.com/ktran112/Minecraft_Quality_of_Life_Mod`
2. `cd` into the root of the repo
3. Run `./gradlew runClient` to start Minecraft with our mod

--------------------------------------------------
FUTURE IMPROVEMENTS
--------------------------------------------------

- Making a compass that can be set to any location when right clicked while holding
- Show damage numbers when hitting enemies, different colour based on normal or critical damage
- Delete slot in inventory to dispose of junk items
- Button or hotkey to sort chests by type or name
- Quick stack matching items into nearby chests
- Show text when you pick up items, ex: “+5 Iron Ingot”
- Shift-click to craft the maximum amount of an item
- Visualize how a block will rotate before placing it
- Draw path lines for bows, crossbows, or tridents
- Show active effect, crit chance, or tool type in the crosshair
- Option to wrap around or skip empty slots when scrolling through hotbar
- Option to turn sprint to toggle or hold
- Mark your death location and restore inventory on claiming grave

--------------------------------------------------
TEAM
--------------------------------------------------

- Shayan Zahedanaraki – Term 6 Developer / Tool auto switch & inventory sort
- Melina Bazrafkan – Term 1 Developer / Debugged tool auto switch & worked on making compass feature
- Salahuddin Yunus - Term 1 Developer / Debugged inventory sort & worked on damage numbers
- Kiet Tran - Term 1 Developer / Armor Hud
- Nafiz Siddique - Term 1 Developer / Mob Health Bar
