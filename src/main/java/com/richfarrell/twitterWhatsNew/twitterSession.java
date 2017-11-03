package com.richfarrelldev.twitterWhatsNew;

import java.util.ArrayList;
import java.util.List;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class twitterSession implements twitterInterfaces{
	private String consumerKey;
	private String consumerSecret;
	private String accessToken;
	private String tokenSecret;
	private String accountName;
	
    public twitterSession(String consumerKey, String consumerSecret, String accessToken, String tokenSecret, String accountName) {
    	this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.accessToken = accessToken;
        this.tokenSecret = tokenSecret;
        this.accountName = accountName;
    }

	@Override
	public List<Status> getTimeline(Integer maxTweets) {
		
		try {
			ConfigurationBuilder cb = new ConfigurationBuilder();
			  cb.setOAuthConsumerKey ( this.consumerKey )
			  .setOAuthConsumerSecret (this.consumerSecret)
			  .setOAuthAccessToken ( this.accessToken )
			  .setOAuthAccessTokenSecret (this.tokenSecret)
			  .setJSONStoreEnabled(true);
			
			Twitter twitter = new TwitterFactory(cb.build()).getInstance();
			Paging page = new Paging (1, maxTweets);
			return twitter.getUserTimeline(this.accountName, page);
		}
		catch(TwitterException e) {
			System.out.println("Error fetching twitter list");
		}
		
		return new ArrayList<Status>();
	}

}