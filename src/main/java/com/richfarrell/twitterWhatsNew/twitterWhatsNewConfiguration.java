package com.richfarrell.twitterWhatsNew;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class twitterWhatsNewConfiguration extends Configuration {
	@NotEmpty
    private String twitterConsumerKey = "hlp7bryQ6LgrOcRco7nLukNbI";
    
    @NotEmpty
    private String twitterConsumerSecret = "5YmS6rmC1as2vwsnnkf6XLjvKxToCDNvpEYQBhRGzVvcx5tw0e";
    
    @NotEmpty
    private String twitterAccessToken = "924998341204824064-ofiyFy0NmogBJQu31kU5nLECyYH7MSm";
    
    @NotEmpty
    private String twitterTokenSecret = "4XG9iVOKk1foYwkR0WhF6TI06QpjkZH4kbftW5ecjf9az";

    @NotEmpty
    private String twitterUserName = "@salesforce";
     
    @JsonProperty
    public String getTwitterConsumerKey() {
        return twitterConsumerKey;
    }

    @JsonProperty
    public String getTwitterConsumerSecret() {
        return twitterConsumerSecret;
    }

    @JsonProperty
    public String getTwitterAccessToken() {
        return twitterAccessToken;
    }
    
    @JsonProperty
    public String getTwitterTokenSecret() {
        return twitterTokenSecret;
    }
    
    @JsonProperty
    public String getTwitterUserName() {
        return twitterUserName;
    }
}