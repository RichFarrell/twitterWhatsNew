define(function (require) {
    'use strict';

    var Backbone = require('backbone');
    var TwitterCollection = require('twitterCollection');
    var TwitterListView = require('twitterListView');

    return Backbone.View.extend({

        twitterCollection: null,
        twitterView: null,

		initialize: function() {
			var view = this;

            this.twitterCollection = new TwitterCollection();
			this.twitterView = new TwitterListView({ collection: this.twitterCollection });

            this.twitterCollection.fetch({success: function() {
				view.render();
			}});

            var collection = this.twitterCollection;

            setInterval(function() {
                collection.fetch({success: function() {
    				view.render();
    			}})
            },
            60000)
		}
	});
});
