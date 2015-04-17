package Asuransi;
import java.util.Date;
public class Accident {
	private String kategori;
	private Date waktu;
	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) throws Exception {
		if (!(kategori == "Kematian" || kategori == "Kecelakaan" || kategori == "Penuh"))
			throw new Exception ("Jenis hanya Kematian, Kecelakaan dan Penuh");
		this.kategori = kategori;
	}
	public Date getWaktu() {
		return waktu;
	}
	public void setWaktu(Date waktu) {
		this.waktu = waktu;
	}
	
}
