package OOPS;

class Building {
    public int floors;
    public double area;
    public int occupants;

    public Building(int floors, double area, int occupants) {
        this.floors = floors;
        this.area = area;
        this.occupants = occupants;
    }

    public double areaPerPerson() {
        if (occupants != 0) {
            return area / occupants;
        } else {
            return 0; // Avoid division by zero
        }
    }
}

public class BuildingDemo
{
    public static void main(String[] args) {
        Building house = new Building(2, 1500.0, 5); // Creating instance for house
        Building office = new Building(5, 3000.0, 20); // Creating instance for office

        // Displaying area per person for house and office
        System.out.println("Area per person in the house: " + house.areaPerPerson() + " square meters");
        System.out.println("Area per person in the office: " + office.areaPerPerson() + " square meters");
    }    
}


