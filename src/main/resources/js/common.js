require.config({
    baseUrl: '/js',
    shim: {
        backbone: {
            deps: [
                'underscore',
                'jquery'
            ],
            exports: 'Backbone'
        }
    },
    paths: {
    	backbone: "/lib/backbone",
    	underscore: "/lib/underscore",
    	jquery: "/lib/jquery-2.1.1"
	}
});

//Start loading the main app file. Put all of
//your application logic in there.
requirejs(['main']);
