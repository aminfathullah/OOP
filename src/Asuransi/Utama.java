package Asuransi;

import java.util.Date;

public class Utama {
	public static void main (String args[])
	{
		Premi premi1 = new Premi();
		try {
			premi1.setKode("22222");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			premi1.setNominal(10000);
		} catch (Exception e) {
			
			e.getMessage();
		}
		Polis polis1 = new Polis();
		try {
			polis1.setJenisAsuransi("Asur");
		} catch (Exception e) {
			
			e.getMessage();
		}
		polis1.setMasaBerlaku(new Date());
		polis1.setNomor("1111");
		polis1.setPremi(premi1);
		Accident accident1 = new Accident();
		try {
			accident1.setKategori("Kematian 2");
		} catch (Exception e) {
			
			e.getMessage();
		}
		accident1.setWaktu(new Date());
		Client client1 = new Client();
		try {
			client1.setNama("Amin 2");
		} catch (Exception e) {
			
			e.getMessage();
		}
		client1.setNoID("213423");
		client1.setAccident(accident1);
		client1.setPolis(polis1);
		PerusahaanAsuransi perusahaan1 = new PerusahaanAsuransi("Live");
		perusahaan1.setPolis(polis1);
		print(perusahaan1, client1);
	}
	public static void print(PerusahaanAsuransi perusahaan, Client client) {
		System.out.println("Data Asuransi");
		System.out.println();
		System.out.println();
		System.out.println("A. Perusahaan: ");
		System.out.println("Perusahaan Asuransi: " + perusahaan.getNamaPerusahaan());
		System.out.println();
		System.out.println("B. Klien :");
		System.out.println("Nama Klien: " + client.getNama());
		System.out.println("No Identitas: " + client.getNoID());
		System.out.println("Jenis Kecelkaan: " + client.getAccident().getKategori());
		System.out.println("Tanggal Kecelakaan: " + client.getAccident().getWaktu());
		System.out.println();
		System.out.println("C. Polis: ");
		System.out.println("Nomor: " + client.getPolis().getNomor());
		System.out.println("Jeis: " + client.getPolis().getJenisAsuransi());
		System.out.println("Tanggal Berlaku: " + client.getPolis().getMasaBerlaku());
		System.out.println("Premi: Rp" + client.getPolis().getPremi().getNominal());
	}
	
}
