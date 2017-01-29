package ch.hackathon.apme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * 
 * @author apme
 *
 */
@Path("/")
public class ApmeRESTService {

	@Inject
	private ContentInfoDAO contentInfoDao;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("content/{id}")
	public ContentInfo getFoo(@PathParam("id") int id) {

		if (id == 0) {
			// No URL parameter idLanguage was sent
			ResponseBuilder builder = Response.status(Response.Status.BAD_REQUEST);
			builder.entity("Missing id parameter on request");
			Response response = builder.build();
			throw new WebApplicationException(response);
		}
		ContentInfo ci = contentInfoDao.get(id);
		if(ci == null){
			ci = new ContentInfo();
		}
		return ci;
	}
}