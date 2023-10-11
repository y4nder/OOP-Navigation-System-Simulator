import java.util.ArrayList;
import java.util.List;

public class RouteMap {
    private Route start;

    public void setStart(Route start){
        this.start = start;
    }

    public List<String> getRoutes(double speed){
        List<String> routes = new ArrayList<>();
        if(start == null ){
            return routes;
        }

        findRoutes(start, "", routes, 0.0, speed);
        return routes;
    }

    public void findRoutes(Route route, String path, List<String> routes, double totalDistance, double speed){
        path += route.getPlaceName();
        totalDistance += route.getDistance();

        if(route.getLeftRoute() == null && route.getRightRoute() == null){
            path += String.format("\n\n- Distance: (%.1f km)", totalDistance);
            path += String.format("\n- Speed: %.1f km/h", speed);
            path += "\n- ETA: " + calculateTime(totalDistance, speed);
            routes.add(path);
            return;
        }

        if(route.getLeftRoute() != null){
            findRoutes(route.getLeftRoute(), path + "\n", routes, totalDistance, speed);
        }
        if(route.getRightRoute() != null){
            findRoutes(route.getRightRoute(), path + "\n", routes, totalDistance, speed);
        }
    }

    private String calculateTime(double distance, double speed){
        String estimatedTime = "";
        double timeInHours = distance / speed;
        int seconds = (int)(timeInHours * 100);
        int hours = seconds/100;
        int minutes = seconds%100;

        if(minutes >= 60){
            hours++;
            minutes = minutes - 60;
        }

        estimatedTime = hours + " hr " + minutes + "min";
        return estimatedTime;
    }
}
