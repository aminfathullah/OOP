package Asuransi;

public class Premi {
	private String kode;
	private int nominal;
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) throws Exception {
		if (kode.length() != 4 )
			throw new Exception("Masukkan 4 Digit kode Premi");
		this.kode = kode;
	}
	public int getNominal() {
		return nominal;
	}
	public void setNominal(int nominal) throws Exception  {
		for (char c: ("" + nominal).toCharArray())
			if (Character.isDigit(c))
				throw new Exception("Nominal Harus angka");
		this.nominal = nominal;
	}
	
}
