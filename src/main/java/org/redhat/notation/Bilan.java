package org.redhat.notation;

public class Bilan {
    private String siren;
	private String gg;
	private String ga;
	private String hp;
	private String hq;
	private String hn;
	private String fl;
	private String fm;
	private String dl;
	private String ee;


    public Bilan(){
        
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
     * @return String return the gg
     */
    public String getGg() {
        return gg;
    }

    /**
     * @param gg the gg to set
     */
    public void setGg(String gg) {
        this.gg = gg;
    }

    /**
     * @return String return the ga
     */
    public String getGa() {
        return ga;
    }

    /**
     * @param ga the ga to set
     */
    public void setGa(String ga) {
        this.ga = ga;
    }

    /**
     * @return String return the hp
     */
    public String getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(String hp) {
        this.hp = hp;
    }

    /**
     * @return String return the hq
     */
    public String getHq() {
        return hq;
    }

    /**
     * @param hq the hq to set
     */
    public void setHq(String hq) {
        this.hq = hq;
    }

    /**
     * @return String return the hn
     */
    public String getHn() {
        return hn;
    }

    /**
     * @param hn the hn to set
     */
    public void setHn(String hn) {
        this.hn = hn;
    }

    /**
     * @return String return the fl
     */
    public String getFl() {
        return fl;
    }

    /**
     * @param fl the fl to set
     */
    public void setFl(String fl) {
        this.fl = fl;
    }

    /**
     * @return String return the fm
     */
    public String getFm() {
        return fm;
    }

    /**
     * @param fm the fm to set
     */
    public void setFm(String fm) {
        this.fm = fm;
    }

    /**
     * @return String return the dl
     */
    public String getDl() {
        return dl;
    }

    /**
     * @param dl the dl to set
     */
    public void setDl(String dl) {
        this.dl = dl;
    }

    /**
     * @return String return the ee
     */
    public String getEe() {
        return ee;
    }

    /**
     * @param ee the ee to set
     */
    public void setEe(String ee) {
        this.ee = ee;
    }

	@Override
	public String toString() {
		return "Bilan [dl=" + dl + ", ee=" + ee + ", fl=" + fl + ", fm=" + fm + ", ga=" + ga + ", gg=" + gg + ", hn="
				+ hn + ", hp=" + hp + ", hq=" + hq + ", siren=" + siren + "]";
	}

	public Bilan(String siren, String gg, String ga, String hp, String hq, String hn, String fl, String fm, String dl,
			String ee) {
		this.siren = siren;
		this.gg = gg;
		this.ga = ga;
		this.hp = hp;
		this.hq = hq;
		this.hn = hn;
		this.fl = fl;
		this.fm = fm;
		this.dl = dl;
		this.ee = ee;
	}

}