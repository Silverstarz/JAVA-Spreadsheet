package fr.u_psud.ief;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.CellEntry;
import com.google.gdata.data.spreadsheet.CellFeed;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;


public class Main {

	//static String key_test_sheet = "1IZv6etSZprtK3D0AGDM9yF0guLV_LP58XR9M4HDY0g8";
	//static String key_test_sheet_edt = "1mGGdFoJlasCbSQbml_WGmoRLKcCsnRUJHwLFMaWtdY4";
	static String key_test_sheet_edt1 ="1mGGdFoJlasCbSQbml_WGmoRLKcCsnRUJHwLFMaWtdY4";
	static String key_test_sheet_edt2 ="1JE1zlcJZAwIy7H3jk0BM6oucrAT4kDFqLoooQc6onQM";

	public static void main(String[] args)  throws AuthenticationException, MalformedURLException, IOException, ServiceException {

		//String username = "";
		//String password = "";

		SpreadsheetService service =
				new SpreadsheetService("MySpreadsheetIntegration-v1");

		//service.setUserCredentials(username, password);


		Scanner sc = new Scanner(System.in);

		for(;;){
			System.out.println();
			System.out.println("Entrez numéro de SEMAINE (1, 2 ou 3) ");
			int semaine = sc.nextInt();

			switch (semaine)
			{
			case 1:

				System.out.println("entrez un numéro de JOUR (1-5 : lundi-vendredi) | (0 : afficher la semaine complète) ");
				int jour = sc.nextInt();

				switch(jour) {
				case 0:
					//  CELL_FEED_URL_semaine1 complète avec [min-row=5&max-row=43&min-col=2&max-col=4]
					System.out.println("---------------------");
					System.out.println("|SEMAINE 1 COMPLETE |");
					System.out.println("---------------------");

					URL CELL_FEED_URL_semaine1 = new URL(
							"https://spreadsheets.google.com/feeds/cells/1JE1zlcJZAwIy7H3jk0BM6oucrAT4kDFqLoooQc6onQM/1/public/values?min-row=5&max-row=43&min-col=2&max-col=4");

					CellFeed cellFeed1 = service.getFeed(CELL_FEED_URL_semaine1, CellFeed.class);	
					//Pour toutes les cellules
					for (CellEntry cell : cellFeed1.getEntries()) {
						// Print the cell's formula or text value
						System.out.println(cell.getCell().getValue() + "\t");
					}
					break;
				case 1:
					//  CELL_FEED_URL_semaine1_lundi avec [min-row=5&max-row=11&min-col=2&max-col=4]
					System.out.println("---------------------");
					System.out.println("|SEMAINE 1 LUNDI    |");
					System.out.println("---------------------");
					URL CELL_FEED_URL_semaine1_lundi = new URL(
							"https://spreadsheets.google.com/feeds/cells/1JE1zlcJZAwIy7H3jk0BM6oucrAT4kDFqLoooQc6onQM/1/public/values?min-row=5&max-row=11&min-col=2&max-col=4");

					CellFeed cellFeed1_lundi = service.getFeed(CELL_FEED_URL_semaine1_lundi, CellFeed.class);	
					//Pour toutes les cellules
					for (CellEntry cell : cellFeed1_lundi.getEntries()) {
						// Print the cell's formula or text value
						System.out.println(cell.getCell().getValue() + "\t");
					}
					break;
				case 2:
					//  CELL_FEED_URL_semaine1_mardi avec [min-row=13&max-row=19&min-col=2&max-col=4]
					System.out.println("---------------------");
					System.out.println("|SEMAINE 1 MARDI    |");
					System.out.println("---------------------");

					URL CELL_FEED_URL_semaine1_mardi = new URL(
							"https://spreadsheets.google.com/feeds/cells/1JE1zlcJZAwIy7H3jk0BM6oucrAT4kDFqLoooQc6onQM/1/public/values?min-row=13&max-row=19&min-col=2&max-col=4");

					CellFeed cellFeed1_mardi = service.getFeed(CELL_FEED_URL_semaine1_mardi, CellFeed.class);	
					//Pour toutes les cellules
					for (CellEntry cell : cellFeed1_mardi.getEntries()) {
						// Print the cell's formula or text value
						System.out.println(cell.getCell().getValue() + "\t");
					}
					break;
				case 3:
					//  CELL_FEED_URL_semaine1_mercredi avec [min-row=21&max-row=27&min-col=2&max-col=4]
					System.out.println("---------------------");
					System.out.println("|SEMAINE 1 MERCREDI |");
					System.out.println("---------------------");

					URL CELL_FEED_URL_semaine1_mercredi = new URL(
							"https://spreadsheets.google.com/feeds/cells/1JE1zlcJZAwIy7H3jk0BM6oucrAT4kDFqLoooQc6onQM/1/public/values?min-row=21&max-row=27&min-col=2&max-col=4");

					CellFeed cellFeed1_mercredi = service.getFeed(CELL_FEED_URL_semaine1_mercredi, CellFeed.class);	
					//Pour toutes les cellules
					for (CellEntry cell : cellFeed1_mercredi.getEntries()) {
						// Print the cell's formula or text value
						System.out.println(cell.getCell().getValue() + "\t");
					}
					break;
				case 4:
					//  CELL_FEED_URL_semaine1_mercredi avec [min-row=29&max-row=35&min-col=2&max-col=4]
					System.out.println("---------------------");
					System.out.println("|SEMAINE 1 JEUDI    |");
					System.out.println("---------------------");

					URL CELL_FEED_URL_semaine1_jeudi = new URL(
							"https://spreadsheets.google.com/feeds/cells/1JE1zlcJZAwIy7H3jk0BM6oucrAT4kDFqLoooQc6onQM/1/public/values?min-row=29&max-row=35&min-col=2&max-col=4");

					CellFeed cellFeed1_jeudi = service.getFeed(CELL_FEED_URL_semaine1_jeudi, CellFeed.class);	
					//Pour toutes les cellules
					for (CellEntry cell : cellFeed1_jeudi.getEntries()) {
						// Print the cell's formula or text value
						System.out.println(cell.getCell().getValue() + "\t");
					}
					break;
				case 5:
					//  CELL_FEED_URL_semaine1_mercredi avec [min-row=37&max-row=43&min-col=2&max-col=4]
					System.out.println("---------------------");
					System.out.println("|SEMAINE 1 VENDREDI |");
					System.out.println("---------------------");

					URL CELL_FEED_URL_semaine1_vendredi = new URL(
							"https://spreadsheets.google.com/feeds/cells/1JE1zlcJZAwIy7H3jk0BM6oucrAT4kDFqLoooQc6onQM/1/public/values?min-row=37&max-row=43&min-col=2&max-col=4");

					CellFeed cellFeed1_vendredi = service.getFeed(CELL_FEED_URL_semaine1_vendredi, CellFeed.class);	
					//Pour toutes les cellules
					for (CellEntry cell : cellFeed1_vendredi.getEntries()) {
						// Print the cell's formula or text value
						System.out.println(cell.getCell().getValue() + "\t");
					}
					break;
				default:
					System.out.println("Tu ne comprends pas le français ? ...");
				}
				break;




			case 2:
				//  CELL_FEED_URL_semaine2 complète avec [min-row=5&max-row=43&min-col=5&max-col=7]
				System.out.println("---------------------");
				System.out.println("|SEMAINE 2 COMPLETE |");
				System.out.println("---------------------");
				URL CELL_FEED_URL_semaine2 = new URL(
						"https://spreadsheets.google.com/feeds/cells/1mGGdFoJlasCbSQbml_WGmoRLKcCsnRUJHwLFMaWtdY4/1/public/values?min-row=5&max-row=43&min-col=5&max-col=7");

				CellFeed cellFeed2 = service.getFeed(CELL_FEED_URL_semaine2, CellFeed.class);	
				//Pour toutes les cellules
				for (CellEntry cell : cellFeed2.getEntries()) {
					// Print the cell's formula or text value
					System.out.println(cell.getCell().getValue() + "\t");
				}
				break;



			case 3:
				//  CELL_FEED_URL_semaine3 complète avec [min-row=5&max-row=43&min-col=8&max-col=10]
				System.out.println("---------------------");
				System.out.println("|SEMAINE 3 COMPLETE |");
				System.out.println("---------------------");

				URL CELL_FEED_URL_semaine3 = new URL(
						"https://spreadsheets.google.com/feeds/cells/1mGGdFoJlasCbSQbml_WGmoRLKcCsnRUJHwLFMaWtdY4/1/public/values?min-row=5&max-row=43&min-col=8&max-col=10");

				CellFeed cellFeed3 = service.getFeed(CELL_FEED_URL_semaine3, CellFeed.class);	
				//Pour toutes les cellules
				for (CellEntry cell : cellFeed3.getEntries()) {
					// Print the cell's formula or text value
					System.out.println(cell.getCell().getValue() + "\t");
				}
				break;
			default:
				System.out.println("Tu ne comprends pas le français ? ...");
				System.out.println();
				System.out.println("Entrez numéro de SEMAINE (1, 2 ou 3)");             
			}
		}
	}

}
