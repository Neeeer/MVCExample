package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        String name = "Controller1 ";
        int n = 1; 
        Controller1 c1 = new Controller1(model, name); // Create first controller
        name = "Controller2 ";
        Controller2 c2_1 = new Controller2(model, name + n, 200); // Create second 1 controller
        n++;
        Controller2 c2_2 = new Controller2(model, name + n, 360); // Create second 2 controller
        n++;
        Controller2 c2_3 = new Controller2(model, name + n, 520); // Create second 3 controller
        n++;
        Controller2 c2_4 = new Controller2(model, name + n, 680); // Create second 4 controller
        n++;
        Controller2 c2_4 = new Controller2(model, name + n, 780); // Create second 4 controller
        
    } // main
  
} // Main
