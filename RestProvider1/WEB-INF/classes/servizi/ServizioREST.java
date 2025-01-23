package servizi;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("citta")
public class ServizioREST {
	@GET
	@Path("/elenco")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> elencoCitta() {
		List<String> elenco = new ArrayList<String>();
		elenco.add("Milano");
		elenco.add("Roma");
		elenco.add("Torino");
		elenco.add("Napoli");
		return elenco;
	}
}
