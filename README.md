# Main
## Summary of Main
The `Main` class is the entry point of the program. It creates an instance of the `RouteMap` class and prompts the user to input a speed. It then calls the `startTravel` method of the `RouteMap` object to begin the travel and display a summary of the traveled path.


# RouteMap
<details>
<summary>Click to expand</summary>

## Summary
The `RouteMap` class is responsible for managing the routes and providing a method to start the travel. It uses the `Map` class to get the starting position and calculates the travel path based on the chosen routes and speed.

### Example Usage
```java
RouteMap routeMap = new RouteMap();
routeMap.startTravel(60);
```

## Code Analysis
### Main functionalities
- The `RouteMap` class manages the routes and provides a method to start the travel.
- It uses the `Map` class to get the starting position.
- It calculates the travel path based on the chosen routes and speed.
- It prints a summary of the travel including the path, distance, speed, and estimated time of arrival.
___
### Methods
- `startTravel(double speed)`: Starts the travel by finding the routes and printing the travel summary.
- `findRoutes(Route route, String path, double totalDistance, double speed)`: Recursively finds the routes and builds the travel path.
- `calculateTime(double distance, double speed)`: Calculates the estimated time of arrival based on the distance and speed.
- `getInput(String instructions)`: Gets user input for choosing the preferred route.
- `crossRoadsAhead(Route route)`: Checks if there are two routes available at the current location.
- `noRoutesAhead(Route route)`: Checks if there are no routes available at the current location.
- `leftRouteIsAvailable(Route route)`: Checks if the left route is available at the current location.
- `rightRouteIsAvailable(Route route)`: Checks if the right route is available at the current location.
___
### Fields
- `start`: The starting route of the travel.
- `map`: An instance of the `Map` class to get the starting position.
- `scan`: A `Scanner` object for getting user input.
___

</details>

# Map
<details>
<summary>Click to expand</summary>

## Summary
The `Map` class represents a map with routes between different locations. It initializes the map with a starting position and sets up the paths between the locations.

## Example Usage
```java
Map map = new Map();
Route startingPosition = map.getStartingPosition();
System.out.println(startingPosition.getPlaceName()); // Output: Cebu City
```

## Code Analysis
### Main functionalities
The main functionality of the `Map` class is to represent a map with routes between different locations. It initializes the map with a starting position and sets up the paths between the locations.
___
### Methods
- `Map()`: Initializes the map with a starting position and sets up the paths between the locations.
- `getStartingPosition()`: Returns the starting position of the map.
___
### Fields
- `startingPosition`: Represents the starting position of the map.
___

