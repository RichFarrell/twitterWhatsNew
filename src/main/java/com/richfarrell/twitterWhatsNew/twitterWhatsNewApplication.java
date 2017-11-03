package com.richfarrelldev.twitterWhatsNew;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

import com.richfarrelldev.twitterWhatsNew.resources.twitterWhatsNewResource;
//import com.richfarrelldev.twitterWhatsNew.health.TemplateHealthCheck;

public class twitterWhatsNewApplication extends Application<twitterWhatsNewConfiguration> {
    public static void main(String[] args) throws Exception {
        new twitterWhatsNewApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<twitterWhatsNewConfiguration> bootstrap) {
    	bootstrap.addBundle(new ViewBundle());
        bootstrap.addBundle(new AssetsBundle("/lib", "/lib", "", "lib"));
		bootstrap.addBundle(new AssetsBundle("/css", "/css", "", "css"));
		bootstrap.addBundle(new AssetsBundle("/js", "/js", "", "js"));
    }

    @Override
    public void run(twitterWhatsNewConfiguration configuration,
                    Environment environment) {
        final twitterWhatsNewResource whatsNewResource = new twitterWhatsNewResource(configuration);
        final twitterSearchResource twitterSearchResource = new twitterSearchResource();

        environment.jersey().register(whatsNewResource);
        environment.jersey().register(twitterSearchResource);
    }
}
