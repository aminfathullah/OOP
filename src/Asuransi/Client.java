package Asuransi;

public class Client {
	private String nama;
	private String noID;
	private Accident accident;
	private Polis polis;
	public Polis getPolis() {
		return polis;
	}
	public void setPolis(Polis polis) {
		this.polis = polis;
	}
	public Accident getAccident() {
		return accident;
	}
	public void setAccident(Accident accident) {
		this.accident = accident;
	}
	public String getNama() {
		return nama;
	}
	public Client() {
	}
	public void setNama(String nama) throws Exception {
		for (char c: nama.toCharArray())
			if (Character.isDigit(c))
				throw new Exception ("Nama hanya huruf");
		this.nama = nama;
	}
	public String getNoID() {
		return noID;
	}
	public void setNoID(String noID) {
		this.noID = noID;
	}
	
}
