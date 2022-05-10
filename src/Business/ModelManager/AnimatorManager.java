package Business.ModelManager;

import Business.Model.User.Animator;
import DB.DAO.AnimatorDAO;

import java.util.Objects;

public class AnimatorManager {

    private AnimatorDAO animatorDAO;

    public AnimatorManager(AnimatorDAO animatorDAO) {
        this.animatorDAO = animatorDAO;
    }

    public void addAnimator(Animator animator){
        animatorDAO.addAnimator(animator);
    }

    public void removeAnimator(String animatorID){
        animatorDAO.removeAnimator(animatorID);
    }

    public boolean authenticateAnimator(String phoneNum, String password)
    {
        Integer ID = animatorDAO.getIDFromPhoneNumber(phoneNum);
        if(Objects.equals(password, animatorDAO.getPassword(ID))){
            return true;
        }

        return false;
    }
}
