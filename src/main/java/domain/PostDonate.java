package domain;

public class PostDonate {
    private int paidDuration;
    private boolean isDonat;
    private boolean canPublishFreeCopy;
    private String editMode;

    public void setDonatePaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public int getDonatePaidDuration() {
        return paidDuration;
    }

    public void setDonatIsDonate(boolean isDonat) {
        this.isDonat = isDonat;
    }

    public boolean getDonateIsDonate() {
        return isDonat;
    }

    public void setDonatCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public boolean getDonateCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setDonatEditMode(String editMode) {
        this.editMode = editMode;
    }

    public String getDonateEditMode() {
        return editMode;
    }
}
