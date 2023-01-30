package views;

import java.util.ArrayList;

import models.Restapi;
import models.Vehicle;

public class Maincon {
    Restapi restapi;
    public Maincon(Restapi restapi){
        this.restapi= restapi;
        this.start();
    }

public void start(){
    ArrayList<Vehicle> vehicles=this.restapi.getVehicles();
    for(Vehicle vehicle:vehicles ){
        System.out.printf("%s\n",
        vehicle.licenseplate );
    }
}
}
