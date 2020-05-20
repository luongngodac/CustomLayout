package vn.edu.ntu.ngodacluong.customlayout;

public class Model
{
    String txtName, txtDateOfBirth, txtPhoneNumber;

    public Model(String txtName, String txtDateOfBirth, String txtPhoneNumber) {
        this.txtName = txtName;
        this.txtDateOfBirth = txtDateOfBirth;
        this.txtPhoneNumber = txtPhoneNumber;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtDateOfBirth() {
        return txtDateOfBirth;
    }

    public void setTxtDateOfBirth(String txtDateOfBirth) {
        this.txtDateOfBirth = txtDateOfBirth;
    }

    public String getTxtPhoneNumber() {
        return txtPhoneNumber;
    }

    public void setTxtPhoneNumber(String txtPhoneNumber) {
        this.txtPhoneNumber = txtPhoneNumber;
    }
}

