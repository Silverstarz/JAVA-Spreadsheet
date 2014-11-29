package fr.u_psud.ief;

import java.io.IOException;
import java.net.*;
import java.util.*;

import com.google.gdata.client.spreadsheet.*;
import com.google.gdata.data.spreadsheet.*;
import com.google.gdata.util.*;


public class Main {

	static String key_test_sheet = "1IZv6etSZprtK3D0AGDM9yF0guLV_LP58XR9M4HDY0g8";
	static String key_test_sheet_edt = "1mGGdFoJlasCbSQbml_WGmoRLKcCsnRUJHwLFMaWtdY4";

	public static void main(String[] args)  throws AuthenticationException, MalformedURLException, IOException, ServiceException {

		//String username = "";
		//String password = "";

		SpreadsheetService service =
				new SpreadsheetService("MySpreadsheetIntegration-v1");

		//service.setUserCredentials(username, password);


		// Adresse spreadsheet title: test_sheet, colonne 1 toutes les lignes
		URL CELL_FEED_URL = new URL(
				"https://spreadsheets.google.com/feeds/cells/1mGGdFoJlasCbSQbml_WGmoRLKcCsnRUJHwLFMaWtdY4/1/public/values?min-row=1&min-col=2&max-col=2");

		CellFeed cellFeed = service.getFeed(CELL_FEED_URL, CellFeed.class);


		//Pour toutes les cellules
		for (CellEntry cell : cellFeed.getEntries()) {
			// Print the cell's formula or text value
			System.out.println(cell.getCell().getValue() + "\t");
		}



	}

}
