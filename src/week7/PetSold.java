package week7;

public class PetSold extends ItemSold {
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;

    public boolean getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(boolean isVac) {
        isVaccinated = isVac;
    }

    public boolean getIsNeutered() {
        return isNeutered;
    }

    public void setIsNeutered(boolean isNeut) {
        isNeutered = isNeut;
    }

    public boolean getIsHousebroken() {
        return isHousebroken;
    }

    public void setIsHousebroken(boolean isHb) {
        isHousebroken = isHb;
    }
}

