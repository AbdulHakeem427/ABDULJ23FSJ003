package edu.disease.asn2;

import java.util.UUID;

/**
 * 
 * @author ABDUL HAKEEM
 * 
 * The ManagerForDisease interface represents a system for managing diseases.
 * It provides methods to add new diseases to the system and retrieve disease information.
 */
public interface ManagerForDisease {

    /**
     * Adds a new disease to the system with the specified information.
     *
     * @param name          The name of the disease.
     * @param infectious    Indicates whether the disease is infectious (true) or not (false).
     * @return              The newly created Disease object.
     */
    public Disease addDisease(String name, boolean infectious);

    /**
     * Retrieves disease information based on its unique disease ID.
     *
     * @param diseaseId     The unique identifier of the disease to retrieve.
     * @return              The Disease object associated with the given disease ID, or null if not found.
     */
    public Disease getDisease(UUID diseaseId);
}
