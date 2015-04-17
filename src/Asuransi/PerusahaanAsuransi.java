package Asuransi;

public class PerusahaanAsuransi {
	private String namaPerusahaan;
	private Polis polis;

	public Polis getPolis() {
		return polis;
	}

	public void setPolis(Polis polis) {
		this.polis = polis;
	}

	public PerusahaanAsuransi(String namaPerusahaan) {
		this.namaPerusahaan = namaPerusahaan;
	}

	public String getNamaPerusahaan() {
		return namaPerusahaan;
	}

	public void setNamaPerusahaan(String namaPerusahaan) {
		this.namaPerusahaan = namaPerusahaan;
	}	
}
