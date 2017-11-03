package com.richfarrell.twitterWhatsNew;

import java.util.ArrayList;
import java.util.List;

public interface twitterInterfaces{
	List<twitter4j.Status> getTimeline(Integer maxTweets);
}