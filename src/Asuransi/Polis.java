package Asuransi;

import java.util.Date;

public class Polis {
	private String nomor;
	private Date masaBerlaku;
	private String jenisAsuransi;
	private Premi premi;
	public String getNomor() {
		return nomor;
	}
	public Premi getPremi() {
		return premi;
	}
	public void setPremi(Premi premi) {
		this.premi = premi;
	}
	public void setNomor(String nomor) {
		this.nomor = nomor;
	}
	public Date getMasaBerlaku() {
		return masaBerlaku;
	}
	public void setMasaBerlaku(Date masaBerlaku) {
		this.masaBerlaku = masaBerlaku;
	}
	public String getJenisAsuransi() {
		return jenisAsuransi;
	}
	public void setJenisAsuransi(String jenisAsuransi) throws Exception {
		if (!(jenisAsuransi == "Kematian" || jenisAsuransi == "Kecelakaan" || jenisAsuransi == "Penuh"))
			throw new Exception ("Jenis hanya Kematian, Kecelakaan dan Penuh");
		this.jenisAsuransi = jenisAsuransi;
	}
}
