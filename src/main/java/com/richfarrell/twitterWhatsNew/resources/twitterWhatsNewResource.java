package com.richfarrell.twitterWhatsNew.resources;

import com.richfarrell.twitterWhatsNew.tweets;
import com.richfarrell.twitterWhatsNew.twitterSession;
import com.richfarrell.twitterWhatsNew.twitterWhatsNewConfiguration;
import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/twitterList")
@Produces(MediaType.APPLICATION_JSON)
public class twitterWhatsNewResource {
    private final String twitterConsumerKey;
    private final String twitterConsumerSecret;
    private final String twitterAccessToken;
    private final String twitterTokenSecret;
    private final String twitterUserName;
    
    public twitterWhatsNewResource(twitterWhatsNewConfiguration configuration) {
        this.twitterConsumerKey = configuration.getTwitterConsumerKey();
        this.twitterConsumerSecret = configuration.getTwitterConsumerSecret();
        this.twitterAccessToken = configuration.getTwitterAccessToken();
        this.twitterTokenSecret = configuration.getTwitterTokenSecret();
        this.twitterUserName = configuration.getTwitterUserName();
    }

    @GET
    @Timed
    public List<twitter4j.Status> searchTweets(@QueryParam("maxtweets") Integer maxTweets) {
        twitterSession twitter = new twitterSession(twitterConsumerKey, 
    		twitterConsumerSecret, 
    		twitterAccessToken, 
    		twitterTokenSecret, 
    		twitterUserName);

        if(maxTweets != null) {
        	return twitter.getTimeline(maxTweets);
        } 
        else {
        	return twitter.getTimeline(10);
        }
    }
}