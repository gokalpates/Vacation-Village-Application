package DB.DAO;

import Business.Model.User.EquipPerson;
import DB.DbContext;

public class EquipPersonDAO {

    public void addEquipPerson(EquipPerson equipPerson){
        String sql ="insert into equip_person values('" + equipPerson.getID() + "','" + equipPerson.getSsn() + "','" +
                equipPerson.getName() + "','" + equipPerson.getSurname() + "','" + equipPerson.getPhoneNum() + "');";
        DbContext.ExecuteQuery(sql);
    }

    public void removeEquipPerson( String equipPersonID){
        //delete equipment used by the animator
        String sql = "delete from equipment where eSSN = '" + equipPersonID + "';";
        DbContext.ExecuteQuery(sql);

        sql = "delete from equip_person where empID = '" + equipPersonID + "';";
        DbContext.ExecuteQuery(sql);
    }
}
