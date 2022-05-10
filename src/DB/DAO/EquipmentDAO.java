package DB.DAO;

import Business.Model.Equipment;
import DB.DbContext;

public class EquipmentDAO {
    public void addEquipment(Equipment equipment){
        String sql = "insert into equipment values('" + equipment.getEssn() + "','" + equipment.getName() + "','" +
                equipment.getPurpose() + "');";
        DbContext.ExecuteQuery(sql);
    }
}