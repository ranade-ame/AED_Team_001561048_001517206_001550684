/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class LabOrganization extends Organization{

    public LabOrganization(String name, String streetaddress, String city, String country, int zipcode) {
        super(Organization.Type.Lab.getValue(), name, streetaddress, city, country, zipcode);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }
     
   
    
    
}
