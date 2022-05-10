package Business.ModelManager;

import Business.Model.User.EquipPerson;
import DB.DAO.EquipPersonDAO;

public class EquipPersonManager {

    private EquipPersonDAO equipPersonDAO;

    public EquipPersonManager(EquipPersonDAO equipPersonDAO) {
        this.equipPersonDAO = equipPersonDAO;
    }

    public void addEquipPerson(EquipPerson equipPerson){
        equipPersonDAO.addEquipPerson(equipPerson);
    }

    public void removeEquipPerson(String equipPersonID){
        equipPersonDAO.removeEquipPerson(equipPersonID);
    }
}
