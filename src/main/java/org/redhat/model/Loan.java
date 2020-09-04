package org.redhat.model;

public class Loan {

    private String siren;
    private double ca;
    private double nbEmployees;
    private int age;
    private boolean publicSupport;
    private String typeProjet;
    private double amount;
    private Notation notation;
    private boolean eligible = false;
    private String msg;
    private Bilan bilan;
	public Loan() {
	}
    

    /**
     * @return String return the siren
     */
    public String getSiren() {
        return siren;
    }

    /**
     * @param siren the siren to set
     */
    public void setSiren(String siren) {
        this.siren = siren;
    }

    /**
     * @return double return the ca
     */
    public double getCa() {
        return ca;
    }

    /**
     * @param ca the ca to set
     */
    public void setCa(double ca) {
        this.ca = ca;
    }

    /**
     * @return double return the nbEmployees
     */
    public double getNbEmployees() {
        return nbEmployees;
    }

    /**
     * @param nbEmployees the nbEmployees to set
     */
    public void setNbEmployees(double nbEmployees) {
        this.nbEmployees = nbEmployees;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return boolean return the publicSupport
     */
    public boolean isPublicSupport() {
        return publicSupport;
    }

    /**
     * @param publicSupport the publicSupport to set
     */
    public void setPublicSupport(boolean publicSupport) {
        this.publicSupport = publicSupport;
    }

    /**
     * @return String return the typeProjet
     */
    public String getTypeProjet() {
        return typeProjet;
    }

    /**
     * @param typeProjet the typeProjet to set
     */
    public void setTypeProjet(String typeProjet) {
        this.typeProjet = typeProjet;
    }

    /**
     * @return double return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return Notation return the notation
     */
    public Notation getNotation() {
        return notation;
    }

    /**
     * @param notation the notation to set
     */
    public void setNotation(Notation notation) {
        this.notation = notation;
    }


	@Override
	public String toString() {
		return "Loan [age=" + age + ", amount=" + amount + ", bilan=" + bilan + ", ca=" + ca + ", elligible="
				+ eligible + ", msg=" + msg + ", nbEmployees=" + nbEmployees + ", notation=" + notation
				+ ", publicSupport=" + publicSupport + ", siren=" + siren + ", typeProjet=" + typeProjet + "]";
	}


    /**
     * @return boolean return the eligible
     */
    public boolean isEligible() {
        return eligible;
    }

    /**
     * @param elligible the eligible to set
     */
    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    /**
     * @return String return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


    /**
     * @return Bilan return the bilan
     */
    public Bilan getBilan() {
        return bilan;
    }

    /**
     * @param bilan the bilan to set
     */
    public void setBilan(Bilan bilan) {
        this.bilan = bilan;
    }

}