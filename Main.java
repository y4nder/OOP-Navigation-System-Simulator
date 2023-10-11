import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        RouteMap routeMap = new RouteMap();
        Map map = new Map();
        routeMap.setStart(map.generateMap());
        // System.out.print("Input speed: ");
        // double speed = scan.nextDouble();
        List<String> routes = routeMap.getRoutes(60.0);

        for(int i = 0; i < routes.size(); i++){
            System.out.print("\nRoute " + (i+1) + ":");
            if(i == 0) System.out.print("(default)\n");
            System.out.println(routes.get(i));
        }

  
    }
}
