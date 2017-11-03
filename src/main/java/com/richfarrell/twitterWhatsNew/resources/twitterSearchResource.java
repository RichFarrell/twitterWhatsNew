package com.richfarrell.twitterWhatsNew.resources;

import com.richfarrell.twitterWhatsNew.twitterSearchView;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/twitterSearch")
@Produces(MediaType.TEXT_HTML)
public class twitterSearchResource {

	@GET
	public twitterSearchView getTwitterSearchView() {
		return new twitterSearchView();
	}
}
