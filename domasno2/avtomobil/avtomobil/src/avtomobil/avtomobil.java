package avtomobil;

public class avtomobil {

	public static void main(String[] args) {
		vtomobil avtomobil1 = new Avtomobil();
		avtomobil1.marka = "Renault";
		avtomobil1.model = "clio";
		avtomobil1.pominatiKm = 23000;
		
		Avtomobil avtomobil2 = new Avtomobil("Renault", "clio", 23000);
		
		System.out.println(avtomobil1.marka + " " + avtomobil1.model + " " + avtomobil1.pominatiKm);
		System.out.println(avtomobil2.marka + " " + avtomobil2.model + " " + avtomobil2.pominatiKm);
	}

}


	}

}
