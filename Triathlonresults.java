/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.triathlonresult;

/**
 *
 * @author user
 */
public class Triathlonresult {

    public static void main(String[] args) {
    // Attributes, getters, setters, constructor

    public void calculateTotalTime() {
        // Calculate total time
    }

    public void displayDetails() {
        // Display basic details
    }
}

public class EliteParticipant extends TriathlonResults {
    // SponsorName attribute, getter, setter

    @Override
    public void displayDetails() {
        // Display details including sponsor
    }
}

public class BeginnerParticipant extends TriathlonResults {
    // No additional attributes
}

public class TriathlonMain {
    public static void main(String[] args) {
        // Create participant objects
        // Calculate total times
        // Determine fastest times
        // Sort results
        // Handle duplicate times
        // Display results
 
    }
}
